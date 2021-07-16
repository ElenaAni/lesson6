package enums;

import Base.SubMenuButtons;
import org.openqa.selenium.By;

public enum ExpenseSubmenuButtons implements SubMenuButtons {

    EXPENSE_REQUEST(".//span[@class='title' and text()='Заявки на расходы']");
//    BUSINESS_TRIPS("TODO"),
//    CENTER_COSTS("TODO"),
//    BUSINESS_CONTRACTS("TODO");

    private final By by;

    ExpenseSubmenuButtons(String xpath) {
        this.by = By.xpath(xpath);
    }

    public By getBy() {
        return by;
    }
}
