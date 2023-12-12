#TASK:
# 3 tane Scenario oluşturunuz
# Amazon sayfasında iphone, samsung ve nokia aratınız.

  # Eger Feature file da kullanacagimiz senarioda ortak adimlar var ise
  # Feature keywordundan sonra Background keywordu ile ortak adimlari belirtebiliriz
  #@BeforeMethod mantigi ile calisir
@US003
Feature:US003 Amazon Testi

  Background:
  Given Kullanici amazon sayfasina gider

  @iphone
  Scenario: TC01 arama kutusunda iphone aratilir
    When Arama kutusunda iphone aratir
    And Sayfayi kapatir

  @samsung
  Scenario: TC02 arama kutusunda iphone aratilir
    When Arama kutusunda samsung aratir
    And Sayfayi kapatir

    @nokia
  Scenario: TC03 arama kutusunda iphone aratilir
    When Arama kutusunda nokia aratir
    And Sayfayi kapatir