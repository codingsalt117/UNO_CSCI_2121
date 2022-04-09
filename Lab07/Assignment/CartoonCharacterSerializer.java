//package Lab7Student;
// Robin Johnson
/**
 * @author Robin Johnson
 * 
 * 		This class is designed to save/load a CartoonCharacter and write to file as a .txt 
 * 		
 */
import java.util.*;
import java.io.*;

public class CartoonCharacterSerializer implements Serializable {
	
	private static ObjectOutputStream outputCartoon;
	private static ObjectInputStream inputCartoon;
	private static PrintWriter writer;
	
	//Method that writes one CartoonCharacter object out to a file
/**
 *  This method serializes a CartoonCharacter in file Cartoon.ser
 * <p>
 * Creates a FileOutPutStream to pass into the ObjectOutPutStream, handles any IOException
 * <p>
 * @custom.require CartoonCharacter Object
 * @custom.ensure Cartoon.ser != null
 */
	public static void serializeCharacter(CartoonCharacter character) {
		//#TODO
		//Initialize outputCartoon to serialize objects to a file called Cartoon.ser
		//Write the character object out to the file
		//Close the stream
		try{
            FileOutputStream fileOut = new FileOutputStream("Cartoon.ser");
            ObjectOutputStream outputCartoon = new ObjectOutputStream(fileOut);
            outputCartoon.writeObject(character);
            outputCartoon.close();
            fileOut.close();
        }
        catch(IOException i){
            System.err.print(i);
        }
    }
/**
 *  This method deserializes a CartoonCharacter in file Cartoon.ser
 * <p>
 * Creates a FileInPutStream to pass into the ObjectOInPutStream, handles any IOException & ClassNotFoundException 
 * <p>
 * @custom.require Cartoon.ser != null
 * @custom.ensure CartoonCharacter Object
 */
	public static CartoonCharacter deserializeCharacter() {
		CartoonCharacter cartoon = null;
		
		//#TODO
		//Initialize inputCartoon to read objects from a file called Cartoon.ser
		//Read one CartoonCharacter object and store it in variable cartoon
		try{
            FileInputStream fileIn = new FileInputStream("Cartoon.ser");
            ObjectInputStream inputCartoon = new ObjectInputStream(fileIn);
            cartoon = (CartoonCharacter) inputCartoon.readObject();
            inputCartoon.close();
            fileIn.close();
        }
        catch(IOException b){
            System.err.print(b);
            
        }
        catch (ClassNotFoundException c){
            System.err.print(c);
            
        }
		
		return cartoon;
	}
/**
 * This method writes a String object to a file
 * <p>
 * Creates a file with the destination, using PrintWriter to create/write string to C-137.txt.
 * <p>
 * Throws FileNotFoundException Exception Handling: IOException
 * <p>
 * @custom.require String Object
 * @custom.ensure C-137.txt != null
 */	

	// NOTE: This is optional and you don't have to do this if you choose not to
	public static void printToFile(String stringToFile) throws FileNotFoundException {
		
		//#TODO
		//Initialize writer to print characters to a file called C-137.txt
		//Print stringToFile to that file
		//Print the string "PrintWriter makes printing 50 times easier!" followed by a newline character out to the file
		//Close the PrintWriter stream
		try{
			String string = stringToFile;
			File ouputString = new File("D:/School/Spring2022/Java 2/Lab/Lab7/Assignment/C-137.txt");
			PrintWriter writer= new PrintWriter("C-137.txt");
			writer.write(string);
			writer.println("PrintWriter makes printing 50 times easier!\n");
			writer.close();
		}
		catch (IOException e){
			System.err.print(e);
		}
	}

}
