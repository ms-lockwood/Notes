public class Variables {

    public static void main(String[] args) {
        System.out.println("hello world");
        Variables myCode= new Variables();
    }//main method

    //EXAMPLE OF A PUBLIC CLASSWIDE VARIABLE
   public String dinerName= "Rise and Dine";
    public double randomPrice = Math.random()*9;

    public Variables(){
        //this is like the new go method
        System.out.println("hej hej varld");

        //EXAMPLE OF LOCAL VARIABLE IN LOOP
        for(int count = 0; count<4 ; count=count+1){
        System.out.println(count);
        }

        pancake(4);
       // doesn't work:  flavor = "plain";
    }//constructor method

    //EXAMPLE OF VARIABLE IN A METHOD PARAMETER
    public void pancake(int number){
        System.out.println("Welcome to "+ dinerName);

        //EXAMPLE OF A LOCAL VARIABLE IN A METHOD
        String flavor = "chocolate chip";
        String order = "I want " + number + " " + flavor + " pancakes.";
        System.out.println( order );
        //I can update flavor and order here, not in Variables()

        System.out.println("The price of your breakfast is " + randomPrice);
    }

}//end of class

/*Notes on Variables

*variable types:
String - stores text inside of double quotes e.g "Hey, the turtle is purple."
int - stores an integer (whole number) e.g. 7
double - stores a number with decimals e.g. 1.5 or (Math.random()*27)
boolean - stores either true or false

* to use variables we must declare them first
    we've seen examples of this in the header of a for loop, and at the top of B3_HalfTheRed

format for declaring variables:
local variables:
type variableName= value; e.g. in a loop
for(int x = 0; blah ; blah){
//code n stuff
}

OR

type variableName;
then set the value of the variable later in the code.
e.g.in a method

public void drawSquare(int side){
//code n stuff that has access to the variable called side
}

class-wide variables:
we can declare variables at the top of our class with public ahead of it to insure we can access the
variable wherever we need it. DO THIS MOST OF THE TIME! It's easier.

public type variableName = value;
e.g.
public int red

*

ENO OF NOTES



COMMENTED CODE below
 public void madLib(){
        System.out.println("halo varld");
        System.out.println("");
        String classmate= "Sally";
        String city = "Worcester";
        String noun1= "book";
        String pluralNoun1= "shoes";
        double decimalBiggerThan1= 14.6;
        int number1= 54;
        String adjective= "windy";
        int number2= 14;
        int wholeNumberBetween1And4=4;
        String pluralAnimal="Geese";
        String MiltonTeacher="Ms. K";
        String MiltonDean="Mr. Heard";
        boolean trueOrFalse= true;
        String season= "fall";
        char letterGrade= 'B';


        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun1+ " and "
                +pluralNoun1 + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +MiltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +MiltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";

        System.out.println(story);
    }
* */
