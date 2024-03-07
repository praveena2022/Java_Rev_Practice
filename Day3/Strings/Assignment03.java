/* 3. Write a program to find the number of vowels, consonents, digits and white space characters in a string. */

public class Assignment03{
    public static void main(String[] args) {


String str="I love India 100 times";
String vowels="aeiou";

String checkStr=str.toLowerCase();

int vowelsCount=0,digitCount=0,whiteSpaceCount=0,consonantsCount=0;

for(int i=0;i<str.length();i++){

char ch=checkStr.charAt(i);
if(ch>='a' && ch<='z')
{
if(vowels.indexOf(ch)!=-1)
 vowelsCount++;
else
consonantsCount++;
}
else if(ch>='0' && ch<='9')
digitCount++;
else if(ch==' ')
whiteSpaceCount++;

}

System.out.println("Number Of Vowels "+vowelsCount);
System.out.println("Number Of Consonants "+consonantsCount);
System.out.println("Number Of Digits "+digitCount);
System.out.println("Number Of White Spaces "+whiteSpaceCount);



}
}
