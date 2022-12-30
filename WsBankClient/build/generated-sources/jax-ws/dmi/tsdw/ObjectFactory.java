
package dmi.tsdw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dmi.tsdw package. 
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

    private final static QName _Logout_QNAME = new QName("http://tsdw.dmi/", "logout");
    private final static QName _GetBalance_QNAME = new QName("http://tsdw.dmi/", "getBalance");
    private final static QName _LogoutResponse_QNAME = new QName("http://tsdw.dmi/", "logoutResponse");
    private final static QName _Operations_QNAME = new QName("http://tsdw.dmi/", "operations");
    private final static QName _StatusAccount_QNAME = new QName("http://tsdw.dmi/", "statusAccount");
    private final static QName _GetBalanceResponse_QNAME = new QName("http://tsdw.dmi/", "getBalanceResponse");
    private final static QName _OperationsResponse_QNAME = new QName("http://tsdw.dmi/", "operationsResponse");
    private final static QName _StatusAccountResponse_QNAME = new QName("http://tsdw.dmi/", "statusAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dmi.tsdw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link GetBalance }
     * 
     */
    public GetBalance createGetBalance() {
        return new GetBalance();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link Operations }
     * 
     */
    public Operations createOperations() {
        return new Operations();
    }

    /**
     * Create an instance of {@link StatusAccount }
     * 
     */
    public StatusAccount createStatusAccount() {
        return new StatusAccount();
    }

    /**
     * Create an instance of {@link GetBalanceResponse }
     * 
     */
    public GetBalanceResponse createGetBalanceResponse() {
        return new GetBalanceResponse();
    }

    /**
     * Create an instance of {@link OperationsResponse }
     * 
     */
    public OperationsResponse createOperationsResponse() {
        return new OperationsResponse();
    }

    /**
     * Create an instance of {@link StatusAccountResponse }
     * 
     */
    public StatusAccountResponse createStatusAccountResponse() {
        return new StatusAccountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "getBalance")
    public JAXBElement<GetBalance> createGetBalance(GetBalance value) {
        return new JAXBElement<GetBalance>(_GetBalance_QNAME, GetBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "operations")
    public JAXBElement<Operations> createOperations(Operations value) {
        return new JAXBElement<Operations>(_Operations_QNAME, Operations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "statusAccount")
    public JAXBElement<StatusAccount> createStatusAccount(StatusAccount value) {
        return new JAXBElement<StatusAccount>(_StatusAccount_QNAME, StatusAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "getBalanceResponse")
    public JAXBElement<GetBalanceResponse> createGetBalanceResponse(GetBalanceResponse value) {
        return new JAXBElement<GetBalanceResponse>(_GetBalanceResponse_QNAME, GetBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "operationsResponse")
    public JAXBElement<OperationsResponse> createOperationsResponse(OperationsResponse value) {
        return new JAXBElement<OperationsResponse>(_OperationsResponse_QNAME, OperationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "statusAccountResponse")
    public JAXBElement<StatusAccountResponse> createStatusAccountResponse(StatusAccountResponse value) {
        return new JAXBElement<StatusAccountResponse>(_StatusAccountResponse_QNAME, StatusAccountResponse.class, null, value);
    }

}
