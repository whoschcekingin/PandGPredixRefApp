
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
 * <p>Java class for Metric complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Metric">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metricEU" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *         &lt;element name="metricId" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Metric", propOrder = {
    "metricEU",
    "metricId",
    "value"
})
public class Metric
    implements Serializable, Equals, HashCode, ToString
{

    protected EngUnit metricEU;
    @XmlElement(required = true)
    protected MIMKey3 metricId;
    protected float value;

    /**
     * Gets the value of the metricEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getMetricEU() {
        return metricEU;
    }

    /**
     * Sets the value of the metricEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setMetricEU(EngUnit value) {
        this.metricEU = value;
    }

    /**
     * Gets the value of the metricId property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getMetricId() {
        return metricId;
    }

    /**
     * Sets the value of the metricId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setMetricId(MIMKey3 value) {
        this.metricId = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
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
            EngUnit theMetricEU;
            theMetricEU = this.getMetricEU();
            strategy.appendField(locator, this, "metricEU", buffer, theMetricEU);
        }
        {
            MIMKey3 theMetricId;
            theMetricId = this.getMetricId();
            strategy.appendField(locator, this, "metricId", buffer, theMetricId);
        }
        {
            float theValue;
            theValue = (true?this.getValue(): 0.0F);
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Metric)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Metric that = ((Metric) object);
        {
            EngUnit lhsMetricEU;
            lhsMetricEU = this.getMetricEU();
            EngUnit rhsMetricEU;
            rhsMetricEU = that.getMetricEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metricEU", lhsMetricEU), LocatorUtils.property(thatLocator, "metricEU", rhsMetricEU), lhsMetricEU, rhsMetricEU)) {
                return false;
            }
        }
        {
            MIMKey3 lhsMetricId;
            lhsMetricId = this.getMetricId();
            MIMKey3 rhsMetricId;
            rhsMetricId = that.getMetricId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metricId", lhsMetricId), LocatorUtils.property(thatLocator, "metricId", rhsMetricId), lhsMetricId, rhsMetricId)) {
                return false;
            }
        }
        {
            float lhsValue;
            lhsValue = (true?this.getValue(): 0.0F);
            float rhsValue;
            rhsValue = (true?that.getValue(): 0.0F);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
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
            EngUnit theMetricEU;
            theMetricEU = this.getMetricEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "metricEU", theMetricEU), currentHashCode, theMetricEU);
        }
        {
            MIMKey3 theMetricId;
            theMetricId = this.getMetricId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "metricId", theMetricId), currentHashCode, theMetricId);
        }
        {
            float theValue;
            theValue = (true?this.getValue(): 0.0F);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
