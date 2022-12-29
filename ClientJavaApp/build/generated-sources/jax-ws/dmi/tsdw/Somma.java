
package dmi.tsdw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for somma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="somma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="op1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="op2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somma", propOrder = {
    "op1",
    "op2"
})
public class Somma {

    protected int op1;
    protected int op2;

    /**
     * Gets the value of the op1 property.
     * 
     */
    public int getOp1() {
        return op1;
    }

    /**
     * Sets the value of the op1 property.
     * 
     */
    public void setOp1(int value) {
        this.op1 = value;
    }

    /**
     * Gets the value of the op2 property.
     * 
     */
    public int getOp2() {
        return op2;
    }

    /**
     * Sets the value of the op2 property.
     * 
     */
    public void setOp2(int value) {
        this.op2 = value;
    }

}
