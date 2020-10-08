
public class ParkingLot {
	private int capacity;
	private int slot[];
	private String regNo[];
	private String age[];
	
	// .............Constructor....................
	
	ParkingLot(int capacity){
		this.capacity = capacity;
		slot = new int[capacity];
		regNo = new String[capacity];
		age = new String[capacity];	
		
	}
	
	//..........Method for creating parking lot.................
	
	String createParkingLot(int pos) {
		for(int i=0; i<pos; i++) {
			slot[pos-1] = 0;
			regNo[pos-1] = null;
			age[pos-1] = null;
		}
		return "Created parking of " + pos + " slots";
	}
	
	//..........Method to park the car..................
	
	String parkTheCar(String reg, String age) {
		String res = "";
		for(int i=0; i<capacity; i++) {
			if(slot[i] == 0) {
				slot[i] = 1;
				regNo[i] = reg;
				this.age[i] = age;
				res = "Car with vehicle registration number "+ "\"" + reg + "\""  + " has been parked at slot number " + (i+1);
				break;
			}
		}
		if(res == " ")
			return "No Slot Available";
		else
			return res;
	
	}
	
	//................Method to find slot numbbers occupied by driver of given age............
	
	String slotNumbersByAge(String a) {
		String res = "";
		for(int i=0; i<age.length; i++) {
			if(a.equals(age[i]))
				res = res+(i+1)+ ",";
		}
		return res.substring(0,res.length()-1);
	}
	
	
	//...............Method to fing slot number of a given car with registration number............
	
	String slotNumberForCarNumber(String a) {
		String res = "";
		for(int i=0; i<regNo.length; i++) {
			if(a.equals(regNo[i])) {
				res = res+(i+1);
				break;
			}	
		}
		return res;
	}
	
	
	//...........Method to vacant the slot of given position...............
	
	String leave(int pos) {
		if(slot[pos-1] == 0) {
			return "Slot already vacant";
		}
		String cReg = regNo[pos-1];
		String cAge = age[pos-1];
		slot[pos-1] = 0;
		regNo[pos-1] = null;
		age[pos-1] = null;
		
		return "Slot number " + pos + " vacated, the car with vehicle registration number " + "\"" + cReg + "\""  + " left the space, the driver of the car was of age " + cAge;
	}
	
	
	//...............Method to return all parked vehivles registration number of car parked  whose driver
	//...has the same age as given. Output will be comma separated.
	
	String vehicleRegNoByAge(String a) {
		String res = "";
		for(int i=0; i<regNo.length; i++) {
			if(a.equals(age[i])) {
				res = res+regNo[i]+",";
			
			}	
		}
		if(res == "")
			return null;
		else
			return res.substring(0,res.length()-1);
	}
	
	
	// Getters and Setters for private variables.

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int[] getSlot() {
		return slot;
	}

	public void setSlot(int[] slot) {
		this.slot = slot;
	}

	public String[] getRegNo() {
		return regNo;
	}

	public void setRegNo(String[] regNo) {
		this.regNo = regNo;
	}

	public String[] getAge() {
		return age;
	}

	public void setAge(String[] age) {
		this.age = age;
	}
	
	
}
