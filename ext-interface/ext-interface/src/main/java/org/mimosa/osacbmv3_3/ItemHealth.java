
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for ItemHealth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemHealth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chgPattType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="healthLevelType" type="{http://www.mimosa.org/OSACBMV3.3.1}HlthLevelType" minOccurs="0"/>
 *         &lt;element name="hGradeReal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="hLevel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="item_id" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemId"/>
 *         &lt;element name="likelihood" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="utc_health" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemHealth", propOrder = {
    "chgPattType",
    "healthLevelType",
    "hGradeReal",
    "hLevel",
    "itemId",
    "likelihood",
    "utcHealth"
})
public class ItemHealth
    implements Serializable, Equals, HashCode, ToString
{

    protected MIMKey3 chgPattType;
    protected HlthLevelType healthLevelType;
    protected Double hGradeReal;
    @XmlSchemaType(name = "unsignedInt")
    protected Long hLevel;
    @XmlElement(name = "item_id", required = true)
    protected ItemId itemId;
    protected Double likelihood;
    @XmlElement(name = "utc_health", required = true)
    protected OsacbmTime utcHealth;

    /**
     * Gets the value of the chgPattType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getChgPattType() {
        return chgPattType;
    }

    /**
     * Sets the value of the chgPattType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setChgPattType(MIMKey3 value) {
        this.chgPattType = value;
    }

    /**
     * Gets the value of the healthLevelType property.
     * 
     * @return
     *     possible object is
     *     {@link HlthLevelType }
     *     
     */
    public HlthLevelType getHealthLevelType() {
        return healthLevelType;
    }

    /**
     * Sets the value of the healthLevelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HlthLevelType }
     *     
     */
    public void setHealthLevelType(HlthLevelType value) {
        this.healthLevelType = value;
    }

    /**
     * Gets the value of the hGradeReal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHGradeReal() {
        return hGradeReal;
    }

    /**
     * Sets the value of the hGradeReal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHGradeReal(Double value) {
        this.hGradeReal = value;
    }

    /**
     * Gets the value of the hLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHLevel() {
        return hLevel;
    }

    /**
     * Sets the value of the hLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHLevel(Long value) {
        this.hLevel = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemId }
     *     
     */
    public ItemId getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemId }
     *     
     */
    public void setItemId(ItemId value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the likelihood property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLikelihood() {
        return likelihood;
    }

    /**
     * Sets the value of the likelihood property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLikelihood(Double value) {
        this.likelihood = value;
    }

    /**
     * Gets the value of the utcHealth property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getUtcHealth() {
        return utcHealth;
    }

    /**
     * Sets the value of the utcHealth property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setUtcHealth(OsacbmTime value) {
        this.utcHealth = value;
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
            MIMKey3 theChgPattType;
            theChgPattType = this.getChgPattType();
            strategy.appendField(locator, this, "chgPattType", buffer, theChgPattType);
        }
        {
            HlthLevelType theHealthLevelType;
            theHealthLevelType = this.getHealthLevelType();
            strategy.appendField(locator, this, "healthLevelType", buffer, theHealthLevelType);
        }
        {
            Double theHGradeReal;
            theHGradeReal = this.getHGradeReal();
            strategy.appendField(locator, this, "hGradeReal", buffer, theHGradeReal);
        }
        {
            Long theHLevel;
            theHLevel = this.getHLevel();
            strategy.appendField(locator, this, "hLevel", buffer, theHLevel);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            strategy.appendField(locator, this, "itemId", buffer, theItemId);
        }
        {
            Double theLikelihood;
            theLikelihood = this.getLikelihood();
            strategy.appendField(locator, this, "likelihood", buffer, theLikelihood);
        }
        {
            OsacbmTime theUtcHealth;
            theUtcHealth = this.getUtcHealth();
            strategy.appendField(locator, this, "utcHealth", buffer, theUtcHealth);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ItemHealth)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemHealth that = ((ItemHealth) object);
        {
            MIMKey3 lhsChgPattType;
            lhsChgPattType = this.getChgPattType();
            MIMKey3 rhsChgPattType;
            rhsChgPattType = that.getChgPattType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chgPattType", lhsChgPattType), LocatorUtils.property(thatLocator, "chgPattType", rhsChgPattType), lhsChgPattType, rhsChgPattType)) {
                return false;
            }
        }
        {
            HlthLevelType lhsHealthLevelType;
            lhsHealthLevelType = this.getHealthLevelType();
            HlthLevelType rhsHealthLevelType;
            rhsHealthLevelType = that.getHealthLevelType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "healthLevelType", lhsHealthLevelType), LocatorUtils.property(thatLocator, "healthLevelType", rhsHealthLevelType), lhsHealthLevelType, rhsHealthLevelType)) {
                return false;
            }
        }
        {
            Double lhsHGradeReal;
            lhsHGradeReal = this.getHGradeReal();
            Double rhsHGradeReal;
            rhsHGradeReal = that.getHGradeReal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hGradeReal", lhsHGradeReal), LocatorUtils.property(thatLocator, "hGradeReal", rhsHGradeReal), lhsHGradeReal, rhsHGradeReal)) {
                return false;
            }
        }
        {
            Long lhsHLevel;
            lhsHLevel = this.getHLevel();
            Long rhsHLevel;
            rhsHLevel = that.getHLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hLevel", lhsHLevel), LocatorUtils.property(thatLocator, "hLevel", rhsHLevel), lhsHLevel, rhsHLevel)) {
                return false;
            }
        }
        {
            ItemId lhsItemId;
            lhsItemId = this.getItemId();
            ItemId rhsItemId;
            rhsItemId = that.getItemId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemId", lhsItemId), LocatorUtils.property(thatLocator, "itemId", rhsItemId), lhsItemId, rhsItemId)) {
                return false;
            }
        }
        {
            Double lhsLikelihood;
            lhsLikelihood = this.getLikelihood();
            Double rhsLikelihood;
            rhsLikelihood = that.getLikelihood();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "likelihood", lhsLikelihood), LocatorUtils.property(thatLocator, "likelihood", rhsLikelihood), lhsLikelihood, rhsLikelihood)) {
                return false;
            }
        }
        {
            OsacbmTime lhsUtcHealth;
            lhsUtcHealth = this.getUtcHealth();
            OsacbmTime rhsUtcHealth;
            rhsUtcHealth = that.getUtcHealth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "utcHealth", lhsUtcHealth), LocatorUtils.property(thatLocator, "utcHealth", rhsUtcHealth), lhsUtcHealth, rhsUtcHealth)) {
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
            MIMKey3 theChgPattType;
            theChgPattType = this.getChgPattType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chgPattType", theChgPattType), currentHashCode, theChgPattType);
        }
        {
            HlthLevelType theHealthLevelType;
            theHealthLevelType = this.getHealthLevelType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "healthLevelType", theHealthLevelType), currentHashCode, theHealthLevelType);
        }
        {
            Double theHGradeReal;
            theHGradeReal = this.getHGradeReal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hGradeReal", theHGradeReal), currentHashCode, theHGradeReal);
        }
        {
            Long theHLevel;
            theHLevel = this.getHLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hLevel", theHLevel), currentHashCode, theHLevel);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemId", theItemId), currentHashCode, theItemId);
        }
        {
            Double theLikelihood;
            theLikelihood = this.getLikelihood();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "likelihood", theLikelihood), currentHashCode, theLikelihood);
        }
        {
            OsacbmTime theUtcHealth;
            theUtcHealth = this.getUtcHealth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "utcHealth", theUtcHealth), currentHashCode, theUtcHealth);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
