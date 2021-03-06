//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:40:43 PM IST 
//


package com.ge.dsp.pm.ext.entity.strategysequence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.strategy.Strategy;
import com.ge.dsp.pm.ext.entity.strategydetail.StrategyDetail;
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
 * 
 * 				A set of Strategies that can be ordered. There are 2 use-cases. Passing information for strategy storage
 * 				and maintenance purposes. Passing information for strategy processing purposes.
 * 
 * 				Within each of those there are 2 use-cases. Using an Action and not using Action.
 * 
 * 				Not Using an Action - The strategyList is simply a List of of strategies relative to a sequence number.
 * 				This allows for passing different kinds of strategies (RETREIVAL, STORAGE, etc) relative to the same
 * 				sequence number.
 * 
 * 				Using an Action - this allows for driving an ActionBehavior relative to an ActionType and within the
 * 				ActionType relative to an ActionCondition.
 * 
 * 				Lining these 'columns' up in a spreadsheet or database table is more intuitive to see the power of this
 * 				design. This allows for data driven behaviors using an Action and encapsulation of behavior within a
 * 				strategy.
 * 			
 * 
 * <p>Java class for StrategySequence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategySequence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/strategy}strategy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/util/map}map" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/strategydetail}strategyDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategySequence", propOrder = {
    "sequence",
    "strategy",
    "map",
    "strategyDetail"
})
public class StrategySequence
    implements Serializable, Equals, HashCode, ToString
{

    protected int sequence;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/strategy")
    protected List<Strategy> strategy;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/util/map")
    protected Map map;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/strategydetail")
    protected List<StrategyDetail> strategyDetail;

    /**
     * Gets the value of the sequence property.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the strategy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Strategy }
     * 
     * 
     */
    public List<Strategy> getStrategy() {
        if (strategy == null) {
            strategy = new ArrayList<Strategy>();
        }
        return this.strategy;
    }

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setMap(Map value) {
        this.map = value;
    }

    /**
     * Gets the value of the strategyDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategyDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategyDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrategyDetail }
     * 
     * 
     */
    public List<StrategyDetail> getStrategyDetail() {
        if (strategyDetail == null) {
            strategyDetail = new ArrayList<StrategyDetail>();
        }
        return this.strategyDetail;
    }

    /**
     * Sets the value of the strategy property.
     * 
     * @param strategy
     *     allowed object is
     *     {@link Strategy }
     *     
     */
    public void setStrategy(List<Strategy> strategy) {
        this.strategy = strategy;
    }

    /**
     * Sets the value of the strategyDetail property.
     * 
     * @param strategyDetail
     *     allowed object is
     *     {@link StrategyDetail }
     *     
     */
    public void setStrategyDetail(List<StrategyDetail> strategyDetail) {
        this.strategyDetail = strategyDetail;
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
            int theSequence;
            theSequence = (true?this.getSequence(): 0);
            strategy.appendField(locator, this, "sequence", buffer, theSequence);
        }
        {
            List<Strategy> theStrategy;
            theStrategy = (((this.strategy!= null)&&(!this.strategy.isEmpty()))?this.getStrategy():null);
            strategy.appendField(locator, this, "strategy", buffer, theStrategy);
        }
        {
            Map theMap;
            theMap = this.getMap();
            strategy.appendField(locator, this, "map", buffer, theMap);
        }
        {
            List<StrategyDetail> theStrategyDetail;
            theStrategyDetail = (((this.strategyDetail!= null)&&(!this.strategyDetail.isEmpty()))?this.getStrategyDetail():null);
            strategy.appendField(locator, this, "strategyDetail", buffer, theStrategyDetail);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StrategySequence)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StrategySequence that = ((StrategySequence) object);
        {
            int lhsSequence;
            lhsSequence = (true?this.getSequence(): 0);
            int rhsSequence;
            rhsSequence = (true?that.getSequence(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequence", lhsSequence), LocatorUtils.property(thatLocator, "sequence", rhsSequence), lhsSequence, rhsSequence)) {
                return false;
            }
        }
        {
            List<Strategy> lhsStrategy;
            lhsStrategy = (((this.strategy!= null)&&(!this.strategy.isEmpty()))?this.getStrategy():null);
            List<Strategy> rhsStrategy;
            rhsStrategy = (((that.strategy!= null)&&(!that.strategy.isEmpty()))?that.getStrategy():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strategy", lhsStrategy), LocatorUtils.property(thatLocator, "strategy", rhsStrategy), lhsStrategy, rhsStrategy)) {
                return false;
            }
        }
        {
            Map lhsMap;
            lhsMap = this.getMap();
            Map rhsMap;
            rhsMap = that.getMap();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "map", lhsMap), LocatorUtils.property(thatLocator, "map", rhsMap), lhsMap, rhsMap)) {
                return false;
            }
        }
        {
            List<StrategyDetail> lhsStrategyDetail;
            lhsStrategyDetail = (((this.strategyDetail!= null)&&(!this.strategyDetail.isEmpty()))?this.getStrategyDetail():null);
            List<StrategyDetail> rhsStrategyDetail;
            rhsStrategyDetail = (((that.strategyDetail!= null)&&(!that.strategyDetail.isEmpty()))?that.getStrategyDetail():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strategyDetail", lhsStrategyDetail), LocatorUtils.property(thatLocator, "strategyDetail", rhsStrategyDetail), lhsStrategyDetail, rhsStrategyDetail)) {
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
            int theSequence;
            theSequence = (true?this.getSequence(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequence", theSequence), currentHashCode, theSequence);
        }
        {
            List<Strategy> theStrategy;
            theStrategy = (((this.strategy!= null)&&(!this.strategy.isEmpty()))?this.getStrategy():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strategy", theStrategy), currentHashCode, theStrategy);
        }
        {
            Map theMap;
            theMap = this.getMap();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "map", theMap), currentHashCode, theMap);
        }
        {
            List<StrategyDetail> theStrategyDetail;
            theStrategyDetail = (((this.strategyDetail!= null)&&(!this.strategyDetail.isEmpty()))?this.getStrategyDetail():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strategyDetail", theStrategyDetail), currentHashCode, theStrategyDetail);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
