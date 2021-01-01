$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/listAllProducts.feature");
formatter.feature({
  "name": "Products will be listed",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AllProducts"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "Whole product in the website will be listed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AllProducts"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Uenjoy website",
  "keyword": "Given "
});
formatter.match({
  "location": "TopButtonRideOns.user_is_on_the_uenjoy_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click to the All Collections button",
  "keyword": "When "
});
formatter.match({
  "location": "ListAllProducts.user_click_to_the_All_Collections_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see the new page that related to All Collection",
  "keyword": "Then "
});
formatter.match({
  "location": "ListAllProducts.user_should_see_the_new_page_that_related_to_All_Collection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});