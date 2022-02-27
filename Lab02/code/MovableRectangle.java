/**
 * @author [Some Human]
 * @version [1.0.0]
 *        
 * This class creates a object, MovablRectangle.
 * Contains methods that define how this object moves.
 * This class implements Movable
 *              
 * MovableRectangle object is defined by a topLeft and bottomRight
 * Both of which are movablePoint objects     
 */

    /**
     * creates two private final emply class varibles topLeft and bottomRight
    */
public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    /**
     * Class constructor
     * Construct a MovableRectangle object
     * @param x1 The x-coord of topLeft
     * @param y1 The y-coord of topLeft
     * @param x2 The x-coord of bottomRight
     * @param y2 The y-coord of bottomRight
    */
    public MovableRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MovablePoint(x1, y1);
        this.bottomRight = new MovablePoint(x2, y2);
    }

    /**
     * Overridden moveUp method for a MovableRectangle object
     * For this moveUp method to be called, the call must be a MovableRectangle
     * 
     * Sends movablePoint objects topLeft and bottomRight to MovablePoint.moveUp
    */
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    /**
     * Overridden moveDown method for a MovableRectangle object
     * For this moveDown method to be called, the call must be a MovableRectangle
     * 
     * Sends movablePoint objects topLeft and bottomRight to MovablePoint.moveDown
    */
    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    /**
     * Overridden moveLeft method for a MovableRectangle object
     * For this moveLeft method to be called, the call must be a MovableRectangle
     * 
     * Sends movablePoint objects topLeft and bottomRight to MovablePoint.moveLeft
    */
    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    /**
     * Overridden moveRight method for a MovableRectangle object
     * For this moveRight method to be called, the call must be a MovableRectangle
     * 
     * Sends movablePoint objects topLeft and bottomRight to MovablePoint.moveRight
    */
    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    /**
     * Overridden toString method for a MovableRectangle object
     * For this toString method to be called, the call must be a MovableRectangle
     * 
     * Tranlsates MoveableRectangle to referance data
     * @return Formated String representation of MovableRectangle
    */
    @Override
    public String toString() {
        return "MovableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
