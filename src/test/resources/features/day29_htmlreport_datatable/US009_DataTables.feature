Feature: US009 Google Testi
  Scenario: TC01 Google sayfasinda aramayapilir
    Given kullanici "https://google.com" sayfasina gider
    When kullanici verilen bilgiler ile arama yapar
      | volvo |
      | audi  |
      | honda |
    And sayfayi kapatir

Feature: US009 Google Testi
  Scenario: TC02 Google sayfasinda aramayapilir
    Given kullanici "https://google.com" sayfasina gider
    When kullanici verilen bilgiler ile arama yapar ikinci yol
      | volvo |
      | audi  |
      | honda |
    And sayfayi kapatir