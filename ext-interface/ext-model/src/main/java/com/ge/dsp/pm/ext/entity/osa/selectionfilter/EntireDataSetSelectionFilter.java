//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.21 at 01:16:18 AM PDT 
//


package com.ge.dsp.pm.ext.entity.osa.selectionfilter;

import java.io.Serializable;
import java.math.BigInteger;
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
import org.mimosa.osacbmv3_3.SelectionFilter;


/**
 * <p>Java class for EntireDataSetSelectionFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntireDataSetSelectionFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}SelectionFilter">
 *       &lt;sequence>
 *         &lt;element name="entireSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sampleInterval" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="intervalUnits" type="{http://dsp.ge.com/pm/ext/entity/osa/selectionfilter}IntervalUnits" minOccurs="0"/>
 *         &lt;element name="sampleMode" type="{http://dsp.ge.com/pm/ext/entity/osa/selectionfilter}SampleMode" minOccurs="0"/>
 *         &lt;element name="otherSampleValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntireDataSetSelectionFilter", propOrder = {
    "entireSet",
    "sampleInterval",
    "intervalUnits",
    "sampleMode",
    "otherSampleValues"
})
public class EntireDataSetSelectionFilter
    extends SelectionFilter
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(defaultValue = "true")
    protected boolean entireSet;
    protected BigInteger sampleInterval;
    protected IntervalUnits intervalUnits;
    protected SampleMode sampleMode;
    protected String otherSampleValues;

    /**
     * Gets the value of the entireSet property.
     * 
     */
    public boolean isEntireSet() {
        return entireSet;
    }

    /**
     * Sets the value of the entireSet property.
     * 
     */
    public void setEntireSet(boolean value) {
        this.entireSet = value;
    }

    /**
     * Gets the value of the sampleInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSampleInterval() {
        return sampleInterval;
    }

    /**
     * Sets the value of the sampleInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSampleInterval(BigInteger value) {
        this.sampleInterval = value;
    }

    /**
     * Gets the value of the intervalUnits property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalUnits }
     *     
     */
    public IntervalUnits getIntervalUnits() {
        return intervalUnits;
    }

    /**
     * Sets the value of the intervalUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalUnits }
     *     
     */
    public void setIntervalUnits(IntervalUnits value) {
        this.intervalUnits = value;
    }

    /**
     * Gets the value of the sampleMode property.
     * 
     * @return
     *     possible object is
     *     {@link SampleMode }
     *     
     */
    public SampleMode getSampleMode() {
        return sampleMode;
    }

    /**
     * Sets the value of the sampleMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleMode }
     *     
     */
    public void setSampleMode(SampleMode value) {
        this.sampleMode = value;
    }

    /**
     * Gets the value of the otherSampleValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherSampleValues() {
        return otherSampleValues;
    }

    /**
     * Sets the value of the otherSampleValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherSampleValues(String value) {
        this.otherSampleValues = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            boolean theEntireSet;
            theEntireSet = (true?this.isEntireSet():false);
            strategy.appendField(locator, this, "entireSet", buffer, theEntireSet);
        }
        {
            BigInteger theSampleInterval;
            theSampleInterval = this.getSampleInterval();
            strategy.appendField(locator, this, "sampleInterval", buffer, theSampleInterval);
        }
        {
            IntervalUnits theIntervalUnits;
            theIntervalUnits = this.getIntervalUnits();
            strategy.appendField(locator, this, "intervalUnits", buffer, theIntervalUnits);
        }
        {
            SampleMode theSampleMode;
            theSampleMode = this.getSampleMode();
            strategy.appendField(locator, this, "sampleMode", buffer, theSampleMode);
        }
        {
            String theOtherSampleValues;
            theOtherSampleValues = this.getOtherSampleValues();
            strategy.appendField(locator, this, "otherSampleValues", buffer, theOtherSampleValues);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EntireDataSetSelectionFilter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EntireDataSetSelectionFilter that = ((EntireDataSetSelectionFilter) object);
        {
            boolean lhsEntireSet;
            lhsEntireSet = (true?this.isEntireSet():false);
            boolean rhsEntireSet;
            rhsEntireSet = (true?that.isEntireSet():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entireSet", lhsEntireSet), LocatorUtils.property(thatLocator, "entireSet", rhsEntireSet), lhsEntireSet, rhsEntireSet)) {
                return false;
            }
        }
        {
            BigInteger lhsSampleInterval;
            lhsSampleInterval = this.getSampleInterval();
            BigInteger rhsSampleInterval;
            rhsSampleInterval = that.getSampleInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sampleInterval", lhsSampleInterval), LocatorUtils.property(thatLocator, "sampleInterval", rhsSampleInterval), lhsSampleInterval, rhsSampleInterval)) {
                return false;
            }
        }
        {
            IntervalUnits lhsIntervalUnits;
            lhsIntervalUnits = this.getIntervalUnits();
            IntervalUnits rhsIntervalUnits;
            rhsIntervalUnits = that.getIntervalUnits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intervalUnits", lhsIntervalUnits), LocatorUtils.property(thatLocator, "intervalUnits", rhsIntervalUnits), lhsIntervalUnits, rhsIntervalUnits)) {
                return false;
            }
        }
        {
            SampleMode lhsSampleMode;
            lhsSampleMode = this.getSampleMode();
            SampleMode rhsSampleMode;
            rhsSampleMode = that.getSampleMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sampleMode", lhsSampleMode), LocatorUtils.property(thatLocator, "sampleMode", rhsSampleMode), lhsSampleMode, rhsSampleMode)) {
                return false;
            }
        }
        {
            String lhsOtherSampleValues;
            lhsOtherSampleValues = this.getOtherSampleValues();
            String rhsOtherSampleValues;
            rhsOtherSampleValues = that.getOtherSampleValues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherSampleValues", lhsOtherSampleValues), LocatorUtils.property(thatLocator, "otherSampleValues", rhsOtherSampleValues), lhsOtherSampleValues, rhsOtherSampleValues)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theEntireSet;
            theEntireSet = (true?this.isEntireSet():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entireSet", theEntireSet), currentHashCode, theEntireSet);
        }
        {
            BigInteger theSampleInterval;
            theSampleInterval = this.getSampleInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sampleInterval", theSampleInterval), currentHashCode, theSampleInterval);
        }
        {
            IntervalUnits theIntervalUnits;
            theIntervalUnits = this.getIntervalUnits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intervalUnits", theIntervalUnits), currentHashCode, theIntervalUnits);
        }
        {
            SampleMode theSampleMode;
            theSampleMode = this.getSampleMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sampleMode", theSampleMode), currentHashCode, theSampleMode);
        }
        {
            String theOtherSampleValues;
            theOtherSampleValues = this.getOtherSampleValues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherSampleValues", theOtherSampleValues), currentHashCode, theOtherSampleValues);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
