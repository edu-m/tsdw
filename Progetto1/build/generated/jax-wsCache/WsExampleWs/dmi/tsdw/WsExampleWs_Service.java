
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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WsExampleWs", targetNamespace = "http://tsdw.dmi/", wsdlLocation = "http://localhost:8080/WsExample/WsExampleWs?wsdl")
public class WsExampleWs_Service
    extends Service
{

    private final static URL WSEXAMPLEWS_WSDL_LOCATION;
    private final static WebServiceException WSEXAMPLEWS_EXCEPTION;
    private final static QName WSEXAMPLEWS_QNAME = new QName("http://tsdw.dmi/", "WsExampleWs");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WsExample/WsExampleWs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSEXAMPLEWS_WSDL_LOCATION = url;
        WSEXAMPLEWS_EXCEPTION = e;
    }

    public WsExampleWs_Service() {
        super(__getWsdlLocation(), WSEXAMPLEWS_QNAME);
    }

    public WsExampleWs_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSEXAMPLEWS_QNAME, features);
    }

    public WsExampleWs_Service(URL wsdlLocation) {
        super(wsdlLocation, WSEXAMPLEWS_QNAME);
    }

    public WsExampleWs_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSEXAMPLEWS_QNAME, features);
    }

    public WsExampleWs_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsExampleWs_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsExampleWs
     */
    @WebEndpoint(name = "WsExampleWsPort")
    public WsExampleWs getWsExampleWsPort() {
        return super.getPort(new QName("http://tsdw.dmi/", "WsExampleWsPort"), WsExampleWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsExampleWs
     */
    @WebEndpoint(name = "WsExampleWsPort")
    public WsExampleWs getWsExampleWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://tsdw.dmi/", "WsExampleWsPort"), WsExampleWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSEXAMPLEWS_EXCEPTION!= null) {
            throw WSEXAMPLEWS_EXCEPTION;
        }
        return WSEXAMPLEWS_WSDL_LOCATION;
    }

}
