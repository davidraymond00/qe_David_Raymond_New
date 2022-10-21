package starter.Projects;

import static net.serenitybdd.rest.SerenityRest.*;

public class Login {

    private String url, body;


    public void setUrlAndBody(){
        url = "https://fakestoreapi.com/auth/login";
        body = "JSON.stringify({\n" +
                "                username: \"mor_2314\",\n" +
                "                password: \"83r5^_\"\n" +
                "            })";
    }

    public void requestLogin(){
        given().body(body);
        when().post(url);
    }

    public void validateStatusCode(){
        then().statusCode(524);
    }
}
