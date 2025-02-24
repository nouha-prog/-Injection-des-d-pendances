package presentation;

import ext.DaoImplV2;
import metier.MetierImpl;


public class presentationV1 {

    public static void main(String[] args){
        /*
        Injection des dependences par instanciation statique
         */
        DaoImplV2 d=new DaoImplV2();

        MetierImpl metier = new MetierImpl(d);// Injectiondes dependences via le constructeur
        //metier.setDao(d); // Injection via Setter
        System.out.println("RES="+ metier.calcul());
    }
    
}
