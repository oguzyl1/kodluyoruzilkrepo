# Maaş Hesaplayıcı

Bu proje, bir fabrika çalışanının maaşını, vergi, bonus ve işe başlangıç yılına göre zam oranlarını hesaplayan bir Nesne Yönelimli Programlama (OOP) çalışmasıdır.

## Hesaplama Kuralları
- **Vergi**: Maaş 1000 TL'den az ise vergi uygulanmaz, fazla ise %3 vergi uygulanır.
- **Bonus**: Haftalık 40 saati aşan her çalışma saati için 30 TL ek ücret ödenir.
- **Maaş Artışı (2021 referans alınarak)**:
  - 10 yıldan az kıdem: %5 zam
  - 10-19 yıl kıdem: %10 zam
  - 20 yıl ve üzeri kıdem: %15 zam

## Proje Yapısı
- **Employee**: Çalışan bilgilerini tutan ve maaş bileşenlerini hesaplayan sınıftır.
- **Main**: Hesaplamaları test eden ana sınıftır.

## Nasıl Çalıştırılır?

Klasör içindeki dosyaları derleyip çalıştırabilirsiniz:

```bash
javac *.java
java Main
```

### Örnek Hesaplama (kemal)
- Maaş: 2000.0
- Vergi: 60.0 (%3)
- Bonus: 150.0 (5 saat * 30)
- Zam: 300.0 (36 yıl kıdem -> %15)
- **Toplam Maaş**: 2390.0
 dı.
