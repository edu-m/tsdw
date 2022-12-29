/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavaapp;

/**
 *
 * @author romae
 */
public class ClientJavaApp {

    

    private static int somma(int op1, int op2) {
        dmi.tsdw.WsArit_Service service = new dmi.tsdw.WsArit_Service();
        dmi.tsdw.WsArit port = service.getWsAritPort();
        return port.somma(op1, op2);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, calling SOAP WS somma(7,9): "+somma(7,9));
    }
}
