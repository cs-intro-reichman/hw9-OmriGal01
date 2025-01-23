public class MyTester {
    public static void main (String[] args) {
        MemorySpace memorySpace = new MemorySpace(100);
        int address1 = memorySpace.malloc(10);
        int address2 = memorySpace.malloc(10);
        int address3 = memorySpace.malloc(10);
        int address4 = memorySpace.malloc(30);
        int address5 = memorySpace.malloc(50);
        System.out.println(address1 + " " + address2 + " " + address3 + " " + address4 + " " + address5);
        System.out.println(memorySpace.toString() + "!");
    }
        /*
    private boolean mallocTest5() {
        MemorySpace memorySpace = new MemorySpace(100);
        String expectedText = "(60 , 40) \n(0 , 10) (10 , 10) (20 , 10) (30 , 30) ";
        String expected = "true";
        String actual = "";
        try {
            int address1 = memorySpace.malloc(10);
            int address2 = memorySpace.malloc(10);
            int address3 = memorySpace.malloc(10);
            int address4 = memorySpace.malloc(30);
            int address5 = memorySpace.malloc(50);
            actual += (address1 == 0 && address2 == 10 && address3 == 20 && address4 == 30 && address5 == -1 && memorySpace.toString().equals(expectedText));
        } catch (Exception e) {
            actual = TesterMessagesEnum.ERROR + e.getMessage();
        }
        return this.tester.test("Malloc blocks of memory but will fail in last due to lack of space", expected, actual);
    }
    
        private boolean mallocTest3() {
        MemorySpace memorySpace = new MemorySpace(100);
        String expectedText = "\n(0 , 40) (40 , 40) (80 , 20) ";
        String expected = "true";
        String actual = "";
        try {
            int address1 = memorySpace.malloc(40);
            int address2 = memorySpace.malloc(40);
            int address3 = memorySpace.malloc(20);
            actual += (address1 == 0 && address2 == 40 && address3 == 80 && memorySpace.toString().equals(expectedText));
        } catch (Exception e) {
            actual = TesterMessagesEnum.ERROR + e.getMessage();
        }
        return this.tester.test("Malloc 3 blocks of memory to fill all memory space", expected, actual);
    }
    
        private boolean mallocTest1() {
        MemorySpace memorySpace = new MemorySpace(100);
        String expectedText = "(20 , 80) \n(0 , 20) ";
        String expected = "true";
        String actual = "";
        try {
            int address = memorySpace.malloc(20);
            actual += (address == 0 && memorySpace.toString().equals(expectedText));
            
        } catch (Exception e) {
            actual = TesterMessagesEnum.ERROR + e.getMessage();
        }
        return this.tester.test("Malloc a block of memory", expected, actual);
    }
        */
}
