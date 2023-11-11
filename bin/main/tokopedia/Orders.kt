package tokopedia

import io.restassured.RestAssured
import io.restassured.response.Response

object Orders {

    fun accountList(
        orderID: Int?,
        orderDescription: String?,
        orderStatus: String?,
        lastUpdateTimestamp: String?,
        specialOrder: Boolean?
    ): Response {

        val body = buildMap {
            orderID?.let { put("order_id", it) }
            orderDescription?.let { put("order_decription", it) }
            orderStatus?.let { put("order_status", it) }
            lastUpdateTimestamp?.let { put("last_update_timestamp", it) }
            specialOrder?.let { put("special_order", it) }

        }
        return RestAssured.given().params(body).post("/processOrder")




    }
}