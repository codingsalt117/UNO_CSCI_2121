/**
 * @author [Robin Johnson]
 * @version [1.0.0]
 * 
 * This class has a constructor that constructs instances of a movable point.
 * Contains methods to move "MovablePoint object" a point left, right, up and down
 * Class implements Movable
 * 
 * MovablePoint object defined by int x and int y  
 */

public class MovablePoint implements Movable {
    /**
     *  creating two empty class int varibles, x and y to be used in building object
    */
    int x;
    int y;

    /**
     * Class Constructor with to parameters
     * Constructs the object MoveablePoint
     * @param x the x coord 
     * @param y the y coord
    */
    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Overrided moveUp method. For the method to be called, 
     * the object it is being called by has to have a moveablePoint
     * 
     * adds 1 to int y and sets the result to y
    */
    @Override
    public void moveUp() {
        y += 1;
    }

    /**
     * Overrided moveDown method. For the method to be called, 
     * the object it is being called by has to have a moveablePoint
     * 
     *subtracts 1 from int y and sets the result to y
    */
    @Override
    public void moveDown() {
        y -= 1;
    }

    /**
     * Overrided moveLeft method. For the method to be called, 
     * the object it is being called by has to have a moveablePoint
     * 
     * subtracts 1 from int x and sets the result to x
    */
    @Override
    public void moveLeft() {
        x -= 1;
    }

    /**
     * Overrided moveRight method. For the method to be called, 
     * the object it is being called by has to have a moveablePoint
     * 
     * adds 1 to int x and sets the result to x
    */
    @Override
    public void moveRight() {
        x += 1;
    }

    /**
     * Overrided toString method. For the method to be called, 
     * the object it is being called by has to have a moveablePoint
     * 
     * Tranlsates MovablePoint object to reference data
     * @return formated string
    */
    @Override
    public String toString() {
        return "MovablePoint [x=" + x + ", y=" + y + "]";
    }
}
