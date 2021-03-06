
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
 * <p>Java class for DataSourceMeasInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSourceMeasInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataSrcType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="mCalcSize" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="mLocCalcType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSourceMeasInfo", propOrder = {
    "dataSrcType",
    "mCalcSize",
    "mLocCalcType"
})
public class DataSourceMeasInfo
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected MIMKey3 dataSrcType;
    protected Float mCalcSize;
    protected MIMKey3 mLocCalcType;

    /**
     * Gets the value of the dataSrcType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getDataSrcType() {
        return dataSrcType;
    }

    /**
     * Sets the value of the dataSrcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setDataSrcType(MIMKey3 value) {
        this.dataSrcType = value;
    }

    /**
     * Gets the value of the mCalcSize property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMCalcSize() {
        return mCalcSize;
    }

    /**
     * Sets the value of the mCalcSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMCalcSize(Float value) {
        this.mCalcSize = value;
    }

    /**
     * Gets the value of the mLocCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getMLocCalcType() {
        return mLocCalcType;
    }

    /**
     * Sets the value of the mLocCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setMLocCalcType(MIMKey3 value) {
        this.mLocCalcType = value;
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
            MIMKey3 theDataSrcType;
            theDataSrcType = this.getDataSrcType();
            strategy.appendField(locator, this, "dataSrcType", buffer, theDataSrcType);
        }
        {
            Float theMCalcSize;
            theMCalcSize = this.getMCalcSize();
            strategy.appendField(locator, this, "mCalcSize", buffer, theMCalcSize);
        }
        {
            MIMKey3 theMLocCalcType;
            theMLocCalcType = this.getMLocCalcType();
            strategy.appendField(locator, this, "mLocCalcType", buffer, theMLocCalcType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DataSourceMeasInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DataSourceMeasInfo that = ((DataSourceMeasInfo) object);
        {
            MIMKey3 lhsDataSrcType;
            lhsDataSrcType = this.getDataSrcType();
            MIMKey3 rhsDataSrcType;
            rhsDataSrcType = that.getDataSrcType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataSrcType", lhsDataSrcType), LocatorUtils.property(thatLocator, "dataSrcType", rhsDataSrcType), lhsDataSrcType, rhsDataSrcType)) {
                return false;
            }
        }
        {
            Float lhsMCalcSize;
            lhsMCalcSize = this.getMCalcSize();
            Float rhsMCalcSize;
            rhsMCalcSize = that.getMCalcSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mCalcSize", lhsMCalcSize), LocatorUtils.property(thatLocator, "mCalcSize", rhsMCalcSize), lhsMCalcSize, rhsMCalcSize)) {
                return false;
            }
        }
        {
            MIMKey3 lhsMLocCalcType;
            lhsMLocCalcType = this.getMLocCalcType();
            MIMKey3 rhsMLocCalcType;
            rhsMLocCalcType = that.getMLocCalcType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mLocCalcType", lhsMLocCalcType), LocatorUtils.property(thatLocator, "mLocCalcType", rhsMLocCalcType), lhsMLocCalcType, rhsMLocCalcType)) {
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
            MIMKey3 theDataSrcType;
            theDataSrcType = this.getDataSrcType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataSrcType", theDataSrcType), currentHashCode, theDataSrcType);
        }
        {
            Float theMCalcSize;
            theMCalcSize = this.getMCalcSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mCalcSize", theMCalcSize), currentHashCode, theMCalcSize);
        }
        {
            MIMKey3 theMLocCalcType;
            theMLocCalcType = this.getMLocCalcType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mLocCalcType", theMLocCalcType), currentHashCode, theMLocCalcType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
