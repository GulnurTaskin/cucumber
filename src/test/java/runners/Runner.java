package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
// testlerimizde rapor istiyorsak bu runner class'tan calistirmamiz gerekiyor
// cunku rapor eklentisini buraya yapacagiz
// raporlar target'in altinda klasorleniyor
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports/rapor.html", // testimizi raporlamak icin bu plugin'i ekliyoruz
                // rapor1, rapor2.. seklinde rapor klasorleri olusturabiliriz
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},

        features = "src/test/resources/features", // calisacak Feature/Scenario'lar nerede ?

        glue = "stepdefinitions" ,  // calisacak Feature/Scenario'larin kodlari nerede?

        tags = "@Smoke", // hangi Feature/Scenario'lar calisacak ?
        // buraya isteidigimiz notasyonu kendimiz olusturabiliriz ex: @ilk
        // @wip = work in progress

        dryRun = false
        // true yapilirsa testi calistirmadan eksik adimlari verir
        // testleri calistirirken dryRun = false olmalidir
)

public class Runner {

}

/*
    Runner class'i TestNG'deki xml dosyalarina benzetilebilir
    Runner sayesinde istedigimiz feature/scenario'lari
    tek basina veya toplu olarak calistirabiliriz

    Runner class'i sadece testlerimizi calistirmakla kalmaz
    ayrica framework'umuzun calismasi icin
    gerekli olan dosyalarin yerlerini belirleyerek
    build isleminin de otomatik olarak yapilmasini saglar

    Runner class'inin icinde kod olmaz, bos bir class'dir
    Asil isi yapacak olan 2 adet notasyondur

    build islemini @CucumberOptions notasyonu halleder


 */