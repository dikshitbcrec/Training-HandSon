package Handson;
/*
 3) i) Create the following class and implement the method to check whether the given
string is a palindrome and return the result.
Class Name : Demo2
Method : palindromeCheck(String):boolean
(Hint: A String is palindrome, If the reversed string is equal to the actual string.
 Ex: madam, mom, dad, malayalam )
ii) Create a Junit test class to test the above class.
 */
public class Demo2 {
	StringBuilder sb=new StringBuilder();
    boolean palindromeCheck(String S1)
    {
    	sb.append(S1);
    	sb=sb.reverse();
    	if(sb.toString().equals(S1))
    	{
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}
