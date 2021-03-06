
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for MonitorId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitorId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="itemId" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemId" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.mimosa.org/OSACBMV3.3.1}Site" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.mimosa.org/OSACBMV3.3.1}DataIdType"/>
 *         &lt;element name="selectionFilter" type="{http://www.mimosa.org/OSACBMV3.3.1}SelectionFilter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorId", propOrder = {
    "id",
    "itemId",
    "site",
    "type",
    "selectionFilter"
})
public class MonitorId
    implements Serializable, Equals, HashCode, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    protected ItemId itemId;
    protected Site site;
    @XmlElement(required = true)
    protected DataIdType type;
    @XmlElement(nillable = true)
    protected List<SelectionFilter> selectionFilter;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemId }
     *     
     */
    public ItemId getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemId }
     *     
     */
    public void setItemId(ItemId value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setSite(Site value) {
        this.site = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DataIdType }
     *     
     */
    public DataIdType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataIdType }
     *     
     */
    public void setType(DataIdType value) {
        this.type = value;
    }

    /**
     * Gets the value of the selectionFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionFilter }
     * 
     * 
     */
    public List<SelectionFilter> getSelectionFilter() {
        if (selectionFilter == null) {
            selectionFilter = new ArrayList<SelectionFilter>();
        }
        return this.selectionFilter;
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
            long theId;
            theId = (true?this.getId(): 0L);
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            strategy.appendField(locator, this, "itemId", buffer, theItemId);
        }
        {
            Site theSite;
            theSite = this.getSite();
            strategy.appendField(locator, this, "site", buffer, theSite);
        }
        {
            DataIdType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            List<SelectionFilter> theSelectionFilter;
            theSelectionFilter = (((this.selectionFilter!= null)&&(!this.selectionFilter.isEmpty()))?this.getSelectionFilter():null);
            strategy.appendField(locator, this, "selectionFilter", buffer, theSelectionFilter);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MonitorId)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MonitorId that = ((MonitorId) object);
        {
            long lhsId;
            lhsId = (true?this.getId(): 0L);
            long rhsId;
            rhsId = (true?that.getId(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            ItemId lhsItemId;
            lhsItemId = this.getItemId();
            ItemId rhsItemId;
            rhsItemId = that.getItemId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemId", lhsItemId), LocatorUtils.property(thatLocator, "itemId", rhsItemId), lhsItemId, rhsItemId)) {
                return false;
            }
        }
        {
            Site lhsSite;
            lhsSite = this.getSite();
            Site rhsSite;
            rhsSite = that.getSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "site", lhsSite), LocatorUtils.property(thatLocator, "site", rhsSite), lhsSite, rhsSite)) {
                return false;
            }
        }
        {
            DataIdType lhsType;
            lhsType = this.getType();
            DataIdType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            List<SelectionFilter> lhsSelectionFilter;
            lhsSelectionFilter = (((this.selectionFilter!= null)&&(!this.selectionFilter.isEmpty()))?this.getSelectionFilter():null);
            List<SelectionFilter> rhsSelectionFilter;
            rhsSelectionFilter = (((that.selectionFilter!= null)&&(!that.selectionFilter.isEmpty()))?that.getSelectionFilter():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selectionFilter", lhsSelectionFilter), LocatorUtils.property(thatLocator, "selectionFilter", rhsSelectionFilter), lhsSelectionFilter, rhsSelectionFilter)) {
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
            long theId;
            theId = (true?this.getId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemId", theItemId), currentHashCode, theItemId);
        }
        {
            Site theSite;
            theSite = this.getSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "site", theSite), currentHashCode, theSite);
        }
        {
            DataIdType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            List<SelectionFilter> theSelectionFilter;
            theSelectionFilter = (((this.selectionFilter!= null)&&(!this.selectionFilter.isEmpty()))?this.getSelectionFilter():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selectionFilter", theSelectionFilter), currentHashCode, theSelectionFilter);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
