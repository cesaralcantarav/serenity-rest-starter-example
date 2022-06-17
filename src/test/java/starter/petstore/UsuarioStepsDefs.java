package starter.petstore;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UsuarioStepsDefs {

    @Steps
    GetUser getUser;

    @When("consulto el usuario {string}")
    public void consultoElUsuario(String username) {
        getUser.consultarUsuario(username);
    }


}
