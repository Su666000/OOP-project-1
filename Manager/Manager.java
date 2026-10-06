class Manager {
	private int id;
	private String fullName;
	private String position;
	private String shiftSchedule;

	public Manager(){}

	public Manager(int id, String fullName,String position, String shiftSchedule){
		this.id = id ;
		this.fullName = fullName;
		this.position = position;
		this.shiftSchedule = shiftSchedule;
	}

	public void addVideoMaterial (){}
	public void registerNewClient (){}
	public void writeOFFMedia (){}
	public void Profitreport (){}

	public String toString(){
		return "Manager{id="+id+", fullName= "+fullName+", position= "+position+"}";
	}


}