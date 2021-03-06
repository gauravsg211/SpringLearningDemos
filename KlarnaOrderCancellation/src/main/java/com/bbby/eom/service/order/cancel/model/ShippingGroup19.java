//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.23 at 06:53:36 PM IST 
//


package com.bbby.eom.service.order.cancel.model;

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
 *         &lt;element name="ExternalShippingGroupID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GiftWrap"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PackAndHold"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PackAndHoldDeliveryBy" type="{}NonRequiredStringDateTime" minOccurs="0"/&gt;
 *         &lt;element name="GiftMessage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SignatureRequired" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *               &lt;enumeration value=""/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
    "externalShippingGroupID",
    "giftWrap",
    "packAndHold",
    "packAndHoldDeliveryBy",
    "giftMessage",
    "signatureRequired"
})
public class ShippingGroup19 {

    @XmlElement(name = "ExternalShippingGroupID", required = true)
    protected String externalShippingGroupID;
    @XmlElement(name = "GiftWrap", required = true)
    protected String giftWrap;
    @XmlElement(name = "PackAndHold", required = true)
    protected String packAndHold;
    @XmlElementRef(name = "PackAndHoldDeliveryBy", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packAndHoldDeliveryBy;
    @XmlElementRef(name = "GiftMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> giftMessage;
    @XmlElementRef(name = "SignatureRequired", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signatureRequired;

    /**
     * Gets the value of the externalShippingGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalShippingGroupID() {
        return externalShippingGroupID;
    }

    /**
     * Sets the value of the externalShippingGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalShippingGroupID(String value) {
        this.externalShippingGroupID = value;
    }

    /**
     * Gets the value of the giftWrap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftWrap() {
        return giftWrap;
    }

    /**
     * Sets the value of the giftWrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftWrap(String value) {
        this.giftWrap = value;
    }

    /**
     * Gets the value of the packAndHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackAndHold() {
        return packAndHold;
    }

    /**
     * Sets the value of the packAndHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackAndHold(String value) {
        this.packAndHold = value;
    }

    /**
     * Gets the value of the packAndHoldDeliveryBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackAndHoldDeliveryBy() {
        return packAndHoldDeliveryBy;
    }

    /**
     * Sets the value of the packAndHoldDeliveryBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackAndHoldDeliveryBy(JAXBElement<String> value) {
        this.packAndHoldDeliveryBy = value;
    }

    /**
     * Gets the value of the giftMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGiftMessage() {
        return giftMessage;
    }

    /**
     * Sets the value of the giftMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGiftMessage(JAXBElement<String> value) {
        this.giftMessage = value;
    }

    /**
     * Gets the value of the signatureRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignatureRequired() {
        return signatureRequired;
    }

    /**
     * Sets the value of the signatureRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignatureRequired(JAXBElement<String> value) {
        this.signatureRequired = value;
    }

}
