package ObjectOrientedDesign.V3;

public enum Type {
    ACOUSTIC, ELECTRIC;

    public String toString(){
        switch (this){
            case ACOUSTIC: return "acoustic";
            case ELECTRIC: return "electric";
            default: return "defualt";
        }
    }
}
