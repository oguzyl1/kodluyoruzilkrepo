# Tek Sayı Girilene Kadar Çift ve 4'ün Katlarını Toplayan Program

Bu program, kullanıcıdan tek bir sayı girilene kadar girişleri kabul eden ve bu süreçte girilen sayılardan çift ve 4'ün katı olanları toplayıp ekrana basan bir Java uygulamasıdır.

## Ödev İçeriği

Program şu mantıkla çalışır:
- Bir `do-while` döngüsü kullanılarak kullanıcıdan sürekli sayı alınır.
- Eğer girilen sayı **tek** ise döngü kırılır.
- Girilen sayı **çift ve 4'ün katı** ise (`n % 4 == 0`), bu sayı bir toplam değişkenine eklenir.
- Döngü sonunda biriken toplam tutar ekrana yazdırılır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- Girdi: 2 -> (Çift ama 4'ün katı değil, toplama eklenmez)
- Girdi: 4 -> (4'ün katı, Toplam: 4)
- Girdi: 8 -> (4'ün katı, Toplam: 12)
- Girdi: 5 -> (Tek sayı, döngü durur)
- **Sonuç:** Toplam : 12
