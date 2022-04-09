package autotest.browsers;

import autotest.enums.BrowserName;
import com.microsoft.playwright.Page;

public class BrowsersFactory {
    private BrowsersFactory() {}

    public static Page createInstance(BrowserName browserName) {
        Page page = null;
        switch (browserName) {
            case CHROMIUM : page = new ChromiumContext().createBrowser();
        }
        return page;
    }
}
