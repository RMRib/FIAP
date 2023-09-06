#Author: ricardo@email.com
#Encoding: utf-8

@testesWeb
Feature: Login

  Scenario: login com sucesso
    Given que estou na pagina de login
    When preencher usuario e senha validos
    And clicar no botao login
    Then a pagina inicial sera exibida

  Scenario Outline: login invalido
    Given que estou na pagina de login
    When preencher usuario "<usuario>" e senha "<senha>"
    And clicar no botao login
    Then sera exibida a mensagem "<mensagem>"

    Examples: 
      | usuario | senha | mensagem                                                                  |
      | teste   |  1234 | Epic sadface: Username and password do not match any user in this service |
