package autotest.enums;

public enum BrowserName {
    CHROMIUM("chromium"),
    FIREFOX("firefox"),
    WEBKIT("webkit");

    private String browserName;

    BrowserName(String browserName) {
        this.browserName = browserName;
    }

    @Override
    public String toString() {
        return String.valueOf(this.browserName);
    }

    public static BrowserName fromString(String browserName) {
        if (browserName != null) {
            for(BrowserName browser : BrowserName.values()) {
                if (browserName.equalsIgnoreCase(browser.browserName)) {
                    return browser;
                }
            }
        }
        return null;
    }

    public String getBrowserName() {
        return this.browserName;
    }
}
