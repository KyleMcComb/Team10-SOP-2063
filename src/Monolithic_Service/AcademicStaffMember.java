package Monolithic_Service;

public class AcademicStaffMember {

	private int StaffID;
	
	Module[] modulesTaught = new Module[2];
	
	ModuleCode[] moduleCode = new ModuleCode[2];
	
	public void setID(int ID) {
		this.StaffID = ID;
		
	}
	
	public int getStaffID() {
		
		return this.StaffID;
	}
	
}
