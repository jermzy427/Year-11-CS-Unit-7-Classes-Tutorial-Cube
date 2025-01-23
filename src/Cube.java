public class Cube {
    private int side;

    public Cube(){
        this.side = 1;
    }
    public Cube(int i) {
        if(i<1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else{
            side = i;
        }
    }
    public int getSide(){
        return this.side;
    }
    public void setSide(int side)throws IllegalArgumentException{

        if(side<1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else{
            this.side = side;
        }
    }

    public int calculateSurfaceArea(){
        int surfaceArea;
        surfaceArea = 6 * this.side * this.side;
        return surfaceArea;
    }
    public int calculateVolume(){
        int volume;
        volume = side*side*side;

        return volume;
    }
    public String toString(){
        return ("Side: " + side + "\nSurface Area: " + calculateSurfaceArea() + "\nVolume: "+ calculateVolume());
    }

    public static void main() {
    }

}



