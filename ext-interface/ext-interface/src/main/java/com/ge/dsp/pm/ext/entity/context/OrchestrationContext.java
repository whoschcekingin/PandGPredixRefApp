
package com.ge.dsp.pm.ext.entity.context;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.asset.Asset;
import com.ge.dsp.pm.ext.entity.util.map.Map;
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
 * This object contains the context information that is
 * 				needed by the analytic core runtime
 * 				components. The
 * 				contents lifecycle
 * 				is documented in the detailed design -> core runtime
 * 				platform page in
 * 				the project
 * 				wiki.
 * 			
 * 
 * <p>Java class for OrchestrationContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrchestrationContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adhServiceIdentifier" type="{http://dsp.ge.com/pm/ext/entity/context}ServiceIdentifier"/>
 *         &lt;element name="rdrServiceIdentifier" type="{http://dsp.ge.com/pm/ext/entity/context}ServiceIdentifier"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/asset}asset" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/util/map}attributeMap"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrchestrationContext", propOrder = {
    "contextIdentifier",
    "adhServiceIdentifier",
    "rdrServiceIdentifier",
    "asset",
    "attributeMap"
})
public class OrchestrationContext
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String contextIdentifier;
    @XmlElement(required = true)
    protected ServiceIdentifier adhServiceIdentifier;
    @XmlElement(required = true)
    protected ServiceIdentifier rdrServiceIdentifier;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/asset")
    protected Asset asset;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/util/map", required = true)
    protected Map attributeMap;

    /**
     * Gets the value of the contextIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextIdentifier() {
        return contextIdentifier;
    }

    /**
     * Sets the value of the contextIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextIdentifier(String value) {
        this.contextIdentifier = value;
    }

    /**
     * Gets the value of the adhServiceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIdentifier }
     *     
     */
    public ServiceIdentifier getAdhServiceIdentifier() {
        return adhServiceIdentifier;
    }

    /**
     * Sets the value of the adhServiceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIdentifier }
     *     
     */
    public void setAdhServiceIdentifier(ServiceIdentifier value) {
        this.adhServiceIdentifier = value;
    }

    /**
     * Gets the value of the rdrServiceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIdentifier }
     *     
     */
    public ServiceIdentifier getRdrServiceIdentifier() {
        return rdrServiceIdentifier;
    }

    /**
     * Sets the value of the rdrServiceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIdentifier }
     *     
     */
    public void setRdrServiceIdentifier(ServiceIdentifier value) {
        this.rdrServiceIdentifier = value;
    }

    /**
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link Asset }
     *     
     */
    public Asset getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asset }
     *     
     */
    public void setAsset(Asset value) {
        this.asset = value;
    }

    /**
     * Gets the value of the attributeMap property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getAttributeMap() {
        return attributeMap;
    }

    /**
     * Sets the value of the attributeMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setAttributeMap(Map value) {
        this.attributeMap = value;
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
            String theContextIdentifier;
            theContextIdentifier = this.getContextIdentifier();
            strategy.appendField(locator, this, "contextIdentifier", buffer, theContextIdentifier);
        }
        {
            ServiceIdentifier theAdhServiceIdentifier;
            theAdhServiceIdentifier = this.getAdhServiceIdentifier();
            strategy.appendField(locator, this, "adhServiceIdentifier", buffer, theAdhServiceIdentifier);
        }
        {
            ServiceIdentifier theRdrServiceIdentifier;
            theRdrServiceIdentifier = this.getRdrServiceIdentifier();
            strategy.appendField(locator, this, "rdrServiceIdentifier", buffer, theRdrServiceIdentifier);
        }
        {
            Asset theAsset;
            theAsset = this.getAsset();
            strategy.appendField(locator, this, "asset", buffer, theAsset);
        }
        {
            Map theAttributeMap;
            theAttributeMap = this.getAttributeMap();
            strategy.appendField(locator, this, "attributeMap", buffer, theAttributeMap);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OrchestrationContext)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OrchestrationContext that = ((OrchestrationContext) object);
        {
            String lhsContextIdentifier;
            lhsContextIdentifier = this.getContextIdentifier();
            String rhsContextIdentifier;
            rhsContextIdentifier = that.getContextIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contextIdentifier", lhsContextIdentifier), LocatorUtils.property(thatLocator, "contextIdentifier", rhsContextIdentifier), lhsContextIdentifier, rhsContextIdentifier)) {
                return false;
            }
        }
        {
            ServiceIdentifier lhsAdhServiceIdentifier;
            lhsAdhServiceIdentifier = this.getAdhServiceIdentifier();
            ServiceIdentifier rhsAdhServiceIdentifier;
            rhsAdhServiceIdentifier = that.getAdhServiceIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adhServiceIdentifier", lhsAdhServiceIdentifier), LocatorUtils.property(thatLocator, "adhServiceIdentifier", rhsAdhServiceIdentifier), lhsAdhServiceIdentifier, rhsAdhServiceIdentifier)) {
                return false;
            }
        }
        {
            ServiceIdentifier lhsRdrServiceIdentifier;
            lhsRdrServiceIdentifier = this.getRdrServiceIdentifier();
            ServiceIdentifier rhsRdrServiceIdentifier;
            rhsRdrServiceIdentifier = that.getRdrServiceIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rdrServiceIdentifier", lhsRdrServiceIdentifier), LocatorUtils.property(thatLocator, "rdrServiceIdentifier", rhsRdrServiceIdentifier), lhsRdrServiceIdentifier, rhsRdrServiceIdentifier)) {
                return false;
            }
        }
        {
            Asset lhsAsset;
            lhsAsset = this.getAsset();
            Asset rhsAsset;
            rhsAsset = that.getAsset();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asset", lhsAsset), LocatorUtils.property(thatLocator, "asset", rhsAsset), lhsAsset, rhsAsset)) {
                return false;
            }
        }
        {
            Map lhsAttributeMap;
            lhsAttributeMap = this.getAttributeMap();
            Map rhsAttributeMap;
            rhsAttributeMap = that.getAttributeMap();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attributeMap", lhsAttributeMap), LocatorUtils.property(thatLocator, "attributeMap", rhsAttributeMap), lhsAttributeMap, rhsAttributeMap)) {
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
            String theContextIdentifier;
            theContextIdentifier = this.getContextIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contextIdentifier", theContextIdentifier), currentHashCode, theContextIdentifier);
        }
        {
            ServiceIdentifier theAdhServiceIdentifier;
            theAdhServiceIdentifier = this.getAdhServiceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adhServiceIdentifier", theAdhServiceIdentifier), currentHashCode, theAdhServiceIdentifier);
        }
        {
            ServiceIdentifier theRdrServiceIdentifier;
            theRdrServiceIdentifier = this.getRdrServiceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rdrServiceIdentifier", theRdrServiceIdentifier), currentHashCode, theRdrServiceIdentifier);
        }
        {
            Asset theAsset;
            theAsset = this.getAsset();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asset", theAsset), currentHashCode, theAsset);
        }
        {
            Map theAttributeMap;
            theAttributeMap = this.getAttributeMap();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attributeMap", theAttributeMap), currentHashCode, theAttributeMap);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
