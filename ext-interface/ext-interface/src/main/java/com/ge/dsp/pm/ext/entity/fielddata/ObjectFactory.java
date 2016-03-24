
package com.ge.dsp.pm.ext.entity.fielddata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.fielddata package. 
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

    private final static QName _FieldData_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/fielddata", "fieldData");
    private final static QName _FieldDataList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/fielddata", "fieldDataList");
    private final static QName _Data_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/fielddata", "data");
    private final static QName _KnownDataTypes_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/fielddata", "knownDataTypes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.fielddata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OsaData }
     * 
     */
    public OsaData createOsaData() {
        return new OsaData();
    }

    /**
     * Create an instance of {@link FieldDataList }
     * 
     */
    public FieldDataList createFieldDataList() {
        return new FieldDataList();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link FieldData }
     * 
     */
    public FieldData createFieldData() {
        return new FieldData();
    }

    /**
     * Create an instance of {@link KnownDataTypes }
     * 
     */
    public KnownDataTypes createKnownDataTypes() {
        return new KnownDataTypes();
    }

    /**
     * Create an instance of {@link Fields }
     * 
     */
    public Fields createFields() {
        return new Fields();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/fielddata", name = "fieldData")
    public JAXBElement<FieldData> createFieldData(FieldData value) {
        return new JAXBElement<FieldData>(_FieldData_QNAME, FieldData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldDataList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/fielddata", name = "fieldDataList")
    public JAXBElement<FieldDataList> createFieldDataList(FieldDataList value) {
        return new JAXBElement<FieldDataList>(_FieldDataList_QNAME, FieldDataList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Data }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/fielddata", name = "data")
    public JAXBElement<Data> createData(Data value) {
        return new JAXBElement<Data>(_Data_QNAME, Data.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnownDataTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/fielddata", name = "knownDataTypes")
    public JAXBElement<KnownDataTypes> createKnownDataTypes(KnownDataTypes value) {
        return new JAXBElement<KnownDataTypes>(_KnownDataTypes_QNAME, KnownDataTypes.class, null, value);
    }

}
