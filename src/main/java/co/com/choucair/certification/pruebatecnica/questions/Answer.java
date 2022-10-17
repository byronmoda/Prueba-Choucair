package co.com.choucair.certification.pruebatecnica.questions;

import co.com.choucair.certification.pruebatecnica.userinterface.UtestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<String> {

    public static Answer toThe () {
        return new Answer();
    }

    @Override
        public String answeredBy (Actor actor) {
            return Text.of(UtestJoinPage.LABEL_VALIDATION).viewedBy(actor).asString();
    }
}