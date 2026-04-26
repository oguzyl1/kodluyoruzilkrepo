# Recursive Metotlar ile Üslü Sayı Hesaplama

Bu program, kullanıcıdan alınan taban ve üs değerlerini kullanarak üs alma işlemini **Recursive (Öz yinelemeli)** bir metot ile hesaplayan bir Java uygulamasıdır.

## Ödev İçeriği
Döngüler yerine fonksiyonun kendi kendini çağırdığı bir yapı kullanılmıştır.

**Recursive Mantık:**
- **Taban Durum (Base Case)**: Eğer üs 0 ise, sonuç her zaman 1'dir.
- **Öz Yinelemeli Durum (Recursive Case)**: `taban * power(taban, üs - 1)` şeklinde fonksiyon tekrar çağrılır.
- Bu süreç üs 0 olana kadar devam eder ve sonuçlar çarpılarak geri döner.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- Taban: 2, Üs: 3 -> **Sonuç**: 8
- Taban: 5, Üs: 3 -> **Sonuç**: 125
 dı.
