//In java we have two types of type casting
//1. Implicit Type Casting
//2. Explicit Type Casting
//Implicit Type Casting: In this type of casting, the compiler automatically converts the smaller data type into the larger data type.
//Explicit Type Casting: In this type of casting, the user manually converts the larger data type into the smaller data type.
//In this program, we will see the type casting of the data types.
class TypeCasting {
    public static void main(String[] args) {
        //implicit type casting 
        int a = 10;
        double b = a;
        System.out.println("Implicit Type Casting: " + b);
        //explicit type casting
        double c = 10.5;
        int d = (int) c;
        System.out.println("Explicit Type Casting: " + d);
    
    
    //Advance Type Casting
    //In this We can convert Non-Primitive data types to Primitive data types or vice versa.
    //Non-Primitive to Primitive
    String str = "10";
    int num =  Integer.parseInt(str); 
    //Integer.parseInt() method is used to convert the string to int.
    //Integer is a wrapper class that contains the parseInt() method. Which converts the string to int.
    System.out.println("Non-Primitive to Primitive: " + num);

    //Primitive to Non-Primitive
    float f = 10.5f;
    String str1 = String.valueOf(f);
    //String.valueOf() method is used to convert the float to string.
    //String is a class that contains the valueOf() method. Which converts the float to string.
    System.out.println("Primitive to Non-Primitive: " + str1);
     }
}