# Sayı Tahmin Oyunu

Bu proje, bilgisayarın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının belirli bir hak çerçevesinde tahmin etmeye çalıştığı bir Java uygulamasıdır.

## Oyun Özellikleri
- **Rastgele Sayı Üretimi**: `Random` sınıfı ile her oyun başında yeni bir hedef sayı belirlenir.
- **Can Sistemi**: Kullanıcının toplam 5 tahmin hakkı bulunur.
- **İpucu Sistemi**: Kullanıcı hatalı tahmin yaptığında, gizli sayının daha büyük mü yoksa küçük mü olduğu belirtilir.
- **Hatalı Giriş Koruması**: 0-100 dışındaki girişlerde kullanıcı uyarılır, tekrarında canı eksilir.
- **Tahmin Geçmişi**: Kullanıcının yaptığı tüm hatalı tahminler bir dizide (`array`) saklanır ve oyun sonunda gösterilir.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
```text
Lütfen tahmininizi giriniz : 50
Hatalı bir sayı girdiniz !
50 sayısı, gizli sayıdan küçüktür.
Kalan hakkı : 4
...
Tebrikler, doğru tahmin !
```
 dı.
