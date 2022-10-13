package components.base;

import annotations.Component;
import components.AbsComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.CoursePage;
import pages.MainPage;

import java.lang.annotation.Annotation;
import java.util.List;

@Component("div.lessons__new-item-container")
public class CourseListComponent extends AbsStaticComponent<CourseListComponent> {

    public CourseListComponent(WebDriver driver) {
        super(driver);
    }

    private List<WebElement> courses = driver.findElements(getComponentLocator());

    public CoursePage clickCourseByIndex(int index){
        Actions action = new Actions(driver);
        action.click(courses.get(index - 1));
        return new CoursePage(driver);
    }

    public String getCourseTitle(int index) {
        return courses.get(index - 1).getText();
    }
}
