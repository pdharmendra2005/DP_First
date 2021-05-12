package automationPractice.StepDefs;

import automationPractice.pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {

  @Before
  public void startBrowser(){
    openBrowser(browserName, baseUrl);

  }
  @After
  public void stopBrowser(){
    closeBrowser();
  }

}
