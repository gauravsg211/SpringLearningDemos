//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.23 at 06:53:36 PM IST 
//


package com.bbby.eom.service.order.cancel.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalPaymentTransactionId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionReferenceCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestedAmount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="11"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestToken" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FollowOnId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FollowOnToken" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestedDTTM" type="{}NonRequiredStringDateTime" minOccurs="0"/&gt;
 *         &lt;element name="ProcessedAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;union&gt;
 *               &lt;simpleType&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                   &lt;totalDigits value="11"/&gt;
 *                   &lt;fractionDigits value="2"/&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/simpleType&gt;
 *               &lt;simpleType&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                   &lt;enumeration value=""/&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/simpleType&gt;
 *             &lt;/union&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionDTTM" type="{}NonRequiredStringDateTime" minOccurs="0"/&gt;
 *         &lt;element name="TransactionExpiryDate" type="{}NonRequiredStringDate" minOccurs="0"/&gt;
 *         &lt;element name="ReconciliationId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExternalResponseCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExternalResponseMessage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionDecisionDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MarkForDeletion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MerchantID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MerchantPassword" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MerchantSignature" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceField3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceField4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceField5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceField6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceField7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceField8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceField9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceField10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RefundReferenceID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Authorization"/&gt;
 *               &lt;enumeration value="Settlement"/&gt;
 *               &lt;enumeration value="Refund"/&gt;
 *               &lt;enumeration value="Balancecheck"/&gt;
 *               &lt;enumeration value="All"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionDecision" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Success"/&gt;
 *               &lt;enumeration value="Failure"/&gt;
 *               &lt;enumeration value="Unavailable"/&gt;
 *               &lt;enumeration value="Fraud"/&gt;
 *               &lt;enumeration value=""/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InvoiceList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Invoice" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="InvoiceNumber"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="50"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="InvoiceTransactionAmount"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                   &lt;totalDigits value="11"/&gt;
 *                                   &lt;fractionDigits value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "externalPaymentTransactionId",
    "transactionReferenceCode",
    "requestedAmount",
    "requestId",
    "requestToken",
    "followOnId",
    "followOnToken",
    "requestedDTTM",
    "processedAmount",
    "transactionDTTM",
    "transactionExpiryDate",
    "reconciliationId",
    "externalResponseCode",
    "externalResponseMessage",
    "transactionDecisionDescription",
    "markForDeletion",
    "merchantID",
    "merchantPassword",
    "merchantSignature",
    "referenceField3",
    "referenceField4",
    "referenceField5",
    "referenceField6",
    "referenceField7",
    "referenceField8",
    "referenceField9",
    "referenceField10",
    "refundReferenceID",
    "transactionType",
    "transactionDecision",
    "invoiceList"
})
public class PaymentTransactionDetail {

    @XmlElement(name = "ExternalPaymentTransactionId", required = true)
    protected String externalPaymentTransactionId;
    @XmlElementRef(name = "TransactionReferenceCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionReferenceCode;
    @XmlElement(name = "RequestedAmount", required = true)
    protected BigDecimal requestedAmount;
    @XmlElementRef(name = "RequestId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestId;
    @XmlElementRef(name = "RequestToken", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestToken;
    @XmlElementRef(name = "FollowOnId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> followOnId;
    @XmlElementRef(name = "FollowOnToken", type = JAXBElement.class, required = false)
    protected JAXBElement<String> followOnToken;
    @XmlElementRef(name = "RequestedDTTM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestedDTTM;
    @XmlElementRef(name = "ProcessedAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processedAmount;
    @XmlElementRef(name = "TransactionDTTM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionDTTM;
    @XmlElementRef(name = "TransactionExpiryDate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionExpiryDate;
    @XmlElementRef(name = "ReconciliationId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reconciliationId;
    @XmlElementRef(name = "ExternalResponseCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalResponseCode;
    @XmlElementRef(name = "ExternalResponseMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalResponseMessage;
    @XmlElementRef(name = "TransactionDecisionDescription", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionDecisionDescription;
    @XmlElementRef(name = "MarkForDeletion", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markForDeletion;
    @XmlElementRef(name = "MerchantID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantID;
    @XmlElementRef(name = "MerchantPassword", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantPassword;
    @XmlElementRef(name = "MerchantSignature", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantSignature;
    @XmlElementRef(name = "ReferenceField3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceField3;
    @XmlElementRef(name = "ReferenceField4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceField4;
    @XmlElementRef(name = "ReferenceField5", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceField5;
    @XmlElementRef(name = "ReferenceField6", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceField6;
    @XmlElementRef(name = "ReferenceField7", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceField7;
    @XmlElementRef(name = "ReferenceField8", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceField8;
    @XmlElementRef(name = "ReferenceField9", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceField9;
    @XmlElementRef(name = "ReferenceField10", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceField10;
    @XmlElementRef(name = "RefundReferenceID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refundReferenceID;
    @XmlElement(name = "TransactionType", required = true)
    protected String transactionType;
    @XmlElementRef(name = "TransactionDecision", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionDecision;
    @XmlElement(name = "InvoiceList")
    protected InvoiceList invoiceList;

    /**
     * Gets the value of the externalPaymentTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPaymentTransactionId() {
        return externalPaymentTransactionId;
    }

    /**
     * Sets the value of the externalPaymentTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPaymentTransactionId(String value) {
        this.externalPaymentTransactionId = value;
    }

    /**
     * Gets the value of the transactionReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionReferenceCode() {
        return transactionReferenceCode;
    }

    /**
     * Sets the value of the transactionReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionReferenceCode(JAXBElement<String> value) {
        this.transactionReferenceCode = value;
    }

    /**
     * Gets the value of the requestedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedAmount() {
        return requestedAmount;
    }

    /**
     * Sets the value of the requestedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestedAmount(BigDecimal value) {
        this.requestedAmount = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestId(JAXBElement<String> value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the requestToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestToken() {
        return requestToken;
    }

    /**
     * Sets the value of the requestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestToken(JAXBElement<String> value) {
        this.requestToken = value;
    }

    /**
     * Gets the value of the followOnId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFollowOnId() {
        return followOnId;
    }

    /**
     * Sets the value of the followOnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFollowOnId(JAXBElement<String> value) {
        this.followOnId = value;
    }

    /**
     * Gets the value of the followOnToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFollowOnToken() {
        return followOnToken;
    }

    /**
     * Sets the value of the followOnToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFollowOnToken(JAXBElement<String> value) {
        this.followOnToken = value;
    }

    /**
     * Gets the value of the requestedDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestedDTTM() {
        return requestedDTTM;
    }

    /**
     * Sets the value of the requestedDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestedDTTM(JAXBElement<String> value) {
        this.requestedDTTM = value;
    }

    /**
     * Gets the value of the processedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessedAmount() {
        return processedAmount;
    }

    /**
     * Sets the value of the processedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessedAmount(JAXBElement<String> value) {
        this.processedAmount = value;
    }

    /**
     * Gets the value of the transactionDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionDTTM() {
        return transactionDTTM;
    }

    /**
     * Sets the value of the transactionDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionDTTM(JAXBElement<String> value) {
        this.transactionDTTM = value;
    }

    /**
     * Gets the value of the transactionExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionExpiryDate() {
        return transactionExpiryDate;
    }

    /**
     * Sets the value of the transactionExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionExpiryDate(JAXBElement<String> value) {
        this.transactionExpiryDate = value;
    }

    /**
     * Gets the value of the reconciliationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReconciliationId() {
        return reconciliationId;
    }

    /**
     * Sets the value of the reconciliationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReconciliationId(JAXBElement<String> value) {
        this.reconciliationId = value;
    }

    /**
     * Gets the value of the externalResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalResponseCode() {
        return externalResponseCode;
    }

    /**
     * Sets the value of the externalResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalResponseCode(JAXBElement<String> value) {
        this.externalResponseCode = value;
    }

    /**
     * Gets the value of the externalResponseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalResponseMessage() {
        return externalResponseMessage;
    }

    /**
     * Sets the value of the externalResponseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalResponseMessage(JAXBElement<String> value) {
        this.externalResponseMessage = value;
    }

    /**
     * Gets the value of the transactionDecisionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionDecisionDescription() {
        return transactionDecisionDescription;
    }

    /**
     * Sets the value of the transactionDecisionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionDecisionDescription(JAXBElement<String> value) {
        this.transactionDecisionDescription = value;
    }

    /**
     * Gets the value of the markForDeletion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkForDeletion() {
        return markForDeletion;
    }

    /**
     * Sets the value of the markForDeletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkForDeletion(JAXBElement<String> value) {
        this.markForDeletion = value;
    }

    /**
     * Gets the value of the merchantID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchantID(JAXBElement<String> value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the merchantPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchantPassword() {
        return merchantPassword;
    }

    /**
     * Sets the value of the merchantPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchantPassword(JAXBElement<String> value) {
        this.merchantPassword = value;
    }

    /**
     * Gets the value of the merchantSignature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchantSignature() {
        return merchantSignature;
    }

    /**
     * Sets the value of the merchantSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchantSignature(JAXBElement<String> value) {
        this.merchantSignature = value;
    }

    /**
     * Gets the value of the referenceField3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceField3() {
        return referenceField3;
    }

    /**
     * Sets the value of the referenceField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceField3(JAXBElement<String> value) {
        this.referenceField3 = value;
    }

    /**
     * Gets the value of the referenceField4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceField4() {
        return referenceField4;
    }

    /**
     * Sets the value of the referenceField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceField4(JAXBElement<String> value) {
        this.referenceField4 = value;
    }

    /**
     * Gets the value of the referenceField5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceField5() {
        return referenceField5;
    }

    /**
     * Sets the value of the referenceField5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceField5(JAXBElement<String> value) {
        this.referenceField5 = value;
    }

    /**
     * Gets the value of the referenceField6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceField6() {
        return referenceField6;
    }

    /**
     * Sets the value of the referenceField6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceField6(JAXBElement<String> value) {
        this.referenceField6 = value;
    }

    /**
     * Gets the value of the referenceField7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceField7() {
        return referenceField7;
    }

    /**
     * Sets the value of the referenceField7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceField7(JAXBElement<String> value) {
        this.referenceField7 = value;
    }

    /**
     * Gets the value of the referenceField8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceField8() {
        return referenceField8;
    }

    /**
     * Sets the value of the referenceField8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceField8(JAXBElement<String> value) {
        this.referenceField8 = value;
    }

    /**
     * Gets the value of the referenceField9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceField9() {
        return referenceField9;
    }

    /**
     * Sets the value of the referenceField9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceField9(JAXBElement<String> value) {
        this.referenceField9 = value;
    }

    /**
     * Gets the value of the referenceField10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceField10() {
        return referenceField10;
    }

    /**
     * Sets the value of the referenceField10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceField10(JAXBElement<String> value) {
        this.referenceField10 = value;
    }

    /**
     * Gets the value of the refundReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefundReferenceID() {
        return refundReferenceID;
    }

    /**
     * Sets the value of the refundReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefundReferenceID(JAXBElement<String> value) {
        this.refundReferenceID = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionDecision property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionDecision() {
        return transactionDecision;
    }

    /**
     * Sets the value of the transactionDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionDecision(JAXBElement<String> value) {
        this.transactionDecision = value;
    }

    /**
     * Gets the value of the invoiceList property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceList }
     *     
     */
    public InvoiceList getInvoiceList() {
        return invoiceList;
    }

    /**
     * Sets the value of the invoiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceList }
     *     
     */
    public void setInvoiceList(InvoiceList value) {
        this.invoiceList = value;
    }

}
