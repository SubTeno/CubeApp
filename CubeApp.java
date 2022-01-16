/**
 * Cube
 */
class Cube {
    private int E;
    public Cube(int E){this.E = E;}
    public int volume() {return E*E*E;}
    public int surfacearea() {return 6*E*E;}
    public double diagonal() {return Math.sqrt(3) * E;}

}

public class CubeApp {
    public static void main(String[] args) {
        Cube c = new Cube(1);
        System.out.println("Diagonal : "+c.diagonal());
        System.out.println("Volume : "+c.volume());
        System.out.println("Surface Area : "+c.surfacearea());
    }
}

