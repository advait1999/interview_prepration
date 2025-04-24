package stringMethods;

import java.util.Arrays;

//Some important String method and there use
public class StringAllImportantMethods {

    public static void main(String[] args) {

        String str1="Hello";


        //1. length() :- return the length of the string
        int length = str1.length();
        System.out.println("1.length of string= "+length);

        //2.charAt(int index) :- return the character at specified index
         char characterAt= str1.charAt(2);
        System.out.println("2.character ate particulate index number:-"+characterAt);

        //3.subString(int index) or subString(int beginIndex, int endIndex) :- give substring with index position
        String substring1 = str1.substring(1);
        System.out.println("3.1 String from Index position :-"+substring1);
        String substring2 = str1.substring(1, 3);
        System.out.println("3.2 string position start and end with index position:- "+substring2);

        //4.equals() :- compare with other string
        String str2="Hello";
        boolean isEquals = str2.equals(str1);
        System.out.println("4. Compare string equality :-"+isEquals);

        //5.equalsIgnoreCase() :- compare and ignore case
        String str3="hello";
        boolean ignoreCase = str3.equalsIgnoreCase(str1);
        System.out.println("5. ignore the case sensitivity :-"+ignoreCase);

        //6.toLowerCase():- convert into lower case
        String lowerCase = str1.toLowerCase();
        System.out.println("6. convert into lower case:- "+lowerCase);

        //7.toUpperCase():- convert into upper case
        String upperCase = str1.toUpperCase();
        System.out.println("7. convert into UPPER case:- "+upperCase);

        //8. trim() :- remove whitespace from starting and end point
        String str4=" hello ";
        String trimmed = str4.trim();
        System.out.println("8. trimmed string:- "+trimmed);

        //9. startWith(String prefix) :- test string start with specific prefix
        String str5="hello world";
        boolean startsWith = str5.startsWith("hello");
        System.out.println("9. find string start with prefix:- "+startsWith);

        //10. endWith(String prefix) :- test string with specific suffix
        boolean endWith=str5.endsWith("world");
        System.out.println("10. String end with specific suffix:- "+endWith);

        //11. contains(CherSequence s):- return true if it contains specific sequence of character
        boolean contains = str5.contains("world");
        System.out.println("11. string contain specific sequence of character:- "+ contains);

        //12. indexOf(String str):- returns the index of the first occurrence of the specified subString
        int indexOf = str5.indexOf("world");
        System.out.println("12. Return index position where subString is started :-"+indexOf);

        //13.lastIndexOf(String str) :- return the last index of specific substring
        String str6="hello world hello";
        int lastIndex=str6.lastIndexOf("hello");
        System.out.println("13. last index of given string or substring:- "+lastIndex);

        //14. replace(CharSequence target,CharSequence replacement):- return new string by replacing all target
        String rep=str6.replace("hello","waoo..");
        System.out.println("14. Return String after replace by targeted string:- "+rep);

        //15. replaceAll(String regex,String replacement):- Replace all substring that match the given regular expression with the replacement
        String repl="hello 123 world 45";
        String replaced = repl.replaceAll("\\d+", "NUM");
        System.out.println("15. return all regular expression:- "+replaced);

        //16.split(String regex):- splits this String around matches of the given regular expression
        String spl="hello , world";
        String[] st=spl.split(",");
        System.out.println("16. split string:- "+ Arrays.toString(st));

        //17. toCharArray():- convert this string to new character array
        char[] c= str1.toCharArray();
        System.out.println("17. string into character array :- "+Arrays.toString(c));

        //18. valueOf();- static method to convert a primitive data type to its string representation
        int num=254;
        String value = String.valueOf(num);
        System.out.println("18.primitive data type to string representation:- "+value);
        System.out.println("character present at index position 1 :- "+value.charAt(1));

        //19.concat(String str):- Append the specific string to the end of the string
        String str7="hello";
        String str8=" world";
        String concated = str7.concat(str8);
        System.out.println("19. concat to string into one string :- "+concated);

        //20.isEmpty():- check if the string is empty or only containing white space
        String str9="";
        boolean empty = str9.isEmpty();
        System.out.println("20. checking empty or not :- "+empty);


    }
}
