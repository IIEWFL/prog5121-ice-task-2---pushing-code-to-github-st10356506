package junittestingicetask;

public class User {
    public boolean verifyAge(int age) {
        return (age>=21);
    }

    public boolean isEven(int number) {//checks if number is even
        return (number % 2 == 0);//returns true if number divided by two leaves remainder of zero
    }


    public boolean isOdd(int number) {//checks if number is odd
        return (number % 2 == 1);//returns true if number divided by two leaves remainder of one
    }

    public boolean isGreater(int num1, int num2) {//checks if firts number is greater than second number
        if (num1 > num2) {
            return true;//return true if first number greater than second
        } else {
            return false;//return false if first number smaller than second
        }
    }

    public int addNums(int number1, int number2) {//adds two numbers
        return number1 + number2;//returns the sum of two numbers
    }

    public boolean checkIfStringHasChar(String sentence, String searchStr) {
        return (sentence.contains(searchStr));
    }

    public String getInitial(String name) {
        return (name.substring(0, 1));//returns the first letter of a name
    }

    public String getSubString(String name) {
        return (name.substring(4, 1));//returns a substring
    }

    public boolean compareText(String text1, String text2) {
        return (text1.compareTo(text2)==0);//returns 0 if text is equal
    } 
}