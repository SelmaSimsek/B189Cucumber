@US004
Feature: US004 Amazon Testi

  Background:
    Given kullanici "https://amazon.com" sayfasina gider

  Scenario: TC01 Arama kutusunda nokia aratilir
    And arama kutusunda "nokia" aratir
    And sayfayi kapatir

  Scenario: TC02 Arama kutusunda java aratilir
    And arama kutusunda "java" aratir
    And sayfayi kapatir

  Scenario: TC03 Arama kutusunda selenium aratilir
    And arama kutusunda "selenium" aratir
    And sayfayi kapatir



#Feature file i daha dinamik hale getirebilmek icin gitmek istedigimiz url i yada aratmak istedigimiz
#  bir ifadeyi ""(cift tirnak) icinde belirtebiliriz, cünkü tirnak icinde yazdigimiz deger
#  stepDefinition classindaki method icin artik bir parametreye dönüsür