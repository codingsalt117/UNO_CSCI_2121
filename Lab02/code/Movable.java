/**
 * @author [Robin Johnson]
 * @version [1.0.0]
 * This interface contains method calls that moves objects, circle or rectangle object  
 *      Implemented by MovablePoint, MovableCircle, MovableRectangle
 */
public interface Movable {

    /**
     * Every class that is Moavable has this method included.
     * This method defines how an movable object moves up.
    */
    void moveUp();

    /**
     * Every class that is Moavable has this method included'
     * This method defines how an movable object moves down.
    */
    void moveDown();

    /** 
     * Every class that is Moavable has this method included.
     * This method defines how an movable object moves left.
    */
    void moveLeft();

    /**
     * Every class that is Moavable has this method included.
     * This method defines how an movable object moves right.
    */
    void moveRight();

}
