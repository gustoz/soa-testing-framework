//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.29 at 06:47:43 PM GMT 
//


package org.archenroot.fw.soatest.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cluster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cluster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managedServer" type="{http://www.archenroot.org/SoaTestingFramework/OsbConfiguration}ManagedServer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cluster", namespace = "http://www.archenroot.org/SoaTestingFramework/OsbConfiguration", propOrder = {
    "managedServer"
})
public class Cluster {

    @XmlElement(required = true)
    protected ManagedServer managedServer;

    /**
     * Gets the value of the managedServer property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedServer }
     *     
     */
    public ManagedServer getManagedServer() {
        return managedServer;
    }

    /**
     * Sets the value of the managedServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedServer }
     *     
     */
    public void setManagedServer(ManagedServer value) {
        this.managedServer = value;
    }

}
