Feature:user sign up amazon webpages



  Scenario: TC001_create amazon account

    Given user is on signup page "https://www.amazon.com/"
    And user click to account checkbox
    And user enter name "mehmet kaplan"
    And user enter email "qwe@gmail.com"
    And user enter password "asdf1234"
    And user enter re-password "asdf1234"
    And user click to continue checkbox
    