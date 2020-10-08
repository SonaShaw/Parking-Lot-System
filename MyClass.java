
import java.io.*;
import java.util.*;
public class MyClass {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\admin\\eclipse-workspace\\SquadStack\\src\\input.txt"); 
		  
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		String query; 
		 // 10 is the capacity of parking lot if you 
		// want more then pass sufficietly big parameter or take a input from user.
		ParkingLot parkingLot = new ParkingLot(10);
		String res;
		
		while ((query = br.readLine()) != null) {
			String splitInput[] = query.split(" ");
			
			switch(splitInput[0]) {
				case "Create_parking_lot":
					res = parkingLot.createParkingLot(Integer.parseInt(splitInput[1]));
					System.out.println(res);
					break;
					
				case "Park":
					res = parkingLot.parkTheCar(splitInput[1], splitInput[3]);
					System.out.println(res);
					break;
					
				case "Slot_numbers_for_driver_of_age":
					res = parkingLot.slotNumbersByAge(splitInput[1]);
					System.out.println(res);
					break;
				case "Slot_number_for_car_with_number":
					res = parkingLot.slotNumberForCarNumber(splitInput[1]);
					System.out.println(res);
					break;
					
				case "Leave":
					res = parkingLot.leave(Integer.parseInt(splitInput[1]));
					System.out.println(res);
					break;
					
				case "Vehicle_registration_number_for_driver_of_age":
					res = parkingLot.vehicleRegNoByAge(splitInput[1]);
					System.out.println(res);
					break;
					
				default:
					System.out.println("Provide a valid input");
					
			} 
		}
		  
	}

}
