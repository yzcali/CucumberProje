@dbokuma
Feature: Veri Okuma
  Scenario: kullanici hotel tablosundaki verileri okur
    Given kullanici veritabanina baglanir
    And kullanici "tHOTEL" tablosundaki "DateStart" verilerini alir
    And kullanici "DateStart" sutunundaki verileri okur
