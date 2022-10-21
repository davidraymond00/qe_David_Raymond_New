package starter.Projects;

import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.when;
import static org.hamcrest.Matchers.equalTo;

public class Users {

    private String url;

    public void setValidUrl(){
        url = "https://fakestoreapi.com/users";
    }

    public void requestGetAllUser(){
        when().get(url);
    }

    public void statusCode200(){
        then().statusCode(200);
    }

    public void getUserWithId(){
        then().body("[0].id", equalTo(1));
    }

    public void getUserWithEmail(){
        then().body("[2].email", equalTo("kevin@gmail.com"));
    }

    public void getUserWithUsername(){
        then().body("[4].username", equalTo("derek"));
    }

    public void getUserWithPhone(){
        then().body("[6].phone", equalTo("1-123-943-0563"));
    }

    public void getUserWithPassword(){
        then().body("[8].password", equalTo("kfejk@*_"));
    }

    public void getUserWithCity(){
        then().body("[8].address.city", equalTo("miami"));
    }

    public void getUserWithStreet(){
        then().body("[2].address.street", equalTo("Frances Ct"));
    }

    public void getUserWithLastname(){
        then().body("[5].name.lastname", equalTo("russell"));
    }

    public void getUserWithFirstname(){
        then().body("[9].name.firstname", equalTo("jimmie"));
    }

}
