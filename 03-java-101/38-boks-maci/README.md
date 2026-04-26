# Boks Maçı Simülasyonu

Bu proje, iki dövüşçünün ağırlık, hasar ve savunma yeteneklerine göre bir ringde karşılaşmasını simüle eden Nesne Yönelimli Programlama (OOP) çalışmasıdır.

## Proje Yapısı
- **Fighter**: Dövüşçü özelliklerini (ad, hasar, sağlık, ağırlık, savurma şansı) ve vuruş mantığını içerir.
- **Ring**: Maçın gerçekleştiği alanı, siklet kontrolünü ve raunt döngüsünü yönetir.
- **Main**: Dövüşçüleri oluşturur ve simülasyonu başlatır.

## Ödev Özellikleri (Şans Faktörü)
Dersin gerekliliklerine göre şu özellik entegre edilmiştir:
- **İlk Vuruş Olasılığı**: Maç başladığında hangi dövüşçünün ilk saldırıyı yapacağı `%50` olasılıkla (`Math.random()`) sistem tarafından belirlenir. Bu sayede simülasyon her seferinde farklı bir başlangıç sunar.

## Nasıl Çalıştırılır?

Tüm `.java` dosyalarını aynı klasörde derleyip çalıştırabilirsiniz:

```bash
javac *.java
java Main
```

### Örnek Çıktı
```text
Maça Alex başlıyor!
======== YENİ ROUND ===========
------------
Alex => Marc 10 hasar vurdu.
------------
Marc => Alex 15 hasar vurdu.
Alex gelen hasarı savurdu.
...
Maçı Kazanan : Alex
```
 dı.
