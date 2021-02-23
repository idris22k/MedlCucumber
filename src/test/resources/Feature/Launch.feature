Feature: validation of amazon application

  Scenario: TC01_to Validate Amazon application to
    Given userbshould launch the mobile application
    When user should search products
    And user should select toggle button
    And user  should select your account
    Then user with login username and password
