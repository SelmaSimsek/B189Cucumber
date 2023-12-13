#USER STORY : US_manager_login_test
#Scenario:kullanici tum manager login bilgileriyle giriş yapabilmeli

#TEST DATA
#url : https://www.bluerentalcars.com/
#Managers:
#| ayhancan@bluerentalcars.com   | ayhan    |
#| beyhancan@bluerentalcars.com  | beyhan   |
#| sam.walker@bluerentalcars.com | sami     |
#| john_doe@gmail.com            | johndoe  |
#| johnson@bluerentalcars.com    | johnson  |

  Feature: US007 BlueRentalCar login islemi
    Scenario Outline: TC01 kullanici manager login bilgileriyle giris yapabilmeli
      Given kullanici "https://www.bluerentalcars.com/" sayfasina gider
      When login butonuna tiklar
      And kullanici "<email>" ve "<password>" bilgilerini girer
      And kullanici 3 saniye bekler
      Then login oldugunu dogrular
      And kullanici 1 saniye bekler
      And sayfayi kapatir
      Examples:
        | email                         | password |
        | ayhancan@bluerentalcars.com   | ayhan    |
        | beyhancan@bluerentalcars.com  | beyhan   |
        | sam.walker@bluerentalcars.com | sami     |
        | john_doe@gmail.com            | johndoe  |
        | johnson@bluerentalcars.com    | johnson  |