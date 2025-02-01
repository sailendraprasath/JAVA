public class info {

    String getName(String name){
        String detail = name;
        detail = "Sailendra prasath";
        return detail;
    }
    long getPhone(long phone){
        return 9952860404L;
    }

    public static void main(String[] args) {
        info in = new info();
        System.out.println(in.getName(""));
        System.out.println(in.getPhone(0));
    }
}
