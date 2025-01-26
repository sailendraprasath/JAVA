public class nums2 {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1; i<=n; i=i+1){
            for(int j=i; j<=n-1;j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j=j-1){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
