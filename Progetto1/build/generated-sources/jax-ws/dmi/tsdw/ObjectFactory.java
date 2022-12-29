
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

    private final static QName _ParseString_QNAME = new QName("http://tsdw.dmi/", "ParseString");
    private final static QName _ParseStringResponse_QNAME = new QName("http://tsdw.dmi/", "ParseStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dmi.tsdw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParseString }
     * 
     */
    public ParseString createParseString() {
        return new ParseString();
    }

    /**
     * Create an instance of {@link ParseStringResponse }
     * 
     */
    public ParseStringResponse createParseStringResponse() {
        return new ParseStringResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "ParseString")
    public JAXBElement<ParseString> createParseString(ParseString value) {
        return new JAXBElement<ParseString>(_ParseString_QNAME, ParseString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsdw.dmi/", name = "ParseStringResponse")
    public JAXBElement<ParseStringResponse> createParseStringResponse(ParseStringResponse value) {
        return new JAXBElement<ParseStringResponse>(_ParseStringResponse_QNAME, ParseStringResponse.class, null, value);
    }

}
