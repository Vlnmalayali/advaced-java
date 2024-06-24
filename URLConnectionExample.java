import java.awt.Desktop;
import java.net.URI;

public class URLConnectionExample {

    public static void main(String[] args) {
        try {
            // URL to open in the browser
            String url = "https://github.com/Vlnmalayali";

            // Create URI object
            URI uri = new URI(url);

            // Check if Desktop is supported
            if (Desktop.isDesktopSupported()) {
                // Get the desktop object
                Desktop desktop = Desktop.getDesktop();

                // Open the URI
                desktop.browse(uri);
            } else {
                System.out.println("Desktop not supported, opening URL in browser is not possible.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
