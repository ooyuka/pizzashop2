package s.pizza;

import java.io.IOException;
import java.util.*;
 
import javax.jdo.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
 
public class ClerkEditDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("no url...");
    }
 
    @Override
    protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        long id2 = Long.parseLong(req.getParameter("id"));
        String order = req.getParameter("order");
        String name = req.getParameter("name");
        String tel = req.getParameter("tel");
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        OrderData data = (OrderData)manager.getObjectById(OrderData.class,id2);
        data.setOrder(order);
        data.setName(name);
        data.setTel(tel);
        manager.close();
        resp.sendRedirect("/clerk.html");
    }
}
