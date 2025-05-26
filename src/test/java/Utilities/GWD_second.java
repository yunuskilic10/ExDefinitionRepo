package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD_second {
    private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static ThreadLocal<String> threadBrowserType = new ThreadLocal<>();
    public static WebDriver getDriver(){
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        if (threadBrowserType.get() == null) {
            threadBrowserType.set("chrome");
        }

        if (threadLocal.get() == null) {
            switch (threadBrowserType.get()) {
                case "firefox":
                    threadLocal.set(new FirefoxDriver());
                    break;

                case "safari":
                    threadLocal.set(new SafariDriver());
                    break;

                case "edge":
                    threadLocal.set(new EdgeDriver());
                    break;

                default:
                    threadLocal.set(new ChromeDriver());
            }
        }
        threadLocal.get().manage().window().maximize();
        threadLocal.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        return threadLocal.get();

    }
    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (threadLocal.get() != null) {
            threadLocal.get().quit();

            WebDriver driver = threadLocal.get();
            driver = null;

            threadLocal.set(driver);
        }

    }
}
