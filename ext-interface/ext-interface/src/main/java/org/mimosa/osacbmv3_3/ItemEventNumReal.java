
package org.mimosa.osacbmv3_3;

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
 * <p>Java class for ItemEventNumReal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemEventNumReal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="engUnit" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *         &lt;element name="evNumDataType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemEventNumReal", propOrder = {
    "dataValue",
    "engUnit",
    "evNumDataType"
})
public class ItemEventNumReal
    implements Serializable, Equals, HashCode, ToString
{

    protected double dataValue;
    protected EngUnit engUnit;
    @XmlElement(required = true)
    protected MIMKey3 evNumDataType;

    /**
     * Gets the value of the dataValue property.
     * 
     */
    public double getDataValue() {
        return dataValue;
    }

    /**
     * Sets the value of the dataValue property.
     * 
     */
    public void setDataValue(double value) {
        this.dataValue = value;
    }

    /**
     * Gets the value of the engUnit property.
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
     * Gets the value of the evNumDataType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getEvNumDataType() {
        return evNumDataType;
    }

    /**
     * Sets the value of the evNumDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setEvNumDataType(MIMKey3 value) {
        this.evNumDataType = value;
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
            double theDataValue;
            theDataValue = (true?this.getDataValue(): 0.0D);
            strategy.appendField(locator, this, "dataValue", buffer, theDataValue);
        }
        {
            EngUnit theEngUnit;
            theEngUnit = this.getEngUnit();
            strategy.appendField(locator, this, "engUnit", buffer, theEngUnit);
        }
        {
            MIMKey3 theEvNumDataType;
            theEvNumDataType = this.getEvNumDataType();
            strategy.appendField(locator, this, "evNumDataType", buffer, theEvNumDataType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ItemEventNumReal)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemEventNumReal that = ((ItemEventNumReal) object);
        {
            double lhsDataValue;
            lhsDataValue = (true?this.getDataValue(): 0.0D);
            double rhsDataValue;
            rhsDataValue = (true?that.getDataValue(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataValue", lhsDataValue), LocatorUtils.property(thatLocator, "dataValue", rhsDataValue), lhsDataValue, rhsDataValue)) {
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
            MIMKey3 lhsEvNumDataType;
            lhsEvNumDataType = this.getEvNumDataType();
            MIMKey3 rhsEvNumDataType;
            rhsEvNumDataType = that.getEvNumDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evNumDataType", lhsEvNumDataType), LocatorUtils.property(thatLocator, "evNumDataType", rhsEvNumDataType), lhsEvNumDataType, rhsEvNumDataType)) {
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
            double theDataValue;
            theDataValue = (true?this.getDataValue(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataValue", theDataValue), currentHashCode, theDataValue);
        }
        {
            EngUnit theEngUnit;
            theEngUnit = this.getEngUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "engUnit", theEngUnit), currentHashCode, theEngUnit);
        }
        {
            MIMKey3 theEvNumDataType;
            theEvNumDataType = this.getEvNumDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evNumDataType", theEvNumDataType), currentHashCode, theEvNumDataType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
