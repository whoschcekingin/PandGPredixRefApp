
package com.ge.dsp.pm.ext.entity.source;

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
 * A source is like an Entity but may cover other concepts such as a File source
 * 
 * <p>Java class for Source complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Source">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceType" type="{http://dsp.ge.com/pm/ext/entity/source}SourceType"/>
 *         &lt;element name="sourceURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Source", propOrder = {
    "sourceType",
    "sourceURI",
    "name"
})
public class Source
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected SourceType sourceType;
    @XmlElement(required = true)
    protected String sourceURI;
    @XmlElement(required = true)
    protected String name;

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSourceType(SourceType value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the sourceURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceURI() {
        return sourceURI;
    }

    /**
     * Sets the value of the sourceURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceURI(String value) {
        this.sourceURI = value;
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
            SourceType theSourceType;
            theSourceType = this.getSourceType();
            strategy.appendField(locator, this, "sourceType", buffer, theSourceType);
        }
        {
            String theSourceURI;
            theSourceURI = this.getSourceURI();
            strategy.appendField(locator, this, "sourceURI", buffer, theSourceURI);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Source)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Source that = ((Source) object);
        {
            SourceType lhsSourceType;
            lhsSourceType = this.getSourceType();
            SourceType rhsSourceType;
            rhsSourceType = that.getSourceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceType", lhsSourceType), LocatorUtils.property(thatLocator, "sourceType", rhsSourceType), lhsSourceType, rhsSourceType)) {
                return false;
            }
        }
        {
            String lhsSourceURI;
            lhsSourceURI = this.getSourceURI();
            String rhsSourceURI;
            rhsSourceURI = that.getSourceURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceURI", lhsSourceURI), LocatorUtils.property(thatLocator, "sourceURI", rhsSourceURI), lhsSourceURI, rhsSourceURI)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            SourceType theSourceType;
            theSourceType = this.getSourceType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceType", theSourceType), currentHashCode, theSourceType);
        }
        {
            String theSourceURI;
            theSourceURI = this.getSourceURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceURI", theSourceURI), currentHashCode, theSourceURI);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
