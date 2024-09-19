package inheritance;

public class CyclicInheritance {
    public static void main(String[] args) {

    }
}

// This code is for demonstration purposes only. It will result in a compilation error.

class A extends B {  // Class A inherits from Class B
}

class B extends C {  // Class B inherits from Class C
}

class C extends A {  // Class C inherits from Class A (This creates a cycle)
}





