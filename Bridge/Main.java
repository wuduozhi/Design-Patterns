public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        RandomCountDisplay d4 = new RandomCountDisplay(new FileDisplayImpl("star.txt"));
        IncreaseDisplay d5 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay d6 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
        d4.randomDisplay(10);
        d5.increaseDisplay(4);
        d6.increaseDisplay(6);
    }
}
