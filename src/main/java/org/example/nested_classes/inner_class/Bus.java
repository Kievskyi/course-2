package org.example.nested_classes.inner_class;

public class Bus {

    String colour;
    int doorCount;
    Bus.Engine engine;


    public class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    public Bus(String colour, int doorCount) {
        this.colour = colour;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);

    }

    public void setEngine(Engine engine) {
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
       Bus bus = new Bus("Red", 100);
       Bus.Engine engine = bus.new Engine(150);
       bus.setEngine(engine);

        System.out.println(bus);
    }
}
