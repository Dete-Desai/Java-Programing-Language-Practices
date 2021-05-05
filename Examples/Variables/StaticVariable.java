// package Variables;

public class StaticVariable {
    public static String variable = "Original Variable";

    public static void main(String[] args) {

        StaticVariable obj = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();

        System.out.println(obj.variable);
        System.out.println(obj2.variable);
        System.out.println(obj3.variable);

        obj3.variable = "Changed Variable";

        System.out.println(obj.variable);
        System.out.println(obj2.variable);
        System.out.println(obj3.variable);
    }
    
}
