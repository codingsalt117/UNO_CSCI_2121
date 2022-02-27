/**
 * @author [Some Human]
 * @version [1.0.0]
 * 
 * This class creates a object, MovablCircle.
 * Contains methods that define how this object moves.
 * This class implements Movable
 *              
 * MoveableCircle object is defined by a radius and a center point
 * Center point is an MobablePoint object
 */

    /**
     * creates two emply class varibles int radius and MovablePoint object center
    */
public class MovableCircle implements Movable {
    private final int radius;
    private final MovablePoint center;

    /**
     * Class constructor
     * Constructs a MovableCircle object
     * @param x The x-coord of center
     * @param y The y-coord of center
     * @param radius The radius of the circle 
    */
    public MovableCircle(int x, int y, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y);
    }

    /**
     * Overridden moveUp method for a MovableCircle object
     * For this moveUp method to be called, the call must be a MovableCircle
     * 
     * Sends movablePoint object center to MovablePoint.moveUp
    */
    @Override
    public void moveUp() {
        center.moveUp();
    }

    /**
     * Overridden moveDown method for a MovableCircle object
     * For this moveDown method to be called, the call must be a MovableCircle
     * 
     * Sends movablePoint object center to MovablePoint.moveUp
    */
    @Override
    public void moveDown() {
        center.moveDown();
    }

    /**
     * Overridden moveLeft method for a MovableCircle object
     * For this moveLeft method to be called, the call must be a MovableCircle
     * 
     * Sends movablePoint object center to MovablePoint.moveUp
    */
    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    /**
     * Overridden moveRight method for a MovableCircle object
     * For this moveRight method to be called, the call must be a MovableCircle
     * 
     * Sends movablePoint object center to MovablePoint.moveUp
    */
    @Override
    public void moveRight() {
        center.moveRight();
    }

    /**
     * Overridden toString method for a MovableCircle object
     * For this toString method to be called, the call must be a MovableCircle
     * 
     * Tranlsates MovableCircle object to reference data
     * @return Formated String representation of MovableCircle
    */
    @Override
    public String toString() {
        return "MovableCircle [radius=" + radius + ", center=" + center + "]";
    }

}
