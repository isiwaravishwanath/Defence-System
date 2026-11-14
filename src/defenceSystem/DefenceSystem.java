/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defenceSystem;

/**
 *
 * @author Isiwara
 */
public class DefenceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainController mainC = new MainController();
        mainC.setVisible(true);

        Helicopter helicopter = new Helicopter();
        helicopter.addMain(mainC);
        
        Submarine submarine = new Submarine();
        submarine.addMain(mainC);
        //mainC.addDefence(submarine);
      
        Tank tank = new Tank();
        tank.addMain(mainC);
        //mainC.addDefence(tank);
        
        mainC.addObserverDefence(helicopter, tank, submarine);

    }

}
