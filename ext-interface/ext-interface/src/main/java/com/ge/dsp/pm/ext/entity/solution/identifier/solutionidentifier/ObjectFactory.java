
package com.ge.dsp.pm.ext.entity.solution.identifier.solutionidentifier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.solution.identifier.solutionidentifier package. 
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

    private final static QName _SolutionIdentifier_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/solution/identifier/solutionidentifier", "solutionIdentifier");
    private final static QName _SolutionIdentifierList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/solution/identifier/solutionidentifier", "solutionIdentifierList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.solution.identifier.solutionidentifier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SolutionIdentifierList }
     * 
     */
    public SolutionIdentifierList createSolutionIdentifierList() {
        return new SolutionIdentifierList();
    }

    /**
     * Create an instance of {@link SolutionIdentifier }
     * 
     */
    public SolutionIdentifier createSolutionIdentifier() {
        return new SolutionIdentifier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolutionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/solution/identifier/solutionidentifier", name = "solutionIdentifier")
    public JAXBElement<SolutionIdentifier> createSolutionIdentifier(SolutionIdentifier value) {
        return new JAXBElement<SolutionIdentifier>(_SolutionIdentifier_QNAME, SolutionIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolutionIdentifierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/solution/identifier/solutionidentifier", name = "solutionIdentifierList")
    public JAXBElement<SolutionIdentifierList> createSolutionIdentifierList(SolutionIdentifierList value) {
        return new JAXBElement<SolutionIdentifierList>(_SolutionIdentifierList_QNAME, SolutionIdentifierList.class, null, value);
    }

}
