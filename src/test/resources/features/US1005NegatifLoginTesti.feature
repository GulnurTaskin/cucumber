Feature: US1005 Kullanici yanlis bilgilerle giris yapamaz

  ScGiven kullanici testotomasyonu anasayfaya gider

  Then account butonuna basar
  And email olarak “toGecersizEmail” girer
  And password olarak “toGecerliPassword” girer
  Then signIn butonuna basar
  And sisteme giris yapamadigini test eder
  And 3 saniye bekler
  And sayfayi kapatirenario: TC09 Kullanici gecerliEmail ve gecersizPassword ile giris yapamamali