package KingCalculationPoints.AppModels.Entities;

import javax.validation.constraints.*;

public class PartyGameKing {

    private int idPartyGameKing;
    private int idPlayerOne, idPlayerTwo, idPlayerThree, idPlayerFour;

    public PartyGameKing(int idPlayerOne, int idPlayerTwo, int idPlayerThree, int idPlayerFour) {
        this.idPlayerOne = idPlayerOne;
        this.idPlayerTwo = idPlayerTwo;
        this.idPlayerThree = idPlayerThree;
        this.idPlayerFour = idPlayerFour;
    }

    public int getIdPartyGameKing() {
        return idPartyGameKing;
    }

    public void setIdPartyGameKing(int idPartyGameKing) {
        this.idPartyGameKing = idPartyGameKing;
    }

    public int getIdPlayerOne() {
        return idPlayerOne;
    }

    public void setIdPlayerOne(int idPlayerOne) {
        this.idPlayerOne = idPlayerOne;
    }

    public int getIdPlayerTwo() {
        return idPlayerTwo;
    }

    public void setIdPlayerTwo(int idPlayerTwo) {
        this.idPlayerTwo = idPlayerTwo;
    }

    public int getIdPlayerThree() {
        return idPlayerThree;
    }

    public void setIdPlayerThree(int idPlayerThree) {
        this.idPlayerThree = idPlayerThree;
    }

    public int getIdPlayerFour() {
        return idPlayerFour;
    }

    public void setIdPlayerFour(int idPlayerFour) {
        this.idPlayerFour = idPlayerFour;
    }
}
