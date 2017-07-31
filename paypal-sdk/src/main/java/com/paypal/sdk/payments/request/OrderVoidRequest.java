// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// OrderVoidRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"order.void","Description":"Voids, or cancels, an order, by ID. You cannot void an order if the payment has already been partially or fully captured.\u003cbr/\u003e\u003cbr/\u003eA successful request returns the HTTP `200 OK` status code and a JSON response body that shows details for the voided order.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"order_id","Description":"The ID of the order to void.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":null,"ResponseType":{"Type":"Order","VariableName":"","Description":"An order transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/payments/orders/{order_id}/do-void","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.*;
import java.util.List;


/**
 * Voids, or cancels, an order, by ID. You cannot void an order if the payment has already been partially or fully captured.<br/><br/>A successful request returns the HTTP `200 OK` status code and a JSON response body that shows details for the voided order.
 */
public class OrderVoidRequest extends HttpRequest<Order> {

    public OrderVoidRequest(String orderId) {
        super("/v1/payments/orders/{order_id}/do-void?"
            .replace("{order_id}", String.valueOf(orderId)), "POST", Order.class);
        header("Content-Type", "application/json");
    }
    
}
