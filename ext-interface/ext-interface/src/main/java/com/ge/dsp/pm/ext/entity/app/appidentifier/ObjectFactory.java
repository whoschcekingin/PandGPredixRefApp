
package com.ge.dsp.pm.ext.entity.app.appidentifier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.app.appidentifier package. 
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
@XmlRegistry
public class ObjectFactory {

    private final static QName _AppIdentifierList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/app/appidentifier", "appIdentifierList");
    private final static QName _AppIdentifier_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/app/appidentifier", "appIdentifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.app.appidentifier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AppIdentifierList }
     * 
     */
    public AppIdentifierList createAppIdentifierList() {
        return new AppIdentifierList();
    }

    /**
     * Create an instance of {@link AppIdentifier }
     * 
     */
    public AppIdentifier createAppIdentifier() {
        return new AppIdentifier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppIdentifierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/app/appidentifier", name = "appIdentifierList")
    public JAXBElement<AppIdentifierList> createAppIdentifierList(AppIdentifierList value) {
        return new JAXBElement<AppIdentifierList>(_AppIdentifierList_QNAME, AppIdentifierList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/app/appidentifier", name = "appIdentifier")
    public JAXBElement<AppIdentifier> createAppIdentifier(AppIdentifier value) {
        return new JAXBElement<AppIdentifier>(_AppIdentifier_QNAME, AppIdentifier.class, null, value);
    }

}
