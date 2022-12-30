/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmi.tsdw;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gabri
 */
public class myServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet myServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet myServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            
            out.println("<html>\n" +
                        "    <head>\n" +
                        "        <title>Fake Bank</title>\n" +
                        "        <meta charset=\"UTF-8\">\n" +
                        "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "        <form method=\"post\" action=\"myServlet\">\n" +
                        "            <input type=\"hidden\" name=\"status\" value=\"statusValue\">\n" +
                        "            Richiedi numero di conto: <button type=\"submit\">Submit</button>\n" +
                        "        </form>\n" +
                        "        \n" +
                        "        <form method=\"post\" action=\"myServlet\">\n" +
                        "            <input type=\"hidden\" name=\"status\" value=\"statusBalance\">\n" +
                        "            Richiedi saldo del conto: <button type=\"submit\">Submit</button>\n" +
                        "        </form>\n" +
                        "        \n" +
                        "        <form method=\"post\" action=\"myServlet\">\n" +
                        "            <input type=\"hidden\" name=\"status\" value=\"statusLogout\">\n" +
                        "            Effettua il logout: <button type=\"submit\">Submit</button>\n" +
                        "        </form>\n" +
                        "        <br>\n" +
                        "        <form method=\"post\" action=\"myServlet\">\n" +
                        "            Inserire le operazioni e premere invio:<br>\n" +
                        "            <input type=\"hidden\" name=\"status\" value=\"statusOperations\">\n" +
                        "            <input type=\"text\" name=\"param1\">\n" +
                        "            <input type=\"text\" name=\"param2\">\n" +
                        "            <button type=\"submit\">Submit</button>\n" +
                        "        </form>\n" +
                        "    </body>\n" +
                        "</html><br>");
            
            
            String name=request.getParameter("status");
            if(name.compareTo("statusValue")==0){
                out.println(statusAccount());
            }
            if(name.compareTo("statusBalance")==0){
                out.println(getBalance());
            }
            if(name.compareTo("statusLogout")==0){
                out.println(logout());
            }
            if(name.compareTo("statusOperations")==0){
                out.println( operations( request.getParameter("param1"), Integer.parseInt(request.getParameter("param2")) ) );
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static String getBalance() {
        dmi.tsdw.MyWebService_Service service = new dmi.tsdw.MyWebService_Service();
        dmi.tsdw.MyWebService port = service.getMyWebServicePort();
        return port.getBalance();
    }

    private static String logout() {
        dmi.tsdw.MyWebService_Service service = new dmi.tsdw.MyWebService_Service();
        dmi.tsdw.MyWebService port = service.getMyWebServicePort();
        return port.logout();
    }

    private static String operations(java.lang.String param1, int param2) {
        dmi.tsdw.MyWebService_Service service = new dmi.tsdw.MyWebService_Service();
        dmi.tsdw.MyWebService port = service.getMyWebServicePort();
        return port.operations(param1, param2);
    }

    private static String statusAccount() {
        dmi.tsdw.MyWebService_Service service = new dmi.tsdw.MyWebService_Service();
        dmi.tsdw.MyWebService port = service.getMyWebServicePort();
        return port.statusAccount();
    }

}
