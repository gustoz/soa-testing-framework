//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.17 at 11:04:30 PM CET 
//


package com.ibm.soatf.config.master;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowPatterns complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowPatterns">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flowPattern" type="{http://www.ibm.com/SOATF/Config/Master}FlowPattern" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowPatterns", propOrder = {
    "flowPattern"
})
public class FlowPatterns {

    protected List<FlowPattern> flowPattern;

    /**
     * Gets the value of the flowPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flowPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowPattern }
     * 
     * 
     */
    public List<FlowPattern> getFlowPattern() {
        if (flowPattern == null) {
            flowPattern = new ArrayList<FlowPattern>();
        }
        return this.flowPattern;
    }

}
