# Dizideki En Yakın Sayıları Bulma

Bu program, bir dizideki elemanların, kullanıcının girdiği bir hedef sayıya göre "en yakın küçük" ve "en yakın büyük" değerlerini tespit eden bir Java uygulamasıdır.

## Ödev İçeriği
Sınıf örneğindeki sadece min ve max bulma mantığı geliştirilerek, belirli bir sayı referans alınarak kıyaslama yapılmıştır.

**Mantık:**
- Dizi `Arrays.sort()` metodu ile küçükten büyüğe sıralanır.
- Sıralı dizide gezilirken; hedef sayıdan küçük olan en son sayı "en yakın küçük", hedef sayıdan büyük olan ilk sayı ise "en yakın büyük" olarak belirlenir.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- Dizi : `{15, 12, 788, 1, -1, -778, 2, 0}`
- Girilen Sayı : 5
- **Girilen sayıdan küçük en yakın sayı**: 2
- **Girilen sayıdan büyük en yakın sayı**: 12
 dı.
