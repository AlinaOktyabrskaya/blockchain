package blockchain;

public class Main {
    public static void main(String[] args) {
          int miners_count = 5;

       for (int i = 1; i <=miners_count;  i ++){
           Thread thread = new Blockchain(i);
           thread.start();
       }

    }
}
