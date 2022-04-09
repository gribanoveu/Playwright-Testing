package autotest.base;

import autotest.browsers.BrowsersFactory;
import autotest.enums.BrowserName;
import com.microsoft.playwright.Page;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public abstract class BaseTest {
    protected Page page;

    @BeforeClass
    @Parameters({"browserName"})
    public void setUp(@Optional("chromium") String browserName) {
        page = BrowsersFactory.createInstance(BrowserName.fromString(browserName));
    }

    @AfterClass
    public void closeBrowser() {
        page.close();
    }
}
