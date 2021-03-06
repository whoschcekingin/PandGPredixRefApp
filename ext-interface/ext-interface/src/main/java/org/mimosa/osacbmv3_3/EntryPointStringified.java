
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
 * <p>Java class for EntryPointStringified complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntryPointStringified">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="epStr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryPointStringified", propOrder = {
    "epStr"
})
public class EntryPointStringified
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String epStr;

    /**
     * Gets the value of the epStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpStr() {
        return epStr;
    }

    /**
     * Sets the value of the epStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpStr(String value) {
        this.epStr = value;
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
            String theEpStr;
            theEpStr = this.getEpStr();
            strategy.appendField(locator, this, "epStr", buffer, theEpStr);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EntryPointStringified)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EntryPointStringified that = ((EntryPointStringified) object);
        {
            String lhsEpStr;
            lhsEpStr = this.getEpStr();
            String rhsEpStr;
            rhsEpStr = that.getEpStr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "epStr", lhsEpStr), LocatorUtils.property(thatLocator, "epStr", rhsEpStr), lhsEpStr, rhsEpStr)) {
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
            String theEpStr;
            theEpStr = this.getEpStr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "epStr", theEpStr), currentHashCode, theEpStr);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
