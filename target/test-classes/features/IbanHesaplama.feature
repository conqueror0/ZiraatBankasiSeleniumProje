
Feature: Iban Hesaplama Getirisi

  Scenario: Z01 kullanici ziraat hesaplama araclari anasayfasindan iban hesaplama sayfasina gider

    Given kullanici ıban hesaplama icin ziraat anasayfasina gider
    Then Iban Hesaplma gorunur oluncaya kadar bekler
    Then Iban Hesaplama alanina tiklanir
    And sonuclarin IBAN Hesaplama icerdigini test eder

  Scenario: Z02 kullanici sube kodlari checkboxi tiklanir sube ismi kontrol edilir
    Given kullanici ıban hesaplama icin ziraat anasayfasina gider
    Then Iban Hesaplma gorunur oluncaya kadar bekler
    Then Iban Hesaplama alanina tiklanir
    Then Sube kodlari checkboxuna tiklanir
    Then sube ismi kontrol edilir
    And sayfa kapatilir

  Scenario: Z03 kullanici sube kodlari checkboxindan sube kodlarina tiklar sube ismi kontrol edilir
    Given kullanici ıban hesaplama icin ziraat anasayfasina gider
    Then Iban Hesaplma gorunur oluncaya kadar bekler
    Then Iban Hesaplama alanina tiklanir
    Then Sube kodlari checkboxuna tiklanir
    Then sube ismi kontrol edilir
    Then Sube isimleri checkboxuna tiklanir
    Then sube isimleri kontrol edilir
    And sayfa kapatilir

  Scenario: Z04 kullanici sube kodlarini secerek hatali musteri ve ekno girer
    Given kullanici ıban hesaplama icin ziraat anasayfasina gider
    Then Iban Hesaplma gorunur oluncaya kadar bekler
    Then Iban Hesaplama alanina tiklanir
    Then Sube kodlari checkboxuna tiklanir
    Then musteri no alanina 00 girer
    Then musteri ek no alanina 00 girer
    Then Hesapla butonuna tiklanilir
    And ekranda hata mesajlari geldiği gorulur

  Scenario: Z05 kullanici sube isimlerini secerek hatali musteri ve ekno girer
    Given kullanici ıban hesaplama icin ziraat anasayfasina gider
    Then Iban Hesaplma gorunur oluncaya kadar bekler
    Then Iban Hesaplama alanina tiklanir
    Then musteri no alanina 00 girer
    Then musteri ek no alanina 00 girer
    Then Hesapla butonuna tiklanilir
    And ekranda hata mesajlari geldiği gorulur


  Scenario: Z06 kullanici sube kodlarini secer sube ve musteri no ek no girisleri yapilir
    Given kullanici ıban hesaplama icin ziraat anasayfasina gider
    Then Iban Hesaplma gorunur oluncaya kadar bekler
    Then Iban Hesaplama alanina tiklanir
    Then Sube kodlari checkboxuna tiklanir
    Then sube secimi ayas ankara yapilir
    Then Hesapla butonuna tiklanilir
    And ekranda bos hata mesajlari geldiği gorulur


  Scenario: Z07 kullanici sube kodlarini secer musteri ve ek no girisini yapar
    Given kullanici ıban hesaplama icin ziraat anasayfasina gider
    Then Iban Hesaplma gorunur oluncaya kadar bekler
    Then Iban Hesaplama alanina tiklanir
    Then Sube kodlari checkboxuna tiklanir
    Then musteri ek no alanina 1235 girer
    Then musteri no alanina 12351235 girer
    Then Hesapla butonuna tiklanilir
    And Iban geldigi kontrol edilir