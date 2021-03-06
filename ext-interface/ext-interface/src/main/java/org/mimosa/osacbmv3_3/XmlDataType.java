
package org.mimosa.osacbmv3_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XmlDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XmlDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="dateTime"/>
 *     &lt;enumeration value="decimal"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="float"/>
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="string"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XmlDataType")
@XmlEnum
public enum XmlDataType {

    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("dateTime")
    DATE_TIME("dateTime"),
    @XmlEnumValue("decimal")
    DECIMAL("decimal"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("string")
    STRING("string");
    private final String value;

    XmlDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XmlDataType fromValue(String v) {
        for (XmlDataType c: XmlDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
