
package com.ge.dsp.pm.ext.entity.tenant.tenantidentifier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for TenantIdentifierList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenantIdentifierList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/tenant/tenantidentifier}tenantIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenantIdentifierList", propOrder = {
    "tenantIdentifier"
})
public class TenantIdentifierList
    implements Serializable, Equals, HashCode, ToString
{

    protected List<TenantIdentifier> tenantIdentifier;

    /**
     * Gets the value of the tenantIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenantIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenantIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenantIdentifier }
     * 
     * 
     */
    public List<TenantIdentifier> getTenantIdentifier() {
        if (tenantIdentifier == null) {
            tenantIdentifier = new ArrayList<TenantIdentifier>();
        }
        return this.tenantIdentifier;
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
            List<TenantIdentifier> theTenantIdentifier;
            theTenantIdentifier = (((this.tenantIdentifier!= null)&&(!this.tenantIdentifier.isEmpty()))?this.getTenantIdentifier():null);
            strategy.appendField(locator, this, "tenantIdentifier", buffer, theTenantIdentifier);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TenantIdentifierList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TenantIdentifierList that = ((TenantIdentifierList) object);
        {
            List<TenantIdentifier> lhsTenantIdentifier;
            lhsTenantIdentifier = (((this.tenantIdentifier!= null)&&(!this.tenantIdentifier.isEmpty()))?this.getTenantIdentifier():null);
            List<TenantIdentifier> rhsTenantIdentifier;
            rhsTenantIdentifier = (((that.tenantIdentifier!= null)&&(!that.tenantIdentifier.isEmpty()))?that.getTenantIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenantIdentifier", lhsTenantIdentifier), LocatorUtils.property(thatLocator, "tenantIdentifier", rhsTenantIdentifier), lhsTenantIdentifier, rhsTenantIdentifier)) {
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
            List<TenantIdentifier> theTenantIdentifier;
            theTenantIdentifier = (((this.tenantIdentifier!= null)&&(!this.tenantIdentifier.isEmpty()))?this.getTenantIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenantIdentifier", theTenantIdentifier), currentHashCode, theTenantIdentifier);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
