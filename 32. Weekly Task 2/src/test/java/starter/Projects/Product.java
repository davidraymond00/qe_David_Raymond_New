package starter.Projects;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class Product {

    private String url;

    public void setValidUrl(){
        url = "https://fakestoreapi.com/products";
    }

    public void requestGetAllProduct(){
        when().get(url);
    }

    public void validateStatus200(){
        then().statusCode(200);
    }

    public void getListWithCategory(){
        then().body("[0].category", equalTo("men's clothing"));
    }

    public void getListWithId(){
        then().body("[1].id", equalTo(2));
    }

    public void getListWithPrice(){
        then().body("[4].price", equalTo(695));
    }

    public void getListWithDescription(){
        then().body("[0].description", equalTo("Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday"));
    }
}
