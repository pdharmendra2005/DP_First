package automationPractice.StepDefs;


import automationPractice.Utils.Utils;
import automationPractice.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSteps {

  HomePage homePage = new HomePage();

  @Given("I am on the HomePage")
  public void verifyUserOnTheHomePage() {
    Assert.assertTrue(homePage.isUserOnHomePage());
  }

  @When("I click on SignIn Link")
  public void selectSignInLink() {
    Utils.waitForPageLoad();
    homePage.goToAuthenticationPage();
    //test case is executing very fast, its not waiting for the web element to perform the action
    // we need to use web driver explicit wait
  }




}
