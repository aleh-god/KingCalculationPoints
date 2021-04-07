package KingCalculationPoints.AppModels.Entities;

public class TableTricksGameKing {

//    private int idPartyGameKing;

    private int idCardGameKing;
    private int playerOneTricksCounter, playerTwoTricksCounter, playerThreeTricksCounter, playerFourTricksCounter;

    public TableTricksGameKing(int playerOneTricksCounter, int playerTwoTricksCounter, int playerThreeTricksCounter, int playerFourTricksCounter) {
        this.playerOneTricksCounter = playerOneTricksCounter;
        this.playerTwoTricksCounter = playerTwoTricksCounter;
        this.playerThreeTricksCounter = playerThreeTricksCounter;
        this.playerFourTricksCounter = playerFourTricksCounter;
    }

    public int getIdCardGameKing() {
        return idCardGameKing;
    }

    public void setIdCardGameKing(int idCardGameKing) {
        this.idCardGameKing = idCardGameKing;
    }

    public int getPlayerOneTricksCounter() {
        return playerOneTricksCounter;
    }

    public void setPlayerOneTricksCounter(int playerOneTricksCounter) {
        this.playerOneTricksCounter = playerOneTricksCounter;
    }

    public int getPlayerTwoTricksCounter() {
        return playerTwoTricksCounter;
    }

    public void setPlayerTwoTricksCounter(int playerTwoTricksCounter) {
        this.playerTwoTricksCounter = playerTwoTricksCounter;
    }

    public int getPlayerThreeTricksCounter() {
        return playerThreeTricksCounter;
    }

    public void setPlayerThreeTricksCounter(int playerThreeTricksCounter) {
        this.playerThreeTricksCounter = playerThreeTricksCounter;
    }

    public int getPlayerFourTricksCounter() {
        return playerFourTricksCounter;
    }

    public void setPlayerFourTricksCounter(int playerFourTricksCounter) {
        this.playerFourTricksCounter = playerFourTricksCounter;
    }
}
