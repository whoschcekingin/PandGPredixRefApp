
package com.ge.dsp.pm.ext.entity.fielddata;

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
 * <p>Java class for FieldDataList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldDataList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/fielddata}fieldData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldDataList", propOrder = {
    "fieldData"
})
public class FieldDataList
    implements Serializable, Equals, HashCode, ToString
{

    protected List<FieldData> fieldData;

    /**
     * Gets the value of the fieldData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldData }
     * 
     * 
     */
    public List<FieldData> getFieldData() {
        if (fieldData == null) {
            fieldData = new ArrayList<FieldData>();
        }
        return this.fieldData;
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
            List<FieldData> theFieldData;
            theFieldData = (((this.fieldData!= null)&&(!this.fieldData.isEmpty()))?this.getFieldData():null);
            strategy.appendField(locator, this, "fieldData", buffer, theFieldData);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FieldDataList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FieldDataList that = ((FieldDataList) object);
        {
            List<FieldData> lhsFieldData;
            lhsFieldData = (((this.fieldData!= null)&&(!this.fieldData.isEmpty()))?this.getFieldData():null);
            List<FieldData> rhsFieldData;
            rhsFieldData = (((that.fieldData!= null)&&(!that.fieldData.isEmpty()))?that.getFieldData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldData", lhsFieldData), LocatorUtils.property(thatLocator, "fieldData", rhsFieldData), lhsFieldData, rhsFieldData)) {
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
            List<FieldData> theFieldData;
            theFieldData = (((this.fieldData!= null)&&(!this.fieldData.isEmpty()))?this.getFieldData():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldData", theFieldData), currentHashCode, theFieldData);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
