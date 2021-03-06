//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:40:43 PM IST 
//


package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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


/**
 * <p>Java class for AndConnector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AndConnector">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}LogicalConnector">
 *       &lt;sequence>
 *         &lt;element name="conjuncts" type="{http://www.mimosa.org/OSACBMV3.3.1}LogicalConnector" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AndConnector", propOrder = {
    "conjuncts"
})
public class AndConnector
    extends LogicalConnector
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<LogicalConnector> conjuncts;

    /**
     * Gets the value of the conjuncts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conjuncts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConjuncts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogicalConnector }
     * 
     * 
     */
    public List<LogicalConnector> getConjuncts() {
        if (conjuncts == null) {
            conjuncts = new ArrayList<LogicalConnector>();
        }
        return this.conjuncts;
    }

    /**
     * Sets the value of the conjuncts property.
     * 
     * @param conjuncts
     *     allowed object is
     *     {@link LogicalConnector }
     *     
     */
    public void setConjuncts(List<LogicalConnector> conjuncts) {
        this.conjuncts = conjuncts;
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
            List<LogicalConnector> theConjuncts;
            theConjuncts = (((this.conjuncts!= null)&&(!this.conjuncts.isEmpty()))?this.getConjuncts():null);
            strategy.appendField(locator, this, "conjuncts", buffer, theConjuncts);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AndConnector)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AndConnector that = ((AndConnector) object);
        {
            List<LogicalConnector> lhsConjuncts;
            lhsConjuncts = (((this.conjuncts!= null)&&(!this.conjuncts.isEmpty()))?this.getConjuncts():null);
            List<LogicalConnector> rhsConjuncts;
            rhsConjuncts = (((that.conjuncts!= null)&&(!that.conjuncts.isEmpty()))?that.getConjuncts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conjuncts", lhsConjuncts), LocatorUtils.property(thatLocator, "conjuncts", rhsConjuncts), lhsConjuncts, rhsConjuncts)) {
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
            List<LogicalConnector> theConjuncts;
            theConjuncts = (((this.conjuncts!= null)&&(!this.conjuncts.isEmpty()))?this.getConjuncts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conjuncts", theConjuncts), currentHashCode, theConjuncts);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
