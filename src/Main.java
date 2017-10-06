import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String myString="";
        int [] nums=new int[10];
        char [] myCharArray = {};// empry array
// ввод без ошибок
        try{
            myString = reader.readLine();
            myCharArray = myString.toCharArray ();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        // конец ввода
        int sum=0;
        for (int i = 0; i<myCharArray.length; i++){
            int numericValue = Character.getNumericValue(myCharArray[i]); // from asci symb to int
            nums[i]=numericValue;

            sum =nums[i]+sum;// просто сумматор входных символов

        }
        System.out.println(sum);

    }
}
