# Dairenin Alanını ve Çevresini Hesaplayan Program

Bu program, yarıçapı kullanıcıdan alınan bir dairenin alanını, çevresini ve belirli bir merkez açısına sahip daire diliminin alanını hesaplayan bir Java uygulamasıdır.

## Ödev İçeriği

Program şu formülleri kullanarak hesaplama yapar:
- **𝜋** = 3.14
- **Daire Alanı** = 𝜋 * r * r
- **Daire Çevresi** = 2 * 𝜋 * r
- **Daire Dilimi Alanı** = (𝜋 * (r * r) * 𝛼) / 360

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- Yarıçap (r): 5
- Merkez Açısı (𝛼): 45
- **Çıktı:** 
  - Daire Alanı: 78.5
  - Daire Çevresi: 31.400...
  - Daire Dilimi Alanı: 9.8125
