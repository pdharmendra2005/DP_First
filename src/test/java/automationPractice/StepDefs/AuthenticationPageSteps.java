package automationPractice.StepDefs;

import automationPractice.pages.AuthenticationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AuthenticationPageSteps {

  AuthenticationPage authenticationPage = new AuthenticationPage();

   @Then("^I should be on Authentication Page$")
   public void verifyAuthenticationPage() {
    Assert.assertTrue(authenticationPage.isUserOnAuthenticationPage());
  }

  @Then("I should see SignUp Panel")
  public void verifySignUpPanel() {
    Assert.assertTrue(authenticationPage.isSignInPanelShown());
  }

  @When("I enter my Email Id as {string}")
  public void enterEmail(String emailToRegister) {
      authenticationPage.enterEmailToRegister(emailToRegister);
   }

  @When("I click on Create an account button")
  public void click_Create_an_account_button() {
      authenticationPage.selectCreateAnAccount();
   }

  @Then("I should be on Registration Page")
  public void i_should_be_on_registration_page() {


  }

  @When("I enter username as {string} and password as {string}")
  public void enterCredentials(String email, String password) {
      authenticationPage.enterCredentials(email,password);
  }

  @When("I click SignIn")
  public void click_signIn_Button() {
      authenticationPage.selectSignIn();
  }



}
