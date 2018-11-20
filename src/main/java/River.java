import java.util.ArrayList;

public class River {

    private ArrayList<Salmon> fish;

    public River(){
        this.fish = new ArrayList<>();
    }

    public int countFish(){
        return this.fish.size();
    }

    public void addFish(Salmon salmon) {
        this.fish.add(salmon);
    }

    public Salmon removeFish() {
        return this.fish.remove(0);
        // want a guard 'if' here to cover off possibly empty river
    }
}
