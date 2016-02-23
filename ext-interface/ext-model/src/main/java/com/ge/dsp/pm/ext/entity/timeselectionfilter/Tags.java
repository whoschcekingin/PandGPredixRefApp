//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//


package com.ge.dsp.pm.ext.entity.timeselectionfilter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.util.map.SimpleMap;
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
 * <p>Java class for Tags complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tags">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aggregator" type="{http://dsp.ge.com/pm/ext/entity/timeselectionfilter}Aggregator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://dsp.ge.com/pm/ext/entity/util/map}SimpleMap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupBy" type="{http://dsp.ge.com/pm/ext/entity/timeselectionfilter}GroupBy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tags", propOrder = {
    "name",
    "aggregator",
    "attribute",
    "groupBy"
})
public class Tags
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String name;
    protected List<Aggregator> aggregator;
    protected List<SimpleMap> attribute;
    @XmlElement(required = true)
    protected GroupBy groupBy;

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
     * Gets the value of the aggregator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aggregator }
     * 
     * 
     */
    public List<Aggregator> getAggregator() {
        if (aggregator == null) {
            aggregator = new ArrayList<Aggregator>();
        }
        return this.aggregator;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleMap }
     * 
     * 
     */
    public List<SimpleMap> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<SimpleMap>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the groupBy property.
     * 
     * @return
     *     possible object is
     *     {@link GroupBy }
     *     
     */
    public GroupBy getGroupBy() {
        return groupBy;
    }

    /**
     * Sets the value of the groupBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupBy }
     *     
     */
    public void setGroupBy(GroupBy value) {
        this.groupBy = value;
    }

    /**
     * Sets the value of the aggregator property.
     * 
     * @param aggregator
     *     allowed object is
     *     {@link Aggregator }
     *     
     */
    public void setAggregator(List<Aggregator> aggregator) {
        this.aggregator = aggregator;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param attribute
     *     allowed object is
     *     {@link SimpleMap }
     *     
     */
    public void setAttribute(List<SimpleMap> attribute) {
        this.attribute = attribute;
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            List<Aggregator> theAggregator;
            theAggregator = (((this.aggregator!= null)&&(!this.aggregator.isEmpty()))?this.getAggregator():null);
            strategy.appendField(locator, this, "aggregator", buffer, theAggregator);
        }
        {
            List<SimpleMap> theAttribute;
            theAttribute = (((this.attribute!= null)&&(!this.attribute.isEmpty()))?this.getAttribute():null);
            strategy.appendField(locator, this, "attribute", buffer, theAttribute);
        }
        {
            GroupBy theGroupBy;
            theGroupBy = this.getGroupBy();
            strategy.appendField(locator, this, "groupBy", buffer, theGroupBy);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Tags)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Tags that = ((Tags) object);
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
            List<Aggregator> lhsAggregator;
            lhsAggregator = (((this.aggregator!= null)&&(!this.aggregator.isEmpty()))?this.getAggregator():null);
            List<Aggregator> rhsAggregator;
            rhsAggregator = (((that.aggregator!= null)&&(!that.aggregator.isEmpty()))?that.getAggregator():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aggregator", lhsAggregator), LocatorUtils.property(thatLocator, "aggregator", rhsAggregator), lhsAggregator, rhsAggregator)) {
                return false;
            }
        }
        {
            List<SimpleMap> lhsAttribute;
            lhsAttribute = (((this.attribute!= null)&&(!this.attribute.isEmpty()))?this.getAttribute():null);
            List<SimpleMap> rhsAttribute;
            rhsAttribute = (((that.attribute!= null)&&(!that.attribute.isEmpty()))?that.getAttribute():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attribute", lhsAttribute), LocatorUtils.property(thatLocator, "attribute", rhsAttribute), lhsAttribute, rhsAttribute)) {
                return false;
            }
        }
        {
            GroupBy lhsGroupBy;
            lhsGroupBy = this.getGroupBy();
            GroupBy rhsGroupBy;
            rhsGroupBy = that.getGroupBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupBy", lhsGroupBy), LocatorUtils.property(thatLocator, "groupBy", rhsGroupBy), lhsGroupBy, rhsGroupBy)) {
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            List<Aggregator> theAggregator;
            theAggregator = (((this.aggregator!= null)&&(!this.aggregator.isEmpty()))?this.getAggregator():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aggregator", theAggregator), currentHashCode, theAggregator);
        }
        {
            List<SimpleMap> theAttribute;
            theAttribute = (((this.attribute!= null)&&(!this.attribute.isEmpty()))?this.getAttribute():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attribute", theAttribute), currentHashCode, theAttribute);
        }
        {
            GroupBy theGroupBy;
            theGroupBy = this.getGroupBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupBy", theGroupBy), currentHashCode, theGroupBy);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}