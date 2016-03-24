//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.21 at 01:16:18 AM PDT 
//


package com.ge.dsp.pm.solution.service.fieldchanged;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.solution.service.entity.fieldchanged.FieldChangedList;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/solution/service/entity/fieldchanged}fieldChangedList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fieldChangedList"
})
@XmlRootElement(name = "fieldChangedEvent")
public class FieldChangedEvent
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/solution/service/entity/fieldchanged", required = true)
    protected FieldChangedList fieldChangedList;

    /**
     * Gets the value of the fieldChangedList property.
     * 
     * @return
     *     possible object is
     *     {@link FieldChangedList }
     *     
     */
    public FieldChangedList getFieldChangedList() {
        return fieldChangedList;
    }

    /**
     * Sets the value of the fieldChangedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldChangedList }
     *     
     */
    public void setFieldChangedList(FieldChangedList value) {
        this.fieldChangedList = value;
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
            FieldChangedList theFieldChangedList;
            theFieldChangedList = this.getFieldChangedList();
            strategy.appendField(locator, this, "fieldChangedList", buffer, theFieldChangedList);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FieldChangedEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FieldChangedEvent that = ((FieldChangedEvent) object);
        {
            FieldChangedList lhsFieldChangedList;
            lhsFieldChangedList = this.getFieldChangedList();
            FieldChangedList rhsFieldChangedList;
            rhsFieldChangedList = that.getFieldChangedList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldChangedList", lhsFieldChangedList), LocatorUtils.property(thatLocator, "fieldChangedList", rhsFieldChangedList), lhsFieldChangedList, rhsFieldChangedList)) {
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
            FieldChangedList theFieldChangedList;
            theFieldChangedList = this.getFieldChangedList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldChangedList", theFieldChangedList), currentHashCode, theFieldChangedList);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
