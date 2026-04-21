# Uçak Bileti Fiyatı Hesaplama

Bu program, mesafe, yaş ve yolculuk tipi bilgilerini alarak uçak bileti fiyatını hesaplayan, yaş ve yolculuk tipi indirimlerini uygulayan bir Java uygulamasıdır.

## Ödev İçeriği

Program şu kurallara göre hesaplama yapar:
- **Birim Ücret**: 0.10 TL / KM
- **Geçerlilik Kontrolü**: Mesafe, yaş ve tip değerleri pozitif ve belirtilen aralıklarda olmalıdır.
- **İndirimler**:
  - 12 yaşından küçükse: %50
  - 12 - 24 yaş arasındaysa: %10
  - 65 yaşından büyükse: %30
  - Gidiş-Dönüş (Tip 2) seçilmişse: Ek %20 indirim (Bilet fiyatı çift katına çıkarılır).

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- Mesafe: 1500 KM
- Yaş: 20
- Yolculuk Tipi: 2 (Gidiş-Dönüş)
- **Sonuç:** Toplam Tutar = 216.0 TL
