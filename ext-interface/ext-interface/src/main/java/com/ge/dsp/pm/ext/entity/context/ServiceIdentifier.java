
package com.ge.dsp.pm.ext.entity.context;

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
 * 
 * 				This object carries the information/objects for
 * 				accessing one of the dsp
 * 				pm services. The platform
 * 				will retrieve this
 * 				information from the service registry. dspPMService
 * 				identifies the
 * 				dsp pm service.
 * 				transport type identifies the transport type for this
 * 				service. serviceName is
 * 				the name used to find
 * 				the service in the
 * 				registry. ServiceURL is the URL - this is only used
 * 				for PointToPoint
 * 				and Systinet.
 * 			
 * 
 * <p>Java class for ServiceIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dspPMService" type="{http://dsp.ge.com/pm/ext/entity/context}DSPPMServices"/>
 *         &lt;element name="transportType" type="{http://dsp.ge.com/pm/ext/entity/context}DSPPMTransportTypes"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceIdentifier", propOrder = {
    "dspPMService",
    "transportType",
    "serviceName",
    "serviceURL"
})
public class ServiceIdentifier
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected DSPPMServices dspPMService;
    @XmlElement(required = true)
    protected DSPPMTransportTypes transportType;
    @XmlElement(required = true)
    protected String serviceName;
    @XmlElement(required = true)
    protected String serviceURL;

    /**
     * Gets the value of the dspPMService property.
     * 
     * @return
     *     possible object is
     *     {@link DSPPMServices }
     *     
     */
    public DSPPMServices getDspPMService() {
        return dspPMService;
    }

    /**
     * Sets the value of the dspPMService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSPPMServices }
     *     
     */
    public void setDspPMService(DSPPMServices value) {
        this.dspPMService = value;
    }

    /**
     * Gets the value of the transportType property.
     * 
     * @return
     *     possible object is
     *     {@link DSPPMTransportTypes }
     *     
     */
    public DSPPMTransportTypes getTransportType() {
        return transportType;
    }

    /**
     * Sets the value of the transportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSPPMTransportTypes }
     *     
     */
    public void setTransportType(DSPPMTransportTypes value) {
        this.transportType = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serviceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceURL() {
        return serviceURL;
    }

    /**
     * Sets the value of the serviceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceURL(String value) {
        this.serviceURL = value;
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
            DSPPMServices theDspPMService;
            theDspPMService = this.getDspPMService();
            strategy.appendField(locator, this, "dspPMService", buffer, theDspPMService);
        }
        {
            DSPPMTransportTypes theTransportType;
            theTransportType = this.getTransportType();
            strategy.appendField(locator, this, "transportType", buffer, theTransportType);
        }
        {
            String theServiceName;
            theServiceName = this.getServiceName();
            strategy.appendField(locator, this, "serviceName", buffer, theServiceName);
        }
        {
            String theServiceURL;
            theServiceURL = this.getServiceURL();
            strategy.appendField(locator, this, "serviceURL", buffer, theServiceURL);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ServiceIdentifier)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ServiceIdentifier that = ((ServiceIdentifier) object);
        {
            DSPPMServices lhsDspPMService;
            lhsDspPMService = this.getDspPMService();
            DSPPMServices rhsDspPMService;
            rhsDspPMService = that.getDspPMService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dspPMService", lhsDspPMService), LocatorUtils.property(thatLocator, "dspPMService", rhsDspPMService), lhsDspPMService, rhsDspPMService)) {
                return false;
            }
        }
        {
            DSPPMTransportTypes lhsTransportType;
            lhsTransportType = this.getTransportType();
            DSPPMTransportTypes rhsTransportType;
            rhsTransportType = that.getTransportType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportType", lhsTransportType), LocatorUtils.property(thatLocator, "transportType", rhsTransportType), lhsTransportType, rhsTransportType)) {
                return false;
            }
        }
        {
            String lhsServiceName;
            lhsServiceName = this.getServiceName();
            String rhsServiceName;
            rhsServiceName = that.getServiceName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceName", lhsServiceName), LocatorUtils.property(thatLocator, "serviceName", rhsServiceName), lhsServiceName, rhsServiceName)) {
                return false;
            }
        }
        {
            String lhsServiceURL;
            lhsServiceURL = this.getServiceURL();
            String rhsServiceURL;
            rhsServiceURL = that.getServiceURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceURL", lhsServiceURL), LocatorUtils.property(thatLocator, "serviceURL", rhsServiceURL), lhsServiceURL, rhsServiceURL)) {
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
            DSPPMServices theDspPMService;
            theDspPMService = this.getDspPMService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dspPMService", theDspPMService), currentHashCode, theDspPMService);
        }
        {
            DSPPMTransportTypes theTransportType;
            theTransportType = this.getTransportType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportType", theTransportType), currentHashCode, theTransportType);
        }
        {
            String theServiceName;
            theServiceName = this.getServiceName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceName", theServiceName), currentHashCode, theServiceName);
        }
        {
            String theServiceURL;
            theServiceURL = this.getServiceURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceURL", theServiceURL), currentHashCode, theServiceURL);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
