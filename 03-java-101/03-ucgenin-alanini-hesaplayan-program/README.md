# Dik Üçgende Hipotenüs ve Alan Hesaplayan Program

Bu program, kullanıcıdan bir dik üçgenin iki dik kenarını alan, hipotenüsü hesaplayan ve ardından Heron formülünü kullanarak üçgenin alanını bulan bir Java uygulamasıdır.

## Ödev İçeriği

Program şu adımları izler:
1. Kullanıcıdan iki dik kenar (a ve b) alınır.
2. **Hipotenüs Hesabı**: `c^2 = a^2 + b^2` (Pisagor Teoremi) formülü uygulanır.
3. **Alan Hesabı**: Ödevde belirtilen Heron formülü uygulanır:
   - **u** = (a + b + c) / 2
   - **Alan** = sqrt(u * (u − a) * (u − b) * (u − c))

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Girdi/Çıktı
- 1. Dik Kenar: 3
- 2. Dik Kenar: 4
- **Çıktı:** 
  - Hipotenüs: 5.0
  - Üçgenin Alanı: 6.0
