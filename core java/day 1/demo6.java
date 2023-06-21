class A {
    A () {
        System.out.println("Class A");
    }

    void abc() {


        int a = 10, b = 30, c = 50, res;

        if(a > b && a > c) res = a;
        else if(b > a && b > c ) res = b;
        else res = c;

 
        System.out.println(res);
    }
}

class demo6 {
    public static void main(String[] args) {
        A a = new A();
        a.abc();
    }
}

//constructor         method
//A(){}			same + other name also

//no return type 		must have retrun type

//always try create once	utilize with multiple time

//internally it allocate the memory 	but no memory it just uttilize same memory

//as soon as object create cons will call: we have to cal