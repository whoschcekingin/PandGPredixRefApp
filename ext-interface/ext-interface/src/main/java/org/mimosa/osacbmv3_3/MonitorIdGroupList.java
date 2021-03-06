
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
 * <p>Java class for MonitorIdGroupList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitorIdGroupList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monitorIdGroup" type="{http://www.mimosa.org/OSACBMV3.3.1}MonitorIdGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorIdGroupList", propOrder = {
    "monitorIdGroup"
})
public class MonitorIdGroupList
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<MonitorIdGroup> monitorIdGroup;

    /**
     * Gets the value of the monitorIdGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitorIdGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitorIdGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitorIdGroup }
     * 
     * 
     */
    public List<MonitorIdGroup> getMonitorIdGroup() {
        if (monitorIdGroup == null) {
            monitorIdGroup = new ArrayList<MonitorIdGroup>();
        }
        return this.monitorIdGroup;
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
            List<MonitorIdGroup> theMonitorIdGroup;
            theMonitorIdGroup = (((this.monitorIdGroup!= null)&&(!this.monitorIdGroup.isEmpty()))?this.getMonitorIdGroup():null);
            strategy.appendField(locator, this, "monitorIdGroup", buffer, theMonitorIdGroup);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MonitorIdGroupList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MonitorIdGroupList that = ((MonitorIdGroupList) object);
        {
            List<MonitorIdGroup> lhsMonitorIdGroup;
            lhsMonitorIdGroup = (((this.monitorIdGroup!= null)&&(!this.monitorIdGroup.isEmpty()))?this.getMonitorIdGroup():null);
            List<MonitorIdGroup> rhsMonitorIdGroup;
            rhsMonitorIdGroup = (((that.monitorIdGroup!= null)&&(!that.monitorIdGroup.isEmpty()))?that.getMonitorIdGroup():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monitorIdGroup", lhsMonitorIdGroup), LocatorUtils.property(thatLocator, "monitorIdGroup", rhsMonitorIdGroup), lhsMonitorIdGroup, rhsMonitorIdGroup)) {
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
            List<MonitorIdGroup> theMonitorIdGroup;
            theMonitorIdGroup = (((this.monitorIdGroup!= null)&&(!this.monitorIdGroup.isEmpty()))?this.getMonitorIdGroup():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monitorIdGroup", theMonitorIdGroup), currentHashCode, theMonitorIdGroup);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
