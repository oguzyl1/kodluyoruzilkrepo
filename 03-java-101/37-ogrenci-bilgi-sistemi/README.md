# Öğrenci Bilgi Sistemi

Bu proje, bir okulun öğrenci, öğretmen ve ders yönetimini simüle eden bir Nesne Yönelimli Programlama (OOP) çalışmasıdır.

## Proje Yapısı
Proje dört temel sınıftan oluşmaktadır:
- **Teacher**: Akademisyen bilgilerini (ad, branş, telefon) tutar.
- **Course**: Derse ait bilgileri, dersin öğretmenini ve not ağırlıklarını tutar.
- **Student**: Öğrenci bilgilerini, ders notlarını ve ortalama hesaplama mantığını içerir.
- **Main**: Sistemin test edildiği ana giriş noktasıdır.

## Ödev Özellikleri (Sözlü Notu Geliştirmesi)
Dersin gerekliliklerine göre şu geliştirmeler yapılmıştır:
- `Course` sınıfına her ders için ayrı ayrı belirlenebilen bir **sözlü notu etki yüzdesi** (`verbalWeight`) eklendi.
- `Student` sınıfı, sınav ve sözlü notlarını ayrı ayrı kabul edecek şekilde güncellendi.
- Ortalama hesaplama mantığı şu formüle göre modernize edildi:
  `Ders Ortalaması = (Sözlü Notu * Etki Oranı) + (Sınav Notu * (1 - Etki Oranı))`

## Nasıl Çalıştırılır?

Tüm `.java` dosyalarını aynı klasörde derleyip çalıştırabilirsiniz:

```bash
javac *.java
java Main
```

### Örnek Hesaplama
Fizik dersi için sınav notu 60, sözlü notu 90 ve sözlü etkisi %20 ise:
`Fizik Ortalaması = (90 * 0.20) + (60 * 0.80) = 18 + 48 = 66`
 dı.
