#Author: profricardo.moura@fiap.com.br

@tag
Feature: Everything about your Pets
  Descrição da feature

Background:
	Given path 'pet'

  @tag1
  Scenario: Finds Pets by status
    Given url UrlBase
    And path 'findByStatus'
    And param status = 'available'
    When method GET
    Then status 200
    And match response[0].name contains 'fish'
