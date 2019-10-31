package world;

import bee.Bee;
import bee.Drone;
import bee.Queen;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * The queen's chamber is where the mating ritual between the queen and her
 * drones is conducted.  The drones will enter the chamber in order.
 * If the queen is ready and a drone is in here, the first drone will
 * be summoned and mate with the queen.  Otherwise the drone has to wait.
 * After a drone mates they perish, which is why there is no routine
 * for exiting (like with the worker bees and the flower field).
 *
 * @author Sean Strout @ RIT CS
 * @author YOUR NAME HERE
 */
public class QueensChamber extends Object{
    private ConcurrentLinkedQueue<Bee> drones;

    public QueensChamber() {
        this.drones = new ConcurrentLinkedQueue<>();
    }

    public synchronized void enterChamber(Drone drone){
        System.out.println("*QC*" + drone + " enters chamber");
        drones.add(drone);

    }

    public synchronized  void summonDrone(){

    }

    public synchronized void dismissDrone(){

    }

    public synchronized boolean hasDrone(){
        if (this.drones.size()>0){
            return true;
        }
        return false;
    }
}