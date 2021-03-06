
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
 * <p>Java class for PADataEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PADataEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}DataEvent">
 *       &lt;sequence>
 *         &lt;element name="itemPrognosis" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemPrognosis" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prognosis" type="{http://www.mimosa.org/OSACBMV3.3.1}AmbiguityGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PADataEvent", propOrder = {
    "itemPrognosis",
    "prognosis"
})
public class PADataEvent
    extends DataEvent
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<ItemPrognosis> itemPrognosis;
    protected AmbiguityGroup prognosis;

    /**
     * Gets the value of the itemPrognosis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPrognosis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPrognosis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPrognosis }
     * 
     * 
     */
    public List<ItemPrognosis> getItemPrognosis() {
        if (itemPrognosis == null) {
            itemPrognosis = new ArrayList<ItemPrognosis>();
        }
        return this.itemPrognosis;
    }

    /**
     * Gets the value of the prognosis property.
     * 
     * @return
     *     possible object is
     *     {@link AmbiguityGroup }
     *     
     */
    public AmbiguityGroup getPrognosis() {
        return prognosis;
    }

    /**
     * Sets the value of the prognosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmbiguityGroup }
     *     
     */
    public void setPrognosis(AmbiguityGroup value) {
        this.prognosis = value;
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
            List<ItemPrognosis> theItemPrognosis;
            theItemPrognosis = (((this.itemPrognosis!= null)&&(!this.itemPrognosis.isEmpty()))?this.getItemPrognosis():null);
            strategy.appendField(locator, this, "itemPrognosis", buffer, theItemPrognosis);
        }
        {
            AmbiguityGroup thePrognosis;
            thePrognosis = this.getPrognosis();
            strategy.appendField(locator, this, "prognosis", buffer, thePrognosis);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PADataEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PADataEvent that = ((PADataEvent) object);
        {
            List<ItemPrognosis> lhsItemPrognosis;
            lhsItemPrognosis = (((this.itemPrognosis!= null)&&(!this.itemPrognosis.isEmpty()))?this.getItemPrognosis():null);
            List<ItemPrognosis> rhsItemPrognosis;
            rhsItemPrognosis = (((that.itemPrognosis!= null)&&(!that.itemPrognosis.isEmpty()))?that.getItemPrognosis():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemPrognosis", lhsItemPrognosis), LocatorUtils.property(thatLocator, "itemPrognosis", rhsItemPrognosis), lhsItemPrognosis, rhsItemPrognosis)) {
                return false;
            }
        }
        {
            AmbiguityGroup lhsPrognosis;
            lhsPrognosis = this.getPrognosis();
            AmbiguityGroup rhsPrognosis;
            rhsPrognosis = that.getPrognosis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prognosis", lhsPrognosis), LocatorUtils.property(thatLocator, "prognosis", rhsPrognosis), lhsPrognosis, rhsPrognosis)) {
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
            List<ItemPrognosis> theItemPrognosis;
            theItemPrognosis = (((this.itemPrognosis!= null)&&(!this.itemPrognosis.isEmpty()))?this.getItemPrognosis():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemPrognosis", theItemPrognosis), currentHashCode, theItemPrognosis);
        }
        {
            AmbiguityGroup thePrognosis;
            thePrognosis = this.getPrognosis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prognosis", thePrognosis), currentHashCode, thePrognosis);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
