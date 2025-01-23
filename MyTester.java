public class MyTester {
    public static void main (String[] args) {
        MemorySpace memorySpace = new MemorySpace(100);
        int address = memorySpace.malloc(5);
        int address1 = memorySpace.malloc(20);
        int address2 = memorySpace.malloc(20);
        int address3 = memorySpace.malloc(55);
        System.out.println(address + " " + address1 + " " + address2 + " " + address3);
        System.out.println(memorySpace.toString() + "\n");
        System.out.println(address == 0 && address1 == 5 && address2 == 25 && address3 == 45 && memorySpace.toString().equals("\n(0 , 5) (5 , 20) (25 , 20) (45 , 55) "));
        memorySpace.free(address);
        System.out.println(memorySpace.toString() + "\n");
        memorySpace.free(address1);
        System.out.println(memorySpace.toString() + "\n");
        System.out.println(memorySpace.toString().equals("(0 , 5) (5 , 20) \n(25 , 20) (45 , 55) ") + "!!!\n");
        memorySpace.defrag();
        System.out.println(memorySpace.toString() + "\n");
    }
        /*
    private boolean defragTest3(){
        MemorySpace memorySpace = new MemorySpace(100);
        String expected1 = "\n(0 , 5) (5 , 20) (25 , 20) (45 , 55) ";
        String expected2 = "(0 , 5) (5 , 20) \n(25 , 20) (45 , 55) ";
        String expected3 = "(0 , 25) \n(25 , 20) (45 , 55) ";
        String expected = "true";
        String actual = "";
        boolean actualB = true;
        try {
            int address = memorySpace.malloc(5);
            int address1 = memorySpace.malloc(20);
            int address2 = memorySpace.malloc(20);
            int address3 = memorySpace.malloc(55);
            actualB = (actualB && address == 0 && address1 == 5 && address2 == 25 && address3 == 45 && memorySpace.toString().equals(expected1));
            memorySpace.free(address);
            memorySpace.free(address1);
            actualB = (actualB && memorySpace.toString().equals(expected2));
            memorySpace.defrag();
            actual += (actualB && memorySpace.toString().equals(expected3));
        } catch (Exception e) {
            actual = TesterMessagesEnum.ERROR + e.getMessage();
        }
        return this.tester.test("defrag successfully 2 consecutive elements", expected, actual);
    }
        */
}
