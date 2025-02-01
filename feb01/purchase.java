public class purchase {
 
    public static void main(String[] args) {
        purchase purc = new purchase();
        int reminder = purc.getChocolate(20);
        System.out.println(reminder);
    }
     
    int getChocolate(int amt){
        int orginalaAmt = amt;
        int choco_price = 18;

        int rem = orginalaAmt-choco_price;

        return rem;
    }
}
