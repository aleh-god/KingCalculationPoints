package KingCalculationPoints.DataAccessObject;

import KingCalculationPoints.AppModels.BattleGameKing;
import KingCalculationPoints.AppModels.CardGameKing;
import KingCalculationPoints.AppModels.GameName;

import java.util.HashMap;
import java.util.List;

public class KingCalculationDataBase {

    public KingCalculationDataBase() {
        System.out.println("Install DB");
    }

    private int idPlayer;
    private HashMap<Integer, PlayerDB> playersDB = new HashMap<>();
    {
        playersDB.put(1, new PlayerDB("Alexander","Xan@gmail.com"));
        playersDB.put(2, new PlayerDB("Natasha","Natasha@yandex.ru"));
        playersDB.put(3, new PlayerDB("Matvey","Matvey@gmail.com"));
        playersDB.put(4, new PlayerDB("Bogdan","Bogdan@yandex.ru"));
        playersDB.put(5, new PlayerDB("Ivan","Ivan@gmail.com"));
    }

    private int idtypeGame;
    private HashMap<Integer, String> typeGameDB = new HashMap<>();
    {
        typeGameDB.put(1, "takeTricks");
        typeGameDB.put(2, "takeBoys");
        typeGameDB.put(3, "takeGirls");
        typeGameDB.put(4, "takeHearts");
        typeGameDB.put(5, "takeKing");
        typeGameDB.put(6, "takeLastTwo");
        typeGameDB.put(7, "takeBFG");
        typeGameDB.put(8, "doNotTakeTricks");
        typeGameDB.put(9, "doNotTakeBoys");
        typeGameDB.put(10, "doNotTakeGirls");
        typeGameDB.put(11, "doNotTakeHearts");
        typeGameDB.put(12, "doNotTakeKing");
        typeGameDB.put(13, "doNotTakeLastTwo");
        typeGameDB.put(14, "doNotTakeBFG");
    }

    private int idBattleGameKing;
    private HashMap<Integer, CardGameKing> gameKingDB = new HashMap<>();
    {
        gameKingDB.put(1, new CardGameKing(1,1, 1, 8));
        gameKingDB.put(2, new CardGameKing(1,2, 1, 4));
        gameKingDB.put(3, new CardGameKing(1,3, 1, 4));
        gameKingDB.put(4, new CardGameKing(1,4, 1, 8));
        gameKingDB.put(5, new CardGameKing(1,5, 1, 1));
        gameKingDB.put(6, new CardGameKing(1,6, 1, 2));
        gameKingDB.put(7, new CardGameKing(1,7, 1, -1));
        gameKingDB.put(8, new CardGameKing(1,8, 1, 8));
        gameKingDB.put(9, new CardGameKing(1,9, 1, 4));
        gameKingDB.put(10, new CardGameKing(1,10, 1, 4));
        gameKingDB.put(11, new CardGameKing(1,11, 1, 8));
        gameKingDB.put(12, new CardGameKing(1,12, 1, 1));
        gameKingDB.put(13, new CardGameKing(1,13, 1, 2));
        gameKingDB.put(14, new CardGameKing(1,14, 1, -1));
        gameKingDB.put(15, new CardGameKing(1,1, 2, 8));
        gameKingDB.put(16, new CardGameKing(1,2, 2, 4));
        gameKingDB.put(17, new CardGameKing(1,3, 2, 4));
        gameKingDB.put(18, new CardGameKing(1,4, 2, 8));
        gameKingDB.put(19, new CardGameKing(1,5, 2, 1));
        gameKingDB.put(20, new CardGameKing(1,6, 2, 2));
        gameKingDB.put(21, new CardGameKing(1,7, 2, -1));
        gameKingDB.put(22, new CardGameKing(1,8, 2, 8));
        gameKingDB.put(23, new CardGameKing(1,9, 2, 4));
        gameKingDB.put(24, new CardGameKing(1,10, 2, 4));
        gameKingDB.put(25, new CardGameKing(1,11, 2, 8));
        gameKingDB.put(26, new CardGameKing(1,12, 2, 1));
        gameKingDB.put(27, new CardGameKing(1,13, 2, 2));
        gameKingDB.put(28, new CardGameKing(1,14, 2, -1));
        gameKingDB.put(29, new CardGameKing(1,1, 3, 8));
        gameKingDB.put(30, new CardGameKing(1,2, 3, 4));
        gameKingDB.put(31, new CardGameKing(1,3, 3, 4));
        gameKingDB.put(32, new CardGameKing(1,4, 3, 8));
        gameKingDB.put(33, new CardGameKing(1,5, 3, 8));
        gameKingDB.put(34, new CardGameKing(1,6, 3, 1));
        gameKingDB.put(35, new CardGameKing(1,7, 3, 2));
        gameKingDB.put(56, new CardGameKing(1,8, 3, -1));
        gameKingDB.put(37, new CardGameKing(1,9, 3, 8));
        gameKingDB.put(38, new CardGameKing(1,10, 3, 4));
        gameKingDB.put(39, new CardGameKing(1,11, 3, 4));
        gameKingDB.put(40, new CardGameKing(1,12, 3, 8));
        gameKingDB.put(41, new CardGameKing(1,13, 3, 8));
        gameKingDB.put(42, new CardGameKing(1,14, 3, -1));
        gameKingDB.put(43, new CardGameKing(1,1, 4, 8));
        gameKingDB.put(44, new CardGameKing(1,2, 4, 8));
        gameKingDB.put(45, new CardGameKing(1,3, 4, 8));
        gameKingDB.put(46, new CardGameKing(1,4, 4, 8));
        gameKingDB.put(47, new CardGameKing(1,5, 4, 8));
        gameKingDB.put(48, new CardGameKing(1,6, 4, 8));
        gameKingDB.put(49, new CardGameKing(1,7, 4, 8));
        gameKingDB.put(57, new CardGameKing(1,8, 4, 8));
        gameKingDB.put(50, new CardGameKing(1,9, 4, 8));
        gameKingDB.put(51, new CardGameKing(1,10, 4, 8));
        gameKingDB.put(52, new CardGameKing(1,11, 4, 8));
        gameKingDB.put(53, new CardGameKing(1,12, 4, 8));
        gameKingDB.put(54, new CardGameKing(1,13, 4, 8));
        gameKingDB.put(55, new CardGameKing(1,14, 4, -1));
    }

    public HashMap<Integer, PlayerDB> getPlayersDB() {
        return playersDB;
    }

    public HashMap<Integer, String> getTypeGameDB() {
        return typeGameDB;
    }

    public HashMap<Integer, CardGameKing> getGameKingDB() {
        return gameKingDB;
    }
}
