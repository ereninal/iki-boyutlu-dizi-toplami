/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikiboyutludizisatirsatirtoplami;

import java.util.Scanner;

/**
 *
 * @author Eren
 */
public class IkiBoyutluDiziSatirSatirToplami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int satir,sutun;
        Scanner oku = new Scanner(System.in);
        System.out.print("Dizinin satir sayısını girin: ");
        satir = oku.nextInt();
        System.out.print("Dizinin sütun sayısını girin: ");
        sutun = oku.nextInt();
        int dizi[][] = new int[satir][sutun];
        int diziToplam[] = new int[satir];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Dizinin "+(i+1)+". Satırının "+(j+1)+". Sütununun Elemanını Girin :");
                dizi[i][j] = oku.nextInt();
            }
        }
        System.out.println("A Dizisi Elemanları");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("A Dizisinin Satır Satır Toplamı");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                diziToplam[i] +=dizi[i][j]; 
            }
            System.out.print(diziToplam[i]+" ");
        }
    }
    
}
