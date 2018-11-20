import java.util.ArrayList;

public class Bear {
    private String name;
    private ArrayList<Salmon> belly;

    public Bear(String name){
        this.name = name;
        this.belly = new ArrayList<>();
    }

////////////////////////////////////////////////////
    public int foodCount() {
        return this.belly.size();
    }

    public void eat(Salmon salmon) {
        this.belly.add(salmon);
    }

    public void poop() {
        this.belly.clear();
    }

    public void takeFishFromRiver(River river) {
        // this can go in the brackets, but more readable this way
        Salmon fish = river.removeFish();
        this.eat(fish);
    }
}