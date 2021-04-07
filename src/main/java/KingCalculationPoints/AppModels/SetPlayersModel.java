package KingCalculationPoints.AppModels;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class SetPlayersModel {



    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String emailPlayerTwo;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String emailPlayerTree;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String emailPlayerFour;

    public SetPlayersModel() {
    }

    public SetPlayersModel(String emailPlayerTwo, String emailPlayerTree, String emailPlayerFour) {
        this.emailPlayerTwo = emailPlayerTwo;
        this.emailPlayerTree = emailPlayerTree;
        this.emailPlayerFour = emailPlayerFour;
    }

    public String getEmailPlayerTwo() {
        return emailPlayerTwo;
    }

    public void setEmailPlayerTwo(String emailPlayerTwo) {
        this.emailPlayerTwo = emailPlayerTwo;
    }

    public String getEmailPlayerTree() {
        return emailPlayerTree;
    }

    public void setEmailPlayerTree(String emailPlayerTree) {
        this.emailPlayerTree = emailPlayerTree;
    }

    public String getEmailPlayerFour() {
        return emailPlayerFour;
    }

    public void setEmailPlayerFour(String emailPlayerFour) {
        this.emailPlayerFour = emailPlayerFour;
    }

}
