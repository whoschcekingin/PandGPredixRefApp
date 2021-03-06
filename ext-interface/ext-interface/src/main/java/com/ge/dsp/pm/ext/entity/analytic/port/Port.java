
package com.ge.dsp.pm.ext.entity.analytic.port;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.analytic.port.portidentifier.PortIdentifier;
import com.ge.dsp.pm.ext.entity.fielddata.Data;
import com.ge.dsp.pm.ext.entity.fieldselection.FieldSelection;
import com.ge.dsp.pm.ext.entity.selectionfilter.SelectionFilter;
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
 * 				the criteria for requesting one field from the asset
 * 				data handler
 * 			
 * 
 * <p>Java class for Port complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Port">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/analytic/port/portidentifier}portIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/fieldselection}fieldSelection" minOccurs="0"/>
 *         &lt;element name="portType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/selectionfilter}selectionFilter" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/fielddata}data" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Port", propOrder = {
    "portIdentifier",
    "fieldSelection",
    "portType",
    "selectionFilter",
    "data"
})
public class Port
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/analytic/port/portidentifier")
    protected PortIdentifier portIdentifier;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/fieldselection")
    protected FieldSelection fieldSelection;
    protected String portType;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/selectionfilter")
    protected SelectionFilter selectionFilter;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/fielddata")
    protected Data data;

    /**
     * Gets the value of the portIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PortIdentifier }
     *     
     */
    public PortIdentifier getPortIdentifier() {
        return portIdentifier;
    }

    /**
     * Sets the value of the portIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortIdentifier }
     *     
     */
    public void setPortIdentifier(PortIdentifier value) {
        this.portIdentifier = value;
    }

    /**
     * Gets the value of the fieldSelection property.
     * 
     * @return
     *     possible object is
     *     {@link FieldSelection }
     *     
     */
    public FieldSelection getFieldSelection() {
        return fieldSelection;
    }

    /**
     * Sets the value of the fieldSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldSelection }
     *     
     */
    public void setFieldSelection(FieldSelection value) {
        this.fieldSelection = value;
    }

    /**
     * Gets the value of the portType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortType(String value) {
        this.portType = value;
    }

    /**
     * Gets the value of the selectionFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionFilter }
     *     
     */
    public SelectionFilter getSelectionFilter() {
        return selectionFilter;
    }

    /**
     * Sets the value of the selectionFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionFilter }
     *     
     */
    public void setSelectionFilter(SelectionFilter value) {
        this.selectionFilter = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    public Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    public void setData(Data value) {
        this.data = value;
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
            PortIdentifier thePortIdentifier;
            thePortIdentifier = this.getPortIdentifier();
            strategy.appendField(locator, this, "portIdentifier", buffer, thePortIdentifier);
        }
        {
            FieldSelection theFieldSelection;
            theFieldSelection = this.getFieldSelection();
            strategy.appendField(locator, this, "fieldSelection", buffer, theFieldSelection);
        }
        {
            String thePortType;
            thePortType = this.getPortType();
            strategy.appendField(locator, this, "portType", buffer, thePortType);
        }
        {
            SelectionFilter theSelectionFilter;
            theSelectionFilter = this.getSelectionFilter();
            strategy.appendField(locator, this, "selectionFilter", buffer, theSelectionFilter);
        }
        {
            Data theData;
            theData = this.getData();
            strategy.appendField(locator, this, "data", buffer, theData);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Port)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Port that = ((Port) object);
        {
            PortIdentifier lhsPortIdentifier;
            lhsPortIdentifier = this.getPortIdentifier();
            PortIdentifier rhsPortIdentifier;
            rhsPortIdentifier = that.getPortIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portIdentifier", lhsPortIdentifier), LocatorUtils.property(thatLocator, "portIdentifier", rhsPortIdentifier), lhsPortIdentifier, rhsPortIdentifier)) {
                return false;
            }
        }
        {
            FieldSelection lhsFieldSelection;
            lhsFieldSelection = this.getFieldSelection();
            FieldSelection rhsFieldSelection;
            rhsFieldSelection = that.getFieldSelection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldSelection", lhsFieldSelection), LocatorUtils.property(thatLocator, "fieldSelection", rhsFieldSelection), lhsFieldSelection, rhsFieldSelection)) {
                return false;
            }
        }
        {
            String lhsPortType;
            lhsPortType = this.getPortType();
            String rhsPortType;
            rhsPortType = that.getPortType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portType", lhsPortType), LocatorUtils.property(thatLocator, "portType", rhsPortType), lhsPortType, rhsPortType)) {
                return false;
            }
        }
        {
            SelectionFilter lhsSelectionFilter;
            lhsSelectionFilter = this.getSelectionFilter();
            SelectionFilter rhsSelectionFilter;
            rhsSelectionFilter = that.getSelectionFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selectionFilter", lhsSelectionFilter), LocatorUtils.property(thatLocator, "selectionFilter", rhsSelectionFilter), lhsSelectionFilter, rhsSelectionFilter)) {
                return false;
            }
        }
        {
            Data lhsData;
            lhsData = this.getData();
            Data rhsData;
            rhsData = that.getData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "data", lhsData), LocatorUtils.property(thatLocator, "data", rhsData), lhsData, rhsData)) {
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
            PortIdentifier thePortIdentifier;
            thePortIdentifier = this.getPortIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portIdentifier", thePortIdentifier), currentHashCode, thePortIdentifier);
        }
        {
            FieldSelection theFieldSelection;
            theFieldSelection = this.getFieldSelection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldSelection", theFieldSelection), currentHashCode, theFieldSelection);
        }
        {
            String thePortType;
            thePortType = this.getPortType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portType", thePortType), currentHashCode, thePortType);
        }
        {
            SelectionFilter theSelectionFilter;
            theSelectionFilter = this.getSelectionFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selectionFilter", theSelectionFilter), currentHashCode, theSelectionFilter);
        }
        {
            Data theData;
            theData = this.getData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "data", theData), currentHashCode, theData);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
