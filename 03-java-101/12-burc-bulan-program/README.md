# Burç Bulan Program

Bu program, kullanıcının doğum ayını ve gününü alarak hangi burç olduğunu bulan bir Java uygulamasıdır.

## Ödev İçeriği

Programda her ay ve gün için ayrı ayrı iç içe `if-else` yazmak yerine, **Sayısal Karşılaştırma (Numerical Comparison)** yöntemi kullanılmıştır. 

### Nasıl Çalışıyor?
- Tarih bilgisi `(Ay * 100) + Gün` formülüyle tek bir sayıya dönüştürülür.
  - Örnek: 21 Mart -> `(3 * 100) + 21 = 321`
- Bu sayede karmaşık iç içe kontroller yerine, tek bir `else if` merdiveniyle tüm burç aralıkları kontrol edilebilir.
- Bu yöntem kodun okunabilirliğini artırır ve hata payını azaltır.

**Burç Tarihleri:**
- Koç: 21 Mart - 20 Nisan
- Boğa: 21 Nisan - 21 Mayıs
- İkizler: 22 Mayıs - 22 Haziran
- Yengeç: 23 Haziran - 22 Temmuz
- Aslan: 23 Temmuz - 22 Ağustos
- Başak: 23 Ağustos - 22 Eylül
- Terazi: 23 Eylül - 22 Ekim
- Akrep: 23 Ekim - 21 Kasım
- Yay: 22 Kasım - 21 Aralık
- Oğlak: 22 Aralık - 21 Ocak
- Kova: 22 Ocak - 19 Şubat
- Balık: 20 Şubat - 20 Mart

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```
