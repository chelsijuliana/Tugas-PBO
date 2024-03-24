/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author USER
 */
public class Gaji {
    public static void main(String[] args){
        
        String nama1 ="Andi";
        String nama2 ="Budi";
        long gajiandri = 10000000;
        long gajibudi = 5000000;
        double pajak,gajibersih;

        //pajak gaji >6jt = 3%
        //pajak gaji <6jt = 2%

        if(gajiandri==10000000){
            pajak=gajiandri*0.03;
            gajibersih=gajiandri-pajak;
            System.out.println("Gaji Bersih Andri :" +gajibersih);
        }
        if(gajibudi==5000000){
            pajak=gajibudi*0.02;
            gajibersih=gajibudi-pajak;
            System.out.println("Gaji Bersih Budi:" +gajibersih);
        }           
    }
    
}
