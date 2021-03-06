
package com.ge.dsp.pm.ext.entity.selectionfilter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntervalUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntervalUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NANOSECONDS"/>
 *     &lt;enumeration value="MILLISECONDS"/>
 *     &lt;enumeration value="MICROSECONDS"/>
 *     &lt;enumeration value="SECONDS"/>
 *     &lt;enumeration value="MINUTES"/>
 *     &lt;enumeration value="HOURS"/>
 *     &lt;enumeration value="DAYS"/>
 *     &lt;enumeration value="WEEKS"/>
 *     &lt;enumeration value="YEARS"/>
 *     &lt;enumeration value="DATAPOINTS"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntervalUnits")
@XmlEnum
public enum IntervalUnits {

    NANOSECONDS,
    MILLISECONDS,
    MICROSECONDS,
    SECONDS,
    MINUTES,
    HOURS,
    DAYS,
    WEEKS,
    YEARS,
    DATAPOINTS,
    OTHER;

    public String value() {
        return name();
    }

    public static IntervalUnits fromValue(String v) {
        return valueOf(v);
    }

}
