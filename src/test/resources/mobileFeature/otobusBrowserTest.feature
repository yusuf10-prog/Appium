@browser

  Feature: Verilen gorevleri kullanici tarafından yerine getirilir.

    Scenario: Sitedeki dil ve para birimi fonksiyonlarinin calistigi dogrulanir.

      * "https://www.obilet.com/" sayfasına gidilir.
      * dil olarak turkce secilir
      * para birimi olarak tl secilir
      * otobus bileti bul a tiklanir
      * gelen bilet fiyatlarinin tl oldugu dogrulan