package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.LogUtils;
import utils.PropertyProvider;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import static utils.GlobalConstants.*;


public class FactoryDriver {

    private static WebDriver driver;

    private static String browserName;

   
    public static void setBrowserName(String browserName) {
        String browserNameInSystemSettings = System.getProperty("browser");
        if(Objects.nonNull(browserNameInSystemSettings)) {
            FactoryDriver.browserName = browserNameInSystemSettings;
        } else {
            FactoryDriver.browserName = browserName;
        }
    }

    public static WebDriver getInstance() {
        if (Objects.isNull(driver)) {
            createNewDriver();
        }
        return driver;
    }
    public static void closeDriver() {
        driver.quit();
        driver = null;
    }

    /***
     * Factory method
     * This one adds cross-browser functionality to tests
     */
    private static void createNewDriver(){
        BrowserTypes browser;
        try{
            browser = BrowserTypes.valueOf(browserName.toUpperCase());
        }catch (IllegalArgumentException e){
            LogUtils.logError(e.getMessage());
            LogUtils.logDebug("Set default browser: Chrome");
            browser = BrowserTypes.CHROME;
        }
        String platform = System.getProperty("os.name").toLowerCase();
        switch (browser){
            case CHROME:
                driver = createChromeDriver(platform);
                LogUtils.logDebug("Chrome driver is created");
                break;

        }
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    /***
     * Set system properties for target platform
     * @param platform passes platform name
     * @return ChromeDriver instance
     */
    private static ChromeDriver createChromeDriver(String platform){
        if(platform.startsWith("windows")) {
            System.setProperty(PropertyProvider.getProperty(CHROME_DRIVER), PropertyProvider.getProperty(CHROME_DRIVER_EXE_WIN));
        }else {
            System.setProperty(PropertyProvider.getProperty(CHROME_DRIVER), PropertyProvider.getProperty(CHROME_DRIVER_EXE_MAC));
        }
        return new ChromeDriver();
    }
}

    
