/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2007 Sun Microsystems Inc. All Rights Reserved
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * https://opensso.dev.java.net/public/CDDLv1.0.html or
 * opensso/legal/CDDLv1.0.txt
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at opensso/legal/CDDLv1.0.txt.
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * $Id: SessionHAPropertiesViewBean.java,v 1.2 2008/06/25 05:43:12 qcheng Exp $
 *
 */

package com.sun.identity.console.session;

import com.iplanet.jato.RequestContext;
import com.iplanet.jato.RequestManager;
import com.iplanet.jato.model.ModelControlException;
import com.iplanet.jato.view.View;
import com.iplanet.jato.view.event.DisplayEvent;
import com.iplanet.jato.view.event.RequestInvocationEvent;

import com.sun.web.ui.model.CCPageTitleModel;
import com.sun.web.ui.view.alert.CCAlert;
import com.sun.web.ui.view.pagetitle.CCPageTitle;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

import com.sun.identity.console.base.AMPropertySheet;
import com.sun.identity.console.base.model.AMConsoleException;
import com.sun.identity.console.base.model.AMModel;
import com.sun.identity.console.base.model.AMPropertySheetModel;
import com.sun.identity.console.session.model.SMProfileModel;
import com.sun.identity.console.session.model.SMProfileModelImpl;

public class SessionHAPropertiesViewBean
        extends SessionHAPropertiesBase {

    public static final String DEFAULT_DISPLAY_URL =
            "/console/session/SessionHAProperties.jsp";

    protected AMPropertySheetModel psModel;

    private static final String PAGETITLE = "pgtitle";
    private boolean initialized;

    /**
     * Creates a authentication domains view bean.
     */
    public SessionHAPropertiesViewBean() {
        super(SESSION_HA_PROPERTIES);
        setDefaultDisplayURL(DEFAULT_DISPLAY_URL);
    }

    protected void initialize() {
        if (!initialized) {
            String sessionAttribute = (String) getPageSessionAttribute(SESSION_HA_PROPERTIES);
            if (sessionAttribute != null) {
                initialized = true;
                createPropertyModel(sessionAttribute);
                createPageTitleModel();
                registerChildren();
                super.initialize();
            }
        }
        super.registerChildren();
    }

    protected void registerChildren() {
        registerChild(SESSION_HA_PROPERTIES, AMPropertySheet.class);
        if (psModel != null) {
            psModel.registerChildren(this);
        }
        if (ptModel != null) {
            ptModel.registerChildren(this);
        }
    }

    protected View createChild(String name) {
        View view = null;
        if (psModel == null) {
            createPropertyModel(SESSION_HA_PROPERTIES);
        }
        if (ptModel == null) {
            createPageTitleModel();
        }
        if (name.equals(PAGETITLE)) {
            view = new CCPageTitle(this, ptModel, name);
        } else if (name.equals(SESSION_HA_PROPERTIES)) {
            view = new AMPropertySheet(this, psModel, name);
        } else if ((psModel != null) && psModel.isChildSupported(name)) {
            view = psModel.createChild(this, name, getModel());
        } else if ((ptModel != null) && ptModel.isChildSupported(name)) {
            view = ptModel.createChild(this, name);
        } else {
            view = super.createChild(name);
        }

        return view;
    }

    public void beginDisplay(DisplayEvent event)
            throws ModelControlException {
        super.beginDisplay(event);
        SMProfileModel model = (SMProfileModel) getModel();
        if (model != null) {
            String sessionAttribute = (String) getPageSessionAttribute(SESSION_HA_PROPERTIES);
            AMPropertySheet ps =
                    (AMPropertySheet) getChild(SESSION_HA_PROPERTIES);
            psModel.clear();
            //try {

                //ps.setAttributeValues(
                //        model.getAttributeValues(sessionAttribute), model);

            //} catch (AMConsoleException a) {
            //    setInlineAlertMessage(CCAlert.TYPE_ERROR,
            //            "message.error", "no.properties");
            //}
            // Set our Sub-Tabs and current position, relative to one.
            addSessionsTab(model, 2);
        }
    }

    private void createPageTitleModel() {
        ptModel = new CCPageTitleModel(
                getClass().getClassLoader().getResourceAsStream(
                        "com/sun/identity/console/twoBtnsPageTitle.xml"));
        ptModel.setValue("button1", "button.save");
        ptModel.setValue("button2", "button.reset");
    }

    protected AMModel getModelInternal() {
        RequestContext rc = RequestManager.getRequestContext();
        HttpServletRequest req = rc.getRequest();
        return new SMProfileModelImpl(req, getPageSessionAttributes());
    }

    protected void createPropertyModel(String modelName) {
        SMProfileModel model = (SMProfileModel) getModel();
        try {
            psModel = new AMPropertySheetModel(
                    model.getSessionProfilePropertyXML(modelName,
                            getClass().getName()));
            psModel.clear();

        } catch (AMConsoleException e) {
            setInlineAlertMessage(CCAlert.TYPE_ERROR, "message.error",
                    e.getMessage() + ", File Not Found for ModelName:[" + modelName + "].");
        }
    }

    /**
     * Handles save button request.
     *
     * @param event Request invocation event
     */
    public void handleButton1Request(RequestInvocationEvent event)
            throws ModelControlException {
        SMProfileModel model = (SMProfileModel) getModel();
        String name =
                (String) getPageSessionAttribute(SESSION_HA_PROPERTIES);

        //AMPropertySheet ps = (AMPropertySheet) getChild(SESSION_HA_PROPERTIES);

        //try {
            //Map orig = model.getAttributeValues(name);
            //Map values = ps.getAttributeValues(orig, true, true, model);
            //model.setAttributeValues(name, values);
            setInlineAlertMessage(CCAlert.TYPE_INFO, "message.information",
                    "message.updated");
        //} catch (AMConsoleException e) {
        //    setInlineAlertMessage(CCAlert.TYPE_ERROR, "message.error",
        //            e.getMessage());
        //}
        forwardTo();
    }

    /**
     * Handles reset request.
     *
     * @param event Request invocation event
     */
    public void handleButton2Request(RequestInvocationEvent event) {
        forwardTo();
    }

}