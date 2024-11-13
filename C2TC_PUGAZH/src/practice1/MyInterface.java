//Nested Interface
package practice1;

public interface MyInterface 
{
	 void calculateArea();
	    interface MyInnerInterface
	    {
	       int  id = 1013;
	       void print();     
	    }
}