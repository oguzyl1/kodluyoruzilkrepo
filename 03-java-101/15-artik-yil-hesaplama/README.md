# Artık Yıl Hesaplama

Bu program, kullanıcının girdiği bir yılın "artık yıl" olup olmadığını belirleyen bir Java uygulamasıdır.

## Ödev İçeriği

Artık yıl hesaplama kuralları:
1. Genel kural olarak, 4'ün katı olan yıllar artık yıldır.
2. 100'ün katı olan yıllardan sadece 400'e tam bölünebilenler artık yıldır (Örn: 1200, 1600, 2000).
3. 1700, 1800, 1900 gibi yıllar 4'ün katı olsa da 100'ün katı olup 400'e bölünmedikleri için artık yıl değildir.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- Yıl: 2020 -> **Sonuç:** 2020 bir artık yıldır !
- Yıl: 2021 -> **Sonuç:** 2021 bir artık yıl değildir !
