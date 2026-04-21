# Sayıları Küçükten Büyüğe Sıralama

Bu program, kullanıcıdan alınan üç sayıyı bir diziye (array) aktarıp, döngüler kullanarak küçükten büyüğe doğru sıralayan bir Java uygulamasıdır.

## Ödev İçeriği

Programda karmaşık `if-else` blokları yerine, **diziler (arrays)** ve **iç içe `for` döngüleri** kullanılarak daha esnek bir sıralama mantığı (Bubble Sort) kurgulanmıştır.

**Özellikler:**
- Kullanıcıdan alınan sayılar bir dizide saklanır.
- İç içe `for` döngüleri ile her sayı birbiriyle karşılaştırılarak yer değiştirilir (swap işlemi).
- Bu yöntem, ileride 3 sayı yerine daha fazla sayı sıralamak istendiğinde kodda büyük değişiklik yapmadan kullanılabilir.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
- 1. Sayı: 15
- 2. Sayı: 2
- 3. Sayı: 40
- **Sonuç:** Sıralama : 2 15 40 
