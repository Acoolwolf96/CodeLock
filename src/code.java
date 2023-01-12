import java.util.Scanner;
public class Code{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input;
		
		CodeLock1 cl = new CodeLock1();
		//cl.checkCode("1234");

		System.out.println("Door Opened?" +" "+ cl.getIsOpen());
		
		
		while(true) {
			System.out.println("Please input Code:");
			input= in.nextLine();
			
			cl.checkCode(input);
			
			if(cl.getIsOpen()) {
				break;
			}
			
		}
		
	}
	
}



class CodeLock1{
    private String code;
    private boolean isOpen;
    
    public void locked(){
        isOpen = false;
    }
    
    public void opened(){
        isOpen = true;
    }
    
    
    public CodeLock1(){
        code = "1234";
        isOpen = false;
    }
    
    public void checkCode(String value){
        if(value.equals(code)){
            isOpen = true;
        }
        
        printStatus();
    }
    
    
    private void printStatus(){
        if(isOpen){
            System.out.println("Door is Open");
        }
        else{
            System.out.println("Door is Locked");
        }
    }
    
    public boolean getIsOpen() {
    	return isOpen;
    }
}
