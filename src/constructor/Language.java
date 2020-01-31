package constructor;

public class Language {
	String name;
	Language(){
		System.out.println("Constructor Method Called");
	}
	Language(String t)
	{
		name=t;
	}
	public static void main(String[] args) {
		Language cpp = new Language();
		Language java = new Language("java");
		cpp.setName("C++");
		java.getName();
		cpp.getName();
	}
	void setName(String t)
	{
		name = t;
	}
	void getName() {
		System.out.println("Language name "+name);
	}

}
