public class MyTester {
    public static void main (String[] args) {
        MemorySpace memory = new MemorySpace(100);
        int address = memory.malloc(20);
        System.out.println(address);
        System.out.println(memory.toString());
    }
        /*
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
