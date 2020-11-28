import com.opencart.navigation.Navigation;
import com.opencart.steps.CategoriesHeaderPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class ComponentsAllComponentsSearchTest extends BaseTest {

    @Test
    public void componentsCategoryAllComponentsOpen(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        CategoriesHeaderPageBL categoriesHeaderPageBL =mainPageBL.getCategoriesHeaderPageBL()
                .clickOnComponentsButton()
                .clickOnAllComponentsButton()
                .checkCategory();
        categoriesHeaderPageBL.verifyAllComponentsCategoryOpen();

    }
}
