//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.17 at 11:23:57 PM CET 
//


package com.ibm.soatf.config.master;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Environment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Environment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dev"/>
 *     &lt;enumeration value="dev2"/>
 *     &lt;enumeration value="dev3"/>
 *     &lt;enumeration value="pre-sit"/>
 *     &lt;enumeration value="sit"/>
 *     &lt;enumeration value="uat"/>
 *     &lt;enumeration value="custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Environment")
@XmlEnum
public enum Environment {

    @XmlEnumValue("dev")
    DEV("dev"),
    @XmlEnumValue("dev2")
    DEV_2("dev2"),
    @XmlEnumValue("dev3")
    DEV_3("dev3"),
    @XmlEnumValue("pre-sit")
    PRE_SIT("pre-sit"),
    @XmlEnumValue("sit")
    SIT("sit"),
    @XmlEnumValue("uat")
    UAT("uat"),
    @XmlEnumValue("custom")
    CUSTOM("custom");
    private final String value;

    Environment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Environment fromValue(String v) {
        for (Environment c: Environment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
