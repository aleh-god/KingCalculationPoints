package KingCalculationPoints.AppModels;

public class CardGameKing {

    private int idCardGameKing;
    private int idBattleGameKing;
    private int idTypeCardGameKing;
    private int idPlayer;

    private GameName typeCardGameKing;

    private Player player;
    private int countBribes;

    public CardGameKing(int idBattleGameKing, int idTypeCardGameKing, int idPlayer, int countBribes) {
        this.idBattleGameKing = idBattleGameKing;
        this.idTypeCardGameKing = idTypeCardGameKing;
        this.idPlayer = idPlayer;
        this.countBribes = countBribes;
    }

    public int getIdCardGameKing() {
        return idCardGameKing;
    }

    public void setIdCardGameKing(int idCardGameKing) {
        this.idCardGameKing = idCardGameKing;
    }

    public int getIdBattleGameKing() {
        return idBattleGameKing;
    }

    public void setIdBattleGameKing(int idBattleGameKing) {
        this.idBattleGameKing = idBattleGameKing;
    }

    public int getIdTypeCardGameKing() {
        return idTypeCardGameKing;
    }

    public void setIdTypeCardGameKing(int idTypeCardGameKing) {
        this.idTypeCardGameKing = idTypeCardGameKing;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public GameName getTypeCardGameKing() {
        return typeCardGameKing;
    }

    public void setTypeCardGameKing(GameName typeCardGameKing) {
        this.typeCardGameKing = typeCardGameKing;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getCountBribes() {
        return countBribes;
    }

    public void setCountBribes(int countBribes) {
        this.countBribes = countBribes;
    }
}
