package step_definitions;

import com.google.gson.JsonObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class US172_StepDef {

Response response=null;
RequestSpecification specification=new RequestSpecBuilder().
                                                            setBaseUri(ConfigurationReader.getProperty("url")).
                                                            setRelaxedHTTPSValidation().
                                                            build();
    @Given("kullanici {string} endointine degeri {string} ve home {string} ile birlikte {string} olarak baglan")
    public void kullaniciEndointineDegeriVeHomeOlarakBaglan(String endPoint, String approvalValue, String homeId, String userTip) {


    String token="";
    if(userTip.equals("admin")){
        token="";
    }else if(userTip.equals("kullanici")){
        token="";
    }else{
        token="";
    }

    JSONObject jsonObject=new JSONObject();
    jsonObject.put("id",homeId);
    jsonObject.put("aproval",approvalValue);


    response=given().
            queryParam("secret_token",token).
            contentType(ContentType.JSON).
            body(jsonObject.toString()).
            spec(specification).
            patch(endPoint);

    response.prettyPrint();
}


    @Then("kullanici baglantinin states code {string} olararak dogrular.")
    public void kullaniciBaglantininStatesCodeOlararakDogrular(String statusCode) {
    int actalResponseCode =response.getStatusCode();
        Assert.assertEquals(actalResponseCode,202);

    response.prettyPrint();
    }


}
