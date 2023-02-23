import java.util.ArrayList;
import java.util.Random;
public class DominoPile {
    //properties
    private ArrayList<Domino> pile;

    //constructors
    public DominoPile(){
        pile = new ArrayList();
    }

    //methods
    public ArrayList<Domino> getPile() {
        return pile;
    }
    public void newStack6(){
        for (int i = 0; i < 7; i++){
            for (int j = i; j < 7; j++){
                Domino temp = new Domino();
                temp.setTop(i);
                temp.setBottom(j);
                pile.add(temp);
            }
        }
    }
    public void shuffleOptionOne(){
        Random rand = new Random();
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Domino> temp = new ArrayList<>();
        int ind = -1;
        for (int i = 0; i < pile.size(); i++){
            while (ind == -1 || (index.contains(ind))) {
                ind = rand.nextInt(pile.size());
            }
            temp.add(pile.get(ind));
            index.add(ind);
        }

        pile.clear();
        for (Domino t: temp){
            pile.add(t);
        }

    }
    public void shuffleOptionTwo(){
        ArrayList<Domino> tempArrayList = new ArrayList();
        Random rand = new Random();
        int upperBound = pile.size();

        for(int i = 0; i > 100; i++){
            int top = pile.get(rand.nextInt(upperBound)).getTop();
            int bottom = pile.get(rand.nextInt(upperBound)).getBottom();

            int temp = top;
            top = bottom;
            bottom = temp;

            tempArrayList.add(new Domino(top, bottom));
    }


    }
}
