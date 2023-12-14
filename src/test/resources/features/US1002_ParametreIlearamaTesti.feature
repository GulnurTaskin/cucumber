@Regression @Smoke @E2E3
Scenario: TC02 Kullanici shoes icin sonuc bulmali

Given kullanici testotomasyonu anasayfaya gider
Then arama kutusuna shoes yazip ENTER tusuna basar
And arama sonucunda urun bulunabildigini test eder
And biraz bekler
Then sayfayi kapatir

@Regression @E2E1
Scenario: TC03 Kullanici nutella arattiginda sonuc bulamamali

Given kullanici testotomasyonu anasayfaya gider
Then arama kutusuna nutella yazip ENTER tusuna basar
And arama sonucunda urun bulunamadigini test eder
And biraz bekler
Then sayfayi kapatir