public class MyTester {
    public static void main (String[] args) {
        MemorySpace memory = new MemorySpace(100);
        System.out.println(memory.toString());
    }
        /*
    private static void testInitialization() {
        MemorySpace memory = new MemorySpace(100);
        String expected = "(0 , 100)\n";
        assertString(expected, memory.toString(), "Initialization");
    }

    private static void testSimpleAllocation() {
        MemorySpace memory = new MemorySpace(100);
        int address = memory.malloc(20);
        assertEqual(0, address, "Simple allocation address");

        String expected = "(20 , 80)\n(0 , 20)\n";
        assertString(expected, memory.toString(), "Simple allocation state");
    }
        */
}
