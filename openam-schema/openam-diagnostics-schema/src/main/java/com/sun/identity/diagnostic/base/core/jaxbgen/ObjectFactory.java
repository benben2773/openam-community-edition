//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.08 at 08:59:44 DU CEST 
//


package com.sun.identity.diagnostic.base.core.jaxbgen;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.identity.diagnostic.base.core.jaxbgen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(28, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.GrammarInfo grammarInfo = new com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (com.sun.identity.diagnostic.base.core.jaxbgen.ObjectFactory.class));
    public final static java.lang.Class version = (com.sun.identity.diagnostic.base.core.jaxbgen.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.LoadOnStartupElement.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.LoadOnStartupElementImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.ServiceElement.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.ServiceElementImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.RuntimeElement.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.RuntimeElementImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.RuntimeType.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.RuntimeTypeImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.TypeofserviceElement.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceElementImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.TypeofserviceType.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceTypeImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.ResourceBundlesType.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.ResourceBundlesTypeImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.LoadOnStartupType.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.LoadOnStartupTypeImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.CategoryType.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.CategoryTypeImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.ServiceType.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.ServiceTypeImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.LibrariesType.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.LibrariesTypeImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.ResourceBundlesElement.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.ResourceBundlesElementImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.ResourceType.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.ResourceTypeImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.LibraryElement.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.LibraryElementImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.CategoryElement.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.CategoryElementImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.RealizationElement.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.RealizationElementImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.RealizationType.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.RealizationTypeImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.ResourceElement.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.ResourceElementImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.LibraryType.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.LibraryTypeImpl");
        defaultImplementations.put((com.sun.identity.diagnostic.base.core.jaxbgen.LibrariesElement.class), "com.sun.identity.diagnostic.base.core.jaxbgen.impl.LibrariesElementImpl");
        rootTagMap.put(new javax.xml.namespace.QName("", "libraries"), (com.sun.identity.diagnostic.base.core.jaxbgen.LibrariesElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "resource-bundles"), (com.sun.identity.diagnostic.base.core.jaxbgen.ResourceBundlesElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "category"), (com.sun.identity.diagnostic.base.core.jaxbgen.CategoryElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "load-on-startup"), (com.sun.identity.diagnostic.base.core.jaxbgen.LoadOnStartupElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "service"), (com.sun.identity.diagnostic.base.core.jaxbgen.ServiceElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "typeofservice"), (com.sun.identity.diagnostic.base.core.jaxbgen.TypeofserviceElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "library"), (com.sun.identity.diagnostic.base.core.jaxbgen.LibraryElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "resource"), (com.sun.identity.diagnostic.base.core.jaxbgen.ResourceElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "realization"), (com.sun.identity.diagnostic.base.core.jaxbgen.RealizationElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "runtime"), (com.sun.identity.diagnostic.base.core.jaxbgen.RuntimeElement.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.identity.diagnostic.base.core.jaxbgen
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @param value
     *     the value of the property to be set
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of LoadOnStartupElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.LoadOnStartupElement createLoadOnStartupElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.LoadOnStartupElementImpl();
    }

    /**
     * Create an instance of ServiceElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.ServiceElement createServiceElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.ServiceElementImpl();
    }

    /**
     * Create an instance of RuntimeElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.RuntimeElement createRuntimeElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.RuntimeElementImpl();
    }

    /**
     * Create an instance of RuntimeType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.RuntimeType createRuntimeType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.RuntimeTypeImpl();
    }

    /**
     * Create an instance of TypeofserviceElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.TypeofserviceElement createTypeofserviceElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceElementImpl();
    }

    /**
     * Create an instance of TypeofserviceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.TypeofserviceType createTypeofserviceType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceTypeImpl();
    }

    /**
     * Create an instance of ResourceBundlesType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.ResourceBundlesType createResourceBundlesType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.ResourceBundlesTypeImpl();
    }

    /**
     * Create an instance of LoadOnStartupType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.LoadOnStartupType createLoadOnStartupType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.LoadOnStartupTypeImpl();
    }

    /**
     * Create an instance of CategoryType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.CategoryType createCategoryType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.CategoryTypeImpl();
    }

    /**
     * Create an instance of ServiceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.ServiceType createServiceType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.ServiceTypeImpl();
    }

    /**
     * Create an instance of LibrariesType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.LibrariesType createLibrariesType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.LibrariesTypeImpl();
    }

    /**
     * Create an instance of ResourceBundlesElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.ResourceBundlesElement createResourceBundlesElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.ResourceBundlesElementImpl();
    }

    /**
     * Create an instance of ResourceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.ResourceType createResourceType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.ResourceTypeImpl();
    }

    /**
     * Create an instance of LibraryElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.LibraryElement createLibraryElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.LibraryElementImpl();
    }

    /**
     * Create an instance of CategoryElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.CategoryElement createCategoryElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.CategoryElementImpl();
    }

    /**
     * Create an instance of RealizationElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.RealizationElement createRealizationElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.RealizationElementImpl();
    }

    /**
     * Create an instance of RealizationType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.RealizationType createRealizationType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.RealizationTypeImpl();
    }

    /**
     * Create an instance of ResourceElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.ResourceElement createResourceElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.ResourceElementImpl();
    }

    /**
     * Create an instance of LibraryType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.LibraryType createLibraryType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.LibraryTypeImpl();
    }

    /**
     * Create an instance of LibrariesElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.diagnostic.base.core.jaxbgen.LibrariesElement createLibrariesElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.LibrariesElementImpl();
    }

}