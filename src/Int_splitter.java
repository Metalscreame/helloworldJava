/**
 * Created by Tom on 27.06.2017.
 */
public class Int_splitter {
    public static void main(String[] args){
        int number=546; // = some int
        int [] array = new int[10];
        int i =0;
        while (number > 0) {

            array[i]=number % 10;
            number = number / 10;
            i++;
        }
        int sum=0;
        for (int j = 0;j<array.length;j++){
            sum=array[j]+sum;
        }
        System.out.println(sum);
    }
}
