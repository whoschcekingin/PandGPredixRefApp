
package com.ge.dsp.pm.ext.entity.sourceinfo;

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
 * <p>Java class for SourceInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceInfoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/sourceinfo}sourceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceInfoList", propOrder = {
    "sourceInfo"
})
public class SourceInfoList
    implements Serializable, Equals, HashCode, ToString
{

    protected List<SourceInfo> sourceInfo;

    /**
     * Gets the value of the sourceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceInfo }
     * 
     * 
     */
    public List<SourceInfo> getSourceInfo() {
        if (sourceInfo == null) {
            sourceInfo = new ArrayList<SourceInfo>();
        }
        return this.sourceInfo;
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
            List<SourceInfo> theSourceInfo;
            theSourceInfo = (((this.sourceInfo!= null)&&(!this.sourceInfo.isEmpty()))?this.getSourceInfo():null);
            strategy.appendField(locator, this, "sourceInfo", buffer, theSourceInfo);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SourceInfoList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SourceInfoList that = ((SourceInfoList) object);
        {
            List<SourceInfo> lhsSourceInfo;
            lhsSourceInfo = (((this.sourceInfo!= null)&&(!this.sourceInfo.isEmpty()))?this.getSourceInfo():null);
            List<SourceInfo> rhsSourceInfo;
            rhsSourceInfo = (((that.sourceInfo!= null)&&(!that.sourceInfo.isEmpty()))?that.getSourceInfo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceInfo", lhsSourceInfo), LocatorUtils.property(thatLocator, "sourceInfo", rhsSourceInfo), lhsSourceInfo, rhsSourceInfo)) {
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
            List<SourceInfo> theSourceInfo;
            theSourceInfo = (((this.sourceInfo!= null)&&(!this.sourceInfo.isEmpty()))?this.getSourceInfo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceInfo", theSourceInfo), currentHashCode, theSourceInfo);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
