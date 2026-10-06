public class Client{
	private int id;
	private String fullName;
	private String birthDate;
	private int age;
	private double phone;
	private String email;
	private double passportNumber;
	private double balance;
	private int rating;

	public Client(){}

	public Client(int id, String fullName, String birthDate, int age, String phone, String email,String passportNumber, double balance, int rating){
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
		this.passportNumber = passportNumber;
		this.balance = balance;
		this.rating =rating;
	}

	public int getAge(){
		if (birthDate == null || birthDate.isEmpty()){
		return 0;
		}
		return this.age;
	}
	public String getFullName(){
		return fullName;
	}


	public StrivgetPassportNumber(){
		return passportNumber;
	}

	public void createRentlRequrst(){}
	public void returnVideoMaterial(){}
	public void payBill(double amount){
	if (this.balance >= amount){
		this.balance -= amount;
	}
		else {
			System.out.println("Недостаточно средств");
		}
	
	}

	public String toString(){
		return "Client{name='"+fullName+"', passportNumber= "+passportNumber+", age="+age+",rating="+rating+"}";
	}
}