
package dmi.tsdw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "myWebService", targetNamespace = "http://tsdw.dmi/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyWebService {


    /**
     * 
     * @param param1
     * @param param2
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "operations", targetNamespace = "http://tsdw.dmi/", className = "dmi.tsdw.Operations")
    @ResponseWrapper(localName = "operationsResponse", targetNamespace = "http://tsdw.dmi/", className = "dmi.tsdw.OperationsResponse")
    @Action(input = "http://tsdw.dmi/myWebService/operationsRequest", output = "http://tsdw.dmi/myWebService/operationsResponse")
    public String operations(
        @WebParam(name = "param1", targetNamespace = "")
        String param1,
        @WebParam(name = "param2", targetNamespace = "")
        int param2);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "logout", targetNamespace = "http://tsdw.dmi/", className = "dmi.tsdw.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://tsdw.dmi/", className = "dmi.tsdw.LogoutResponse")
    @Action(input = "http://tsdw.dmi/myWebService/logoutRequest", output = "http://tsdw.dmi/myWebService/logoutResponse")
    public String logout();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "statusAccount", targetNamespace = "http://tsdw.dmi/", className = "dmi.tsdw.StatusAccount")
    @ResponseWrapper(localName = "statusAccountResponse", targetNamespace = "http://tsdw.dmi/", className = "dmi.tsdw.StatusAccountResponse")
    @Action(input = "http://tsdw.dmi/myWebService/statusAccountRequest", output = "http://tsdw.dmi/myWebService/statusAccountResponse")
    public String statusAccount();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBalance", targetNamespace = "http://tsdw.dmi/", className = "dmi.tsdw.GetBalance")
    @ResponseWrapper(localName = "getBalanceResponse", targetNamespace = "http://tsdw.dmi/", className = "dmi.tsdw.GetBalanceResponse")
    @Action(input = "http://tsdw.dmi/myWebService/getBalanceRequest", output = "http://tsdw.dmi/myWebService/getBalanceResponse")
    public String getBalance();

}
