package KingCalculationPoints.AppModels;

public enum Player {
    One,
    Two,
    Tree,
    Four;

    private int id;
    private String name;

//    Player(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
