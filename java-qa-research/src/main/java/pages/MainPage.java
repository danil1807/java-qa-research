package pages;


import annotations.UrlPrefix;
import components.base.CourseListComponent;
import org.openqa.selenium.WebDriver;

@UrlPrefix("/")
//@Page("MainPage")
public class MainPage extends AbsBasePage<MainPage> {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private CourseListComponent courseListComponent;

    public CourseListComponent getCourseListComponent() {
        return courseListComponent = new CourseListComponent(driver);
    }
}
