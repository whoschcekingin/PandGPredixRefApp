//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.21 at 01:16:18 AM PDT 
//


package com.ge.dsp.pm.ext.entity.osa.selectionfilter;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * Each name/value selection filter row has a Name field, Value field
 * 			and a flag to enable or disable the row. Both name and value field
 * 			has a fieldType, which could be Adh General field, Adh temporary
 * 			field or Other. Other field means that the field is manual field and
 * 			has no relation to ADH
 * 
 * <p>Java class for NameValueSelectionFilterRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameValueSelectionFilterRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://dsp.ge.com/pm/ext/entity/osa/selectionfilter}NameStringOrField"/>
 *         &lt;element name="value" type="{http://dsp.ge.com/pm/ext/entity/osa/selectionfilter}ValueStringOrField"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameValueSelectionFilterRow", propOrder = {
    "name",
    "value",
    "enabled"
})
public class NameValueSelectionFilterRow
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected NameStringOrField name;
    @XmlElement(required = true)
    protected ValueStringOrField value;
    @XmlElement(defaultValue = "true")
    protected boolean enabled;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameStringOrField }
     *     
     */
    public NameStringOrField getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameStringOrField }
     *     
     */
    public void setName(NameStringOrField value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ValueStringOrField }
     *     
     */
    public ValueStringOrField getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueStringOrField }
     *     
     */
    public void setValue(ValueStringOrField value) {
        this.value = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
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
            NameStringOrField theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            ValueStringOrField theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            boolean theEnabled;
            theEnabled = (true?this.isEnabled():false);
            strategy.appendField(locator, this, "enabled", buffer, theEnabled);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NameValueSelectionFilterRow)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NameValueSelectionFilterRow that = ((NameValueSelectionFilterRow) object);
        {
            NameStringOrField lhsName;
            lhsName = this.getName();
            NameStringOrField rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            ValueStringOrField lhsValue;
            lhsValue = this.getValue();
            ValueStringOrField rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            boolean lhsEnabled;
            lhsEnabled = (true?this.isEnabled():false);
            boolean rhsEnabled;
            rhsEnabled = (true?that.isEnabled():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enabled", lhsEnabled), LocatorUtils.property(thatLocator, "enabled", rhsEnabled), lhsEnabled, rhsEnabled)) {
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
            NameStringOrField theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            ValueStringOrField theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            boolean theEnabled;
            theEnabled = (true?this.isEnabled():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enabled", theEnabled), currentHashCode, theEnabled);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
