private int breadth;
    // Constructor with default parameters
    public Rectangle() {
        this.length = 45;
        this.breadth = 5;
    }
    // Constructor with custom parameters
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // Getter methods
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
    // Main method to test the Rectangle class
    public static void main(String[] args) {
        Rectangle defaultRect = new Rectangle();
        Rectangle customRect = new Rectangle(10, 20);
        System.out.println("Default Rectangle - Length: " + defaultRect.getLength() + ", Breadth: " + defaultRect.getBreadth());
        System.out.println("Custom Rectangle - Length: " + customRect.getLength() + ", Breadth: " + customRect.getBreadth());
    }
}
