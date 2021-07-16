package features.expenses;

import enums.ExpenseSubmenuButtons;
import org.junit.jupiter.api.Test;
import base.BaseUITest;
import common.Configuration;
import enums.NavigationBarTabs;
import Pages.AllExpensesPage;
import Pages.LoginPage;

public class NewExpensesTest extends BaseUITest {

    private static final int EXPENSE_SUM = 10000;
    @Test
    public void createNewExpensePositiveTest() {
        AllExpensesPage expensesScreen = (AllExpensesPage) new LoginPage(driver)
                .authoriseScenario(Configuration.STUDENT_LOGIN, Configuration.STUDENT_PASSWORD)
                .getPageNavigation()
                .moveCursorToNavigationTab(NavigationBarTabs.EXPENSES)
                .clickSubMenuButton(ExpenseSubmenuButtons.EXPENSE_REQUEST);

        expensesScreen
                .clickOnCreateNewExpenseButton()
                .enterDescription("test 1234")
                .selectBusinessUnit(1)
                .selectExpenditure(87)
                .setExpenseSum(EXPENSE_SUM)
                .clickNotifyDateChangedCheckBox()
                .selectDateInDatePicker(20)
                .clickSubmit()
                .checkNewExpensePopUp();
    }
}

