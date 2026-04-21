# KDV Tutarı Hesaplayan Program

Bu program, kullanıcıdan alınan para değerine göre KDV tutarını ve KDV'li toplam fiyatı hesaplayan bir Java uygulamasıdır.

## Ödev İçeriği

Program şu mantıkla çalışır:
- Eğer girilen tutar **0 ile 1000 TL** arasında ise KDV oranı **%18** olarak alınır.
- Eğer tutar **1000 TL'den büyük** ise KDV oranı **%8** olarak uygulanır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Çıktı

- **Tutarı 500 girerseniz:** KDV %18 hesaplanır.
- **Tutarı 1500 girerseniz:** KDV %8 hesaplanır.
