import com.opencart.navigation.Navigation;
import com.opencart.steps.CategoriesHeaderPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class PhonesPDAsSearchTest extends BaseTest {

    @Test
    public void phonesPDAsCategoryOpen(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        CategoriesHeaderPageBL categoriesHeaderPageBL =mainPageBL.getCategoriesHeaderPageBL()
                .clickOnPhonesPDAsButton()
                .checkCategory();
        categoriesHeaderPageBL.verifyPhonesPDAsCategoryOpen();

    }
}
