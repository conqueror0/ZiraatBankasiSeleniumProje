
Feature: Tuketici Kredisi

  Scenario: Z01 kullanici ziraat anasayfasindan tüketici kredisine gider

    Given kullanici ziraat anasayfasina gider
    Then Tuketici Kredisi gorunur oluncaya kadar bekler
    Then Tuketici kredisine tiklanilir
    And sonuclarin Tüketici Kredisi icerdigini test eder

  Scenario: Z02 kullanici 50000 TL kredi hesaplamasi yapar

    Given kullanici ziraat anasayfasina gider
    Then Tuketici Kredisi gorunur oluncaya kadar bekler
    Then Tuketici kredisine tiklanilir
    Then 50000 Tl tutar girilir
    Then Hesapla butonuna tiklanilir
    Then Yillik Maliyet Orani gorunur oluncaya kadar bekler
    And sayfa kapatilir

  Scenario: Z03 kullanici dijital kredi secip hesaplama yapar

    Given kullanici ziraat anasayfasina gider
    Then Tuketici Kredisi gorunur oluncaya kadar bekler
    Then Tuketici kredisine tiklanilir
    Then Kredi DropDownList tiklanir Dijital Kredi Ürün Paketi secilir
    Then kullanici 2 saniye bekler
    Then 50000 Tl tutar girilir
    Then Hesapla butonuna tiklanilir
    Then Yillik Maliyet Orani gorunur oluncaya kadar bekler
    And sayfa kapatilir

  Scenario: Z04 kullanici tuketici kredi urun paketi secip hesaplama yapar

    Given kullanici ziraat anasayfasina gider
    Then Tuketici Kredisi gorunur oluncaya kadar bekler
    Then Tuketici kredisine tiklanilir
    Then Kredi DropDownList tiklanir Tuketici Kredi Ürün Paketi secilir
    Then kullanici 2 saniye bekler
    Then 50000 Tl tutar girilir
    Then Hesapla butonuna tiklanilir
    Then Yillik Maliyet Orani gorunur oluncaya kadar bekler
    And sayfa kapatilir

  Scenario: Z05 kullanici tüketici kredisi 3 ay %1 faiz girisi yapar
    Given kullanici ziraat anasayfasina gider
    Then Tuketici Kredisi gorunur oluncaya kadar bekler
    Then Tuketici kredisine tiklanilir
    Then kullanici 2 saniye bekler
    Then 50000 Tl tutar girilir
    Then kullanici 2 saniye bekler
    Then Vade 3 ay secilir
    Then Faiz Orani 1 secilir
    Then Hesapla butonuna tiklanilir
    Then Yillik Maliyet Orani gorunur oluncaya kadar bekler
    Then Hesaplama sonuclarının dogrulugu kontrol edilir
    And sayfa kapatilir


  Scenario: Z06 kullanici dijital kredi 3 ay %1 faiz girisi yapar
    Given kullanici ziraat anasayfasina gider
    Then Tuketici Kredisi gorunur oluncaya kadar bekler
    Then Tuketici kredisine tiklanilir
    Then kullanici 2 saniye bekler
    Then Kredi DropDownList tiklanir Dijital Kredi Ürün Paketi secilir
    Then 50000 Tl tutar girilir
    Then kullanici 2 saniye bekler
    Then Vade 3 ay secilir
    Then Faiz Orani 1 secilir
    Then Hesapla butonuna tiklanilir
    Then Yillik Maliyet Orani gorunur oluncaya kadar bekler
    Then Hesaplama sonuclarının dijital kredi icin dogrulugu kontrol edilir
    And sayfa kapatilir


  Scenario: Z07 kullanici tuketici kredisi 3 ay %1 faiz girisi yapar
    Given kullanici ziraat anasayfasina gider
    Then Tuketici Kredisi gorunur oluncaya kadar bekler
    Then Tuketici kredisine tiklanilir
    Then kullanici 2 saniye bekler
    Then Kredi DropDownList tiklanir Tuketici Kredi Ürün Paketi secilir
    Then 100000 Tl tutar girilir
    Then kullanici 2 saniye bekler
    Then Vade 3 ay secilir
    Then Faiz Orani 1 secilir
    Then Hesapla butonuna tiklanilir
    Then Yillik Maliyet Orani gorunur oluncaya kadar bekler
    Then Hesaplama sonuclarının dogrulugu kontrol edilir
    And sayfa kapatilir


  Scenario: Z08 Odeme plani alani acilip geldigi kontrl edilir
    Given kullanici ziraat anasayfasina gider
    Then Tuketici Kredisi gorunur oluncaya kadar bekler
    Then Tuketici kredisine tiklanilir
    Then kullanici 2 saniye bekler
    Then 50000 Tl tutar girilir
    Then kullanici 2 saniye bekler
    Then Vade 3 ay secilir
    Then Faiz Orani 1 secilir
    Then Hesapla butonuna tiklanilir
    Then Yillik Maliyet Orani gorunur oluncaya kadar bekler
    Then Odeme plani alanina tiklanir
    And Odeme alani kontrolu saglanir