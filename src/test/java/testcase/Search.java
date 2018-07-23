package testcase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Search{

    @Given("^打开百度，验证title$")
    public void setp1() {
        System.out.println("打开百度，验证title");
    }

    @When("^输入 \"(.*?)\"$")
    public void setp2(String text){
        System.out.println(text);
    }

    @Then("^点击搜索按钮$")
    public void setp3() {
        System.out.println("点击搜索按钮$");
    }

    @Then("^清除搜索框$")
    public void setp4() {
        System.out.println("清除搜索框$");;
    }

}
