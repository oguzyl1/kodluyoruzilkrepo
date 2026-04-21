# Hava Sıcaklığına Göre Etkinlik Önerme

Bu program, kullanıcıdan alınan hava sıcaklığına göre yapılabilecek aktiviteleri öneren bir Java uygulamasıdır.

## Ödev İçeriği

Programda koşullu ifadeler (`if-else if`) kullanılarak sıcaklık aralıklarına göre etkinlikler belirlenmiştir.

**Sıcaklık Koşulları:**
- **Sıcaklık < 5**: Kayak
- **5 <= Sıcaklık <= 15**: Sinema
- **15 < Sıcaklık <= 25**: Piknik
- **Sıcaklık > 25**: Yüzme

## Farklı Çözüm Yolu
Hocanın çözümünden farklı olarak, `&&` (VE) mantıksal operatörü kullanılarak daha okunaklı ve sıralı bir `else if` merdiveni tercih edilmiştir. Bu sayede kodun karmaşıklığı azaltılmış ve hata payı düşürülmüştür.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```
