package Model;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private Location location;
    private String name;
    private List<Arc> neighbours;
    private boolean visited;
    private int tag;

    public Airport(Location location, String name) {
        this.location = location;
        this.name = name;
        this.neighbours = new ArrayList<>();
        this.visited = false;
        this.tag = 0;
    }

}
