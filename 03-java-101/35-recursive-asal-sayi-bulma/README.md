# Recursive Metotlar ile Asal Sayı Bulma

Bu program, kullanıcıdan alınan bir sayının "Asal" olup olmadığını **Recursive (Öz yinelemeli)** bir metot kullanarak tespit eden bir Java uygulamasıdır.

## Ödev İçeriği
Dersin ödevi kapsamında, sayının çarpanları olup olmadığı döngüler yerine bir rekürsif fonksiyon ile kontrol edilmiştir.

**Recursive Mantık:**
- **Durma Koşulu 1**: Eğer sayı 2'den küçükse asal değildir.
- **Durma Koşulu 2**: Eğer sayı, mevcut `i` değerine tam bölünüyorsa asal değildir.
- **Durma Koşulu 3**: Eğer `i * i > n` ise (karekök sınırına ulaşıldıysa) sayı asaldır.
- **Tekrar Çağrı**: Fonksiyon, `i` değerini bir artırarak kendisini tekrar çağırır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryolar
- Sayı Giriniz : 17 -> **Sonuç**: 17 sayısı ASALDIR !
- Sayı Giriniz : 22 -> **Sonuç**: 22 sayısı ASAL değildir !
