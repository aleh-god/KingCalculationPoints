package KingCalculationPoints.WebControllers;

import KingCalculationPoints.AppModels.*;
import KingCalculationPoints.DataAccessObject.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("")
public class KingCalculationWebAppController {

    private final MyDataAccessObject myDataAccessObject;
    private final CheckLoginDAO checkLoginDAO;

    @Autowired
    public KingCalculationWebAppController(MyDataAccessObject myDataAccessObject, CheckLoginDAO checkLoginDAO) {
        this.myDataAccessObject = myDataAccessObject;
        this.checkLoginDAO = checkLoginDAO;
    }

    @GetMapping("/login")
    public String returnLoginMenuView(@ModelAttribute("loginModel") LoginModel loginModel) {
        // Создаем пустой объект с полями, через пустой конструктор
        // Объект кладем в Model model присваиваем метку для работы thymeleaf
        // model.addAttribute("loginModel", new loginModel());
        // Все это можно заменить через анотацию @ModelAttribute("person") Person person
        // thymeleaf генерирует view-страницу с нужными связанными полями
        return "/1_UserLoginMenu";
    }

    @PostMapping("/2_UserMainMenu")
    public String returnUserMainView(@ModelAttribute("loginModel") @Valid LoginModel loginModel,
                                      BindingResult bindingResult)
    {

        if (bindingResult.hasErrors()) // Объект можно проверить на наличие ошибок валидации и присвоить специальную логику обработки ошибок
            return "/1_UserLoginMenu"; // Если есть ошбики, то возвращаем форму заново. НО теперь с сообщениями ошибок в соотв полях, так как все связано с Model model

        // Проверяем входящего пользователя на наличие в базе
        if ( !checkLoginDAO.checkLoginInDataBase(loginModel))
            return "/1_UserLoginMenu";

        // Взять имя пользователя, номер сессии и вернуть приглашение + меню
        checkLoginDAO.setNameVerifiedUserFromDataBaseInModel(loginModel);

        return "/2_UserMainMenu";
    }

    @GetMapping("/start")
    public String returnSetPlayersMenuView(@ModelAttribute("setPlayersModel") SetPlayersModel setPlayersModel) {

        // Заполнить первого пользователя

        //

        return "/21_SetPlayersMenu";
    }

    @PostMapping("/3_PartyBoardMenu")
    public String returnWebViewCreate(@ModelAttribute("setPlayersModel") SetPlayersModel setPlayersModel,
                                      BindingResult bindingResult) { // Ошибки валидации внедряются в объект, который всегда должен ити сразу после объекта валидации.

        if (bindingResult.hasErrors()) // Объект можно проверить на наличие ошибок валидации и присвоить специальную логику обработки ошибок
            return "/21_SetPlayersMenu"; // Если есть ошбики, то возвращаем форму заново. НО теперь с сообщениями ошибок в соотв полях, так как все связано с Model model

        // Объект загружаем в БД
        myDataAccessObject.startPartyGame(setPlayersModel);

        // Вместо формы подтверждения просто перенаправляем redirect: на готовый view
        return "redirect:/3_PartyBoardMenu";
    }

//    // Условный пример. На нужен класс для внедрения полей в view + проверка полей, класс который будет считать логику
//
//    @GetMapping("/{id}")
//    public String returnWebView(@PathVariable("id") int id, Model model) {
//        myDataAccessObject.workWithSQL();
//        MyEntitiesForWebView result = null;
//        model.addAttribute("myModelWork",result);
//        return "WebView";
//    }

    // методы String
    // TransitionToSetPlayersMenu
        // SQl - J_PartyGames
    // TransitionToPartyBoardMenu
        // табличка с играми, табличка с очками
    // TransitionToRoundBoardMenu
        // SQl - J_TricksGame

}
