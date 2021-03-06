
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
 * <p>Java class for NotConnector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotConnector">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}LogicalConnector">
 *       &lt;sequence>
 *         &lt;element name="notArg" type="{http://www.mimosa.org/OSACBMV3.3.1}LogicalConnector"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotConnector", propOrder = {
    "notArg"
})
public class NotConnector
    extends LogicalConnector
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected LogicalConnector notArg;

    /**
     * Gets the value of the notArg property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalConnector }
     *     
     */
    public LogicalConnector getNotArg() {
        return notArg;
    }

    /**
     * Sets the value of the notArg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalConnector }
     *     
     */
    public void setNotArg(LogicalConnector value) {
        this.notArg = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            LogicalConnector theNotArg;
            theNotArg = this.getNotArg();
            strategy.appendField(locator, this, "notArg", buffer, theNotArg);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NotConnector)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final NotConnector that = ((NotConnector) object);
        {
            LogicalConnector lhsNotArg;
            lhsNotArg = this.getNotArg();
            LogicalConnector rhsNotArg;
            rhsNotArg = that.getNotArg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notArg", lhsNotArg), LocatorUtils.property(thatLocator, "notArg", rhsNotArg), lhsNotArg, rhsNotArg)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            LogicalConnector theNotArg;
            theNotArg = this.getNotArg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notArg", theNotArg), currentHashCode, theNotArg);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
