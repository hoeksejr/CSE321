public class Hello {

    public String greet() {
        return "Hello";
    }

    public static void main(String[] args) {
        Hello h = new Hello();
        System.out.println(h.greet());
    }
}
