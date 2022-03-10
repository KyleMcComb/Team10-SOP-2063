package Monolithic_Service;

public class Student {

	private int StudentID;
	
	Module[] modulesArray = new Module[20];
	
	ModuleCode[] moduleCodes = new ModuleCode[20];
	
	public void setID(int ID) {
		
		this.StudentID = ID;
		
	}
	
	public int getID() {
		return this.StudentID;
		
	}
	
	
			
}


