package Model;


public class Arc {

    private Airport from;
    private Airport to;
    private double weight;

    public Arc (Airport from, Airport to, double weight){
        if(from == null || to == null) throw  new IllegalArgumentException("Null airport.");
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public Arc (Airport from, Airport to){
        this(from, to, 0.0);
    }

    public Airport getFrom() {
        return this.from;
    }

    public Airport getTo() {
        return this.to;
    }

    public double getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return  false;
        if(obj == this) return  true;
        if(this.from.equals(((Arc)obj).getFrom())){
            if(this.from.equals(((Arc)obj).getFrom())){
                return (this.weight == ((Arc)obj).getWeight());
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "| From:"+ from + " - To:"+ to + " - Weight:" + weight +" |.";
    }

}
