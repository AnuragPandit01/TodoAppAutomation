package com.anuragpandit.tests;

import com.anuragpandit.pages.TodoPage;
import com.opencsv.CSVReader;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TodoTest extends BaseTest {

    @Test(dataProvider = "todoData")
    public void testAddTodo(String todoText) {
        TodoPage todoPage = new TodoPage(driver);
        todoPage.addTodo(todoText);
        Assert.assertTrue(todoPage.isTodoPresent(todoText), "Todo item not added: " + todoText);
    }

    @DataProvider(name = "todoData")
    public Object[][] getTodoData() {
        List<String[]> data = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/testdata/todos.csv"))) {
            data = csvReader.readAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Object[][] result = new Object[data.size()][1];
        for (int i = 0; i < data.size(); i++) {
            result[i][0] = data.get(i)[0];
        }
        return result;
    }
}
