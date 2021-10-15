import java.util.Scanner;
public class wordWrapProgram {
public static void main(String[] args) {
//Declaration of Data Values
int linebreak;
String inputString;
String outputString;
String fullOutputString = null;
int stringLength;
String endCall;
String blankLine;
//Declaration of User Input Scanner
Scanner scnr = new Scanner(System.in);
//User Input Request
System.out.println("Enter your preferred line width followed by a block of text to run through
WordWrap Program:");
linebreak = scnr.nextInt();
inputString = scnr.nextLine() + " " + scnr.nextLine() + " " + scnr.nextLine() + " "
+ scnr.nextLine() + " " + scnr.nextLine() + " "
+ scnr.nextLine() + " " + scnr.nextLine() + " "
+ scnr.nextLine() + " " + scnr.nextLine() + " "
+ scnr.nextLine() + " " + scnr.nextLine() + " "
+ scnr.nextLine() + " " + scnr.nextLine() + " "
+ scnr.nextLine() + " " + scnr.nextLine() + " " + scnr.nextLine();
//Other data values
endCall = ("" + "Stop. ");
blankLine = ("* ");
//Declaration of String Reader
Scanner read = new Scanner(inputString);
while (read.hasNext()
) {
outputString = read.next() + " ";
fullOutputString += outputString;
stringLength = fullOutputString.length();
if (outputString.length() < linebreak && !
(outputString.equals(blankLine)
)
) {
System.out.print(outputString);
}
//Extra Long Tokens
if (outputString.length() > linebreak && !
(outputString.equals(endCall + "")
)
)
{
System.out.println();
System.out.print(outputString);
}
//Linebreaking
if (stringLength > linebreak && !
(outputString.equals(endCall + "")
)
) {
System.out.println();
fullOutputString = null;
}
//Blanklines
if (outputString.equals(blankLine)
) {
System.out.println();
}
//EndCall
if (outputString.equals(endCall)
) {
System.out.println();
System.out.println(outputString);
break;
}
}
scnr.close();
read.close();
}
}
