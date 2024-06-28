public class WrapperExample 
{
    public static void main(String[] args) {
        // Autoboxing: Automatically converting a primitive type to a wrapper object
        int primitiveInt = 5;
        Integer wrappedInt = primitiveInt; // Autoboxing
        System.out.println("Autoboxing: Primitive int " + primitiveInt + " to Integer " + wrappedInt);

        // Autounboxing: Automatically converting a wrapper object to a primitive type
        Integer anotherWrappedInt = 10;
        int anotherPrimitiveInt = anotherWrappedInt; // Autounboxing
        System.out.println("Autounboxing: Integer " + anotherWrappedInt + " to primitive int " + anotherPrimitiveInt);

        // Using wrapper classes in collections
        java.util.ArrayList<Integer> integerList = new java.util.ArrayList<>();
        integerList.add(20); // Autoboxing
        integerList.add(30); // Autoboxing

        System.out.println("Values in integerList: ");
        for (Integer num : integerList) {
            System.out.println(num); // Autounboxing when retrieved from the list
        }

        // Autoboxing and autounboxing in expressions
        Integer a = 50, b = 100;
        int sum = a + b; // Autounboxing both a and b, then autoboxing the result back to Integer
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
    }
}
