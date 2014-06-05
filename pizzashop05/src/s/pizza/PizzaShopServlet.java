package s.pizza;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.http.*;

import s.pizza.OrderData;
import s.pizza.PMF;

@SuppressWarnings("serial")
public class PizzaShopServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        String param1 = req.getParameter("id");
        PrintWriter out = resp.getWriter();
        List<OrderData> list = null;
        if (param1 == null || param1 ==""){
            String query = "select from " + OrderData.class.getName();
            try {
                list = (List<OrderData>)manager.newQuery(query).execute();
            } catch(JDOObjectNotFoundException e){
            	
            	//Dataがない場合の対処法
            	
            }
        } else {
            try {
                OrderData data = (OrderData)manager.getObjectById(OrderData.class,Long.parseLong(param1));
                list = new ArrayList();
                list.add(data);
            } catch(JDOObjectNotFoundException e){
            	
            	//対処法,IDのgetは1番目からなので注意
            	
            }
        }
        String res = "[";
        if (list != null){
            for(OrderData data:list){
                res += "{id:" + data.getId() + ",name:'" + data.getName() + "',order:'" +
                        data.getOrder() + "',date:'" + data.getDatetime() +
                        "',tel:'" + data.getTel() + "'},";
            }
        }
        res += "]";
        out.println(res);
        manager.close();
    }
}
