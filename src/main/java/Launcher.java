import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Launcher {
    public static void main(String[] args) {
        Server server = new Server();
        ServerConnector serverConnector = new ServerConnector(server);
        serverConnector.setPort(8082);
        server.setConnectors(new Connector[] {serverConnector});
        ServletContextHandler contextHandler = new ServletContextHandler(server,"/example");
        contextHandler.setContextPath("/");
        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
