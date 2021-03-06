
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
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
 * <p>Java class for Role complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Role">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentRoleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Role", propOrder = {
    "agentRoleType",
    "id"
})
public class Role
    implements Serializable, Equals, HashCode, ToString
{

    protected String agentRoleType;
    @XmlElement(required = true)
    protected MIMKey2 id;

    /**
     * Gets the value of the agentRoleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentRoleType() {
        return agentRoleType;
    }

    /**
     * Sets the value of the agentRoleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentRoleType(String value) {
        this.agentRoleType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey2 }
     *     
     */
    public MIMKey2 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey2 }
     *     
     */
    public void setId(MIMKey2 value) {
        this.id = value;
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
            String theAgentRoleType;
            theAgentRoleType = this.getAgentRoleType();
            strategy.appendField(locator, this, "agentRoleType", buffer, theAgentRoleType);
        }
        {
            MIMKey2 theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Role)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Role that = ((Role) object);
        {
            String lhsAgentRoleType;
            lhsAgentRoleType = this.getAgentRoleType();
            String rhsAgentRoleType;
            rhsAgentRoleType = that.getAgentRoleType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agentRoleType", lhsAgentRoleType), LocatorUtils.property(thatLocator, "agentRoleType", rhsAgentRoleType), lhsAgentRoleType, rhsAgentRoleType)) {
                return false;
            }
        }
        {
            MIMKey2 lhsId;
            lhsId = this.getId();
            MIMKey2 rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
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
            String theAgentRoleType;
            theAgentRoleType = this.getAgentRoleType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agentRoleType", theAgentRoleType), currentHashCode, theAgentRoleType);
        }
        {
            MIMKey2 theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
