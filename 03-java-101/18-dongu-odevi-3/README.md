# 4 ve 5'in Kuvvetlerini Bulan Program

Bu program, kullanıcının girdiği bir sınır sayısına kadar olan 4 ve 5'in kuvvetlerini ekrana basan bir Java uygulamasıdır.

## Ödev İçeriği

Program şu mantıkla çalışır:
- Kullanıcıdan bir sınır değeri alınır.
- Bir döngü 1'den başlayarak her adımda 4 ile çarpılarak (`i *= 4`) hedef sayıya kadar ilerler.
- Benzer şekilde bir diğer döngü 5'in kuvvetlerini (`i *= 5`) hesaplar.
- Bulunan tüm kuvvetler (1, 4, 16, 64... ve 1, 5, 25, 125...) ekrana yazdırılır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- Sınır Sayısı: 100
- **Çıktı:**
  - 4'ün Kuvvetleri: 1, 4, 16, 64
  - 5'in Kuvvetleri: 1, 5, 25
