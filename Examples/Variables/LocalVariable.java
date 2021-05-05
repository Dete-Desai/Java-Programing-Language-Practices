// package Variables;

public class LocalVariable {

    public String variable = "Original Variable";

    public void method() {

        String variable = "Local Variable";
        System.out.println(variable);
    }

    public static void main(String[] args) {

        LocalVariable obj = new LocalVariable();

        System.out.println("Calling Method");

        obj.method();

        System.out.println(obj.variable);
    }
    
}
