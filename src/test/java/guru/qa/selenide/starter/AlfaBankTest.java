package guru.qa.selenide.starter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AlfaBankTest {

    @Test
    void testAlfa(){
        String varMenuButton = "Депозиты";

        open("https://alfabank.ru/");
        $(byText("Вклады")).click();
        $("body").shouldHave(text("Накопительные продукты"));
        $x("//div[@id='filter']//a[@data-widget-uid='0dc9994fe9']").click();
//       $$(byText("Депозиты")).find(visible).click();  best option, not working
//       $(byText("Депозиты"),1).click();   not working
        $("body").shouldHave(text("Вклад на ваших условиях"));
    }
}

