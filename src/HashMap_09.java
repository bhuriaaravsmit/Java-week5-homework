/*9. Create a HashMap object called people that will store String keys and Integer values: And use for each loop to iterate the value from Map.*/


import java.util.HashMap;
import java.util.Map;

public class HashMap_09 {


    public static void main(String[] args) {

        Map<String , Integer> people = new HashMap<String , Integer>();
//add keys and values (Name ,age)
        people.put( "Mark" , 25);
        people.put( "Mick", 49);
        people.put( "James " , 42);
        people.put( "Kevin" , 37);
//for each loop

        for(String i:people.keySet()){

            System.out.println("Name " + i + " Age " + people.get(i));

        }











}







}
