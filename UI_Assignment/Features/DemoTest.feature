
Feature: UI Assignment for the website TAMM


  Scenario: : To test the TAMM website for business guide 
    Given have the url of the application
   When Select English language and accept cookies
    And select Start & Manage a business page
    Then Get the  Start & Manage a business page visible
    When Click the Step-by-Step Business Guide from Tool Category
    Then User guide page is loaded  
    When Verify first question with all options and its content
    Then Select option for first question
    And Click Next button of first question page
    When Verify second question with all options and its content
    And Verify Previous answers in second question
    Then Select third option for second question
    And Click Next button of second question page
    When Verify third question  with all options and its content
    And  verify previous answer in third question
   Then Select first option for third question
   When  Click Next button of third question page
   Then Verify Login page is getting displayed
   And close the browser

  
