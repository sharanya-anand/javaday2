package assignment2;
        public class m5q8{
    public static void main(String[] args) throws Exception {

        Thread t = new Thread(() -> {
            System.out.println("Running");
        });

        System.out.println("State: " + t.getState()); 
        System.out.println("State after start: " + t.getState());
        t.join();
        System.out.println("State after finish: " + t.getState());
        
    }
}
   
