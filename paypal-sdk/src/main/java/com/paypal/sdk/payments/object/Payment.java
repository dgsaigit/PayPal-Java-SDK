// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// Payment.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payment","VariableName":"","Description":"A payment. Use this object to create, process, and manage payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"create_time","Description":"The date and time when the payment was created, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"experience_profile_id","Description":"The PayPal-generated ID for the merchant's payment experience profile. For information, see [create web experience profile](/docs/api/payment-experience/#web-profile_create).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"failure_reason","Description":"The reason code for a payment failure.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"id","Description":"The ID of the payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"intent","Description":"The payment intent. Value is:\u003cul\u003e\u003cli\u003e\u003ccode\u003esale\u003c/code\u003e. Makes an immediate payment.\u003c/li\u003e\u003cli\u003e\u003ccode\u003eauthorize\u003c/code\u003e. [Authorizes a payment for capture later](/docs/integration/direct/payments/capture-payment/).\u003c/li\u003e\u003cli\u003e\u003ccode\u003eorder\u003c/code\u003e. [Creates an order](/docs/integration/direct/payments/orders/).\u003c/li\u003e\u003c/ul\u003e","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"note_to_payer","Description":"A free-form field that clients can use to send a note to the payer.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payer","VariableName":"payer","Description":"A payer that funds a payment.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"Redirect Urls","VariableName":"redirect_urls","Description":"A set of redirect URLs that you provide for PayPal-based payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"state","Description":"The state of the payment, authorization, or order transaction. Value is:\u003cul\u003e\u003cli\u003e\u003ccode\u003ecreated\u003c/code\u003e. The transaction was successfully created.\u003c/li\u003e\u003cli\u003e\u003ccode\u003eapproved\u003c/code\u003e. The buyer approved the transaction.\u003c/li\u003e\u003cli\u003e\u003ccode\u003efailed\u003c/code\u003e. The transaction request failed.\u003c/li\u003e\u003c/ul\u003e","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Transaction","VariableName":"transactions","Description":"An array of payment-related transactions. A transaction defines what the payment is for and who fulfills the payment. For update and execute payment calls, the **`transactions`** object accepts the **`amount`** object only.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"update_time","Description":"The date and time when the payment was updated, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A payment. Use this object to create, process, and manage payments.
 */
public class Payment implements Serializable, Deserializable {

    // Required default constructor
    public Payment() {}

	/**
	* The date and time when the payment was created, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String createTime;

	public String createTime() { return createTime; }
	
	public Payment createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The PayPal-generated ID for the merchant's payment experience profile. For information, see [create web experience profile](/docs/api/payment-experience/#web-profile_create).
	*/
	private String experienceProfileId;

	public String experienceProfileId() { return experienceProfileId; }
	
	public Payment experienceProfileId(String experienceProfileId) {
	    this.experienceProfileId = experienceProfileId;
	    return this;
	}

	/**
	* The reason code for a payment failure.
	*/
	private String failureReason;

	public String failureReason() { return failureReason; }
	
	public Payment failureReason(String failureReason) {
	    this.failureReason = failureReason;
	    return this;
	}

	/**
	* The ID of the payment.
	*/
	private String id;

	public String id() { return id; }
	
	public Payment id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* The payment intent. Value is:<ul><li><code>sale</code>. Makes an immediate payment.</li><li><code>authorize</code>. [Authorizes a payment for capture later](/docs/integration/direct/payments/capture-payment/).</li><li><code>order</code>. [Creates an order](/docs/integration/direct/payments/orders/).</li></ul>
	*/
	private String intent;

	public String intent() { return intent; }
	
	public Payment intent(String intent) {
	    this.intent = intent;
	    return this;
	}

	/**
	*/
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Payment links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* A free-form field that clients can use to send a note to the payer.
	*/
	private String noteToPayer;

	public String noteToPayer() { return noteToPayer; }
	
	public Payment noteToPayer(String noteToPayer) {
	    this.noteToPayer = noteToPayer;
	    return this;
	}

	/**
	* REQUIRED
	* A payer that funds a payment.
	*/
	private Payer payer;

	public Payer payer() { return payer; }
	
	public Payment payer(Payer payer) {
	    this.payer = payer;
	    return this;
	}

	/**
	* A set of redirect URLs that you provide for PayPal-based payments.
	*/
	private RedirectUrls redirectUrls;

	public RedirectUrls redirectUrls() { return redirectUrls; }
	
	public Payment redirectUrls(RedirectUrls redirectUrls) {
	    this.redirectUrls = redirectUrls;
	    return this;
	}

	/**
	* The state of the payment, authorization, or order transaction. Value is:<ul><li><code>created</code>. The transaction was successfully created.</li><li><code>approved</code>. The buyer approved the transaction.</li><li><code>failed</code>. The transaction request failed.</li></ul>
	*/
	private String state;

	public String state() { return state; }
	
	public Payment state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* An array of payment-related transactions. A transaction defines what the payment is for and who fulfills the payment. For update and execute payment calls, the **`transactions`** object accepts the **`amount`** object only.
	*/
	private List<Transaction> transactions;

	public List<Transaction> transactions() { return transactions; }
	
	public Payment transactions(List<Transaction> transactions) {
	    this.transactions = transactions;
	    return this;
	}

	/**
	* The date and time when the payment was updated, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Payment updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (createTime != null) {
            serialized.put("create_time", this.createTime);
        }
        if (experienceProfileId != null) {
            serialized.put("experience_profile_id", this.experienceProfileId);
        }
        if (failureReason != null) {
            serialized.put("failure_reason", this.failureReason);
        }
        if (id != null) {
            serialized.put("id", this.id);
        }
        if (intent != null) {
            serialized.put("intent", this.intent);
        }
        if (links != null) {
            serialized.put("links", this.links);
        }
        if (noteToPayer != null) {
            serialized.put("note_to_payer", this.noteToPayer);
        }
        if (payer != null) {
            serialized.put("payer", this.payer);
        }
        if (redirectUrls != null) {
            serialized.put("redirect_urls", this.redirectUrls);
        }
        if (state != null) {
            serialized.put("state", this.state);
        }
        if (transactions != null) {
            serialized.put("transactions", this.transactions);
        }
        if (updateTime != null) {
            serialized.put("update_time", this.updateTime);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("create_time")) {
            this.createTime = (String) values.get("create_time");
        }
        if (values.containsKey("experience_profile_id")) {
            this.experienceProfileId = (String) values.get("experience_profile_id");
        }
        if (values.containsKey("failure_reason")) {
            this.failureReason = (String) values.get("failure_reason");
        }
        if (values.containsKey("id")) {
            this.id = (String) values.get("id");
        }
        if (values.containsKey("intent")) {
            this.intent = (String) values.get("intent");
        }
        if (values.containsKey("links")) {
            this.links = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("links");
				for (Map<String, Object> nestedValue : nestedValues) {
					LinkDescriptionObject nested = new LinkDescriptionObject();
					nested.deserialize(nestedValue);
					this.links.add(nested);
                }
        }
        if (values.containsKey("note_to_payer")) {
            this.noteToPayer = (String) values.get("note_to_payer");
        }
        if (values.containsKey("payer")) {
            this.payer = new Payer();
            this.payer.deserialize((Map<String, Object>) values.get("payer"));
        }
        if (values.containsKey("redirect_urls")) {
            this.redirectUrls = new RedirectUrls();
            this.redirectUrls.deserialize((Map<String, Object>) values.get("redirect_urls"));
        }
        if (values.containsKey("state")) {
            this.state = (String) values.get("state");
        }
        if (values.containsKey("transactions")) {
            this.transactions = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("transactions");
				for (Map<String, Object> nestedValue : nestedValues) {
					Transaction nested = new Transaction();
					nested.deserialize(nestedValue);
					this.transactions.add(nested);
                }
        }
        if (values.containsKey("update_time")) {
            this.updateTime = (String) values.get("update_time");
        }
    }
}

