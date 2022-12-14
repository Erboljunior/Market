import java.math.BigDecimal;

public enum Goods {
BANANA(BigDecimal.valueOf(25)),APPLE(BigDecimal.valueOf(4)),MANGO(BigDecimal.valueOf(49)),
    WATERMELON(BigDecimal.valueOf(120)),LEMON(BigDecimal.valueOf(29)),KIWI(BigDecimal.valueOf(34)),
    LIME(BigDecimal.valueOf(37)),GRAPE(BigDecimal.valueOf(115));
    private BigDecimal price;

    Goods(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
