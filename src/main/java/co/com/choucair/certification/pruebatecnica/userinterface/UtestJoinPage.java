package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

    public class UtestJoinPage extends PageObject {

        public static final Target JOIN_BUTTON = Target.the("button that shows registration page").located(By.xpath("//a[@ui-sref='signup.personal']"));
        public static final Target INPUT_FIRSTNAME = Target.the("register first name").located(By.id("firstName"));
        public static final Target INPUT_LASTNAME = Target.the("register last name").located(By.id("lastName"));
        public static final Target INPUT_EMAIL = Target.the("register email").located(By.id("email"));
        public static final Target INPUT_MONTH = Target.the("register mont").located(By.id("birthMonth"));
        public static final Target INPUT_DAY = Target.the("register mont").located(By.id("birthDay"));
        public static final Target INPUT_YEAR = Target.the("register mont").located(By.id("birthYear"));
        //public static final Target INPUT_LANGUAGE = Target.the("register languages").located(By.xpath("//input[@type='search']"));
        public static final Target JOIN_NEXT = Target.the("next page register address").located(By.xpath("//a[@ng-click='validateBasicInfoStep(userForm);']"));
        //public static final Target INPUT_CITY = Target.the("register city").located(By.id("city"));
        //public static final Target INPUT_ZIP = Target.the("register zip").located(By.id("zip"));
        //public static final Target INPUT_COUNTRY = Target.the("register country").located(By.xpath("//div[@ng-attr-id='ui-select-choices-row-{{ $select.generatedId }}-{{$index}}']"));
        public static final Target JOIN_NEXT2 = Target.the("next page register devices").located(By.xpath("//a[@ng-click='validateAddressInfoStep(forms.userForm);']"));
        public static final Target JOIN_NEXT3 = Target.the("next page register complete").located(By.xpath("//a[@ng-click='validateDevices(userForm);']"));
        public static final Target INPUT_PASSWORD = Target.the("register password").located(By.id("password"));
        public static final Target INPUT_REPASSWORD = Target.the("register confirm password").located(By.id("confirmPassword"));
        public static final Target JOIN_INFORMATION = Target.the("register confirm send information").located(By.name("newsletterOptIn"));
        public static final Target JOIN_TERMS = Target.the("register confirm condition").located(By.id("termOfUse"));
        public static final Target JOIN_PRIVACY = Target.the("register confirm privacy").located(By.id("privacySetting"));
        public static final Target JOIN_COMPLETE = Target.the("register complete").located(By.id("laddaBtn"));
        public static final Target LABEL_VALIDATION = Target.the("register complete").located(By.linkText("Academy Training Courses"));
    }
