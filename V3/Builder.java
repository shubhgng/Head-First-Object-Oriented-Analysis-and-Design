package ObjectOrientedDesign.V3;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINS,
    OLSON, RYAN, PRS, ANY;

    public String toString(){
        switch (this){
            case FENDER: return "Fender";
            case MARTIN: return "martin";
            case GIBSON: return "gibson";
            case COLLINS: return "collins";
            case OLSON: return "olson";
            case RYAN: return "ryan";
            case PRS: return "PRS";
            case ANY: return "any";
            default: return "defualt";
        }
    }
}
