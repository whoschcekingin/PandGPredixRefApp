//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//


package org.mimosa.osacbmv3_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SITE_CATEGORY.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SITE_CATEGORY">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SITE_ZERO"/>
 *     &lt;enumeration value="SITE_SPECIFIC"/>
 *     &lt;enumeration value="SITE_PLAT"/>
 *     &lt;enumeration value="SITE_TEMPLATE"/>
 *     &lt;enumeration value="SITE_ENT_ZERO"/>
 *     &lt;enumeration value="SITE_ZERO_ONE"/>
 *     &lt;enumeration value="SITE_ZERO_TWO"/>
 *     &lt;enumeration value="SITE_PLAT_TRNG_DATA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SITE_CATEGORY")
@XmlEnum
public enum SITECATEGORY {

    SITE_ZERO,
    SITE_SPECIFIC,
    SITE_PLAT,
    SITE_TEMPLATE,
    SITE_ENT_ZERO,
    SITE_ZERO_ONE,
    SITE_ZERO_TWO,
    SITE_PLAT_TRNG_DATA;

    public String value() {
        return name();
    }

    public static SITECATEGORY fromValue(String v) {
        return valueOf(v);
    }

}