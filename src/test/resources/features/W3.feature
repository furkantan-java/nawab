# new feature
# Tags: optional

Feature: Find all the elements with a tag
  Scenario: go to url3, find all the elements in the page with the tag a,
  for each of those elements, if it is displayed on the page,
  print the text and the href of that element.

    Given user is on the url3
    When find all elements with the tag a
    Then for each element displayed print text and href