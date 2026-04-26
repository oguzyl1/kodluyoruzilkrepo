# Üslü Sayı Hesaplama

Bu program, kullanıcıdan alınan taban ve üs değerlerine göre üslü sayı sonucunu hesaplayan bir Java uygulamasıdır.

## Ödev İçeriği

Programda `Math.pow()` metodu yerine döngü mantığını kavramak adına **for döngüsü** kullanılmıştır.

**Nasıl Çalışır?**
- Taban (`n`) ve Üs (`k`) değerleri kullanıcıdan alınır.
- `total` değişkeni 1'den başlatılır.
- Üs değeri kadar dönen bir döngü içerisinde `total` değişkeni her seferinde taban ile çarpılır.
- Sonuç ekrana basılır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- Taban: 3
- Üs: 4
- **Hesaplama:** 3 * 3 * 3 * 3 = 81
- **Sonuç:** 81
