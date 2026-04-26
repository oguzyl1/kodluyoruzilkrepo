# Mayın Tarlası Oyunu

Bu proje, metin tabanlı bir **Mayın Tarlası** (Minesweeper) oyunudur. Çift boyutlu diziler, döngüler ve koşullu ifadeler kullanılarak Java ile geliştirilmiştir.

## Oyun Kuralları
- **Dinamik Boyut**: Kullanıcı, satır ve sütun sayısını kendisi belirler (Min 2x2).
- **Mayın Yerleşimi**: Toplam eleman sayısının çeyreği (`n/4`) kadar mayın rastgele yerleştirilir.
- **İpucu**: Kullanıcı bir nokta seçtiğinde, o noktanın etrafındaki (8 yön) mayınların sayısı yazılır.
- **Kazanma**: Hiçbir mayına basmadan tüm güvenli noktalar açılırsa oyun kazanılır.
- **Kaybetme**: Herhangi bir mayınlı hücre (`*`) seçilirse oyun sona erer.

## Proje Yapısı
- **MineSweeper**: Oyunun mantıksal süreçlerini (mayın yerleştirme, koordinat kontrolü, puanlama) yöneten sınıftır.
- **Main**: Kullanıcıdan matris boyutlarını alan ve oyunu başlatan sınıftır.

## Nasıl Çalıştırılır?

Tüm `.java` dosyalarını aynı klasörde derleyip çalıştırabilirsiniz:

```bash
javac *.java
java Main
```

### Örnek Senaryo
- Satır/Sütun: 3x3 (Mayın sayısı: 9/4 = 2)
- Kullanıcı (1,1) seçer -> Etraftaki mayın sayısı ekrana basılır.
 dı.
