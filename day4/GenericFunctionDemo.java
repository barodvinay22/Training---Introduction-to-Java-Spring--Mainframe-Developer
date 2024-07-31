
class GenericFunctionDemo {
	// A Generic method example
	static <T> void genericDisplay(T element)
	{
		System.out.println(element.getClass().getName()
						+ " = " + element);
	}

	public static void main(String[] args)
	{
		// Calling generic method with Integer argument
		genericDisplay(11);

		// Calling generic method with String argument
		genericDisplay("Test String");

		// Calling generic method with double argument
		genericDisplay(1.0);
		// Calling generic method with Student argument
		genericDisplay(new Student(1, "Vinay", 25));
	}
}
class Student{
	private Integer id;
    private String name;
    private Integer age;
	Student(Integer id,String name,Integer age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	// @Override
	// public String toString() {
	// 	return String.format("Student id = %s , name = %s, age = %s",id,name,age);
	// }
}