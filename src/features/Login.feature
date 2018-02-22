@Login
Feature: Logowanie

  Scenario: Logowanie istniejacego klienta
    Given Jestem na stronie Logowanie
    When Wpisuje login "xxxx@morele.net" i haslo "haslo111"
    And Klikniecie na przycisk Zaloguj sie
    Then Jestem zalogowany

