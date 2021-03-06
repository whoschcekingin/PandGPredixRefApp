
package com.ge.dsp.pm.ext.entity.asset;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.asset.assetidentifier.AssetIdentifier;
import com.ge.dsp.pm.ext.entity.assetselector.AssetSelector;
import com.ge.dsp.pm.ext.entity.field.fieldidentifier.FieldIdentifier;
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
 * <p>Java class for Asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/asset/assetidentifier}assetIdentifier"/>
 *         &lt;element name="assetIdFieldIdentifier" type="{http://dsp.ge.com/pm/ext/entity/field/fieldidentifier}FieldIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/assetselector}assetSelector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", propOrder = {
    "assetIdentifier",
    "assetIdFieldIdentifier",
    "assetSelector"
})
public class Asset
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/asset/assetidentifier", required = true)
    protected AssetIdentifier assetIdentifier;
    protected FieldIdentifier assetIdFieldIdentifier;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/assetselector")
    protected AssetSelector assetSelector;

    /**
     * Gets the value of the assetIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AssetIdentifier }
     *     
     */
    public AssetIdentifier getAssetIdentifier() {
        return assetIdentifier;
    }

    /**
     * Sets the value of the assetIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetIdentifier }
     *     
     */
    public void setAssetIdentifier(AssetIdentifier value) {
        this.assetIdentifier = value;
    }

    /**
     * Gets the value of the assetIdFieldIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIdentifier }
     *     
     */
    public FieldIdentifier getAssetIdFieldIdentifier() {
        return assetIdFieldIdentifier;
    }

    /**
     * Sets the value of the assetIdFieldIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIdentifier }
     *     
     */
    public void setAssetIdFieldIdentifier(FieldIdentifier value) {
        this.assetIdFieldIdentifier = value;
    }

    /**
     * Gets the value of the assetSelector property.
     * 
     * @return
     *     possible object is
     *     {@link AssetSelector }
     *     
     */
    public AssetSelector getAssetSelector() {
        return assetSelector;
    }

    /**
     * Sets the value of the assetSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetSelector }
     *     
     */
    public void setAssetSelector(AssetSelector value) {
        this.assetSelector = value;
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
            AssetIdentifier theAssetIdentifier;
            theAssetIdentifier = this.getAssetIdentifier();
            strategy.appendField(locator, this, "assetIdentifier", buffer, theAssetIdentifier);
        }
        {
            FieldIdentifier theAssetIdFieldIdentifier;
            theAssetIdFieldIdentifier = this.getAssetIdFieldIdentifier();
            strategy.appendField(locator, this, "assetIdFieldIdentifier", buffer, theAssetIdFieldIdentifier);
        }
        {
            AssetSelector theAssetSelector;
            theAssetSelector = this.getAssetSelector();
            strategy.appendField(locator, this, "assetSelector", buffer, theAssetSelector);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Asset)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Asset that = ((Asset) object);
        {
            AssetIdentifier lhsAssetIdentifier;
            lhsAssetIdentifier = this.getAssetIdentifier();
            AssetIdentifier rhsAssetIdentifier;
            rhsAssetIdentifier = that.getAssetIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assetIdentifier", lhsAssetIdentifier), LocatorUtils.property(thatLocator, "assetIdentifier", rhsAssetIdentifier), lhsAssetIdentifier, rhsAssetIdentifier)) {
                return false;
            }
        }
        {
            FieldIdentifier lhsAssetIdFieldIdentifier;
            lhsAssetIdFieldIdentifier = this.getAssetIdFieldIdentifier();
            FieldIdentifier rhsAssetIdFieldIdentifier;
            rhsAssetIdFieldIdentifier = that.getAssetIdFieldIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assetIdFieldIdentifier", lhsAssetIdFieldIdentifier), LocatorUtils.property(thatLocator, "assetIdFieldIdentifier", rhsAssetIdFieldIdentifier), lhsAssetIdFieldIdentifier, rhsAssetIdFieldIdentifier)) {
                return false;
            }
        }
        {
            AssetSelector lhsAssetSelector;
            lhsAssetSelector = this.getAssetSelector();
            AssetSelector rhsAssetSelector;
            rhsAssetSelector = that.getAssetSelector();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assetSelector", lhsAssetSelector), LocatorUtils.property(thatLocator, "assetSelector", rhsAssetSelector), lhsAssetSelector, rhsAssetSelector)) {
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
            AssetIdentifier theAssetIdentifier;
            theAssetIdentifier = this.getAssetIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assetIdentifier", theAssetIdentifier), currentHashCode, theAssetIdentifier);
        }
        {
            FieldIdentifier theAssetIdFieldIdentifier;
            theAssetIdFieldIdentifier = this.getAssetIdFieldIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assetIdFieldIdentifier", theAssetIdFieldIdentifier), currentHashCode, theAssetIdFieldIdentifier);
        }
        {
            AssetSelector theAssetSelector;
            theAssetSelector = this.getAssetSelector();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assetSelector", theAssetSelector), currentHashCode, theAssetSelector);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
