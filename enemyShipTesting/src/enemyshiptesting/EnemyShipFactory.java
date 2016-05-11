/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enemyshiptesting;

/**
 *
 * @author DIP
 */
public class EnemyShipFactory {
     public EnemyShip makeEnemyShip(String newShipType){
	         
	        EnemyShip newShip = null;
	         
	        if (newShipType.equals("U")){
	             
	            return new UfoEnemyShip();
	             
	        } else
	         
	        if (newShipType.equals("R")){
	             
	            return new RocketEnemyShip();
	             
	        } else
	         
	        if (newShipType.equals("B")){
	             
	            return new BigUFOEnemyShip();
	             
	        } else return null;
	         
        }

    
}
