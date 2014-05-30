package test;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddLinkDataServlet extends HttpServlet{
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
        String member = req.getParameter("member");
        String address = req.getParameter("address");
        String mail = req.getParameter("mail");
        String password = req.getParameter("password");
        String tell = req.getParameter("tell");
        Date date = Calendar.getInstance().getTime();
        LinkData data = new LinkData(member, address, mail, tell ,password, date);
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        try {
            manager.makePersistent(data);
        } finally {
            manager.close();
        }
        resp.sendRedirect("/index.html");
    }

}
