package com.anuragpandit.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TodoPage {
    private WebDriver driver;

    @FindBy(css = ".new-todo")
    private WebElement todoInput;

    @FindBy(css = ".todo-list li label")
    private List<WebElement> todoItems;

    @FindBy(css = ".todo-list li .destroy")
    private List<WebElement> deleteButtons;

    public TodoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addTodo(String todoText) {
        todoInput.sendKeys(todoText);
        todoInput.sendKeys(Keys.ENTER);
    }

    public void editTodo(int index, String newText) {
        todoItems.get(index).click();
        todoItems.get(index).sendKeys(newText);
        todoItems.get(index).sendKeys(Keys.ENTER);
    }

    public void deleteTodo(int index) {
        deleteButtons.get(index).click();
    }

    public boolean isTodoPresent(String todoText) {
        for (WebElement item : todoItems) {
            if (item.getText().equals(todoText)) {
                return true;
            }
        }
        return false;
    }
}
