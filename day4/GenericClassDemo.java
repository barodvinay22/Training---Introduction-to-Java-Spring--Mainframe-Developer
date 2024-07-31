class GenericClassDemo {
	public static void main(String[] args)
	{
		// instance of Integer type
		Test<Integer> test = new Test<Integer>(15);
		System.out.println(test.getObject());

		// instance of String type
		Test<String> stringObj
			= new Test<String>("Test String");
		System.out.println(stringObj.getObject());
	}
}
class Test<T> {
	// An object of type T is declared
	T obj;
	Test(T obj) { this.obj = obj; } // constructor
	public T getObject() { return this.obj; }
}


