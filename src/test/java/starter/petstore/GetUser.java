package starter.petstore;

import net.serenitybdd.rest.SerenityRest;

public class GetUser {

    public void consultarUsuario(String username){
        SerenityRest.given()
                .get("https://petstore.swagger.io/v2/user/"+username);

    }
}
