/*IS a Realtion of Classes Means Inheritance */

// class Engine {
//     String str = "I am Engine";

//     void print() {
//         System.out.println(str);
//     }
// }

// class Car extends Engine {
//     void print() {
//         System.out.println("I am Car" + str);
//     }
// }

/*Has a relationship  */
class Engine {
    String str = "I am Engine";

    void print() {
        System.out.println(str);
    }
}

class Car {
    Engine eng;

    Car(Engine eng) {
        this.eng = eng;
    }

    void print() {
        System.out.println("I am Car" + eng.str);
    }
}

public class Relation {
    public static void main(String[] args) throws Exception {
        Engine eng = new Engine();
        Car car = new Car(eng);
        car.print();
    }
}
