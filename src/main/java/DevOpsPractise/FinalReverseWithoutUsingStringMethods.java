package DevOpsPractise;

public class FinalReverseWithoutUsingStringMethods {

	public static int reverseAString() {
		// TODO Auto-generated method stub
		String str = "My Name is Arup";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();     // used string builder to reverse
       System.out.println(str2);
	return 0;
        }

	

}
