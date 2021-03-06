
package com.ge.dsp.pm.ext.entity.fielddata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.engunit.EngUnit;
import com.ge.dsp.pm.ext.entity.field.Field;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for FieldData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/field}field" minOccurs="0"/>
 *         &lt;element name="data" type="{http://dsp.ge.com/pm/ext/entity/fielddata}Data" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/engunit}engUnit" minOccurs="0"/>
 *         &lt;element name="knownDataTypes" type="{http://dsp.ge.com/pm/ext/entity/fielddata}KnownDataTypes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldData", propOrder = {
    "resultId",
    "field",
    "data",
    "engUnit",
    "knownDataTypes"
})
public class FieldData
    implements Serializable, Equals, HashCode, ToString
{

    protected String resultId;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/field")
    protected Field field;
    protected Data data;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/engunit")
    protected EngUnit engUnit;
    protected KnownDataTypes knownDataTypes;

    /**
     * Gets the value of the resultId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * Sets the value of the resultId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultId(String value) {
        this.resultId = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setField(Field value) {
        this.field = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    public Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    public void setData(Data value) {
        this.data = value;
    }

    /**
     * 
     * 						The Engineering Units which the DataEvent is
     * 						being delivered in
     * 					
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getEngUnit() {
        return engUnit;
    }

    /**
     * Sets the value of the engUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setEngUnit(EngUnit value) {
        this.engUnit = value;
    }

    /**
     * Gets the value of the knownDataTypes property.
     * 
     * @return
     *     possible object is
     *     {@link KnownDataTypes }
     *     
     */
    public KnownDataTypes getKnownDataTypes() {
        return knownDataTypes;
    }

    /**
     * Sets the value of the knownDataTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnownDataTypes }
     *     
     */
    public void setKnownDataTypes(KnownDataTypes value) {
        this.knownDataTypes = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theResultId;
            theResultId = this.getResultId();
            strategy.appendField(locator, this, "resultId", buffer, theResultId);
        }
        {
            Field theField;
            theField = this.getField();
            strategy.appendField(locator, this, "field", buffer, theField);
        }
        {
            Data theData;
            theData = this.getData();
            strategy.appendField(locator, this, "data", buffer, theData);
        }
        {
            EngUnit theEngUnit;
            theEngUnit = this.getEngUnit();
            strategy.appendField(locator, this, "engUnit", buffer, theEngUnit);
        }
        {
            KnownDataTypes theKnownDataTypes;
            theKnownDataTypes = this.getKnownDataTypes();
            strategy.appendField(locator, this, "knownDataTypes", buffer, theKnownDataTypes);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FieldData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FieldData that = ((FieldData) object);
        {
            String lhsResultId;
            lhsResultId = this.getResultId();
            String rhsResultId;
            rhsResultId = that.getResultId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultId", lhsResultId), LocatorUtils.property(thatLocator, "resultId", rhsResultId), lhsResultId, rhsResultId)) {
                return false;
            }
        }
        {
            Field lhsField;
            lhsField = this.getField();
            Field rhsField;
            rhsField = that.getField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsField), LocatorUtils.property(thatLocator, "field", rhsField), lhsField, rhsField)) {
                return false;
            }
        }
        {
            Data lhsData;
            lhsData = this.getData();
            Data rhsData;
            rhsData = that.getData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "data", lhsData), LocatorUtils.property(thatLocator, "data", rhsData), lhsData, rhsData)) {
                return false;
            }
        }
        {
            EngUnit lhsEngUnit;
            lhsEngUnit = this.getEngUnit();
            EngUnit rhsEngUnit;
            rhsEngUnit = that.getEngUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "engUnit", lhsEngUnit), LocatorUtils.property(thatLocator, "engUnit", rhsEngUnit), lhsEngUnit, rhsEngUnit)) {
                return false;
            }
        }
        {
            KnownDataTypes lhsKnownDataTypes;
            lhsKnownDataTypes = this.getKnownDataTypes();
            KnownDataTypes rhsKnownDataTypes;
            rhsKnownDataTypes = that.getKnownDataTypes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "knownDataTypes", lhsKnownDataTypes), LocatorUtils.property(thatLocator, "knownDataTypes", rhsKnownDataTypes), lhsKnownDataTypes, rhsKnownDataTypes)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theResultId;
            theResultId = this.getResultId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultId", theResultId), currentHashCode, theResultId);
        }
        {
            Field theField;
            theField = this.getField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "field", theField), currentHashCode, theField);
        }
        {
            Data theData;
            theData = this.getData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "data", theData), currentHashCode, theData);
        }
        {
            EngUnit theEngUnit;
            theEngUnit = this.getEngUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "engUnit", theEngUnit), currentHashCode, theEngUnit);
        }
        {
            KnownDataTypes theKnownDataTypes;
            theKnownDataTypes = this.getKnownDataTypes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "knownDataTypes", theKnownDataTypes), currentHashCode, theKnownDataTypes);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
