public class main {
    public main() {
        Strategy strat = new CircleStrategy();
        DrawCar drawCar = new DrawCar();

        drawCar.draw(6, strat);
    }
}
