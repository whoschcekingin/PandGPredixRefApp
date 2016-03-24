//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.21 at 01:16:18 AM PDT 
//


package com.ge.dsp.pm.ext.entity.context;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSPPMServices.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DSPPMServices">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RDR"/>
 *     &lt;enumeration value="ADH"/>
 *     &lt;enumeration value="Orchestration"/>
 *     &lt;enumeration value="AnalyticWrapper"/>
 *     &lt;enumeration value="ConfigurationSelector"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DSPPMServices")
@XmlEnum
public enum DSPPMServices {

    RDR("RDR"),
    ADH("ADH"),
    @XmlEnumValue("Orchestration")
    ORCHESTRATION("Orchestration"),
    @XmlEnumValue("AnalyticWrapper")
    ANALYTIC_WRAPPER("AnalyticWrapper"),
    @XmlEnumValue("ConfigurationSelector")
    CONFIGURATION_SELECTOR("ConfigurationSelector");
    private final String value;

    DSPPMServices(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DSPPMServices fromValue(String v) {
        for (DSPPMServices c: DSPPMServices.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
