// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// InvoiceUpdateRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.update","Description":"Fully updates an invoice, by ID. In the JSON request body, include a complete `invoice` object. This call does not support partial updates.","QueryParameters":[{"Type":"boolean","VariableName":"notify_merchant","Description":"Indicates whether to send the invoice update notification to the merchant. Default is `true`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice to update.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":{"Type":"Invoice","VariableName":"body","Description":"Invoice details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Invoice","VariableName":"","Description":"Invoice details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"PUT","Path":"/v1/invoicing/invoices/{invoice_id}","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.*;
import java.util.List;


/**
 * Fully updates an invoice, by ID. In the JSON request body, include a complete `invoice` object. This call does not support partial updates.
 */
public class InvoiceUpdateRequest extends HttpRequest<Invoice> {

    public InvoiceUpdateRequest(String invoiceId) {
        super("/v1/invoicing/invoices/{invoice_id}?"
            .replace("{invoice_id}", String.valueOf(invoiceId)), "PUT", Invoice.class);
        header("Content-Type", "application/json");
    }

    public InvoiceUpdateRequest notifyMerchant(Boolean notifyMerchant) {
		path(path() + "notify_merchant=" + String.valueOf(notifyMerchant) + "&");
        return this;
    }
    
    

    public InvoiceUpdateRequest requestBody(Invoice body) {
        super.requestBody(body);
        return this;
    }
}
