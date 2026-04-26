# ATM Projesi

Bu program, kullanıcının banka hesabına erişip bakiye sorgulama, para yatırma ve para çekme işlemlerini yapabildiği bir ATM simülasyonudur.

## Ödev İçeriği
Sınıfta anlatılan ATM projesindeki operasyonel işlemler, ders örneğinin aksine **Switch-Case** yapısı kullanılarak modernize edilmiştir.

**Özellikler:**
- Kullanıcı Adı: `patika`, Şifre: `dev123`
- 3 hatalı giriş hakkı (3. hata sonrası hesap bloke olur).
- Para yatırma, çekme ve bakiye sorgulama özellikleri.
- Temiz ve modüler bir işlem menüsü.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
1. Başarıyla giriş yapılır.
2. İşlem menüsünden "1" (Para Yatırma) seçilir.
3. Miktar girilir ve ana bakiyeye eklenir.
4. "4" (Çıkış) ile güvenli bir şekilde oturum sonlandırılır.
