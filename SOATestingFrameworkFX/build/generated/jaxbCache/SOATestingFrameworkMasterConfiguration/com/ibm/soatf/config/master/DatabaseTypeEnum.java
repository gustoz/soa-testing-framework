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
 * <p>Java class for DatabaseTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DatabaseTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Oracle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DatabaseTypeEnum")
@XmlEnum
public enum DatabaseTypeEnum {

    @XmlEnumValue("Oracle")
    ORACLE("Oracle");
    private final String value;

    DatabaseTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatabaseTypeEnum fromValue(String v) {
        for (DatabaseTypeEnum c: DatabaseTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
