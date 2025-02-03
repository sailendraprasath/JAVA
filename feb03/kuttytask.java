
interface Playable{
    void play();
}
class Guiter implements Playable{
    public void play(){
        System.out.println("Guiter is playing");
    }
}
class Piano implements Playable{
    public void play(){
        System.out.println("Piano is playing");
    }
}
public class kuttytask {
    public static void main(String[] args) {
        Guiter obj1 = new Guiter();
        obj1.play();

        Piano obj2 = new Piano();
        obj2.play();
    }
}
