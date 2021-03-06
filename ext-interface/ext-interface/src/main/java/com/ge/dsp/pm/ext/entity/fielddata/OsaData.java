
package com.ge.dsp.pm.ext.entity.fielddata;

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
import org.mimosa.osacbmv3_3.DataEvent;


/**
 * <p>Java class for OsaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OsaData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dsp.ge.com/pm/ext/entity/fielddata}Data">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.mimosa.org/OSACBMV3.3.1}DataEvent"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OsaData", propOrder = {
    "dataEvent"
})
public class OsaData
    extends Data
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(name = "DataEvent", namespace = "http://www.mimosa.org/OSACBMV3.3.1", required = true, nillable = true)
    protected DataEvent dataEvent;

    /**
     * Gets the value of the dataEvent property.
     * 
     * @return
     *     possible object is
     *     {@link DataEvent }
     *     
     */
    public DataEvent getDataEvent() {
        return dataEvent;
    }

    /**
     * Sets the value of the dataEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataEvent }
     *     
     */
    public void setDataEvent(DataEvent value) {
        this.dataEvent = value;
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
            DataEvent theDataEvent;
            theDataEvent = this.getDataEvent();
            strategy.appendField(locator, this, "dataEvent", buffer, theDataEvent);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OsaData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OsaData that = ((OsaData) object);
        {
            DataEvent lhsDataEvent;
            lhsDataEvent = this.getDataEvent();
            DataEvent rhsDataEvent;
            rhsDataEvent = that.getDataEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataEvent", lhsDataEvent), LocatorUtils.property(thatLocator, "dataEvent", rhsDataEvent), lhsDataEvent, rhsDataEvent)) {
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
            DataEvent theDataEvent;
            theDataEvent = this.getDataEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataEvent", theDataEvent), currentHashCode, theDataEvent);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
