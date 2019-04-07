import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Launcher {
    public static void main(String[] args) {
        //создаем экземпляр сервера
        Server server = new Server();
        //создаем и конфигурируем коннекторы
        ServerConnector serverConnector = new ServerConnector(server);
        serverConnector.setPort(8082);
        server.setConnectors(new Connector[] {serverConnector});
        //создаем и конфигурируем хендлеры
        //ServletContextHandler contextHandler = new ServletContextHandler(server,"/example");
        //contextHandler.setContextPath("/");
        server.setHandler(new HelloHandler("Hello world", null));
        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
