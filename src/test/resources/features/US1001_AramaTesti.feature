Feature: US1001 K ullanici testotomasyonu sayfasinda arama yapar
  Scenario: TC01_Kullanici phone aramasinda sonuc bulmali
    Given kullanici testotomasyonu anasayfaya gider
    Then arama kutusuna phone yazip ENTER tusuna basar
    And arama sonucunda urun bulunabildigini test eder
    Then sayfayi kapatir