# Palindromik Kelime Bulma

Bu program, kullanıcının girdiği bir kelimenin tersten okunuşunun kendisiyle aynı olup olmadığını (palindromik durumunu) kontrol eden bir Java uygulamasıdır.

## Palindromik Kelime Nedir?
Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime"dir.

**Örnekler:**
- abba
- asa
- kavak
- kayak

## Ödev İçeriği
Programda iki farklı kontrol yöntemi sunulmuştur:
1. **İndis Kontrolü**: Kelimenin başından ve sonundan başlayarak karakterler eşleşene kadar merkeze doğru ilerlenir.
2. **String Ters Çevirme**: Kelime tamamen ters çevrilir ve orijinal haliyle kıyaslanır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- Bir kelime giriniz : kavak -> **Sonuç**: "kavak" palindromik bir kelimedir.
- Bir kelime giriniz : patika -> **Sonuç**: "patika" palindromik bir kelime değildir.
 dı.
