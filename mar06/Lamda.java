// <<..................inside the obj.....................>>

interface A {
    void display();    
}
public class Lamda {
    public static void main(String[] args) {
        A obj = ()->
            {
                System.out.println("This is Display");
            };
            obj.display();
        }
    };

// <<......................basic method.............................>>

// interface A {
//     void display();    
// }
// public class Lamda {
//     public static void main(String[] args) {
//         A obj = new A(){
//             public void display(){
//                 System.out.println();
//             }
//         };
//         obj.display();
//     }
// };