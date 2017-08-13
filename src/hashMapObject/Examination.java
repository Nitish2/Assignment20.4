package hashMapObject;

/**
 * Creating a HashMap object in the Java Program and perform the following functionalities:
      Adding key-value pairs to the HashMap object
        Retrieving all the keys present in the HashMap.
          Retrieving all the values present in the HashMap.
            Making the HashMap as Synchronized.
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Examination { //Creating Class
	public static void main(String[] args) { // Main class

		// Creating HashMap object
		HashMap<String, String> examination = new HashMap<String, String>();

		// Adding Key Value into the hashMap .
		examination.put("Subject1", "Java");
		examination.put("Subjec2", "OOPS");
		examination.put("Subject3", "Android");
		examination.put("Subject4", "Phython");

		System.out.println("HashMap:");
		for (Map.Entry<String, String> exam : examination.entrySet()) { //Prints all the elements in the hashMap
			System.out.println(exam.getKey() + " " + exam.getValue());
		}

		//Retrieving and prints all keys and values present in the hashMap table  
		System.out.println("\nAll  the keys and values present in the hashMap:");
		for (Map.Entry<String, String> exam1 : examination.entrySet()) {
			System.out.println("Key(" + exam1.getKey() + ")" + " " + "Value(" + exam1.getValue() + ")");
		}

        /*
         * We synchronized HashMap because it returns a thread-safe map 
             backed up by the specified HashMap.
         */
		Map<String, String> SyncMap = Collections.synchronizedMap(examination); //Creating a synchronized map Object 
		Set<java.util.Map.Entry<String, String>> set = SyncMap.entrySet();
		synchronized (SyncMap) { //Synchronizing HashMap 

          //Note: Iterator should be used in a synchronized block even if we have synchronized the HashMap explicitly
			Iterator<java.util.Map.Entry<String, String>> i = set.iterator();
			System.out.println("\nSyncronized HashMap:");
			
			while (i.hasNext()) {  //While Loop to print the elements of Synchronized HashMap
				java.util.Map.Entry<String, String> syncHash = i.next();
				System.out.println(syncHash.getKey() + " " + syncHash.getValue());

			}
		}
	}
}