
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
 * <p>Java class for Transducer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transducer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calibEU" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *         &lt;element name="lastCalib" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outAmpl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="outEU" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit"/>
 *         &lt;element name="selfPowered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="transdType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transducer", propOrder = {
    "calibEU",
    "lastCalib",
    "name",
    "outAmpl",
    "outEU",
    "selfPowered",
    "transdType"
})
public class Transducer
    implements Serializable, Equals, HashCode, ToString
{

    protected EngUnit calibEU;
    protected OsacbmTime lastCalib;
    protected String name;
    protected Double outAmpl;
    @XmlElement(required = true)
    protected EngUnit outEU;
    protected Boolean selfPowered;
    @XmlElement(required = true)
    protected MIMKey3 transdType;

    /**
     * Gets the value of the calibEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getCalibEU() {
        return calibEU;
    }

    /**
     * Sets the value of the calibEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setCalibEU(EngUnit value) {
        this.calibEU = value;
    }

    /**
     * Gets the value of the lastCalib property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getLastCalib() {
        return lastCalib;
    }

    /**
     * Sets the value of the lastCalib property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setLastCalib(OsacbmTime value) {
        this.lastCalib = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the outAmpl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOutAmpl() {
        return outAmpl;
    }

    /**
     * Sets the value of the outAmpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOutAmpl(Double value) {
        this.outAmpl = value;
    }

    /**
     * Gets the value of the outEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getOutEU() {
        return outEU;
    }

    /**
     * Sets the value of the outEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setOutEU(EngUnit value) {
        this.outEU = value;
    }

    /**
     * Gets the value of the selfPowered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelfPowered() {
        return selfPowered;
    }

    /**
     * Sets the value of the selfPowered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfPowered(Boolean value) {
        this.selfPowered = value;
    }

    /**
     * Gets the value of the transdType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getTransdType() {
        return transdType;
    }

    /**
     * Sets the value of the transdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setTransdType(MIMKey3 value) {
        this.transdType = value;
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
            EngUnit theCalibEU;
            theCalibEU = this.getCalibEU();
            strategy.appendField(locator, this, "calibEU", buffer, theCalibEU);
        }
        {
            OsacbmTime theLastCalib;
            theLastCalib = this.getLastCalib();
            strategy.appendField(locator, this, "lastCalib", buffer, theLastCalib);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            Double theOutAmpl;
            theOutAmpl = this.getOutAmpl();
            strategy.appendField(locator, this, "outAmpl", buffer, theOutAmpl);
        }
        {
            EngUnit theOutEU;
            theOutEU = this.getOutEU();
            strategy.appendField(locator, this, "outEU", buffer, theOutEU);
        }
        {
            Boolean theSelfPowered;
            theSelfPowered = this.isSelfPowered();
            strategy.appendField(locator, this, "selfPowered", buffer, theSelfPowered);
        }
        {
            MIMKey3 theTransdType;
            theTransdType = this.getTransdType();
            strategy.appendField(locator, this, "transdType", buffer, theTransdType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Transducer)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Transducer that = ((Transducer) object);
        {
            EngUnit lhsCalibEU;
            lhsCalibEU = this.getCalibEU();
            EngUnit rhsCalibEU;
            rhsCalibEU = that.getCalibEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calibEU", lhsCalibEU), LocatorUtils.property(thatLocator, "calibEU", rhsCalibEU), lhsCalibEU, rhsCalibEU)) {
                return false;
            }
        }
        {
            OsacbmTime lhsLastCalib;
            lhsLastCalib = this.getLastCalib();
            OsacbmTime rhsLastCalib;
            rhsLastCalib = that.getLastCalib();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastCalib", lhsLastCalib), LocatorUtils.property(thatLocator, "lastCalib", rhsLastCalib), lhsLastCalib, rhsLastCalib)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            Double lhsOutAmpl;
            lhsOutAmpl = this.getOutAmpl();
            Double rhsOutAmpl;
            rhsOutAmpl = that.getOutAmpl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outAmpl", lhsOutAmpl), LocatorUtils.property(thatLocator, "outAmpl", rhsOutAmpl), lhsOutAmpl, rhsOutAmpl)) {
                return false;
            }
        }
        {
            EngUnit lhsOutEU;
            lhsOutEU = this.getOutEU();
            EngUnit rhsOutEU;
            rhsOutEU = that.getOutEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outEU", lhsOutEU), LocatorUtils.property(thatLocator, "outEU", rhsOutEU), lhsOutEU, rhsOutEU)) {
                return false;
            }
        }
        {
            Boolean lhsSelfPowered;
            lhsSelfPowered = this.isSelfPowered();
            Boolean rhsSelfPowered;
            rhsSelfPowered = that.isSelfPowered();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selfPowered", lhsSelfPowered), LocatorUtils.property(thatLocator, "selfPowered", rhsSelfPowered), lhsSelfPowered, rhsSelfPowered)) {
                return false;
            }
        }
        {
            MIMKey3 lhsTransdType;
            lhsTransdType = this.getTransdType();
            MIMKey3 rhsTransdType;
            rhsTransdType = that.getTransdType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transdType", lhsTransdType), LocatorUtils.property(thatLocator, "transdType", rhsTransdType), lhsTransdType, rhsTransdType)) {
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
            EngUnit theCalibEU;
            theCalibEU = this.getCalibEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calibEU", theCalibEU), currentHashCode, theCalibEU);
        }
        {
            OsacbmTime theLastCalib;
            theLastCalib = this.getLastCalib();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastCalib", theLastCalib), currentHashCode, theLastCalib);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            Double theOutAmpl;
            theOutAmpl = this.getOutAmpl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outAmpl", theOutAmpl), currentHashCode, theOutAmpl);
        }
        {
            EngUnit theOutEU;
            theOutEU = this.getOutEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outEU", theOutEU), currentHashCode, theOutEU);
        }
        {
            Boolean theSelfPowered;
            theSelfPowered = this.isSelfPowered();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selfPowered", theSelfPowered), currentHashCode, theSelfPowered);
        }
        {
            MIMKey3 theTransdType;
            theTransdType = this.getTransdType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transdType", theTransdType), currentHashCode, theTransdType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
