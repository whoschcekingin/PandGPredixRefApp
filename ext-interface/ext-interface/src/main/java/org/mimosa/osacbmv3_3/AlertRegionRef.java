
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for AlertRegionRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRegionRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regionId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="regionLastUpdate" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="regionSeq" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="regionSite" type="{http://www.mimosa.org/OSACBMV3.3.1}Site" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertRegionRef", propOrder = {
    "regionId",
    "regionLastUpdate",
    "regionSeq",
    "regionSite"
})
public class AlertRegionRef
    implements Serializable, Equals, HashCode, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected long regionId;
    protected OsacbmTime regionLastUpdate;
    @XmlSchemaType(name = "unsignedInt")
    protected Long regionSeq;
    protected Site regionSite;

    /**
     * Gets the value of the regionId property.
     * 
     */
    public long getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     */
    public void setRegionId(long value) {
        this.regionId = value;
    }

    /**
     * Gets the value of the regionLastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getRegionLastUpdate() {
        return regionLastUpdate;
    }

    /**
     * Sets the value of the regionLastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setRegionLastUpdate(OsacbmTime value) {
        this.regionLastUpdate = value;
    }

    /**
     * Gets the value of the regionSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegionSeq() {
        return regionSeq;
    }

    /**
     * Sets the value of the regionSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegionSeq(Long value) {
        this.regionSeq = value;
    }

    /**
     * Gets the value of the regionSite property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getRegionSite() {
        return regionSite;
    }

    /**
     * Sets the value of the regionSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setRegionSite(Site value) {
        this.regionSite = value;
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
            long theRegionId;
            theRegionId = (true?this.getRegionId(): 0L);
            strategy.appendField(locator, this, "regionId", buffer, theRegionId);
        }
        {
            OsacbmTime theRegionLastUpdate;
            theRegionLastUpdate = this.getRegionLastUpdate();
            strategy.appendField(locator, this, "regionLastUpdate", buffer, theRegionLastUpdate);
        }
        {
            Long theRegionSeq;
            theRegionSeq = this.getRegionSeq();
            strategy.appendField(locator, this, "regionSeq", buffer, theRegionSeq);
        }
        {
            Site theRegionSite;
            theRegionSite = this.getRegionSite();
            strategy.appendField(locator, this, "regionSite", buffer, theRegionSite);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AlertRegionRef)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AlertRegionRef that = ((AlertRegionRef) object);
        {
            long lhsRegionId;
            lhsRegionId = (true?this.getRegionId(): 0L);
            long rhsRegionId;
            rhsRegionId = (true?that.getRegionId(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionId", lhsRegionId), LocatorUtils.property(thatLocator, "regionId", rhsRegionId), lhsRegionId, rhsRegionId)) {
                return false;
            }
        }
        {
            OsacbmTime lhsRegionLastUpdate;
            lhsRegionLastUpdate = this.getRegionLastUpdate();
            OsacbmTime rhsRegionLastUpdate;
            rhsRegionLastUpdate = that.getRegionLastUpdate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionLastUpdate", lhsRegionLastUpdate), LocatorUtils.property(thatLocator, "regionLastUpdate", rhsRegionLastUpdate), lhsRegionLastUpdate, rhsRegionLastUpdate)) {
                return false;
            }
        }
        {
            Long lhsRegionSeq;
            lhsRegionSeq = this.getRegionSeq();
            Long rhsRegionSeq;
            rhsRegionSeq = that.getRegionSeq();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionSeq", lhsRegionSeq), LocatorUtils.property(thatLocator, "regionSeq", rhsRegionSeq), lhsRegionSeq, rhsRegionSeq)) {
                return false;
            }
        }
        {
            Site lhsRegionSite;
            lhsRegionSite = this.getRegionSite();
            Site rhsRegionSite;
            rhsRegionSite = that.getRegionSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionSite", lhsRegionSite), LocatorUtils.property(thatLocator, "regionSite", rhsRegionSite), lhsRegionSite, rhsRegionSite)) {
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
            long theRegionId;
            theRegionId = (true?this.getRegionId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regionId", theRegionId), currentHashCode, theRegionId);
        }
        {
            OsacbmTime theRegionLastUpdate;
            theRegionLastUpdate = this.getRegionLastUpdate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regionLastUpdate", theRegionLastUpdate), currentHashCode, theRegionLastUpdate);
        }
        {
            Long theRegionSeq;
            theRegionSeq = this.getRegionSeq();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regionSeq", theRegionSeq), currentHashCode, theRegionSeq);
        }
        {
            Site theRegionSite;
            theRegionSite = this.getRegionSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regionSite", theRegionSite), currentHashCode, theRegionSite);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
