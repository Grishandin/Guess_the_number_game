package Grishandin;

public class Main {

    public static void main(String[] args) {
        do {
            GameBody.gameBody();
        } while (GameBody.scannerCon.nextInt()==1);
    }

}
