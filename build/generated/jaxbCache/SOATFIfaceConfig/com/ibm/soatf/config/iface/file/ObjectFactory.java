//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.02 at 10:57:18 AM BST 
//


package com.ibm.soatf.config.iface.file;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ibm.soatf.config.iface.file package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ibm.soatf.config.iface.file
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileConfig }
     * 
     */
    public FileConfig createFileConfig() {
        return new FileConfig();
    }

    /**
     * Create an instance of {@link DefaultFile }
     * 
     */
    public DefaultFile createDefaultFile() {
        return new DefaultFile();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link EnvSpecificFile }
     * 
     */
    public EnvSpecificFile createEnvSpecificFile() {
        return new EnvSpecificFile();
    }

}