package pages;

import annotations.UrlPrefix;
import annotations.UrlTemplate;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

@UrlTemplate("/{1}/{2}")
@UrlPrefix("/news")
public class CoursePage extends AbsBasePage<CoursePage>{

    public CoursePage(WebDriver driver) {
        super(driver);
    }

    public boolean someTestMethod(String courseTitle) {
        return false;
    }
}
