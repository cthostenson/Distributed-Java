import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "ListServlet",
            urlPatterns = "/list")
public class ListServlet extends HttpServlet {
    private final String DRIVER_NAME = "jdbc:derby:";
    private final String DATABASE_PATH = "/WEB-INF/lib/filmfinder";
    private final String USER = "carter";
    private final String PW = "java";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            String path = getServletContext().getRealPath(DATABASE_PATH);

            conn = DriverManager.getConnection(DRIVER_NAME + path, USER, PW);

            stmt = conn.createStatement();

            StringBuilder sql = new StringBuilder();
            sql.append("SELECT Title FROM Movies ");
            sql.append("ORDER BY Title");

            rset = stmt.executeQuery(sql.toString());

            StringBuilder html = new StringBuilder("<html><body><ul>");

            while(rset.next()) {
                String title = rset.getString(1); // you can ask for index or by column name
                html.append("<li>").append(title).append("</li>");
            }

            html.append("</ul></body></html>");

            response.getWriter().print(html.toString());

        } catch(ClassNotFoundException | SQLException e) {
            response.getWriter().print(e.getMessage());
        } finally {
            if (rset != null) {
                try {
                    rset.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
