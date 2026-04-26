# Dizideki Elemanların Frekansı

Bu program, bir sayı dizisi içindeki elemanların kaçar kez tekrar edildiğini (frekanslarını) hesaplayan bir Java uygulamasıdır.

## Ödev İçeriği
Dizilerde arama ve gruplama mantığı kullanılarak, veri setindeki eleman dağılımı analiz edilmiştir.

**Mantık:**
- Dizi önce `Arrays.sort()` ile sıralanır.
- Sıralı dizide yan yana gelen aynı sayılar bir döngü ve sayaç yardımıyla sayılır.
- Her bir benzersiz sayı için toplam tekrar sayısı ekrana yazdırılır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- Dizi : `[10, 20, 20, 10, 10, 20, 5, 20]`
- **10** sayısı 3 kere tekrar edildi.
- **20** sayısı 4 kere tekrar edildi.
- **5** sayısı 1 kere tekrar edildi.
 dı.
