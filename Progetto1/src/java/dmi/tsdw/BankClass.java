/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmi.tsdw;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author romae
 */
@WebService(serviceName = "WsArit")
public class BankClass {
    public int context = 0; // il conto di default è impostato a zero. L'utente deve cambiarlo con Un
    public static Account[] arr = new Account[10];
    BankClass() {
        for (int i = 0; i < 10; ++i)
            arr[i] = new Account();
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ParseString")
    public String ParseString(@WebParam(name = "msg") final String msg) {
        String key = msg.substring(0, 1);
        if (key.equals("U") // selezione di conto
                && (Integer.parseInt(msg.substring(1, 2)) < 10 && Integer.parseInt(msg.substring(1, 2)) >= 0)) {
            context = Integer.parseInt(msg.substring(1, 2));
            return ("Conto cambiato, selezionato " + context);
        } else if (key.equals("V")) { // versamento su conto
            int oldBal = arr[context].getBalance();
            arr[context].addToBalance(Integer.parseInt(msg.substring(1, 5)));
            return ("Conto incrementato a " + arr[context].getBalance() + ". Aveva " + oldBal);
        } else if (key.equals("P")) { // prelevamento su conto
            int oldBal = arr[context].getBalance();
            arr[context].addToBalance(-1 * Integer.parseInt(msg.substring(1, 4)));
            return ("Conto decrementato a " + arr[context].getBalance() + ". Aveva " + oldBal);
        } else if (key.equals("S")) {
            return ("Non ho idea di cosa fare");
        }
        return "ERROR";
    }
}
