# Taksimetre Programı

Bu program, gidilen mesafeye (KM) göre taksimetre tutarını hesaplayan bir Java uygulamasıdır.

## Ödev İçeriği

Program şu kurallara göre hesaplama yapar:
- KM başına ücret: **2.20 TL**
- Açılış ücreti: **10 TL**
- Minimum ödenecek tutar: **20 TL** (Hesaplanan tutar 20 TL'nin altındaysa 20 TL kabul edilir.)

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- 1 KM giderse: 10 + 2.2 = 12.2 TL => Minimum limit nedeniyle **20.0 TL** öder.
- 10 KM giderse: 10 + 22 = **32.0 TL** öder.
