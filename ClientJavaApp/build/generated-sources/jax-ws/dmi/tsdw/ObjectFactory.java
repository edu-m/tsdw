
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

    private final static QName _ShowOddEven_QNAME = new QName("http://tsdw.dmi/", "showOddEven");
    private final static QName _SommaResponse_QNAME = new QName("http://tsdw.dmi/", "sommaResponse");
    private final static QName _ShowOddEvenResponse_QNAME = new QName("http://tsdw.dmi/", "showOddEvenResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://tsdw.dmi/", "helloResponse");
    private final static QName _Hello_QNAME = new QName("http://tsdw.dmi/", "hello");
    private final static QName _Subj_QNAME = new QName("http://tsdw.dmi/", "subj");
    private final static QName _SubjResponse_QNAME = new QName("http://tsdw.dmi/", "subjResponse");
    private final static QName _Somma_QNAME = new QName("http://tsdw.dmi/", "somma");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dmi.tsdw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowOddEven }
     * 
     */
    public ShowOddEven createShowOddEven() {
        return new ShowOddEven();
    }

    /**
     * Create an instance of {@link SommaResponse }
     * 
     */
    public SommaResponse createSommaResponse() {
        return new SommaResponse();
    }

    /**
     * Create an instance of {@link ShowOddEvenResponse }
     * 
     */
    public ShowOddEvenResponse createShowOddEvenResponse() {
        return new ShowOddEvenResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Subj }
     * 
     */
    public Subj createSubj() {
        return new Subj();
    }

    /**
     * Create an instance of {@link SubjResponse }
     * 
     */
    public SubjResponse createSubjResponse() {
        return new SubjResponse();
    }

    /**
     * Create an instance of {@link Somma }
     * 
     */
    public Somma createSomma() {
        return new Somma();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowOddEven }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "showOddEven")
    public JAXBElement<ShowOddEven> createShowOddEven(ShowOddEven value) {
        return new JAXBElement<ShowOddEven>(_ShowOddEven_QNAME, ShowOddEven.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SommaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "sommaResponse")
    public JAXBElement<SommaResponse> createSommaResponse(SommaResponse value) {
        return new JAXBElement<SommaResponse>(_SommaResponse_QNAME, SommaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowOddEvenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "showOddEvenResponse")
    public JAXBElement<ShowOddEvenResponse> createShowOddEvenResponse(ShowOddEvenResponse value) {
        return new JAXBElement<ShowOddEvenResponse>(_ShowOddEvenResponse_QNAME, ShowOddEvenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "subj")
    public JAXBElement<Subj> createSubj(Subj value) {
        return new JAXBElement<Subj>(_Subj_QNAME, Subj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "subjResponse")
    public JAXBElement<SubjResponse> createSubjResponse(SubjResponse value) {
        return new JAXBElement<SubjResponse>(_SubjResponse_QNAME, SubjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "somma")
    public JAXBElement<Somma> createSomma(Somma value) {
        return new JAXBElement<Somma>(_Somma_QNAME, Somma.class, null, value);
    }

}
