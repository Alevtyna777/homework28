import java.io.IOException;

public abstract class HttpServlet {
    protected abstract void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;

    protected abstract void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
