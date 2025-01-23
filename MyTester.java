public class MyTester {
    public static void main (String[] args) {
        MemorySpace memorySpace = new MemorySpace(100);
        memorySpace.free(0);
    }
        /*
    private boolean freeTest2(){
        MemorySpace memorySpace = new MemorySpace(100);
        String expectedText = "(0 , 100)\n";
        String expected = TesterMessagesEnum.ERROR + " IllegalArgumentException: index must be between 0 and size";
        String actual = "";
        try {
            memorySpace.free(0);
            actual += (memorySpace.toString().equals(expectedText));
        } catch (IllegalArgumentException e) {
            actual = TesterMessagesEnum.ERROR + " IllegalArgumentException: " + e.getMessage();
        } catch (Exception e) {
            actual = TesterMessagesEnum.ERROR + e.getMessage();
        }
        return this.tester.test("Try to free a block of memory when freeList is empty", expected, actual);
    }
        */
}
