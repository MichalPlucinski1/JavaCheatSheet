package OOP.InnerClass;

class OuterClass {
    int x = 10;


    class InnerClass {
        int y = 5;
        private int z = 15;

        public int getZ() {
            return z;
        }
    }



    static class StaticInnerClass{
        int a = 10; // can be created without Innerclass object

    }
}

