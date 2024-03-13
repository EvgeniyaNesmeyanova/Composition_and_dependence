public class PosterManager {
    private PurchaseItem[] items = new PurchaseItem[0];

    //добавление элементов
    public void save(PurchaseItem item) {
        PurchaseItem[] tmp = new PurchaseItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;

    }

    //считывание элементов массива
    public PurchaseItem[] getItems() {
        return items;
    }



}

