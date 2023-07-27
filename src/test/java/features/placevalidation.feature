Feature: Validatating place API's

Scenario: Verify if place is being successfully added using addplaceAPI

Given add place payload 
When user calls "addplaceAPI" with the POST http method
Then the Api call got success with the status code 200
And  "status" in Responce body is " OK "
And "scope" in responce body is "App"

