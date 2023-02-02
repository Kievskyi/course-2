package org.example.nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }

}

class Math {
    private int a;

    public void getResult() {
        int delimoe = 21;

        class Delenie {
            private int delitel;

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                return delimoe%delitel;
            }
        }

        Delenie delenie = new Delenie();

        delenie.setDelitel(4);

    }
}
