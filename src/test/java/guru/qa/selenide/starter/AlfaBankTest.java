package guru.qa.selenide.starter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class AlfaBankTest {

    @Test
    void testAlfa(){
        Selenide.open("https://alfabank.ru/");
        Selenide.$(Selectors.byText("Вклады")).click();
        Selenide.$("body").shouldHave(Condition.text("Накопительные продукты"));

    }
}

