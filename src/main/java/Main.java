import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CarDealerAssistent cda = new CarDealerAssistent("D:/Dealer.txt");
        cda.start();
    }
}

