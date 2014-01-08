package com.ibm.soatf.component.soap;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPMessage;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author zANGETSu
 */
public class JAXWSDispatch{

     public static void invokeServiceWithProvidedSOAPRequest(String urlString, String requestFile, String responseFileName)  {
        try {
            final String filename = new StringBuilder("").toString();
                       
            final URL url = new URL(urlString);
            final String requestEnvelope = FileUtils.readFileToString(new File(requestFile));
            
            final SOAPMessage response = JAXWSDispatch.invoke(url.toString(), requestEnvelope);
            final File responseFile = new File(responseFileName);
            if (responseFile.exists()) {
                FileUtils.forceDelete(responseFile);
            }
            try (FileOutputStream fos = new FileOutputStream(responseFile)) {
                response.writeTo(fos);
            }
        } catch (Throwable ex) {
            
        }
    }
    /**
     *
     * @param endpointUrl
     * @param xmlMsg
     * @return
     * @throws Exception
     */
    public static SOAPMessage invoke(String endpointUrl, String xmlMsg) throws Exception {
        /** Create a service and add at least one port to it. **/
        
        SOAPConnectionFactory sfc = SOAPConnectionFactory.newInstance();
        SOAPConnection connection = sfc.createConnection();
        InputStream is = new ByteArrayInputStream(xmlMsg.getBytes());
        SOAPMessage request = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createMessage(new MimeHeaders(), is);
        request.removeAllAttachments();
        
        URL endpoint = new URL(endpointUrl);
        SOAPMessage response = connection.call(request, endpoint);
        connection.close();
        
        response.writeTo(System.out);
        response.writeTo(new FileOutputStream(new File("res.xml")));
        
        return response;
    }
}