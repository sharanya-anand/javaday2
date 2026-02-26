package assignment1;
   class BC {
    void draw() {
        System.out.println("writing bc");
    }
}

class AB extends BC {
    void draw() {
        System.out.println("writing ab");
    }
}

class m3q3 extends BC {
    void draw() {
        System.out.println("main");
    }

    public static void main(String[] args) {
        BC s;

        s = new AB();
        s.draw();

        s = new m3q3();
        s.draw();
    }
}
    