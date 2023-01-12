# CODE-LOCK

Create a class called CodeLock.

The class has attributes:

code (here we assign the code that opens the door)
isOpen (this is false, if the door is locked and true, if the door is opened)
Create a default constructor that assigns code value to "1234" and isOpen to false.

Create printStatus method. If isOpen is true, the method prints “Door is open”. If it is false, the method prints “Door is locked”.

Create checkCode method. The method has one parameter. The method checks if the value of the parameter equals to the value of the code attribute. If it does, isOpen will be true. If not, isOpen will be false. Lastly, the method calls printStatus method.

Don't encapsulate the class. Everything (attributes, methods) should be visible outside of the class

Continue with the CodeLock class you created in step 1.

Set all the attributes so that they cannot be accessed outside of the class.
Create a getter method for isOpen attribute. Getter method returns the value of the isOpen attribute. Name the method: getIsOpen
Set printStatus method so that it can’t be accessed outside of the class.
checkCode method is visible to all (can be called outside of the class)

Create an app. Copy the CodeLock class from the step 2. Your code should be something like:

public class CodeLockApp {
	public static void main(String args[]) {
              // Codes of the main
	}
}

class CodeLock {
	// codes of the CodeLock class
} 


Create a simple user interface (UI). Program the user interface into the main.

Ask the user to type the code. 
Check if the code is right using the checkCode method of the object. 
Exit the loop, if the object’s isOpen is true.
