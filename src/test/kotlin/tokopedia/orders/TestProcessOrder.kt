package tokopedia.orders

import io.restassured.RestAssured
import io.restassured.filter.log.ErrorLoggingFilter
import io.restassured.filter.log.RequestLoggingFilter
import io.restassured.filter.log.ResponseLoggingFilter
import io.restassured.path.json.JsonPath
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import tokopedia.Orders

class TestProcessOrder {

    init {
        // this tutorial set the base uri here, but in real use case, you can use configuration file or any other method to set the base uri
        RestAssured.baseURI = "http://localhost:3001/"

        // add filters here, you can use the available default filters, its will print the logs to console, can help with debugging the test
        RestAssured.filters(RequestLoggingFilter(), ResponseLoggingFilter(), ErrorLoggingFilter())
    }



    @Test
    fun `Test Proccess Order` (){
        val response = Orders.accountList(111111111,
            "etryetrie","34738473","1699566858",false)
        val responseJsonPath = JsonPath(response.asString())
        Assertions.assertAll("Assert response Body",
            Executable {Assertions.assertEquals(200,200)},
            Executable {Assertions.assertEquals("Inprogress",responseJsonPath.get("order_status"),"assert order status In progress")},
            Executable {Assertions.assertEquals("1699678561",responseJsonPath.get("last_update_timestamp"),"assert order last update timestamp")})
        }


    }


