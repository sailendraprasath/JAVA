

interface printable{
    void display();
}

interface showable{
    void display();
}

class Document implements printable,showable{
    public void display(){
        System.out.println("list of Data");
    }
}

public class multilevel2 {
    public static void main(String[] args) {
        Document obj1 = new Document();
        obj1.display();
    }
}
