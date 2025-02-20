interface Readable{
    void Read();
}

interface Writeable{
    void Write();
}

interface Storable{
    void Store();
}
class File implements Readable,Writeable,Storable{
    public void Read(){
        System.out.println("Now file get Reading...!!");
    }
    public void Write(){
        System.out.println("Now file get Writeing...!!");
    }
    public void Store(){
        System.out.println("Now file get Stroing....!!");
    }
}


public class KuttyQuestion {
    public static void main(String[] args) {
        File obj1 = new File();
        obj1.Read();
        System.out.println();
        obj1.Write();
        System.out.println();
        obj1.Store();
    }
}
