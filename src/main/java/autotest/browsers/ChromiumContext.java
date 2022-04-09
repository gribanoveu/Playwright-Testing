package autotest.browsers;

import com.microsoft.playwright.*;
import lombok.extern.slf4j.Slf4j;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Slf4j
public class ChromiumContext extends AbstractBrowser {

    @Override
    protected Page createBrowser() {
        String timeStamp = new SimpleDateFormat("dd.MM.yy").format(Calendar.getInstance().getTime());
        var videoPath = Paths.get("temp/" + timeStamp + "/videos/");
        log.info("Video saved in: " + videoPath);
        var contextOptions = new Browser.NewContextOptions()
                .setViewportSize(1920, 1080)
                .setRecordVideoDir(videoPath)
                .setRecordVideoSize(1920, 1080);
        browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        context = browser.newContext(contextOptions);
        page = context.newPage();
        return page;
    }
}
