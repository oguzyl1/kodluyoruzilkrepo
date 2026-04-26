# Mükemmel Sayı Bulma

Bu program, kullanıcının girdiği bir tamsayının "mükemmel sayı" olup olmadığını kontrol eden bir Java uygulamasıdır.

## Mükemmel Sayı Nedir?
Bir sayının kendisi hariç pozitif tam sayı çarpanlarının (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya **mükemmel sayı** denir.

**Örnekler:**
- **28**: 1 + 2 + 4 + 7 + 14 = 28 (Mükemmel sayıdır)
- **496**: 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248 = 496 (Mükemmel sayıdır)
- **6**: 1 + 2 + 3 = 6 (Mükemmel sayıdır)

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryolar
- **Girdi**: 28 -> **Çıktı**: 28 Mükemmel sayıdır
- **Girdi**: 1 -> **Çıktı**: 1 Mükemmel sayı değildir.
- **Girdi**: 496 -> **Çıktı**: 496 Mükemmel sayıdır
