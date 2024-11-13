//Child class implements inner interface
package practice1;

public class NestedInterfaceClass implements MyInterface.MyInnerInterface{

	@Override
	public void print() {
		 System.out.println("Print method of nested interface");
	}

	

}