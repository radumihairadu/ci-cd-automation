package cucumber_assignment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    String input;
    int actual;


    @Given("I enter a calendar date {string}")
    public void i_enter_a_calendar_date(String string) {
        // Write code here that turns the phrase above into concrete actions
       input = string;
    }
    @When("I test for days gone since entered calendar date")
    public void i_test_for_days_gone_since_entered_calendar_date() {
        // Write code here that turns the phrase above into concrete actions
        actual = DaysCounter.count(input);
    }
    @Then("I should get result {int}")
    public void i_should_get_result(Integer expected) {
        // Write code here that turns the phrase above into concrete actions
        if (actual != expected)
            throw new AssertionError("Actual not equal with expected ");
    }

}
