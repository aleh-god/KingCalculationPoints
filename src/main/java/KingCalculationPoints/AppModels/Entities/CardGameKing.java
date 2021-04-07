package KingCalculationPoints.AppModels.Entities;

public class CardGameKing {

//    private int idPartyGameKing;

    private int idCardGameKing;
    private int idPlayer;
    private int idTypeCardGameKing;

    public CardGameKing(int idPlayer, int idTypeCardGameKing) {
        this.idCardGameKing = idCardGameKing;
        this.idPlayer = idPlayer;
        this.idTypeCardGameKing = idTypeCardGameKing;
    }

    public int getIdCardGameKing() {
        return idCardGameKing;
    }

    public void setIdCardGameKing(int idCardGameKing) {
        this.idCardGameKing = idCardGameKing;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public int getIdTypeCardGameKing() {
        return idTypeCardGameKing;
    }

    public void setIdTypeCardGameKing(int idTypeCardGameKing) {
        this.idTypeCardGameKing = idTypeCardGameKing;
    }
}
