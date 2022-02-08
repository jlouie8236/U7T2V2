import java.util.ArrayList;
/** This class represents a list of Car objects.
 *
 * @author Jacqueline Louie
 */
public class UsedCarLot {
    /** The list that contains all Car objects */
    private ArrayList<Car> inventory;

    /** Instantiates a UsedCarLot object, and sets the object to an empty ArrayList. */
    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    /** Returns a reference to the UsedCarLot ArrayList.
     *
     * @return The list of cars in the ArrayList.
     */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /** Adds a Car object to the inventory ArrayList.
     *
     * @param newCar The new Car object to be added to the inventory.
     */
    public void addCar(Car newCar)
    {
        inventory.add(newCar);
    }

    /** Swaps the location of the selected cars at two given parameters.
     *
     * @param car1 The first car's index in the ArrayList.
     * @param car2 The second car's index in the Array List.
     * @return Returns a boolean indicating the success or failure of the method.
     */
    public boolean swap(int car1, int car2)
    {
        if (car1 >= inventory.size() || car2 >= inventory.size() || car1 < 0 || car2 < 0)
        {
            return false;
        }
        else
        {
            Car temp = inventory.set(car1, inventory.get(car2));
            inventory.set(car2, temp);
            return true;
        }
    }


    /* Adds a Car to the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1
        PRECONDITION: 0 <= indexToAdd < inventory.size()
        DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
        like you did the other addCar method; also note that this method is void
    */

    /** Adds a Car object indicated by the parameter to the inventory at the index given. This increases the size of the inventory by 1
     * <p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *
     * @param indexToAdd The index where carToAdd will be added.
     * @param carToAdd The Car object to be added to the inventory.
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */

    /** Removes the Car object located at the parameter given, and decreases the size of the inventory by 1.
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size().
     *
     * @param indexOfCarToSell The index where the Car object should be removed.
     * @return The Car object that was removed.
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);

    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */

    /** Removes the Car located at the parameter given and replaces the empty space with NULL.
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index where the Car object should be removed.
     * @return The Car object that was removed.
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car sold = inventory.set(indexOfCarToSell, null);
        return sold;
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */

    /** Moves Car located at the first parameter to the second parameter.
     * <p>
     *  If the second parameter is more than the first parameter, the Car is moved to the right in the inventory;
     *  If the second parameter is less than the first parameter, the Car is moved to the left.
     *
     *  @param indexOfCarToMove The index of the Car that will be moved.
     * @param destinationIndex The index where the Car will be moved to.
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car moved = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, moved);
    }
}
