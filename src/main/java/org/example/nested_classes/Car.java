package org.example.nested_classes;

public class Car {

    String colour;
    static int doorCount;
    Engine engine;

    void method() {
        System.out.println(Engine.countOfEngines);
        Engine engine1 = new Engine(150);
        System.out.println(engine1.horsePower);
    }

    public static class Engine {
        int horsePower;
        static int countOfEngines;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfEngines ++;
            doorCount ++;
        }

        @Override
        public String toString() {
            return "My Engine {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    public Car(String colour, int doorCount, Engine engine) {
        this.colour = colour;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car {" +
                "colour='" + colour + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);

        Car car = new Car("Blue", 4, engine);

        System.out.println(car);
    }

}

