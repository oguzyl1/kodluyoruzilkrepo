# Kombinasyon Hesaplama Programı

Bu program, kullanıcıdan alınan `n` ve `r` değerlerine göre n'in r'li kombinasyonunu hesaplayan bir Java uygulamasıdır.

## Ödev İçeriği

Program şu matematiksel formül üzerine kurulmuştur:
**C(n,r) = n! / (r! * (n-r)!)**

**Özellikler:**
- `for` döngüleri kullanılarak faktöriyel değerleri hesaplanır.
- `long` veri tipi kullanılarak daha büyük sonuçların hesaplanabilmesi sağlanmıştır.
- `n >= r` kontrolü yapılarak matematiksel hata payı ortadan kaldırılmıştır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- n: 5
- r: 2
- **Hesaplama:** 5! / (2! * 3!) = 120 / (2 * 6) = 120 / 12 = 10
- **Sonuç:** C(5,2) kombinasyonu : 10
