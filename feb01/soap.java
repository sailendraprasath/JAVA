public class soap{

    void getsoap(int money){
        System.out.println(money);
        System.out.println("soap purchased");
    }
    void getChocolate(int amt){
        System.out.println(amt);
        System.out.println("Chocolate purchased");
    }
    void getPowder(int cost){
        System.out.println(cost);
        System.out.println("Powder purchased");
    }
    public static void main(String[] args) {
        soap S = new soap();
        S.getsoap(20);

        soap choco = new soap();
        choco.getChocolate(50);

        soap pow = new soap();
        pow.getPowder(35);
    }
}