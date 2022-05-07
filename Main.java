
import com.sun.javaws.exceptions.InvalidArgumentException;

public class Main {

    public static void main(String[] args) throws CryptographicException, InvalidArgumentException {
        Network n = new Network();

        n.populate(100);
        n.interweave();
        n.generateRandomTransactions(50);
    }
}
