package Coding_Qus;

public class SingletonEx {
	
	private SingletonEx obj;
	
	private SingletonEx() {
		
	}
	public SingletonEx getInstance(){
		
			if(obj == null) {
				obj=new SingletonEx();
			}
			return obj;
	}

}
