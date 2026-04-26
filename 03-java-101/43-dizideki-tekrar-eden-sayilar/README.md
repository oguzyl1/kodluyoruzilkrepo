# Dizideki Tekrar Eden Sayıları Bulma

Bu program, bir sayı dizisi içindeki tekrar eden **çift sayıları** belirleyen ve ekrana yazdıran bir Java uygulamasıdır.

## Ödev İçeriği
Dizilerde arama ve karşılaştırma mantığı kullanılarak, bir sayının hem tekrar edip etmediği hem de çift olup olmadığı kontrol edilmiştir.

**Mantık:**
- İç içe `for` döngüleri kullanılarak dizideki her bir eleman diğer tüm elemanlarla kıyaslanır.
- Eğer bir sayı tekrar ediyorsa (`list[i] == list[j]`) ve bu sayı çift ise (`list[i] % 2 == 0`) işleme alınır.
- `isFind` yardımcı metodu ile, aynı sayının tekrar edenler listesine birden fazla kez eklenmesi önlenir.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Çıktı
```text
Dizi : [3, 7, 2, 3, 2, 9, 10, 21, 1, 33, 9, 1, 10, 4, 4, 8, 8]
Tekrar Eden Çift Sayılar:
2 10 4 8 
```
 dı.
