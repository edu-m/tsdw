
package dmi.tsdw;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WsArit", targetNamespace = "http://tsdw.dmi/", wsdlLocation = "http://localhost:8080/Progetto1/WsArit?wsdl")
public class WsArit_Service
    extends Service
{

    private final static URL WSARIT_WSDL_LOCATION;
    private final static WebServiceException WSARIT_EXCEPTION;
    private final static QName WSARIT_QNAME = new QName("http://tsdw.dmi/", "WsArit");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Progetto1/WsArit?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSARIT_WSDL_LOCATION = url;
        WSARIT_EXCEPTION = e;
    }

    public WsArit_Service() {
        super(__getWsdlLocation(), WSARIT_QNAME);
    }

    public WsArit_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSARIT_QNAME, features);
    }

    public WsArit_Service(URL wsdlLocation) {
        super(wsdlLocation, WSARIT_QNAME);
    }

    public WsArit_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSARIT_QNAME, features);
    }

    public WsArit_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsArit_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsArit
     */
    @WebEndpoint(name = "WsAritPort")
    public WsArit getWsAritPort() {
        return super.getPort(new QName("http://tsdw.dmi/", "WsAritPort"), WsArit.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsArit
     */
    @WebEndpoint(name = "WsAritPort")
    public WsArit getWsAritPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://tsdw.dmi/", "WsAritPort"), WsArit.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSARIT_EXCEPTION!= null) {
            throw WSARIT_EXCEPTION;
        }
        return WSARIT_WSDL_LOCATION;
    }

}