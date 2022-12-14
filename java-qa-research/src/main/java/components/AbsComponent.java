package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import waiters.StandardWaiter;

public abstract class AbsComponent<T> {

    protected WebDriver driver;
    protected StandardWaiter waiter;

    public AbsComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waiter = new StandardWaiter(driver);
    }

}
