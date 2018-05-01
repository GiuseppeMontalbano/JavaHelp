# JavaHelp
Un piccolo help per capire un po' Java e il suo ambiente.
## Java OOP
OOP (Object Oriented Programming): si parla di oggetti...
### Classe
Il concetto di **classe** identifica che cos'è un oggetto.
La classe è un prototipo di ciò di cui abbiamo bisogno, una **astrazione** di quello che vogliamo rappresentare per il nostro problema. Pensiamo ad una automobile. Essa ha una marca, un modello, un certo tipo di motore, il tipo di trazione, numero di posti a sedere, ecc... In generale possiamo trovare *caratteristiche* comuni che ogni automobile ha per essere chiamata tale.

Inoltre l'automobile ha varie *funzionalità* come accelerazione, frenata, velocità, uso del climatizzatore, sterzata, uso delle freccie, ecc...

Quindi possiamo ideare un **modello di dati** in grado di descrivere in modo più generico ciò di cui abbiamo bisogno attraverso l'utilizzo delle variabili (o attributi o proprietà).

Attraverso le funzionalità si può agire sul modello dei dati modificando il suo stato, chiamate funzioni o metodi.
Vi è una funzionalità particolare e molto importante chiamata **costruttore**. Questa funzionalità ha il compito di creare un oggetto, ovvero rendere unico il modello dei dati.
Un esempio:
```java
public class Automobile {
  /* Attributi (Modello dei Dati) */
  private String marca;
  private String modello;
  private int nPosti;
  private boolean frecciaSx;
  private boolean frecciaDx;
  private boolean 4freccie;
  private int velocitaMax;
  
  /* Metodi */
  public Automobile(String marca, String modello, int nPosti) {
    this.marca = marca;
    this.modello = modello;
    this.nPosti = nPosti;
    this.frecciaSx = false;
    ...
  }
}
```
