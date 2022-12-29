/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankclient;

import dmi.tsdw.BankClass;

/**
 *
 * @author romae
 */
public class BankClient {

    /**
     * @param args the command line arguments
     */
    private static String parseString(java.lang.String msg) {
        dmi.tsdw.WsArit service = new dmi.tsdw.WsArit();
        dmi.tsdw.BankClass port = service.getBankClassPort();
        return port.parseString(msg);
    }
    
    public static void main(String[] args) {
        parseString("U");
    }
    

    
    
}
