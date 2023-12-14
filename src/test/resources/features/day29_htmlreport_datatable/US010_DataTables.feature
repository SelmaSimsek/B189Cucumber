Feature: US010 BlueRentalCar sayfasinda Login Testi
  Scenario: TC01 Verilen email ve password bilgileri ile login olunur
    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    And verilen wmail ve password ile login olur
      | email                         | password |
      | sam.walker@bluerentalcars.com | sami     |
      | john_doe@gmail.com            | johndoe  |
      | johnson@bluerentalcars.com    | johnson  |
    And sayfayi kapatir