package starter.Projects;

import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.when;
import static org.hamcrest.Matchers.equalTo;

public class Cart {

    private String url;

    public void setValidUrl(){
        url = "https://fakestoreapi.com/carts";
    }

    public void requestGetAllMyCart(){
        when().get(url);
    }

    public void statusCode200(){
        then().statusCode(200);
    }

    public void getCartWithId(){

        then().body("[1].id", equalTo(2));
    }

    public void getCartWithDate(){
        then().body("[1].date", equalTo("2020-01-02T00:00:02.000Z"));
    }

}
