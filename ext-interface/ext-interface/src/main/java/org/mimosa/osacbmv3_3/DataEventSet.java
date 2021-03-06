
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
 * <p>Java class for DataEventSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataEventSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dataEvents" type="{http://www.mimosa.org/OSACBMV3.3.1}DataEvent" maxOccurs="unbounded"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="sequenceNum" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.mimosa.org/OSACBMV3.3.1}Site"/>
 *         &lt;element name="time" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataEventSet", propOrder = {
    "alertStatus",
    "dataEvents",
    "id",
    "sequenceNum",
    "site",
    "time"
})
public class DataEventSet
    implements Serializable, Equals, HashCode, ToString
{

    protected Boolean alertStatus;
    @XmlElement(required = true)
    protected List<DataEvent> dataEvents;
    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceNum;
    @XmlElement(required = true)
    protected Site site;
    @XmlElement(required = true)
    protected OsacbmTime time;

    /**
     * Gets the value of the alertStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertStatus() {
        return alertStatus;
    }

    /**
     * Sets the value of the alertStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertStatus(Boolean value) {
        this.alertStatus = value;
    }

    /**
     * Gets the value of the dataEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataEvent }
     * 
     * 
     */
    public List<DataEvent> getDataEvents() {
        if (dataEvents == null) {
            dataEvents = new ArrayList<DataEvent>();
        }
        return this.dataEvents;
    }

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
     * Gets the value of the sequenceNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceNum() {
        return sequenceNum;
    }

    /**
     * Sets the value of the sequenceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceNum(Long value) {
        this.sequenceNum = value;
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
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setTime(OsacbmTime value) {
        this.time = value;
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
            Boolean theAlertStatus;
            theAlertStatus = this.isAlertStatus();
            strategy.appendField(locator, this, "alertStatus", buffer, theAlertStatus);
        }
        {
            List<DataEvent> theDataEvents;
            theDataEvents = (((this.dataEvents!= null)&&(!this.dataEvents.isEmpty()))?this.getDataEvents():null);
            strategy.appendField(locator, this, "dataEvents", buffer, theDataEvents);
        }
        {
            long theId;
            theId = (true?this.getId(): 0L);
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            Long theSequenceNum;
            theSequenceNum = this.getSequenceNum();
            strategy.appendField(locator, this, "sequenceNum", buffer, theSequenceNum);
        }
        {
            Site theSite;
            theSite = this.getSite();
            strategy.appendField(locator, this, "site", buffer, theSite);
        }
        {
            OsacbmTime theTime;
            theTime = this.getTime();
            strategy.appendField(locator, this, "time", buffer, theTime);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DataEventSet)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DataEventSet that = ((DataEventSet) object);
        {
            Boolean lhsAlertStatus;
            lhsAlertStatus = this.isAlertStatus();
            Boolean rhsAlertStatus;
            rhsAlertStatus = that.isAlertStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alertStatus", lhsAlertStatus), LocatorUtils.property(thatLocator, "alertStatus", rhsAlertStatus), lhsAlertStatus, rhsAlertStatus)) {
                return false;
            }
        }
        {
            List<DataEvent> lhsDataEvents;
            lhsDataEvents = (((this.dataEvents!= null)&&(!this.dataEvents.isEmpty()))?this.getDataEvents():null);
            List<DataEvent> rhsDataEvents;
            rhsDataEvents = (((that.dataEvents!= null)&&(!that.dataEvents.isEmpty()))?that.getDataEvents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataEvents", lhsDataEvents), LocatorUtils.property(thatLocator, "dataEvents", rhsDataEvents), lhsDataEvents, rhsDataEvents)) {
                return false;
            }
        }
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
            Long lhsSequenceNum;
            lhsSequenceNum = this.getSequenceNum();
            Long rhsSequenceNum;
            rhsSequenceNum = that.getSequenceNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNum", lhsSequenceNum), LocatorUtils.property(thatLocator, "sequenceNum", rhsSequenceNum), lhsSequenceNum, rhsSequenceNum)) {
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
            OsacbmTime lhsTime;
            lhsTime = this.getTime();
            OsacbmTime rhsTime;
            rhsTime = that.getTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "time", lhsTime), LocatorUtils.property(thatLocator, "time", rhsTime), lhsTime, rhsTime)) {
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
            Boolean theAlertStatus;
            theAlertStatus = this.isAlertStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertStatus", theAlertStatus), currentHashCode, theAlertStatus);
        }
        {
            List<DataEvent> theDataEvents;
            theDataEvents = (((this.dataEvents!= null)&&(!this.dataEvents.isEmpty()))?this.getDataEvents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataEvents", theDataEvents), currentHashCode, theDataEvents);
        }
        {
            long theId;
            theId = (true?this.getId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            Long theSequenceNum;
            theSequenceNum = this.getSequenceNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNum", theSequenceNum), currentHashCode, theSequenceNum);
        }
        {
            Site theSite;
            theSite = this.getSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "site", theSite), currentHashCode, theSite);
        }
        {
            OsacbmTime theTime;
            theTime = this.getTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "time", theTime), currentHashCode, theTime);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
