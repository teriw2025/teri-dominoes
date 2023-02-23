public class Domino {
    public int top;
    public int bottom;

    public Domino(){
        top = 0;
        bottom = 0;
    }

    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public String toString(){
        return top + "/" + bottom;
    }

    public void flip(){
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    public void settle(){
        if(top>bottom)
            flip();
    }


    public int small(){
        if (top>bottom)
            return bottom;
        else return top;
    }

    public int big(){
        if (top>bottom)
            return top;
        else return bottom;
    }
    public int compareTo(Domino other){
        System.out.println(small() + " " + other.small());
        System.out.println("This: " + top + " " + bottom);
        System.out.println("Other: " + other.top + " " + other.bottom);
        if (small() < other.small()) return -1;
        else if (small() > other.small()) return 1;
        else{
            System.out.println(big() + " " + other.big());
            if (big() < other.big()) return -1;
            else if (big() > other.big()) return 1;
            else return 0;
        }
    }

    public int compareToWeight(Domino other){
        if (top + bottom < other.top + other.bottom)
            return -1;
        else if (top + bottom > other.top + other.bottom)
            return 1;
        else return 0;
    }

    public boolean canConnect(Domino other){
        if (top == other.top || top == other.bottom || bottom == other.top ||bottom == other.bottom)
            return true;
        else return false;
    }
}
