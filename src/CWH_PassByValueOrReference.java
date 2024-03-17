public class CWH_PassByValueOrReference {
    static class VariablePassByReference
    {
        int value;
        VariablePassByReference(int value){
            this.value = value;
        }
    }

    static void changeVariablePassByReference(VariablePassByReference obj)
    {
        obj.value = 45;
    }

    static void changeVariable(int x){
        x = 10;
    }
    static void changeArray(int [] arr) {
        arr[2] = 98;
    }

    public static void main(String[] args) {
        // in case of variables... by default, passed by value
        int x = 100;
        changeVariable(x);
        System.out.println(x);

        // in case of variables...if passed by reference.
        VariablePassByReference obj = new VariablePassByReference(100);
        changeVariablePassByReference(obj);
        System.out.println(obj.value);

        // in case of arrays...by default, passed by reference
        int [] arr = {10, 20 ,30 ,40 ,50};
        changeArray(arr);
        for(int it : arr)
            System.out.print(it + " ");
        System.out.println();
    }
}
