Feature: Scenario Outline functionalities

  @newAccounts
  Scenario Outline: Uenjoy accounts verification
    Given User is on the Uenjoy website
    And User clicks to the account button
    And User writes own "<email address>" to the email box
    And User writes own "<password>" to the password box
    When User clicks to the sign in button
    Then User should see the own account page

    Examples: Table for the verification
      | email address     | password  |
      | isdfw01@gmail.com | wp4kt6301 |
      | wmjpj55@gmail.com | fd5ns6828 |
      | bpjyk57@gmail.com | fc3yr1878 |
      | jhkxt44@gmail.com | tc3ln5184 |
      | ihnnn67@gmail.com | gm5tg6603 |