
package com.ge.dsp.pm.ext.entity.selectionfilter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.fieldidentifiervalue.FieldIdentifierObject;
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
 * <p>Java class for NestedSelectionFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NestedSelectionFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dsp.ge.com/pm/ext/entity/selectionfilter}SelectionFilter">
 *       &lt;sequence>
 *         &lt;element name="fieldIdentifierValue" type="{http://dsp.ge.com/pm/ext/entity/fieldidentifiervalue}FieldIdentifierObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://dsp.ge.com/pm/ext/entity/selectionfilter}OperatorEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NestedSelectionFilter", propOrder = {
    "fieldIdentifierValue",
    "operator"
})
public class NestedSelectionFilter
    extends SelectionFilter
    implements Serializable, Equals, HashCode, ToString
{

    protected List<FieldIdentifierObject> fieldIdentifierValue;
    @XmlElement(required = true)
    protected OperatorEnum operator;

    /**
     * Gets the value of the fieldIdentifierValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldIdentifierValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldIdentifierValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldIdentifierObject }
     * 
     * 
     */
    public List<FieldIdentifierObject> getFieldIdentifierValue() {
        if (fieldIdentifierValue == null) {
            fieldIdentifierValue = new ArrayList<FieldIdentifierObject>();
        }
        return this.fieldIdentifierValue;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorEnum }
     *     
     */
    public OperatorEnum getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorEnum }
     *     
     */
    public void setOperator(OperatorEnum value) {
        this.operator = value;
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
            List<FieldIdentifierObject> theFieldIdentifierValue;
            theFieldIdentifierValue = (((this.fieldIdentifierValue!= null)&&(!this.fieldIdentifierValue.isEmpty()))?this.getFieldIdentifierValue():null);
            strategy.appendField(locator, this, "fieldIdentifierValue", buffer, theFieldIdentifierValue);
        }
        {
            OperatorEnum theOperator;
            theOperator = this.getOperator();
            strategy.appendField(locator, this, "operator", buffer, theOperator);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NestedSelectionFilter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final NestedSelectionFilter that = ((NestedSelectionFilter) object);
        {
            List<FieldIdentifierObject> lhsFieldIdentifierValue;
            lhsFieldIdentifierValue = (((this.fieldIdentifierValue!= null)&&(!this.fieldIdentifierValue.isEmpty()))?this.getFieldIdentifierValue():null);
            List<FieldIdentifierObject> rhsFieldIdentifierValue;
            rhsFieldIdentifierValue = (((that.fieldIdentifierValue!= null)&&(!that.fieldIdentifierValue.isEmpty()))?that.getFieldIdentifierValue():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldIdentifierValue", lhsFieldIdentifierValue), LocatorUtils.property(thatLocator, "fieldIdentifierValue", rhsFieldIdentifierValue), lhsFieldIdentifierValue, rhsFieldIdentifierValue)) {
                return false;
            }
        }
        {
            OperatorEnum lhsOperator;
            lhsOperator = this.getOperator();
            OperatorEnum rhsOperator;
            rhsOperator = that.getOperator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operator", lhsOperator), LocatorUtils.property(thatLocator, "operator", rhsOperator), lhsOperator, rhsOperator)) {
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
            List<FieldIdentifierObject> theFieldIdentifierValue;
            theFieldIdentifierValue = (((this.fieldIdentifierValue!= null)&&(!this.fieldIdentifierValue.isEmpty()))?this.getFieldIdentifierValue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldIdentifierValue", theFieldIdentifierValue), currentHashCode, theFieldIdentifierValue);
        }
        {
            OperatorEnum theOperator;
            theOperator = this.getOperator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operator", theOperator), currentHashCode, theOperator);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
