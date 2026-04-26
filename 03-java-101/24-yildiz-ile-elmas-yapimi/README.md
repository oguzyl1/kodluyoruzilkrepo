# Yıldızlar ile Elmas Yapımı

Bu program, kullanıcıdan alınan basamak sayısına göre yıldızlar (*) kullanarak bir elmas deseni oluşturan bir Java uygulamasıdır.

## Ödev İçeriği
Programda iç içe `for` döngüleri kullanılmıştır:
- İlk döngü grubu, elmasın üst yarısını (üçgen şeklinde) oluşturur.
- İkinci döngü grubu, elmasın alt yarısını (ters üçgen şeklinde) oluşturur.
- Boşluklar için `(n - i)`, yıldızlar için `(2 * i - 1)` formülü uygulanmıştır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Çıktı (5 için)
```text
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```
