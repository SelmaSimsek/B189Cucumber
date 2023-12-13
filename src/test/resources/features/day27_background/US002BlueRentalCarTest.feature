@US002
Feature: US002 Blue Rental Car Test
  Scenario: TC01 Verilen email ve password ile login olma
    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    And email ve password bilgileri ile login olur
    And Sayfayi kapatir