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
       MainController mainController=new MainController();
       Helicopter helicopter=new Helicopter();
       Submarine submarine=new Submarine();
       Tank tank=new Tank();
       
       mainController.setVisible(true);
       helicopter.setVisible(true);
       submarine.setVisible(true);
       tank.setVisible(true);
    }
    
}
