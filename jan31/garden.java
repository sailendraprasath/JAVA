public class garden {
    int apple_price = 20;
    int apple_count = 5;
    int TotalCost = 0;

    void total_money(){
        for(int i=1; i<=apple_count;i++){
            TotalCost += apple_price;
        }
        System.out.println(TotalCost);
    }

    public static void main(String[] args) {
        garden gar =new garden();
        gar.total_money();
    }
}
