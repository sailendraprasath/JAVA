public class nums3 {
    public static void main(String[] args) {
        int[] array = {20, -10, 15, 0, -85};

        int positiveCount = 0;
        int negaitiveCount = 0;
        int zeroCount = 0;

        for(int num:array){
            if (num > 0) {
                positiveCount++;
            }
            else if(num < 0){
                negaitiveCount++;
            }
            else{
                zeroCount++;
            }
        }

        System.out.println("number of positive count is: "+positiveCount);
        System.out.println("number of negative count is: "+negaitiveCount);
        System.out.println("number of zeros count is: "+zeroCount);
    }
}
