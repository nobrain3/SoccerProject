package kr.co.kjworld.cardviewlist;

public class CardViewListItem {
    int itemImage;
    String itemTitle;

    CardViewListItem (int a_itemImage, String a_imageTitle) {
        itemImage = a_itemImage;
        itemTitle = a_imageTitle;
    }

    int getItemImage() {
        return itemImage;
    }

    String getItemTitle() {
        return itemTitle;
    }
}
