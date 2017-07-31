// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// TemplateData.java
// DO NOT EDIT
// @type object
// @json {"Type":"Template Data","VariableName":"","Description":"Template data.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"boolean","VariableName":"allow_partial_payment","Description":"Indicates whether the invoice allows a partial payment. If `false`, invoice must be paid in full. If `true`, the invoice allows partial payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"File Attachment","VariableName":"attachments","Description":"List of files that are attached to the invoice.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Billing Info","VariableName":"billing_info","Description":"The required invoice recipient email address and any optional billing information. Supports one recipient only.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"cc_info","Description":"For invoices sent by email, one or more email addresses to which to send a CC: copy of the notification. Supports only email addresses under participant.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Custom Amount","VariableName":"custom","Description":"The custom amount to apply to an invoice. If you include a label, you must include a custom amount.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Cost","VariableName":"discount","Description":"The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Invoice Item","VariableName":"items","Description":"The list of items to include in the invoice. Each invoice can contain up to 100 items.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"logo_url","Description":"The full URL of an external logo image.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Merchant Information","VariableName":"merchant_info","Description":"Merchant business information that appears on the invoice.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"merchant_memo","Description":"A private bookkeeping memo for the merchant.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"minimum_amount_due","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"note","Description":"A note to the payer.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payment Term","VariableName":"payment_term","Description":"The payment term of the invoice. If you specify `term_type`, you cannot specify `due_date`, and vice versa.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reference","Description":"Reference data, such as PO number, to add to the invoice.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Shipping Cost","VariableName":"shipping_cost","Description":"The shipping cost, as a percentage or amount value.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Shipping Info","VariableName":"shipping_info","Description":"The shipping information for the invoice recipient.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"tax_calculated_after_discount","Description":"Indicates whether the invoice allows a partial payment. If `false`, invoice must be paid in full. If `true`, the invoice allows partial payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"tax_inclusive","Description":"Indicates whether the unit price includes tax.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"terms","Description":"The general terms of the invoice.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"total_amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Template data.
 */
public class TemplateData implements Serializable, Deserializable {

    // Required default constructor
    public TemplateData() {}

	/**
	* Indicates whether the invoice allows a partial payment. If `false`, invoice must be paid in full. If `true`, the invoice allows partial payments.
	*/
	private Boolean allowPartialPayment;

	public Boolean allowPartialPayment() { return allowPartialPayment; }
	
	public TemplateData allowPartialPayment(Boolean allowPartialPayment) {
	    this.allowPartialPayment = allowPartialPayment;
	    return this;
	}

	/**
	* List of files that are attached to the invoice.
	*/
	private List<FileAttachment> attachments;

	public List<FileAttachment> attachments() { return attachments; }
	
	public TemplateData attachments(List<FileAttachment> attachments) {
	    this.attachments = attachments;
	    return this;
	}

	/**
	* The required invoice recipient email address and any optional billing information. Supports one recipient only.
	*/
	private List<BillingInfo> billingInfo;

	public List<BillingInfo> billingInfo() { return billingInfo; }
	
	public TemplateData billingInfo(List<BillingInfo> billingInfo) {
	    this.billingInfo = billingInfo;
	    return this;
	}

	/**
	* For invoices sent by email, one or more email addresses to which to send a CC: copy of the notification. Supports only email addresses under participant.
	*/
	private List<String> ccInfo;

	public List<String> ccInfo() { return ccInfo; }
	
	public TemplateData ccInfo(List<String> ccInfo) {
	    this.ccInfo = ccInfo;
	    return this;
	}

	/**
	* The custom amount to apply to an invoice. If you include a label, you must include a custom amount.
	*/
	private CustomAmount custom;

	public CustomAmount custom() { return custom; }
	
	public TemplateData custom(CustomAmount custom) {
	    this.custom = custom;
	    return this;
	}

	/**
	* The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.
	*/
	private Cost discount;

	public Cost discount() { return discount; }
	
	public TemplateData discount(Cost discount) {
	    this.discount = discount;
	    return this;
	}

	/**
	* The list of items to include in the invoice. Each invoice can contain up to 100 items.
	*/
	private List<InvoiceItem> items;

	public List<InvoiceItem> items() { return items; }
	
	public TemplateData items(List<InvoiceItem> items) {
	    this.items = items;
	    return this;
	}

	/**
	* The full URL of an external logo image.
	*/
	private String logoUrl;

	public String logoUrl() { return logoUrl; }
	
	public TemplateData logoUrl(String logoUrl) {
	    this.logoUrl = logoUrl;
	    return this;
	}

	/**
	* REQUIRED
	* Merchant business information that appears on the invoice.
	*/
	private MerchantInformation merchantInfo;

	public MerchantInformation merchantInfo() { return merchantInfo; }
	
	public TemplateData merchantInfo(MerchantInformation merchantInfo) {
	    this.merchantInfo = merchantInfo;
	    return this;
	}

	/**
	* A private bookkeeping memo for the merchant.
	*/
	private String merchantMemo;

	public String merchantMemo() { return merchantMemo; }
	
	public TemplateData merchantMemo(String merchantMemo) {
	    this.merchantMemo = merchantMemo;
	    return this;
	}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	private Currency minimumAmountDue;

	public Currency minimumAmountDue() { return minimumAmountDue; }
	
	public TemplateData minimumAmountDue(Currency minimumAmountDue) {
	    this.minimumAmountDue = minimumAmountDue;
	    return this;
	}

	/**
	* A note to the payer.
	*/
	private String note;

	public String note() { return note; }
	
	public TemplateData note(String note) {
	    this.note = note;
	    return this;
	}

	/**
	* The payment term of the invoice. If you specify `term_type`, you cannot specify `due_date`, and vice versa.
	*/
	private PaymentTerm paymentTerm;

	public PaymentTerm paymentTerm() { return paymentTerm; }
	
	public TemplateData paymentTerm(PaymentTerm paymentTerm) {
	    this.paymentTerm = paymentTerm;
	    return this;
	}

	/**
	* Reference data, such as PO number, to add to the invoice.
	*/
	private String reference;

	public String reference() { return reference; }
	
	public TemplateData reference(String reference) {
	    this.reference = reference;
	    return this;
	}

	/**
	* The shipping cost, as a percentage or amount value.
	*/
	private ShippingCost shippingCost;

	public ShippingCost shippingCost() { return shippingCost; }
	
	public TemplateData shippingCost(ShippingCost shippingCost) {
	    this.shippingCost = shippingCost;
	    return this;
	}

	/**
	* The shipping information for the invoice recipient.
	*/
	private ShippingInfo shippingInfo;

	public ShippingInfo shippingInfo() { return shippingInfo; }
	
	public TemplateData shippingInfo(ShippingInfo shippingInfo) {
	    this.shippingInfo = shippingInfo;
	    return this;
	}

	/**
	* Indicates whether the invoice allows a partial payment. If `false`, invoice must be paid in full. If `true`, the invoice allows partial payments.
	*/
	private Boolean taxCalculatedAfterDiscount;

	public Boolean taxCalculatedAfterDiscount() { return taxCalculatedAfterDiscount; }
	
	public TemplateData taxCalculatedAfterDiscount(Boolean taxCalculatedAfterDiscount) {
	    this.taxCalculatedAfterDiscount = taxCalculatedAfterDiscount;
	    return this;
	}

	/**
	* Indicates whether the unit price includes tax.
	*/
	private Boolean taxInclusive;

	public Boolean taxInclusive() { return taxInclusive; }
	
	public TemplateData taxInclusive(Boolean taxInclusive) {
	    this.taxInclusive = taxInclusive;
	    return this;
	}

	/**
	* The general terms of the invoice.
	*/
	private String terms;

	public String terms() { return terms; }
	
	public TemplateData terms(String terms) {
	    this.terms = terms;
	    return this;
	}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	private Currency totalAmount;

	public Currency totalAmount() { return totalAmount; }
	
	public TemplateData totalAmount(Currency totalAmount) {
	    this.totalAmount = totalAmount;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (allowPartialPayment != null) {
            serialized.put("allow_partial_payment", this.allowPartialPayment);
        }
        if (attachments != null) {
            serialized.put("attachments", this.attachments);
        }
        if (billingInfo != null) {
            serialized.put("billing_info", this.billingInfo);
        }
        if (ccInfo != null) {
            serialized.put("cc_info", this.ccInfo);
        }
        if (custom != null) {
            serialized.put("custom", this.custom);
        }
        if (discount != null) {
            serialized.put("discount", this.discount);
        }
        if (items != null) {
            serialized.put("items", this.items);
        }
        if (logoUrl != null) {
            serialized.put("logo_url", this.logoUrl);
        }
        if (merchantInfo != null) {
            serialized.put("merchant_info", this.merchantInfo);
        }
        if (merchantMemo != null) {
            serialized.put("merchant_memo", this.merchantMemo);
        }
        if (minimumAmountDue != null) {
            serialized.put("minimum_amount_due", this.minimumAmountDue);
        }
        if (note != null) {
            serialized.put("note", this.note);
        }
        if (paymentTerm != null) {
            serialized.put("payment_term", this.paymentTerm);
        }
        if (reference != null) {
            serialized.put("reference", this.reference);
        }
        if (shippingCost != null) {
            serialized.put("shipping_cost", this.shippingCost);
        }
        if (shippingInfo != null) {
            serialized.put("shipping_info", this.shippingInfo);
        }
        if (taxCalculatedAfterDiscount != null) {
            serialized.put("tax_calculated_after_discount", this.taxCalculatedAfterDiscount);
        }
        if (taxInclusive != null) {
            serialized.put("tax_inclusive", this.taxInclusive);
        }
        if (terms != null) {
            serialized.put("terms", this.terms);
        }
        if (totalAmount != null) {
            serialized.put("total_amount", this.totalAmount);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("allow_partial_payment")) {
            this.allowPartialPayment = (Boolean) values.get("allow_partial_payment");
        }
        if (values.containsKey("attachments")) {
            this.attachments = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("attachments");
				for (Map<String, Object> nestedValue : nestedValues) {
					FileAttachment nested = new FileAttachment();
					nested.deserialize(nestedValue);
					this.attachments.add(nested);
                }
        }
        if (values.containsKey("billing_info")) {
            this.billingInfo = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("billing_info");
				for (Map<String, Object> nestedValue : nestedValues) {
					BillingInfo nested = new BillingInfo();
					nested.deserialize(nestedValue);
					this.billingInfo.add(nested);
                }
        }
        if (values.containsKey("cc_info")) {
            this.ccInfo = new ArrayList<>();
                List<String> nestedValues = (List<String>) values.get("cc_info");
                for (String nestedValue : nestedValues) {
                    this.ccInfo.add(nestedValue);
                }
        }
        if (values.containsKey("custom")) {
            this.custom = new CustomAmount();
            this.custom.deserialize((Map<String, Object>) values.get("custom"));
        }
        if (values.containsKey("discount")) {
            this.discount = new Cost();
            this.discount.deserialize((Map<String, Object>) values.get("discount"));
        }
        if (values.containsKey("items")) {
            this.items = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("items");
				for (Map<String, Object> nestedValue : nestedValues) {
					InvoiceItem nested = new InvoiceItem();
					nested.deserialize(nestedValue);
					this.items.add(nested);
                }
        }
        if (values.containsKey("logo_url")) {
            this.logoUrl = (String) values.get("logo_url");
        }
        if (values.containsKey("merchant_info")) {
            this.merchantInfo = new MerchantInformation();
            this.merchantInfo.deserialize((Map<String, Object>) values.get("merchant_info"));
        }
        if (values.containsKey("merchant_memo")) {
            this.merchantMemo = (String) values.get("merchant_memo");
        }
        if (values.containsKey("minimum_amount_due")) {
            this.minimumAmountDue = new Currency();
            this.minimumAmountDue.deserialize((Map<String, Object>) values.get("minimum_amount_due"));
        }
        if (values.containsKey("note")) {
            this.note = (String) values.get("note");
        }
        if (values.containsKey("payment_term")) {
            this.paymentTerm = new PaymentTerm();
            this.paymentTerm.deserialize((Map<String, Object>) values.get("payment_term"));
        }
        if (values.containsKey("reference")) {
            this.reference = (String) values.get("reference");
        }
        if (values.containsKey("shipping_cost")) {
            this.shippingCost = new ShippingCost();
            this.shippingCost.deserialize((Map<String, Object>) values.get("shipping_cost"));
        }
        if (values.containsKey("shipping_info")) {
            this.shippingInfo = new ShippingInfo();
            this.shippingInfo.deserialize((Map<String, Object>) values.get("shipping_info"));
        }
        if (values.containsKey("tax_calculated_after_discount")) {
            this.taxCalculatedAfterDiscount = (Boolean) values.get("tax_calculated_after_discount");
        }
        if (values.containsKey("tax_inclusive")) {
            this.taxInclusive = (Boolean) values.get("tax_inclusive");
        }
        if (values.containsKey("terms")) {
            this.terms = (String) values.get("terms");
        }
        if (values.containsKey("total_amount")) {
            this.totalAmount = new Currency();
            this.totalAmount.deserialize((Map<String, Object>) values.get("total_amount"));
        }
    }
}

