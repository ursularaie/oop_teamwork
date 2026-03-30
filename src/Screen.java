public class Screen {
    private int x; // screen mõõtmed, kus sees pall liigub
    private int y;

    public Screen(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // siia tuleb meetod, mis joonistab ekraani, kui hakkab tegema graafikat
}
