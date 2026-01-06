interface Demo {
    void display();
}

public class Test {
    public static void main(String[] args) {
        Demo d = new Demo() {
            public void display() {
                System.out.println("Anonymous class 1");
            }
        };
        d.display();
		 Demo d1 = new Demo() {
            public void display() {
                System.out.println("Anonymous class 2");
            }
        };
        d1.display();
    }
}
