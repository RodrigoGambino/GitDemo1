package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import Cucumber.Automation.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.CheckOutPage;

@RunWith(Cucumber.class)
public class stepDefinition extends Base {
	CheckOutPage cp;
	
	@Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
		System.out.println("Deciding the browser to open");
		System.out.println("Deciding the browser to open");
		System.out.println("Deciding the browser to open");
		System.out.println("Deciding the browser to open");
		//fdf
		//dfsdf
		System.out.println("Deciding the browser to open");
		System.out.println("Deciding the browser to open");
		System.out.println("Deciding the browser to open");
		System.out.println("Deciding the browser to open");
		
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("Browser is started");
    	System.out.println("Deciding the browser to open");
    }
	
	@Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //code to navigate to login url
		System.out.println("Navigated to login url");
    }
	
	@When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
        System.out.println("Browser is triggered");
        System.out.println("Browser is triggered");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //home page validation
    	System.out.println("Validated home page");
    }
    
    @Then("Cards displayed are {string}")
    public void cards_displayed_are(String string) {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(string);
    }

    @When("^User sing up with following details$")
    public void user_sing_up_with_following_details(DataTable data) throws Throwable {
    	List<List<String>> obj = data.asLists();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	System.out.println(obj.get(0).get(4));
        
    }
    
    @When("^User login in to application with username (.+) and password (.+)$")
    public void user_login_into_application_with_username_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }
    
    @Then("^Verify selected (.+) items are display in Checkout page$")
    public void verify_selected_something_items_are_display_in_checkout_page(String strArg1) throws Throwable {
    	cp = new CheckOutPage(driver);
        Assert.assertTrue(cp.getProductName().getText().contains(strArg1));
    }
    
}
