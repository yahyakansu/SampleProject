@Ride-ons
Feature: Top button functionalities

  Background: User is already use Uenjoy website
    Given User is on the Uenjoy website

  Scenario: Ride-ons dropdown button verification
    When User click to the Ride-ons button
    Then User should see the new page that releated Ride-ons

  Scenario: Racer dropdown button verification
    When User move to the Ride-ons button
    And User click to the Racer button
    Then User should see the new page that releated Racer

  Scenario: Explorer dropdown button verification
    When User move to the Ride-ons button
    And User click to the Explorer button
    Then User should see the new page that releated Explorer

  Scenario: Two Seat dropdown button verification
    When User move to the Ride-ons button
    And User click to the Two Seat button
    Then User should see the new page that releated Two Seat