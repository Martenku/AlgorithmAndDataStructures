/**Implemented Double Binary Search algorithm
 * Marten Kuusmann
 */
public class doubleBinSearch {
    private static int[] numberList = new int[]{11,13,16,20,25,29,32,34,35,37,40,44,49,53,56,58,59,61,64,68};
    private static int searchable = 44;

    /**Implemented Binary search algorithm
     *
     * @param beginIndex First element index in the range.
     * @param lastIndex Last element index int the range.
     * @return element index where it could be.
     */
     private static int binSearch(int beginIndex, int lastIndex){
        int elemetsCount = lastIndex - beginIndex;
        int middleIndex = elemetsCount/2 + beginIndex;
        while (beginIndex < lastIndex ) {
            if (numberList[middleIndex] == searchable){
                return middleIndex;

            } else if (numberList[middleIndex] > searchable){
                return binSearch(beginIndex, middleIndex);

            }else {
                return binSearch(middleIndex+1, lastIndex);
            }

        }
        return middleIndex;
    }

    private static int doubleBinSearchAlgo() {
        int lastIndex = 0;
        int index = 0;
        int vahemik = 0;
        while (index < numberList.length) {
            if (numberList[index] == searchable) {
                return index;
            } else if (numberList[index] > searchable) {
                return binSearch(vahemik-1, index-1);
            }

            if (index == 0){
                vahemik = 1;
            }
            vahemik = vahemik * 2;
            index = vahemik + index;
        }//while

        return binSearch(vahemik-1, numberList.length);
    }//doubleBinSearchAlgo

    public static void main(String[] args) {
        System.out.println(doubleBinSearchAlgo());
    }
}
