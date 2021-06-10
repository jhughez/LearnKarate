Feature: Hello World

  Background:
    * url 'http://localhost:8080/'

  Scenario: Get Hello World

    Given path 'test'
    When method GET
    Then status 200
    And match $ == 'Hello World'

  Scenario: Get Hello Joe

    Given path 'test/by-name'
    And param name = 'Joe'
    When method GET
    Then status 200
    And match $ == 'Hello Joe'

  Scenario: Save Data

    Given path 'test'
    And request {name: 'test'}
    When method POST
    Then status 200
    And match $ == 'Hello test'
