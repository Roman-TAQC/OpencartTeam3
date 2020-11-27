import com.opencart.navigation.Navigation;
import com.opencart.pages.BasePage;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.MyAccountPageBL;
import com.opencart.steps.editAccount.EditAccountPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserEditAccountTest extends BaseTest {

    @Test
    public void editUserAccountWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        BasePage basePage = new BasePage();
        MainPageBL mainPageBL = new MainPageBL();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        EditAccountPageBL editAccountPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnMyAccountButtonRegisteredUser()
                .editUserAccount();
        myAccountPageBL.verifyEditUserAccount();
    }
}
