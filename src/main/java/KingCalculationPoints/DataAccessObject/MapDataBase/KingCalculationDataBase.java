package KingCalculationPoints.DataAccessObject.MapDataBase;

import KingCalculationPoints.AppModels.Entities.CardGameKing;
import KingCalculationPoints.AppModels.Entities.PartyGameKing;
import KingCalculationPoints.AppModels.Entities.TableTricksGameKing;

import java.util.HashMap;

public class KingCalculationDataBase {

    public KingCalculationDataBase() {
        System.out.println("Install DB");
    }

    private String email;
    private HashMap<String, PlayerDB> playersDB = new HashMap<>();
    {
        playersDB.put("Xan@gmail.com", new PlayerDB("Alexander",1));
        playersDB.put("Natasha@yandex.ru", new PlayerDB("Natasha",2));
        playersDB.put("Matvey@gmail.com", new PlayerDB("Matvey",3));
        playersDB.put("Bogdan@yandex.ru", new PlayerDB("Bogdan",4));
        playersDB.put("Ivan@gmail.com", new PlayerDB("Ivan",5));
    }

    private int idPartyGameKing;
    private HashMap<Integer, PartyGameKing> partyGameKingDB = new HashMap<>();
    {
        partyGameKingDB.put(1, new PartyGameKing(1,2,3,4));
        partyGameKingDB.put(2, new PartyGameKing(5,2,3,4));
        partyGameKingDB.put(3, new PartyGameKing(3,4,5,1));
    }

    private int idTypeGame;
    private HashMap<Integer, String> typeGameDB = new HashMap<>();
    {
        typeGameDB.put(1, "takeTricks");
        typeGameDB.put(2, "takeBoys");
        typeGameDB.put(3, "takeGirls");
        typeGameDB.put(4, "takeHearts");
        typeGameDB.put(5, "takeKing");
        typeGameDB.put(6, "takeLastTwo");
        typeGameDB.put(7, "takeBFG");
        typeGameDB.put(10, "takeBFGTricks");
        typeGameDB.put(11, "takeBFGBoys");
        typeGameDB.put(12, "takeBFGGirls");
        typeGameDB.put(13, "takeBFGHearts");
        typeGameDB.put(14, "takeBFGKing");
        typeGameDB.put(15, "takeBFGLastTwo");
        typeGameDB.put(20, "doNotTakeTricks");
        typeGameDB.put(21, "doNotTakeBoys");
        typeGameDB.put(22, "doNotTakeGirls");
        typeGameDB.put(23, "doNotTakeHearts");
        typeGameDB.put(24, "doNotTakeKing");
        typeGameDB.put(25, "doNotTakeLastTwo");
        typeGameDB.put(26, "doNotTakeBFG");
        typeGameDB.put(31, "doNotTakeBFGTricks");
        typeGameDB.put(32, "doNotTakeBFGBoys");
        typeGameDB.put(33, "doNotTakeBFGGirls");
        typeGameDB.put(34, "doNotTakeBFGHearts");
        typeGameDB.put(35, "doNotTakeBFGKing");
        typeGameDB.put(36, "doNotTakeBFGLastTwo");
    }

    private HashMap<Integer, CardGameKing> cardGameKingDB = new HashMap<>();
    {
        cardGameKingDB.put(1, new CardGameKing(1,1));
        cardGameKingDB.put(2, new CardGameKing(2,2));
        cardGameKingDB.put(3, new CardGameKing(3,3));
        cardGameKingDB.put(4, new CardGameKing(4,4));
        cardGameKingDB.put(5, new CardGameKing(1,5));
        cardGameKingDB.put(6, new CardGameKing(2,6));
        cardGameKingDB.put(7, new CardGameKing(3,10));
        cardGameKingDB.put(8, new CardGameKing(4,11));
        cardGameKingDB.put(9, new CardGameKing(1,12));
        cardGameKingDB.put(10, new CardGameKing(2,13));
        cardGameKingDB.put(11, new CardGameKing(3,14));
        cardGameKingDB.put(12, new CardGameKing(4,15));
        cardGameKingDB.put(13, new CardGameKing(1,31));
        cardGameKingDB.put(14, new CardGameKing(2,32));
        cardGameKingDB.put(15, new CardGameKing(3,33));
        cardGameKingDB.put(16, new CardGameKing(4,34));
        cardGameKingDB.put(17, new CardGameKing(1,35));
        cardGameKingDB.put(18, new CardGameKing(2,36));
        cardGameKingDB.put(19, new CardGameKing(3,31));
        cardGameKingDB.put(20, new CardGameKing(4,32));
        cardGameKingDB.put(21, new CardGameKing(1,33));
        cardGameKingDB.put(22, new CardGameKing(2,34));
        cardGameKingDB.put(23, new CardGameKing(3,35));
        cardGameKingDB.put(24, new CardGameKing(4,36));
        cardGameKingDB.put(25, new CardGameKing(1,1));
        cardGameKingDB.put(26, new CardGameKing(2,2));
        cardGameKingDB.put(27, new CardGameKing(3,3));
        cardGameKingDB.put(28, new CardGameKing(4,4));
        cardGameKingDB.put(29, new CardGameKing(1,5));
        cardGameKingDB.put(30, new CardGameKing(2,6));
        cardGameKingDB.put(31, new CardGameKing(3,10));
        cardGameKingDB.put(32, new CardGameKing(4,11));
        cardGameKingDB.put(33, new CardGameKing(1,12));
        cardGameKingDB.put(34, new CardGameKing(2,13));
        cardGameKingDB.put(35, new CardGameKing(3,14));
        cardGameKingDB.put(36, new CardGameKing(4,15));
        cardGameKingDB.put(37, new CardGameKing(1,31));
        cardGameKingDB.put(38, new CardGameKing(2,32));
        cardGameKingDB.put(39, new CardGameKing(3,33));
        cardGameKingDB.put(40, new CardGameKing(4,34));
        cardGameKingDB.put(41, new CardGameKing(1,35));
        cardGameKingDB.put(42, new CardGameKing(2,36));
        cardGameKingDB.put(43, new CardGameKing(3,31));
        cardGameKingDB.put(44, new CardGameKing(4,32));
        cardGameKingDB.put(45, new CardGameKing(1,33));
        cardGameKingDB.put(46, new CardGameKing(2,34));
        cardGameKingDB.put(47, new CardGameKing(3,35));
        cardGameKingDB.put(48, new CardGameKing(4,36));
        cardGameKingDB.put(49, new CardGameKing(1,1));
        cardGameKingDB.put(50, new CardGameKing(2,2));
        cardGameKingDB.put(51, new CardGameKing(3,3));
        cardGameKingDB.put(52, new CardGameKing(4,4));
        cardGameKingDB.put(53, new CardGameKing(1,5));
        cardGameKingDB.put(54, new CardGameKing(2,6));
        cardGameKingDB.put(55, new CardGameKing(3,10));
        cardGameKingDB.put(56, new CardGameKing(4,11));
        cardGameKingDB.put(57, new CardGameKing(1,12));
        cardGameKingDB.put(58, new CardGameKing(2,13));
        cardGameKingDB.put(59, new CardGameKing(3,14));
        cardGameKingDB.put(60, new CardGameKing(4,15));
        cardGameKingDB.put(61, new CardGameKing(1,31));
        cardGameKingDB.put(62, new CardGameKing(2,32));
        cardGameKingDB.put(63, new CardGameKing(3,33));
        cardGameKingDB.put(64, new CardGameKing(4,34));
        cardGameKingDB.put(65, new CardGameKing(1,35));
        cardGameKingDB.put(66, new CardGameKing(2,36));
        cardGameKingDB.put(67, new CardGameKing(3,31));
        cardGameKingDB.put(68, new CardGameKing(4,32));
        cardGameKingDB.put(69, new CardGameKing(1,33));
        cardGameKingDB.put(70, new CardGameKing(2,34));
        cardGameKingDB.put(71, new CardGameKing(3,35));
        cardGameKingDB.put(72, new CardGameKing(4,36));

    }

    private HashMap<Integer, TableTricksGameKing> tableTricksGameKingDB = new HashMap<>();
    {
        tableTricksGameKingDB.put(1, new TableTricksGameKing(4,2,0,2));
        tableTricksGameKingDB.put(2, new TableTricksGameKing(2,2,0,0));
        tableTricksGameKingDB.put(3, new TableTricksGameKing(0,0,2,2));
        tableTricksGameKingDB.put(4, new TableTricksGameKing(1,1,1,5));
        tableTricksGameKingDB.put(5, new TableTricksGameKing(0,0,0,1));
        tableTricksGameKingDB.put(6, new TableTricksGameKing(2,0,0,0));
        tableTricksGameKingDB.put(7, new TableTricksGameKing(0,0,0,8));
        tableTricksGameKingDB.put(8, new TableTricksGameKing(0,4,0,0));
        tableTricksGameKingDB.put(9, new TableTricksGameKing(0,4,0,0));
        tableTricksGameKingDB.put(10, new TableTricksGameKing(1,1,6,0));
        tableTricksGameKingDB.put(11, new TableTricksGameKing(0,0,0,1));
        tableTricksGameKingDB.put(12, new TableTricksGameKing(0,2,0,0));
        tableTricksGameKingDB.put(13, new TableTricksGameKing(4,2,0,2));
        tableTricksGameKingDB.put(14, new TableTricksGameKing(2,2,0,0));
        tableTricksGameKingDB.put(15, new TableTricksGameKing(0,0,2,2));
        tableTricksGameKingDB.put(16, new TableTricksGameKing(1,1,1,5));
        tableTricksGameKingDB.put(17, new TableTricksGameKing(0,0,0,1));
        tableTricksGameKingDB.put(18, new TableTricksGameKing(2,0,0,0));
        tableTricksGameKingDB.put(19, new TableTricksGameKing(0,0,0,8));
        tableTricksGameKingDB.put(20, new TableTricksGameKing(0,4,0,0));
        tableTricksGameKingDB.put(21, new TableTricksGameKing(0,4,0,0));
        tableTricksGameKingDB.put(22, new TableTricksGameKing(1,1,6,0));
        tableTricksGameKingDB.put(23, new TableTricksGameKing(0,0,0,1));
        tableTricksGameKingDB.put(24, new TableTricksGameKing(0,2,0,0));
        tableTricksGameKingDB.put(25, new TableTricksGameKing(4,2,0,2));
        tableTricksGameKingDB.put(26, new TableTricksGameKing(2,2,0,0));
        tableTricksGameKingDB.put(27, new TableTricksGameKing(0,0,2,2));
        tableTricksGameKingDB.put(28, new TableTricksGameKing(1,1,1,5));
        tableTricksGameKingDB.put(29, new TableTricksGameKing(0,0,0,1));
        tableTricksGameKingDB.put(30, new TableTricksGameKing(2,0,0,0));
        tableTricksGameKingDB.put(31, new TableTricksGameKing(0,0,0,8));
        tableTricksGameKingDB.put(32, new TableTricksGameKing(0,4,0,0));
        tableTricksGameKingDB.put(33, new TableTricksGameKing(0,4,0,0));
        tableTricksGameKingDB.put(34, new TableTricksGameKing(1,1,6,0));
        tableTricksGameKingDB.put(35, new TableTricksGameKing(0,0,0,1));
        tableTricksGameKingDB.put(36, new TableTricksGameKing(0,2,0,0));
        tableTricksGameKingDB.put(37, new TableTricksGameKing(4,2,0,2));
        tableTricksGameKingDB.put(38, new TableTricksGameKing(2,2,0,0));
        tableTricksGameKingDB.put(39, new TableTricksGameKing(0,0,2,2));
        tableTricksGameKingDB.put(40, new TableTricksGameKing(1,1,1,5));
        tableTricksGameKingDB.put(41, new TableTricksGameKing(0,0,0,1));
        tableTricksGameKingDB.put(42, new TableTricksGameKing(2,0,0,0));
        tableTricksGameKingDB.put(43, new TableTricksGameKing(0,0,0,8));
        tableTricksGameKingDB.put(44, new TableTricksGameKing(0,4,0,0));
        tableTricksGameKingDB.put(45, new TableTricksGameKing(0,4,0,0));
        tableTricksGameKingDB.put(46, new TableTricksGameKing(1,1,6,0));
        tableTricksGameKingDB.put(47, new TableTricksGameKing(0,0,0,1));
        tableTricksGameKingDB.put(48, new TableTricksGameKing(0,2,0,0));
        tableTricksGameKingDB.put(49, new TableTricksGameKing(4,2,0,2));
        tableTricksGameKingDB.put(50, new TableTricksGameKing(2,2,0,0));
        tableTricksGameKingDB.put(51, new TableTricksGameKing(0,0,2,2));
        tableTricksGameKingDB.put(52, new TableTricksGameKing(1,1,1,5));
        tableTricksGameKingDB.put(53, new TableTricksGameKing(0,0,0,1));
        tableTricksGameKingDB.put(54, new TableTricksGameKing(2,0,0,0));
        tableTricksGameKingDB.put(55, new TableTricksGameKing(0,0,0,8));
        tableTricksGameKingDB.put(56, new TableTricksGameKing(0,4,0,0));
        tableTricksGameKingDB.put(57, new TableTricksGameKing(0,4,0,0));
        tableTricksGameKingDB.put(58, new TableTricksGameKing(1,1,6,0));
        tableTricksGameKingDB.put(59, new TableTricksGameKing(0,0,0,1));
        tableTricksGameKingDB.put(60, new TableTricksGameKing(0,2,0,0));
        tableTricksGameKingDB.put(61, new TableTricksGameKing(4,2,0,2));
        tableTricksGameKingDB.put(62, new TableTricksGameKing(2,2,0,0));
        tableTricksGameKingDB.put(63, new TableTricksGameKing(0,0,2,2));
        tableTricksGameKingDB.put(64, new TableTricksGameKing(1,1,1,5));
        tableTricksGameKingDB.put(65, new TableTricksGameKing(0,0,0,1));
        tableTricksGameKingDB.put(66, new TableTricksGameKing(2,0,0,0));
        tableTricksGameKingDB.put(67, new TableTricksGameKing(0,0,0,8));
        tableTricksGameKingDB.put(68, new TableTricksGameKing(0,4,0,0));
        tableTricksGameKingDB.put(69, new TableTricksGameKing(0,4,0,0));
        tableTricksGameKingDB.put(70, new TableTricksGameKing(1,1,6,0));
        tableTricksGameKingDB.put(71, new TableTricksGameKing(0,0,0,1));
        tableTricksGameKingDB.put(72, new TableTricksGameKing(0,2,0,0));
    }


}
