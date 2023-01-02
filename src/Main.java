public class Main {
    public static void main(String[] args) {

        Employee e1=new Employee(101,"Sumit",28) ;
        Employee e2= new Employee(101,"Sumit",28);

        //shallow comparing
        System.out.println(e1==e2); // false as object are created with new object
        System.out.println(e1.equals(e2)); // false as It is using equals() from Object class.
        Employee e3=e2;
        System.out.println(e3==e2); // true because e3 and e2 is pointing to same ref.

        // Deep Comparing

        // After overriding equals method in the Employee class
        System.out.println(e1.equals(e2)); // we will get true because of deep comparing.

        System.out.println("Hello world!");
    }
}