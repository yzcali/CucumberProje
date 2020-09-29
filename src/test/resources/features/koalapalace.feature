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

  @hotelroomcreate
  Scenario: TC10_kullanici bilgleri girerek hotel room olusturur
    Given kullanici hotelroomcreate sayfasina gider
    And kullanici hotelroomcreate idhotel bolumunde "star" secer
    And kullanici hotelroomcreate code bolumune "12345" girer
    And kullanici hotelroomcreate name bolumune "Techproed" girer
    And kullanici hotelroomcreate location bolumune "USA" girer
    And kullanici hotelroomcreate description bolumune "ne yazik ki aciklama yok" girer
    And kullanici hotelroomcreate price bolumune fiyat girer
    And kullanici hotelroomcreate roomtype bolumunde "Single" secer
    And kullanici hotelroomcreate maxadult bolumune "2" girer
    And kullanici hotelroomcreate maxchildren bolumune "3" girer
    And kullanici hotelroomcreate save butonuna tiklar
    Then kullanici hotelroomcreate kayit islemini assert eder







