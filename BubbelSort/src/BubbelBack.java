/**Implemented Bubbel sort
 * Find smallest element and bring it first in list
 * Marten Kuusmann
 */
import java.util.Arrays;


public class BubbelBack {
    static int[] numberList = new int[]{30,45,36,62,23,55,35,29,40,78,80,77,75,50};

    static void BubbelSmallestFirst(){
        int element = numberList[numberList.length-1];

        for (int i = numberList.length-1; i > 0 ; i--) {
            if (element < numberList[i-1]){
                numberList[i] = numberList[i-1];
                numberList[i-1] = element;
            }else {
                element = numberList[i-1];
            }

        }//for
    }//BubbelSmallestFirst

    public static void main(String[] args) {

        BubbelSmallestFirst();
        System.out.println(Arrays.toString(numberList));
    }
}
