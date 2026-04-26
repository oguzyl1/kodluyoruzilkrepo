# Çok Boyutlu Diziler ile B Harfi Yazdıran Program

Bu program, Java'da çok boyutlu dizileri (matrisleri) kullanarak ekrana yıldızlar (*) ile "B" harfi çizen bir uygulamadır.

## Ödev İçeriği
Sınıf örneğinde gösterilen "A" harfi mantığı geliştirilerek, "B" harfinin üç yatay (üst, orta, alt) ve iki dikey sütunlu yapısı kurgulanmıştır.

**Mantık:**
- 7 satır ve 4 sütunluk bir `String` matrisi oluşturulur.
- `i == 0 || i == 3 || i == 6` koşulu ile harfin yatay çizgileri belirlenir.
- `j == 0 || j == 3` koşulu ile dikey sütunlar belirlenir.
- İç içe döngülerle matris taranarak ilgili koordinatlara yıldız, diğerlerine boşluk karakteri atanır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Çıktı
```text
 *  *  *  * 
 *        * 
 *        * 
 *  *  *  * 
 *        * 
 *        * 
 *  *  *  * 
```
 dı.
