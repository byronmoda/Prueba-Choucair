package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.UtestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

    public class Join implements Task {

        public static Join thepage(){
        return Tasks.instrumented(Join.class);
    }

        public static Join onThePage(){
        return Tasks.instrumented(Join.class);
    }

        @Override
             public <T extends Actor> void performAs(T actor){
                actor.attemptsTo(Click.on(UtestJoinPage.JOIN_BUTTON),
                Enter.theValue("Pedro").into(UtestJoinPage.INPUT_FIRSTNAME),
                Enter.theValue("Palacios").into(UtestJoinPage.INPUT_LASTNAME),
                Enter.theValue("pepe77@gmail.com").into(UtestJoinPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("October").from(UtestJoinPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText("31").from(UtestJoinPage.INPUT_DAY),
                SelectFromOptions.byVisibleText("2000").from(UtestJoinPage.INPUT_YEAR),
                //Enter.theValue("Spanish").into(UtestJoinPage.INPUT_LANGUAGE),
                Click.on(UtestJoinPage.JOIN_NEXT),
                //Enter.theValue("Yuto").into(UtestJoinPage.INPUT_CITY),
                //Enter.theValue("270002").into(UtestJoinPage.INPUT_ZIP),
                //SelectFromOptions.byVisibleText("Colombia").from(UtestJoinPage.INPUT_COUNTRY),
                Click.on(UtestJoinPage.JOIN_NEXT2),
                Click.on(UtestJoinPage.JOIN_NEXT3),
                Enter.theValue("Prueba+12345").into(UtestJoinPage.INPUT_PASSWORD),
                Enter.theValue("Prueba+12345").into(UtestJoinPage.INPUT_REPASSWORD),
                Click.on(UtestJoinPage.JOIN_INFORMATION),
                Click.on(UtestJoinPage.JOIN_TERMS),
                Click.on(UtestJoinPage.JOIN_PRIVACY),
                Click.on(UtestJoinPage.JOIN_COMPLETE)
                );

                try{
                    Thread.sleep(5000);
                }   catch (InterruptedException e){
                    e.printStackTrace();
                    }
        }
    }