//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:40:43 PM IST 
//


package com.ge.dsp.pm.ext.entity.strategy.identifier.strategyidentifier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.strategy.identifier.strategyidentifier package. 
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

    private final static QName _StrategyIdentifierList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/strategy/identifier/strategyidentifier", "strategyIdentifierList");
    private final static QName _StrategyIdentifier_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/strategy/identifier/strategyidentifier", "strategyIdentifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.strategy.identifier.strategyidentifier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StrategyIdentifierList }
     * 
     */
    public StrategyIdentifierList createStrategyIdentifierList() {
        return new StrategyIdentifierList();
    }

    /**
     * Create an instance of {@link StrategyIdentifier }
     * 
     */
    public StrategyIdentifier createStrategyIdentifier() {
        return new StrategyIdentifier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategyIdentifierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/strategy/identifier/strategyidentifier", name = "strategyIdentifierList")
    public JAXBElement<StrategyIdentifierList> createStrategyIdentifierList(StrategyIdentifierList value) {
        return new JAXBElement<StrategyIdentifierList>(_StrategyIdentifierList_QNAME, StrategyIdentifierList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategyIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/strategy/identifier/strategyidentifier", name = "strategyIdentifier")
    public JAXBElement<StrategyIdentifier> createStrategyIdentifier(StrategyIdentifier value) {
        return new JAXBElement<StrategyIdentifier>(_StrategyIdentifier_QNAME, StrategyIdentifier.class, null, value);
    }

}
