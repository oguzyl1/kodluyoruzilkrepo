# Ters Üçgen Yapımı

Bu program, kullanıcıdan alınan basamak sayısına göre yıldızlar (*) kullanarak ekrana ters bir üçgen çizen bir Java uygulamasıdır.

## Ödev İçeriği
Programda iç içe `for` döngüleri kullanılarak geometrik bir desen oluşturulmuştur.

**Kullanılan Mantık:**
- Dış döngü, girilen basamak sayısından başlayarak (örneğin 10) 1'e doğru azalır.
- Her adımda, o satırdaki boşluk sayısı `(n - i)` ve yıldız sayısı `(2 * i - 1)` olarak hesaplanır.
- Bu sayede görsel olarak dengeli ve simetrik bir ters üçgen elde edilir.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Çıktı (10 için)
```text
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *
```
 dı.
