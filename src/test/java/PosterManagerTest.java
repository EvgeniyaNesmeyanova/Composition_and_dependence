import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    PurchaseItem item1 = new PurchaseItem(1, "фильм1");
    PurchaseItem item2 = new PurchaseItem(3, "фильм2");
    PurchaseItem item3 = new PurchaseItem(10, "фильм3");

    PosterManager repo=new PosterManager();
    PosterManager manager=new PosterManager();

    @Test
    public void test() {
        PosterManager repo = new PosterManager();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);

        PurchaseItem[] expected = {item1, item2, item3};
        PurchaseItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }

}
