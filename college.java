public class college {

    void display() {
        System.out.println("Welcome to the Java");
    }

    void show() {
        this.display();   
    }

    public static void main(String[] args) {
        college c = new college(); 
        c.show();
    }
}