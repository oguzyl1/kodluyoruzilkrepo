# Desene Göre Metot Oluşturma (Recursive)

Bu program, kullanıcıdan alınan bir `n` değerine göre, döngü kullanmadan rekürsif bir metot ile özel bir sayı deseni oluşturan bir Java uygulamasıdır.

## Kural
Girilen sayı 0 veya negatif olana kadar 5 çıkarılır. Sayı negatif veya 0 olduktan sonra tekrar 5 eklenir. Her adımda sayının güncel değeri ekrana yazdırılır.

**Mantık:**
- Metot önce mevcut sayıyı yazdırır.
- Eğer sayı pozitifse, `n - 5` parametresi ile kendisini tekrar çağırır.
- Fonksiyonun öz yinelemeli çağrısından sonra (stack geri dönerken) sayı tekrar yazdırılır.
- Bu sayede herhangi bir döngü değişkeni veya toplama işlemi gerekmeden simetrik bir azalış-artış deseni elde edilir.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryolar
- **N Sayısı**: 16 -> **Çıktı**: 16 11 6 1 -4 1 6 11 16 
- **N Sayısı**: 10 -> **Çıktı**: 10 5 0 5 10 
 dı.
