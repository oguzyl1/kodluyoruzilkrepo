# Kullanıcı Girişi ve Şifre Sıfırlama

Bu program, kullanıcıdan giriş bilgilerini alan, hatalı şifre durumunda kullanıcıya şifre sıfırlama seçeneği sunan bir Java uygulamasıdır.

## Ödev İçeriği

Program şu kurallara göre çalışır:
- Geçerli kullanıcı adı: `patika`
- Geçerli şifre: `java123`
- Şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağı sorulur.
- Yeni şifre oluştururken:
  - Yeni şifrenin unuttuğu şifre (hatalı girilen) ile aynı olmaması gerekir.
  - Yeni şifrenin eski başarılı şifre (`java123`) ile aynı olmaması gerekir.
  - Şifreler aynı ise "Şifre oluşturulamadı", farklı ise "Şifre oluşturuldu" mesajı verilir.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- Kullanıcı Adı: patika
- Şifre: 12345 (Hatalı)
- Şifre Sıfırlama: 1 (Evet)
- Yeni Şifre: 12345 (Hatalı şifre ile aynı)
- **Sonuç:** Şifre oluşturulamadı, lütfen başka şifre giriniz.
