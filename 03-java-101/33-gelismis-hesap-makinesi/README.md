# Gelişmiş Hesap Makinesi

Bu program, standart matematiksel işlemlerin yanı sıra üslü sayı, faktöriyel, mod alma ve geometrik hesaplamalar yapabilen geniş kapsamlı bir Java hesap makinesidir.

## Ödev İçeriği
Ders örneğindeki temel hesap makinesine ek olarak şu fonksiyonlar geliştirilmiştir:
- **Mod Alma**: Girilen sayının belirtilen değere göre modunu hesaplar.
- **Dikdörtgen Alan ve Çevre Hesabı**: Verilen kenar uzunluklarına göre alan ve çevreyi hesaplar.

**Özellikler:**
- Her işlem için ayrı bir `static` metot tanımlanmıştır.
- `Switch-case` yapısı ile interaktif bir menü sunulmuştur.
- Hatalı giriş kontrolleri (örneğin bölme işleminde 0 kontrolü) yapılmıştır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
1. Menüden "7" seçilir.
2. Sayı: 10, Mod: 3 girilir.
3. **Sonuç**: 1
 dı.
