package tests;

import autotest.base.BaseTest;
import com.microsoft.playwright.Page;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchPageTest extends BaseTest {


    @Test
    public void search() {
        SearchPage searchPage = new SearchPage(page);
        searchPage.navigate();
        searchPage.search("search query");
    }
}
