# Girilen Sayılardan En Büyük ve En Küçük Olanı Bulma

Bu program, kullanıcının girdiği `N` adet sayma sayısı içerisinden en büyük ve en küçük olanları tespit eden bir Java uygulamasıdır.

## Ödev İçeriği
Program, `for` döngüsü kullanarak kullanıcıdan sayıları sırayla alır ve her adımda mevcut "en büyük" ve "en küçük" değerlerle kıyaslama yapar.

**Mantık:**
- Başlangıçta en büyük sayı `Integer.MIN_VALUE`, en küçük sayı ise `Integer.MAX_VALUE` olarak atanır.
- Girilen her sayı bu değerlerle kıyaslanır ve gerekirse güncellenir.
- Döngü sonunda bulunan uç değerler ekrana yazdırılır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- Kaç tane sayı gireceksiniz: 4
- 1. Sayı: 16
- 2. Sayı: -22
- 3. Sayı: -15
- 4. Sayı: 100
- **En büyük sayı**: 100
- **En küçük sayı**: -22
