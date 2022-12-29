
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
@WebService(name = "BankClass", targetNamespace = "http://tsdw.dmi/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankClass {


    /**
     * 
     * @param msg
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ParseString")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ParseString", targetNamespace = "http://tsdw.dmi/", className = "dmi.tsdw.ParseString")
    @ResponseWrapper(localName = "ParseStringResponse", targetNamespace = "http://tsdw.dmi/", className = "dmi.tsdw.ParseStringResponse")
    @Action(input = "http://tsdw.dmi/BankClass/ParseStringRequest", output = "http://tsdw.dmi/BankClass/ParseStringResponse")
    public String parseString(
        @WebParam(name = "msg", targetNamespace = "")
        String msg);

}
