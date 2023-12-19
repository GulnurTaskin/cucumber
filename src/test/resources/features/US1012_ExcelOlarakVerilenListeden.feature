Feature: US1012 Excel olarak verilen urunler ve min. stok miktarlari testi

  Scenario Outline: : TC18 excel olarak verilen listedeki urunler min. stok bulundurmali
# liste oldugu icin scenario outline yaptik
    Given kullanici "toUrl" anasayfaya gider
    Then stok excelindeki "<istenenSatir>" daki urunun stok miktarini bulur
    And stok miktarinin "<istenenSatir>" da verilen stok miktarindan fazla oldugunu test eder
    And sayfayi kapatir
# excel dosyasina(workbook, sheet) ulasabilmek icin, apache poi'ye ihtiyacimiz var
    #pom.xml'e maven rep'den apache poi dependency'si yukledik
    Examples:
      |istenenSatir|
      |2           |
      |3           |
      |4           |
      |5           |
      |6           |
      |7           |
      |8           |
      |9           |

  # bu testi raporladigimiz zaman sadece burdaki urun miktarlari ile sonuc veriyor
  # urun isimleri ile birlikte sonuc vermesini istersek softAssert ile yapmamiz lazim dedi hoca
  # ancak assertion ile cozmek mumkun degilmis
  # onun yerine if/else ile farkli bir cozumunu yapip, testotomasyonuStepdefinitions'a
  # stokExcelindekiTumUrunleriAratipMinStokMiktarindaUrunOlanlariListeler olarak yeni bir method yazmisiz
  # bir sonraki feature'de bu method kullanilmis