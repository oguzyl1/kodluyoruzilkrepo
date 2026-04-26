# 1-100 Arasındaki Asal Sayıları Bulan Program

Bu program, 1 ile 100 arasındaki tüm asal sayıları (sadece 1'e ve kendisine bölünebilen sayılar) bulan ve ekrana yazdıran bir Java uygulamasıdır.

## Ödev İçeriği
Programda iç içe `for` döngüleri kullanılarak her bir sayının asal olup olmadığı kontrol edilmiştir.

**Mantık:**
- 2'den 100'e kadar bir döngü kurulur (1 asal sayı değildir).
- Her bir sayı, kendisinden küçük 2'den başlayan sayılara bölünmeye çalışılır.
- Eğer hiçbir sayıya tam bölünmüyorsa, o sayı asaldır ve ekrana basılır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Çıktı
```text
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
```
 dı.
