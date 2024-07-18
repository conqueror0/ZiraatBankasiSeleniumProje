
Feature: Mevduat Getirisi

  Scenario: Z01 kullanici ziraat hesaplama araclari anasayfasindan mevduat getirisi sayfasina gider

    Given kullanici mevduat getirisi icin ziraat anasayfasina gider
    Then Mevduat Getirisi gorunur oluncaya kadar bekler
    Then Mevduat Getirisi alanina tiklanir
    And sonuclarin Tüketici Kredisi icerdigini test eder

  Scenario: Z02 kullanici 100 gun 100000 TL getiri hesaplamasi yapar

    Given kullanici mevduat getirisi icin ziraat anasayfasina gider
    Then Mevduat Getirisi gorunur oluncaya kadar bekler
    Then Mevduat Getirisi alanina tiklanir
    Then Vade 100 gun girilir
    Then Vade tutari 100000 girilir
    Then Hesapla butonuna tiklanilir
    And Hesaplama Tl getirisi kontrolu saglanir

  Scenario: Z03 kullanici 100 gun 100000 USD getiri hesaplamasi yapar

    Given kullanici mevduat getirisi icin ziraat anasayfasina gider
    Then Mevduat Getirisi gorunur oluncaya kadar bekler
    Then Mevduat Getirisi alanina tiklanir
    Then Doviz cinsi USD secilir
    Then Vade 100 gun girilir
    Then Vade tutari 100000 girilir
    Then Hesapla butonuna tiklanilir
    And Hesaplama USD getirisi kontrolu saglanir

  Scenario: Z04 kullanici 100 gun 100000 Euro getiri hesaplamasi yapar

    Given kullanici mevduat getirisi icin ziraat anasayfasina gider
    Then Mevduat Getirisi gorunur oluncaya kadar bekler
    Then Mevduat Getirisi alanina tiklanir
    Then Doviz cinsi EURO secilir
    Then Vade 100 gun girilir
    Then Vade tutari 100000 girilir
    Then Hesapla butonuna tiklanilir
    And Hesaplama EURO getirisi kontrolu saglanir