package KingCalculationPoints.DataAccessObject.MapDataBase;

// Игровая сущность. Не относится к таблице аутентификации игрока.
public class PlayerDB {

    private String emailPlayer;
    private String namePlayer;
    private int idPlayer;

    public PlayerDB(String name, int id) {
        this.namePlayer = name;
        this.idPlayer = id;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayerDB(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int getIdPlayerDB() {
        return idPlayer;
    }

    public void setIdPlayerDB(int idPlayer) {
        this.idPlayer = idPlayer;
    }
}
