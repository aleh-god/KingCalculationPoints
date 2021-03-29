package KingCalculationPoints.DataAccessObject;

import KingCalculationPoints.AppModels.CardGameKing;
import KingCalculationPoints.AppModels.Player;

import java.util.HashMap;
import java.util.Map;

public class KingCalculationDataAccessObject {

    private KingCalculationDataBase kingCalculationDataBase = new KingCalculationDataBase();
    private HashMap<Integer, PlayerDB> playersDB = kingCalculationDataBase.getPlayersDB();
    private HashMap<Integer, String> typeGameDB = kingCalculationDataBase.getTypeGameDB();
    private HashMap<Integer, CardGameKing> gameKingDB = kingCalculationDataBase.getGameKingDB();

    public KingCalculationDataAccessObject() {
        System.out.println("Install DAO");
    }

    public void chekSumTypeCardGameKingInDataBase(int keyIdBattleGame, int keyIdTypeCardGame) {
        int checkSunInCardGame = -1;
        System.out.println("Start chekSumTypeCardGameKingInDataBase");

        for (Map.Entry<Integer, CardGameKing> entry : gameKingDB.entrySet()) {
            // && - отличается от & - тем, что не проверяет два условия одновременно, а начинает с левого - ускоряет работу с данными
            if (entry.getValue().getIdBattleGameKing() == keyIdBattleGame && entry.getValue().getIdTypeCardGameKing() == keyIdTypeCardGame) {
                System.out.println(
                        "Gamer id: "
                                + entry.getValue().getIdPlayer()
                                + " take "
                        + entry.getValue().getCountBribes()
                        + " bribes"
                );
            }
        }

    }
}
