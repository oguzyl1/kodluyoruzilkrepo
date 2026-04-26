# Matris Transpozunu Bulma

Bu program, Java'da çok boyutlu diziler ile oluşturulmuş bir matrisin transpozunu (devriğini) hesaplayan bir uygulamadır.

## Matris Transpozu Nedir?
Matrisin transpozunu almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucunda `RxC` boyutundaki bir matris, `CxR` boyutuna dönüşür.

**Mantık:**
- Orijinal matrisin `matrix[i][j]` elemanı, transpoze matrisin `transpose[j][i]` konumuna yerleştirilir.
- İç içe `for` döngüleri ile tüm indeksler taranarak dönüşüm tamamlanır.

## Nasıl Çalıştırılır?

Klasör içindeki `Main.java` dosyasını derleyip çalıştırabilirsiniz:

```bash
javac Main.java
java Main
```

### Örnek Senaryo
**Matris :**
```text
2    3    4    
5    6    4    
```
**Transpoze :**
```text
2    5    
3    6    
4    4    
```
 dı.
