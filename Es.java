/*
 * Finder: preso un array di numeri casuali, selezionato un numero da tastiera,
 * si valuta se esiste e si eliminano gli eventuali duplicati compattando l'array.
 */
package es;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Master
 */
public class Es {

    /**
     * Vede se il numero scelto esiste nell'array. Valori in
     * <strong>double</strong>.
     *
     * @param a array
     * @param n numero scelto
     * @return true se esiste, false altrimenti
     */
    public boolean isExist(double[] a, double n) {
        boolean yes = false;
        int i = 0;
        while (!yes && i < a.length) {
            if (n == a[i]) {
                yes = true;
            } else {
                i++;
            }
        }
        return yes;
    }

    /**
     * Vede se il numero scelto esiste nell'array. Valori in <b>int</b>.
     *
     * @param a array
     * @param n numero scelto
     * @return true se esiste, false altrimenti
     */
    public boolean isExist(int[] a, int n) {
        boolean yes = false;
        int i = 0;
        while (!yes && i < a.length) {
            if (n == a[i]) {
                yes = true;
            } else {
                i++;
            }
        }
        return yes;
    }

    /**
     * Elimina i duplicati e compatta l'array.
     *
     * @param a array
     * @param n numero scelto
     * @return array compattato
     */
    public double[] delDuplicates(double[] a, double n) {
        int end = a.length;
        int shift = 0;
        int cnt = 0;
        for (int j = 0; j < end; j++) {
            if (n == a[j]) {
                cnt++;
                if (cnt == 1) {
                    shift++;
                } else {
                    shift = j;
                    for (int k = j + 1; k < end; k++, shift++) {
                        a[shift] = a[k];
                    }
                    end--;
                }
            }
        }

        cnt--;
        for (int i = a.length - cnt; i < a.length; i++) {
            a[i] = 0;
        }
        return a;
    }

    /**
     * Elimina i duplicati e compatta l'array.
     *
     * @param a array
     * @param n numero scelto
     * @return array compattato
     */
    public int[] delDuplicates(int[] a, int n) {
        int end = a.length;
        int shift = 0;
        int cnt = 0;
        for (int j = 0; j < end; j++) {
            if (n == a[j]) {
                cnt++;
                if (cnt == 1) {
                    shift++;
                } else {
                    shift = j;
                    for (int k = j + 1; k < end; k++, shift++) {
                        a[shift] = a[k];
                    }
                    end--;
                }
            }
        }

        cnt--;
        for (int i = a.length - cnt; i < a.length; i++) {
            a[i] = 0;
        }
        return a;
    }

    /**
     * Funzione principale: richiede un numero per il controllo sull'array. Se
     * il numero inserito esiste nell'array allora si procede con l'eliminazione
     * dei duplicati.
     *
     * @param a array di numeri casuali
     * @return array modificato, se il numero di input esiste, invariato
     * altrimenti
     */
    public double[] find(double[] a) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nType a number: ");
        try {
            double n = Double.parseDouble(r.readLine());
            if (isExist(a, n)) {
                return delDuplicates(a, n);
            } else {
                System.out.printf("The number %d didn't exist in this array.", n);
            }
        } catch (IOException ex) {
            System.out.println("Error: bad input.");
        } catch (NumberFormatException en) {
            System.out.println("Error: input format must be a number.");
        }
        return a;
    }

    /**
     * Funzione principale: richiede un numero per il controllo sull'array. Se
     * il numero inserito esiste nell'array allora si procede con l'eliminazione
     * dei duplicati.
     *
     * @param a array di numeri casuali
     * @return array modificato, se il numero di input esiste, invariato
     * altrimenti
     */
    public int[] find(int[] a) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nType a number: ");
        try {
            int n = Integer.parseInt(r.readLine());
            if (isExist(a, n)) {
                return delDuplicates(a, n);
            } else {
                System.out.printf("The number %d didn't exist in this array.", n);
            }
        } catch (IOException ex) {
            System.out.println("Error: bad input.");
        } catch (NumberFormatException en) {
            System.out.println("Error: input format must be a number.");
        }
        return a;
    }

    /**
     * Stampa l'array in righa
     *
     * @param a array
     */
    public void print(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%10.2f", a[i]);
        }
    }

    /**
     * Stampa l'array in righa
     *
     * @param a array
     */
    public void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%5d", a[i]);
        }
    }

    /**
     * Genera un array di dimensione casuale e popolata da numeri casuali
     *
     * @return array di tipo double
     */
    public double[] createDouble() {
        double[] tmp = new double[(int) (Math.random() * 20 + 1)];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Math.random() * Math.random() * 100 + 1;
        }
        return tmp;
    }

    /**
     * Genera un array di dimensione casuale e popolata da numeri casuali
     *
     * @return array di tipo int
     */
    public int[] createInt() {
        int[] tmp = new int[(int) (Math.random() * 20 + 1)];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = (int) (Math.random() * Math.random() * 100 + 1);
        }
        return tmp;
    }

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Array di test */
//        double[] a = {8, 4, 2, 12, 23, 4, 9, 12, 4};
        Es es = new Es();
        /* Decommentare la righa successiva caso double */
//        double[] a = es.createDouble();
        /* Decommentare la righa successiva caso int */
        int[] a = es.createInt();
        System.out.println("Elements:");
        es.print(a);
        a = es.find(a);
        System.out.println("Actioning...");
        es.print(a);
        System.out.println();
    }

}
