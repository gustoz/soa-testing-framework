//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.02 at 10:57:17 AM BST 
//


package com.ibm.soatf.config.master;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This part is related to OSB environment configuration which the framework will communicate to, so it includes AdminServer and related message bean classes plus JMX related stuff. On top of this it includes list of services running on OSB which can be managed trough weblogic management API.
 * 
 * <p>Java class for OracleFusionMiddleware complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OracleFusionMiddleware">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oracleFusionMiddlewareInstance" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ibm.com/SOATF/Config/Master}AbstractMasterConfigEnvironmentInstance">
 *                 &lt;sequence>
 *                   &lt;element name="ssh">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sshUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="sshPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="adminServer">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="jmxProtocol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="securityPrincipal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="securityCredentials" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="clusters">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cluster" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="managedServer" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="type">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="OSB"/>
 *                                           &lt;enumeration value="SOA"/>
 *                                           &lt;enumeration value="WSM"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="environment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OracleFusionMiddleware", propOrder = {
    "oracleFusionMiddlewareInstance"
})
public class OracleFusionMiddleware {

    @XmlElement(required = true)
    protected List<OracleFusionMiddleware.OracleFusionMiddlewareInstance> oracleFusionMiddlewareInstance;

    /**
     * Gets the value of the oracleFusionMiddlewareInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oracleFusionMiddlewareInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOracleFusionMiddlewareInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OracleFusionMiddleware.OracleFusionMiddlewareInstance }
     * 
     * 
     */
    public List<OracleFusionMiddleware.OracleFusionMiddlewareInstance> getOracleFusionMiddlewareInstance() {
        if (oracleFusionMiddlewareInstance == null) {
            oracleFusionMiddlewareInstance = new ArrayList<OracleFusionMiddleware.OracleFusionMiddlewareInstance>();
        }
        return this.oracleFusionMiddlewareInstance;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ibm.com/SOATF/Config/Master}AbstractMasterConfigEnvironmentInstance">
     *       &lt;sequence>
     *         &lt;element name="ssh">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sshUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="sshPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="adminServer">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="jmxProtocol" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="securityPrincipal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="securityCredentials" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="clusters">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cluster" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="managedServer" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="type">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="OSB"/>
     *                                 &lt;enumeration value="SOA"/>
     *                                 &lt;enumeration value="WSM"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="environment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ssh",
        "adminServer",
        "clusters"
    })
    public static class OracleFusionMiddlewareInstance
        extends AbstractMasterConfigEnvironmentInstance
    {

        @XmlElement(required = true)
        protected OracleFusionMiddleware.OracleFusionMiddlewareInstance.Ssh ssh;
        @XmlElement(required = true)
        protected OracleFusionMiddleware.OracleFusionMiddlewareInstance.AdminServer adminServer;
        @XmlElement(required = true)
        protected OracleFusionMiddleware.OracleFusionMiddlewareInstance.Clusters clusters;
        @XmlAttribute(name = "environment", required = true)
        protected String environment;

        /**
         * Gets the value of the ssh property.
         * 
         * @return
         *     possible object is
         *     {@link OracleFusionMiddleware.OracleFusionMiddlewareInstance.Ssh }
         *     
         */
        public OracleFusionMiddleware.OracleFusionMiddlewareInstance.Ssh getSsh() {
            return ssh;
        }

        /**
         * Sets the value of the ssh property.
         * 
         * @param value
         *     allowed object is
         *     {@link OracleFusionMiddleware.OracleFusionMiddlewareInstance.Ssh }
         *     
         */
        public void setSsh(OracleFusionMiddleware.OracleFusionMiddlewareInstance.Ssh value) {
            this.ssh = value;
        }

        /**
         * Gets the value of the adminServer property.
         * 
         * @return
         *     possible object is
         *     {@link OracleFusionMiddleware.OracleFusionMiddlewareInstance.AdminServer }
         *     
         */
        public OracleFusionMiddleware.OracleFusionMiddlewareInstance.AdminServer getAdminServer() {
            return adminServer;
        }

        /**
         * Sets the value of the adminServer property.
         * 
         * @param value
         *     allowed object is
         *     {@link OracleFusionMiddleware.OracleFusionMiddlewareInstance.AdminServer }
         *     
         */
        public void setAdminServer(OracleFusionMiddleware.OracleFusionMiddlewareInstance.AdminServer value) {
            this.adminServer = value;
        }

        /**
         * Gets the value of the clusters property.
         * 
         * @return
         *     possible object is
         *     {@link OracleFusionMiddleware.OracleFusionMiddlewareInstance.Clusters }
         *     
         */
        public OracleFusionMiddleware.OracleFusionMiddlewareInstance.Clusters getClusters() {
            return clusters;
        }

        /**
         * Sets the value of the clusters property.
         * 
         * @param value
         *     allowed object is
         *     {@link OracleFusionMiddleware.OracleFusionMiddlewareInstance.Clusters }
         *     
         */
        public void setClusters(OracleFusionMiddleware.OracleFusionMiddlewareInstance.Clusters value) {
            this.clusters = value;
        }

        /**
         * Gets the value of the environment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnvironment() {
            return environment;
        }

        /**
         * Sets the value of the environment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnvironment(String value) {
            this.environment = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="jmxProtocol" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="securityPrincipal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="securityCredentials" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "jmxProtocol",
            "host",
            "port",
            "securityPrincipal",
            "securityCredentials"
        })
        public static class AdminServer {

            @XmlElement(required = true, defaultValue = "t3")
            protected String jmxProtocol;
            @XmlElement(required = true)
            protected String host;
            protected int port;
            @XmlElement(required = true)
            protected String securityPrincipal;
            @XmlElement(required = true)
            protected String securityCredentials;

            /**
             * Gets the value of the jmxProtocol property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJmxProtocol() {
                return jmxProtocol;
            }

            /**
             * Sets the value of the jmxProtocol property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJmxProtocol(String value) {
                this.jmxProtocol = value;
            }

            /**
             * Gets the value of the host property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHost() {
                return host;
            }

            /**
             * Sets the value of the host property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHost(String value) {
                this.host = value;
            }

            /**
             * Gets the value of the port property.
             * 
             */
            public int getPort() {
                return port;
            }

            /**
             * Sets the value of the port property.
             * 
             */
            public void setPort(int value) {
                this.port = value;
            }

            /**
             * Gets the value of the securityPrincipal property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecurityPrincipal() {
                return securityPrincipal;
            }

            /**
             * Sets the value of the securityPrincipal property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecurityPrincipal(String value) {
                this.securityPrincipal = value;
            }

            /**
             * Gets the value of the securityCredentials property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecurityCredentials() {
                return securityCredentials;
            }

            /**
             * Sets the value of the securityCredentials property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecurityCredentials(String value) {
                this.securityCredentials = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cluster" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="managedServer" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="type">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="OSB"/>
         *                       &lt;enumeration value="SOA"/>
         *                       &lt;enumeration value="WSM"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cluster"
        })
        public static class Clusters {

            protected List<OracleFusionMiddleware.OracleFusionMiddlewareInstance.Clusters.Cluster> cluster;

            /**
             * Gets the value of the cluster property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cluster property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCluster().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OracleFusionMiddleware.OracleFusionMiddlewareInstance.Clusters.Cluster }
             * 
             * 
             */
            public List<OracleFusionMiddleware.OracleFusionMiddlewareInstance.Clusters.Cluster> getCluster() {
                if (cluster == null) {
                    cluster = new ArrayList<OracleFusionMiddleware.OracleFusionMiddlewareInstance.Clusters.Cluster>();
                }
                return this.cluster;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="managedServer" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="type">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="OSB"/>
             *             &lt;enumeration value="SOA"/>
             *             &lt;enumeration value="WSM"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "managedServer"
            })
            public static class Cluster {

                protected List<OracleFusionMiddleware.OracleFusionMiddlewareInstance.Clusters.Cluster.ManagedServer> managedServer;
                @XmlAttribute(name = "type")
                protected String type;
                @XmlAttribute(name = "name")
                protected String name;

                /**
                 * Gets the value of the managedServer property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the managedServer property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getManagedServer().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OracleFusionMiddleware.OracleFusionMiddlewareInstance.Clusters.Cluster.ManagedServer }
                 * 
                 * 
                 */
                public List<OracleFusionMiddleware.OracleFusionMiddlewareInstance.Clusters.Cluster.ManagedServer> getManagedServer() {
                    if (managedServer == null) {
                        managedServer = new ArrayList<OracleFusionMiddleware.OracleFusionMiddlewareInstance.Clusters.Cluster.ManagedServer>();
                    }
                    return this.managedServer;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "hostName",
                    "port"
                })
                public static class ManagedServer {

                    @XmlElement(required = true)
                    protected String hostName;
                    protected int port;
                    @XmlAttribute(name = "name")
                    protected String name;

                    /**
                     * Gets the value of the hostName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHostName() {
                        return hostName;
                    }

                    /**
                     * Sets the value of the hostName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHostName(String value) {
                        this.hostName = value;
                    }

                    /**
                     * Gets the value of the port property.
                     * 
                     */
                    public int getPort() {
                        return port;
                    }

                    /**
                     * Sets the value of the port property.
                     * 
                     */
                    public void setPort(int value) {
                        this.port = value;
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

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="sshUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="sshPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sshUser",
            "sshPassword",
            "port"
        })
        public static class Ssh {

            @XmlElement(required = true)
            protected String sshUser;
            @XmlElement(required = true)
            protected String sshPassword;
            protected int port;

            /**
             * Gets the value of the sshUser property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSshUser() {
                return sshUser;
            }

            /**
             * Sets the value of the sshUser property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSshUser(String value) {
                this.sshUser = value;
            }

            /**
             * Gets the value of the sshPassword property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSshPassword() {
                return sshPassword;
            }

            /**
             * Sets the value of the sshPassword property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSshPassword(String value) {
                this.sshPassword = value;
            }

            /**
             * Gets the value of the port property.
             * 
             */
            public int getPort() {
                return port;
            }

            /**
             * Sets the value of the port property.
             * 
             */
            public void setPort(int value) {
                this.port = value;
            }

        }

    }

}