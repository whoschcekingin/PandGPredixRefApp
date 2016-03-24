
package com.ge.dsp.pm.ext.entity.fieldselection;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.fieldselection package. 
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

    private final static QName _FieldSelection_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/fieldselection", "fieldSelection");
    private final static QName _FieldSelectionList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/fieldselection", "fieldSelectionList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.fieldselection
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FieldSelectionList }
     * 
     */
    public FieldSelectionList createFieldSelectionList() {
        return new FieldSelectionList();
    }

    /**
     * Create an instance of {@link FieldSelection }
     * 
     */
    public FieldSelection createFieldSelection() {
        return new FieldSelection();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldSelection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/fieldselection", name = "fieldSelection")
    public JAXBElement<FieldSelection> createFieldSelection(FieldSelection value) {
        return new JAXBElement<FieldSelection>(_FieldSelection_QNAME, FieldSelection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldSelectionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/fieldselection", name = "fieldSelectionList")
    public JAXBElement<FieldSelectionList> createFieldSelectionList(FieldSelectionList value) {
        return new JAXBElement<FieldSelectionList>(_FieldSelectionList_QNAME, FieldSelectionList.class, null, value);
    }

}
