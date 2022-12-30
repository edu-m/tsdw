/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmi.tsdw;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.*;
import javax.jws.Oneway;

/**
 *
 * @author gabri
 */
@WebService(serviceName = "myWebService")
public class myWebService {
    int selectedAccount=9999;
    
    ArrayList<Integer> bankAccount = new ArrayList<>(Arrays.asList(5000, 4500, 3700, 9800, 650, 1750, 6200, 1300, 7000, 8300));

    /**
     * Web service operation
     */
    @WebMethod(operationName = "statusAccount")
    public String statusAccount() {
        if(selectedAccount>=0 && selectedAccount<=9)
            return "Si sta operando sul conto: "+(selectedAccount+1);
        else
            return "Scegliere un conto sul quale operare";
    }

    /**
     * Web service operation
     * @param param1
     * @param param2
     * @return 
     */
    @WebMethod(operationName = "operations")
    public String operations(@WebParam(name = "param1") String param1, @WebParam(name = "param2") int param2) {
        
        if(param1.compareTo("U")==0 || param1.compareTo("u")==0){
            if(param2>=1 && param2<=10){
                selectedAccount=param2-1;
                return "Si sta operando sul conto: " + param2;
            }
        }
        
        if(param1.compareTo("V")==0 || param1.compareTo("v")==0){
            int tmp = bankAccount.get(selectedAccount)+param2;
            bankAccount.set(selectedAccount, tmp);
            return "Versamento effettuato";
        }
        
        if(param1.compareTo("P")==0 || param1.compareTo("p")==0){
            if(bankAccount.get(selectedAccount)>=param2){
                int tmp = bankAccount.get(selectedAccount);
                tmp -= param2;
                bankAccount.set(selectedAccount, tmp);
                return "Prelievo effettuato";
            }else
                return "Fondi insufficienti";
        }
        return "ERROR";
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "getBalance")
    public String getBalance() {
        if(selectedAccount>=0 && selectedAccount<=9){
            return "Il saldo è: "+bankAccount.get(selectedAccount);
        }
        return "Nessun conto selezionato";
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "logout")
    public String logout() {
        if(selectedAccount>=0 && selectedAccount<=9){
            selectedAccount=9999;
            return "Hai effettuato il logout";
        }
        return "Non hai ancora effettuato un login";
    }
    
    
    
    
    
    
    
    
    
    

}
