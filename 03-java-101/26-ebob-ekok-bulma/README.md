# EBOB ve EKOK Bulma

Bu program, kullanıcının girdiği iki sayının En Büyük Ortak Bölenini (EBOB) ve En Küçük Ortak Katını (EKOK) hesaplayan bir Java uygulamasıdır.

## Ödev İçeriği
Dersin ödevi kapsamında, EBOB hesabı **While Döngüsü** kullanılarak tersten (büyükten küçüğe doğru) kontrol mekanizması ile yapılmıştır.

**Formüller ve Mantık:**
- **EBOB**: Girilen iki sayının en küçüğünden başlayarak 1'e doğru azalan bir döngü ile her iki sayıyı da bölen ilk (en büyük) sayı bulunur.
- **EKOK**: `(n1 * n2) / EBOB` formülü kullanılarak hesaplanır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- n1: 18
- n2: 24
- **EBOB**: 6
- **EKOK**: 72
