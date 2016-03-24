//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.21 at 01:16:18 AM PDT 
//


package com.ge.dsp.pm.ext.entity.osa.selectionfilter;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.field.fieldidentifier.FieldIdentifier;
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
import org.mimosa.osacbmv3_3.OsacbmTime;


/**
 * Time Selection Filter to define Time type like Dispatcher Time,
 * 			Runtime Time, etc with Time/Row offset details.
 * 
 * <p>Java class for TimeSelectionFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSelectionFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anchorTimeType" type="{http://dsp.ge.com/pm/ext/entity/osa/selectionfilter}AnchorTimeType"/>
 *         &lt;element name="anchorTime" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime"/>
 *         &lt;element name="timeOffset" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="timeOffsetUnits" type="{http://dsp.ge.com/pm/ext/entity/osa/selectionfilter}TimeOffsetUnits" minOccurs="0"/>
 *         &lt;element name="rowOffset" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="field" type="{http://dsp.ge.com/pm/ext/entity/field/fieldidentifier}FieldIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSelectionFilter", propOrder = {
    "anchorTimeType",
    "anchorTime",
    "timeOffset",
    "timeOffsetUnits",
    "rowOffset",
    "field"
})
public class TimeSelectionFilter
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected AnchorTimeType anchorTimeType;
    @XmlElement(required = true)
    protected OsacbmTime anchorTime;
    protected BigInteger timeOffset;
    protected TimeOffsetUnits timeOffsetUnits;
    protected BigInteger rowOffset;
    protected FieldIdentifier field;

    /**
     * Gets the value of the anchorTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link AnchorTimeType }
     *     
     */
    public AnchorTimeType getAnchorTimeType() {
        return anchorTimeType;
    }

    /**
     * Sets the value of the anchorTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnchorTimeType }
     *     
     */
    public void setAnchorTimeType(AnchorTimeType value) {
        this.anchorTimeType = value;
    }

    /**
     * Gets the value of the anchorTime property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getAnchorTime() {
        return anchorTime;
    }

    /**
     * Sets the value of the anchorTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setAnchorTime(OsacbmTime value) {
        this.anchorTime = value;
    }

    /**
     * Gets the value of the timeOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeOffset() {
        return timeOffset;
    }

    /**
     * Sets the value of the timeOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeOffset(BigInteger value) {
        this.timeOffset = value;
    }

    /**
     * Gets the value of the timeOffsetUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TimeOffsetUnits }
     *     
     */
    public TimeOffsetUnits getTimeOffsetUnits() {
        return timeOffsetUnits;
    }

    /**
     * Sets the value of the timeOffsetUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeOffsetUnits }
     *     
     */
    public void setTimeOffsetUnits(TimeOffsetUnits value) {
        this.timeOffsetUnits = value;
    }

    /**
     * Gets the value of the rowOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowOffset() {
        return rowOffset;
    }

    /**
     * Sets the value of the rowOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowOffset(BigInteger value) {
        this.rowOffset = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIdentifier }
     *     
     */
    public FieldIdentifier getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIdentifier }
     *     
     */
    public void setField(FieldIdentifier value) {
        this.field = value;
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
            AnchorTimeType theAnchorTimeType;
            theAnchorTimeType = this.getAnchorTimeType();
            strategy.appendField(locator, this, "anchorTimeType", buffer, theAnchorTimeType);
        }
        {
            OsacbmTime theAnchorTime;
            theAnchorTime = this.getAnchorTime();
            strategy.appendField(locator, this, "anchorTime", buffer, theAnchorTime);
        }
        {
            BigInteger theTimeOffset;
            theTimeOffset = this.getTimeOffset();
            strategy.appendField(locator, this, "timeOffset", buffer, theTimeOffset);
        }
        {
            TimeOffsetUnits theTimeOffsetUnits;
            theTimeOffsetUnits = this.getTimeOffsetUnits();
            strategy.appendField(locator, this, "timeOffsetUnits", buffer, theTimeOffsetUnits);
        }
        {
            BigInteger theRowOffset;
            theRowOffset = this.getRowOffset();
            strategy.appendField(locator, this, "rowOffset", buffer, theRowOffset);
        }
        {
            FieldIdentifier theField;
            theField = this.getField();
            strategy.appendField(locator, this, "field", buffer, theField);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeSelectionFilter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeSelectionFilter that = ((TimeSelectionFilter) object);
        {
            AnchorTimeType lhsAnchorTimeType;
            lhsAnchorTimeType = this.getAnchorTimeType();
            AnchorTimeType rhsAnchorTimeType;
            rhsAnchorTimeType = that.getAnchorTimeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anchorTimeType", lhsAnchorTimeType), LocatorUtils.property(thatLocator, "anchorTimeType", rhsAnchorTimeType), lhsAnchorTimeType, rhsAnchorTimeType)) {
                return false;
            }
        }
        {
            OsacbmTime lhsAnchorTime;
            lhsAnchorTime = this.getAnchorTime();
            OsacbmTime rhsAnchorTime;
            rhsAnchorTime = that.getAnchorTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anchorTime", lhsAnchorTime), LocatorUtils.property(thatLocator, "anchorTime", rhsAnchorTime), lhsAnchorTime, rhsAnchorTime)) {
                return false;
            }
        }
        {
            BigInteger lhsTimeOffset;
            lhsTimeOffset = this.getTimeOffset();
            BigInteger rhsTimeOffset;
            rhsTimeOffset = that.getTimeOffset();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeOffset", lhsTimeOffset), LocatorUtils.property(thatLocator, "timeOffset", rhsTimeOffset), lhsTimeOffset, rhsTimeOffset)) {
                return false;
            }
        }
        {
            TimeOffsetUnits lhsTimeOffsetUnits;
            lhsTimeOffsetUnits = this.getTimeOffsetUnits();
            TimeOffsetUnits rhsTimeOffsetUnits;
            rhsTimeOffsetUnits = that.getTimeOffsetUnits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeOffsetUnits", lhsTimeOffsetUnits), LocatorUtils.property(thatLocator, "timeOffsetUnits", rhsTimeOffsetUnits), lhsTimeOffsetUnits, rhsTimeOffsetUnits)) {
                return false;
            }
        }
        {
            BigInteger lhsRowOffset;
            lhsRowOffset = this.getRowOffset();
            BigInteger rhsRowOffset;
            rhsRowOffset = that.getRowOffset();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rowOffset", lhsRowOffset), LocatorUtils.property(thatLocator, "rowOffset", rhsRowOffset), lhsRowOffset, rhsRowOffset)) {
                return false;
            }
        }
        {
            FieldIdentifier lhsField;
            lhsField = this.getField();
            FieldIdentifier rhsField;
            rhsField = that.getField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsField), LocatorUtils.property(thatLocator, "field", rhsField), lhsField, rhsField)) {
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
            AnchorTimeType theAnchorTimeType;
            theAnchorTimeType = this.getAnchorTimeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anchorTimeType", theAnchorTimeType), currentHashCode, theAnchorTimeType);
        }
        {
            OsacbmTime theAnchorTime;
            theAnchorTime = this.getAnchorTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anchorTime", theAnchorTime), currentHashCode, theAnchorTime);
        }
        {
            BigInteger theTimeOffset;
            theTimeOffset = this.getTimeOffset();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeOffset", theTimeOffset), currentHashCode, theTimeOffset);
        }
        {
            TimeOffsetUnits theTimeOffsetUnits;
            theTimeOffsetUnits = this.getTimeOffsetUnits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeOffsetUnits", theTimeOffsetUnits), currentHashCode, theTimeOffsetUnits);
        }
        {
            BigInteger theRowOffset;
            theRowOffset = this.getRowOffset();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rowOffset", theRowOffset), currentHashCode, theRowOffset);
        }
        {
            FieldIdentifier theField;
            theField = this.getField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "field", theField), currentHashCode, theField);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
