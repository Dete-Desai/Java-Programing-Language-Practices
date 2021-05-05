// package Variables;

public class InstanceVariable {
    
    String variable = "Original variable";
    
    public static void main(String[] args) {

        InstanceVariable obj = new InstanceVariable();
        InstanceVariable obj2 = new InstanceVariable();
        InstanceVariable obj3 = new InstanceVariable();

        System.out.println(obj.variable);
        System.out.println(obj2.variable);
        System.out.println(obj3.variable);

        obj2.variable = "Changed Variable";

        System.out.println(obj.variable);
        System.out.println(obj2.variable);
        System.out.println(obj3.variable);
    }
}
