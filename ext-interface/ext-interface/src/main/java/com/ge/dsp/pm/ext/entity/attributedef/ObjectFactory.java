
package com.ge.dsp.pm.ext.entity.attributedef;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.attributedef package. 
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

    private final static QName _Parents_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/attributedef", "parents");
    private final static QName _AttributeDefList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/attributedef", "attributeDefList");
    private final static QName _AttributeDef_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/attributedef", "attributeDef");
    private final static QName _AttributeType_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/attributedef", "attributeType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.attributedef
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AttributeDef }
     * 
     */
    public AttributeDef createAttributeDef() {
        return new AttributeDef();
    }

    /**
     * Create an instance of {@link AttributeDefList }
     * 
     */
    public AttributeDefList createAttributeDefList() {
        return new AttributeDefList();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeDefList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/attributedef", name = "parents")
    public JAXBElement<AttributeDefList> createParents(AttributeDefList value) {
        return new JAXBElement<AttributeDefList>(_Parents_QNAME, AttributeDefList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeDefList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/attributedef", name = "attributeDefList")
    public JAXBElement<AttributeDefList> createAttributeDefList(AttributeDefList value) {
        return new JAXBElement<AttributeDefList>(_AttributeDefList_QNAME, AttributeDefList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeDef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/attributedef", name = "attributeDef")
    public JAXBElement<AttributeDef> createAttributeDef(AttributeDef value) {
        return new JAXBElement<AttributeDef>(_AttributeDef_QNAME, AttributeDef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/attributedef", name = "attributeType")
    public JAXBElement<AttributeType> createAttributeType(AttributeType value) {
        return new JAXBElement<AttributeType>(_AttributeType_QNAME, AttributeType.class, null, value);
    }

}
