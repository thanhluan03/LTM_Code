public class Thread_Test {
    public static void main(String[] args) {
        Thread_InDaySo  inDaySoA = new Thread_InDaySo("A");
        Thread_InDaySo inDaySoB = new Thread_InDaySo("B");

        inDaySoA.start();
        inDaySoB.start();

        // A va B doc lap, co quyen chay xong xong
    }
}
