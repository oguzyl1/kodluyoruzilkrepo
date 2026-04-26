# Dizideki Elemanları Sıralayan Program

Bu program, kullanıcıdan alınan bir dizi boyutuna ve elemanlarına göre sayıları küçükten büyüğe sıralayan bir Java uygulamasıdır.

## Ödev İçeriği
Dinamik bir dizi oluşturma ve bu diziyi standart kütüphane metotlarıyla (`Arrays.sort()`) işleme yeteneği hedeflenmiştir.

**Mantık:**
- Kullanıcıdan alınan `n` değeri ile dizi boyutu belirlenir.
- Bir `for` döngüsü yardımıyla tüm elemanlar diziye kaydedilir.
- `Arrays.sort()` kullanılarak elemanlar numerik sıraya sokulur.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- Dizinin boyutu n : 5
- Elemanlar : 99, -2, -2121, 1, 0
- **Sıralama**: -2121 -2 0 1 99
 dı.
