
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
 * <p>Java class for MIMAgent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MIMAgent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agent_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="agent_site" type="{http://www.mimosa.org/OSACBMV3.3.1}Site"/>
 *         &lt;element name="agentType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="inputs" type="{http://www.mimosa.org/OSACBMV3.3.1}PortRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outputs" type="{http://www.mimosa.org/OSACBMV3.3.1}PortRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="roles" type="{http://www.mimosa.org/OSACBMV3.3.1}Role" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MIMAgent", propOrder = {
    "agentId",
    "agentSite",
    "agentType",
    "inputs",
    "name",
    "outputs",
    "roles"
})
public class MIMAgent
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(name = "agent_id")
    @XmlSchemaType(name = "unsignedInt")
    protected long agentId;
    @XmlElement(name = "agent_site", required = true)
    protected Site agentSite;
    protected MIMKey3 agentType;
    @XmlElement(nillable = true)
    protected List<PortRef> inputs;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(nillable = true)
    protected List<PortRef> outputs;
    @XmlElement(nillable = true)
    protected List<Role> roles;

    /**
     * Gets the value of the agentId property.
     * 
     */
    public long getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     */
    public void setAgentId(long value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the agentSite property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getAgentSite() {
        return agentSite;
    }

    /**
     * Sets the value of the agentSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setAgentSite(Site value) {
        this.agentSite = value;
    }

    /**
     * Gets the value of the agentType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getAgentType() {
        return agentType;
    }

    /**
     * Sets the value of the agentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setAgentType(MIMKey3 value) {
        this.agentType = value;
    }

    /**
     * Gets the value of the inputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortRef }
     * 
     * 
     */
    public List<PortRef> getInputs() {
        if (inputs == null) {
            inputs = new ArrayList<PortRef>();
        }
        return this.inputs;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the outputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortRef }
     * 
     * 
     */
    public List<PortRef> getOutputs() {
        if (outputs == null) {
            outputs = new ArrayList<PortRef>();
        }
        return this.outputs;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Role }
     * 
     * 
     */
    public List<Role> getRoles() {
        if (roles == null) {
            roles = new ArrayList<Role>();
        }
        return this.roles;
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
            long theAgentId;
            theAgentId = (true?this.getAgentId(): 0L);
            strategy.appendField(locator, this, "agentId", buffer, theAgentId);
        }
        {
            Site theAgentSite;
            theAgentSite = this.getAgentSite();
            strategy.appendField(locator, this, "agentSite", buffer, theAgentSite);
        }
        {
            MIMKey3 theAgentType;
            theAgentType = this.getAgentType();
            strategy.appendField(locator, this, "agentType", buffer, theAgentType);
        }
        {
            List<PortRef> theInputs;
            theInputs = (((this.inputs!= null)&&(!this.inputs.isEmpty()))?this.getInputs():null);
            strategy.appendField(locator, this, "inputs", buffer, theInputs);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            List<PortRef> theOutputs;
            theOutputs = (((this.outputs!= null)&&(!this.outputs.isEmpty()))?this.getOutputs():null);
            strategy.appendField(locator, this, "outputs", buffer, theOutputs);
        }
        {
            List<Role> theRoles;
            theRoles = (((this.roles!= null)&&(!this.roles.isEmpty()))?this.getRoles():null);
            strategy.appendField(locator, this, "roles", buffer, theRoles);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MIMAgent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MIMAgent that = ((MIMAgent) object);
        {
            long lhsAgentId;
            lhsAgentId = (true?this.getAgentId(): 0L);
            long rhsAgentId;
            rhsAgentId = (true?that.getAgentId(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agentId", lhsAgentId), LocatorUtils.property(thatLocator, "agentId", rhsAgentId), lhsAgentId, rhsAgentId)) {
                return false;
            }
        }
        {
            Site lhsAgentSite;
            lhsAgentSite = this.getAgentSite();
            Site rhsAgentSite;
            rhsAgentSite = that.getAgentSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agentSite", lhsAgentSite), LocatorUtils.property(thatLocator, "agentSite", rhsAgentSite), lhsAgentSite, rhsAgentSite)) {
                return false;
            }
        }
        {
            MIMKey3 lhsAgentType;
            lhsAgentType = this.getAgentType();
            MIMKey3 rhsAgentType;
            rhsAgentType = that.getAgentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agentType", lhsAgentType), LocatorUtils.property(thatLocator, "agentType", rhsAgentType), lhsAgentType, rhsAgentType)) {
                return false;
            }
        }
        {
            List<PortRef> lhsInputs;
            lhsInputs = (((this.inputs!= null)&&(!this.inputs.isEmpty()))?this.getInputs():null);
            List<PortRef> rhsInputs;
            rhsInputs = (((that.inputs!= null)&&(!that.inputs.isEmpty()))?that.getInputs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inputs", lhsInputs), LocatorUtils.property(thatLocator, "inputs", rhsInputs), lhsInputs, rhsInputs)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            List<PortRef> lhsOutputs;
            lhsOutputs = (((this.outputs!= null)&&(!this.outputs.isEmpty()))?this.getOutputs():null);
            List<PortRef> rhsOutputs;
            rhsOutputs = (((that.outputs!= null)&&(!that.outputs.isEmpty()))?that.getOutputs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outputs", lhsOutputs), LocatorUtils.property(thatLocator, "outputs", rhsOutputs), lhsOutputs, rhsOutputs)) {
                return false;
            }
        }
        {
            List<Role> lhsRoles;
            lhsRoles = (((this.roles!= null)&&(!this.roles.isEmpty()))?this.getRoles():null);
            List<Role> rhsRoles;
            rhsRoles = (((that.roles!= null)&&(!that.roles.isEmpty()))?that.getRoles():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roles", lhsRoles), LocatorUtils.property(thatLocator, "roles", rhsRoles), lhsRoles, rhsRoles)) {
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
            long theAgentId;
            theAgentId = (true?this.getAgentId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agentId", theAgentId), currentHashCode, theAgentId);
        }
        {
            Site theAgentSite;
            theAgentSite = this.getAgentSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agentSite", theAgentSite), currentHashCode, theAgentSite);
        }
        {
            MIMKey3 theAgentType;
            theAgentType = this.getAgentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agentType", theAgentType), currentHashCode, theAgentType);
        }
        {
            List<PortRef> theInputs;
            theInputs = (((this.inputs!= null)&&(!this.inputs.isEmpty()))?this.getInputs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inputs", theInputs), currentHashCode, theInputs);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            List<PortRef> theOutputs;
            theOutputs = (((this.outputs!= null)&&(!this.outputs.isEmpty()))?this.getOutputs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outputs", theOutputs), currentHashCode, theOutputs);
        }
        {
            List<Role> theRoles;
            theRoles = (((this.roles!= null)&&(!this.roles.isEmpty()))?this.getRoles():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roles", theRoles), currentHashCode, theRoles);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
