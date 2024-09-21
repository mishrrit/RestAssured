Feature: Verify the Get POST in the API

Scenario Outline: GET all post from the API
    Given Get call to "<url>"
    Then  Response is "<statusCode>"

    Examples:
    |  url         |statusCode |
    | /api/users   |200        |     





