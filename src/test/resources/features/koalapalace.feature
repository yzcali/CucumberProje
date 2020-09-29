@koalapalace
Feature: Koala Palace
  Background: : Koala Palace Admin Giris
    Given kullanici koalapalace admin sayfasina gider
    And kullanici kullaniciadi ve sifresini girer
    Then kullanici giris islemini gerceklestirir

  @hotelcreate
  Scenario: TC09_kullanici bilgileri girerek hotel olusturur
    Given kullanici hotelcreate sayfasina gider
    And kullanici hotelcreate code bolumune "1234" girer
    And kullanici hotelcreate name bolumune "test" girer
    And kullanici hotelcreate adress bolumune "cikmaz sokak" girer
    And kullanici hotelcreate phone bolumune "0539123456" girer
    And kullanici hotelcreate email bolumune "hamza@tech.com" girer
    And kullanici hotelcreate idgroup bolumunde "Hotel Type1" secer
    And kullanici hotelcreate save butonuna tiklar
    Then kullanici hotelcreate kayit islemini assert eder











