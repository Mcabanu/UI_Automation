package Steps;

import TestCases.TestCases_001;
import io.cucumber.java.en.*;

public class StepDefinition {
	
	@Given("have the url of the application")
	public void have_the_url_of_the_application() {
	    TestCases_001.openURL();
	}

	@When("Select English language and accept cookies")
	public void select_english_language_and_accept_cookies() {
		TestCases_001.SelectLanguage();
	}

	@When("select Start & Manage a business page")
	public void select_start_manage_a_business_page() {
		TestCases_001.SelectBusinessType();
	}

	@Then("Get the  Start & Manage a business page visible")
	public void Get_the_start_manage_a_business_page_visible() {
		TestCases_001.verifyBussinesTypePage();
	}

	@When("Click the Step-by-Step Business Guide from Tool Category")
	public void click_the_step_by_step_business_guide_from_tool_category() {
		TestCases_001.SelectToolAndVerify();
	}

	@Then("User guide page is loaded")
	public void user_guide_page_is_loaded() {
		TestCases_001.verifyUserguidePage();
	}

	@When("Verify first question with all options and its content")
	public void verify_first_question_no_with_all_options_and_its_content() {
		TestCases_001.VerifyQuestion1();
	}

	@Then("Select option for first question")
	public void select_option_for_first_question() {
		TestCases_001.answerQue1();
	}
	

	@Then("Click Next button of first question page")
	public void click_next_button_of_first_question_page() {
		TestCases_001.next1();
	}

	@When("Verify second question with all options and its content")
	public void verify_second_question_no_with_all_options_and_its_content() {
		TestCases_001.VerifyQuestion2();
	}

	@When("Verify Previous answers in second question")
	public void verify_previous_answers_in_second_question() {
		TestCases_001.checkPreviouAnswer_1AndClickNext();
	}
	
	@Then("Select third option for second question")
	public void select_third_option_for_second_question() {
		TestCases_001.answerQue2();  
	}


	@Then("Click Next button of second question page")
	public void click_next_button_of_second_question_page() {
		TestCases_001.next2();
	}
	
	@When("Verify third question  with all options and its content")
	public void verify_third_question_with_all_options_and_its_content() {
		TestCases_001.VerifyQuestion3();
	}

	@When("verify previous answer in third question")
	public void verify_previous_answer_in_third_question() {
		TestCases_001.checkPreviouAnswer_1_2_AndClickNext();
	}

	@Then("Select first option for third question")
	public void select_first_option_for_third_question() {
		TestCases_001.answerQue3();
	}

	@When("Click Next button of third question page")
	public void click_next_button_of_third_question_page() {
		TestCases_001.next3();
	}

	@Then("Verify Login page is getting displayed")
	public void verify_login_page_is_getting_displayed() {
		TestCases_001.verifyOfLoginpage();
	}
	
	
	
	@Then("close the browser")
	public void close_the_browser() {
	    TestCases_001.tearDown();
	}

}
