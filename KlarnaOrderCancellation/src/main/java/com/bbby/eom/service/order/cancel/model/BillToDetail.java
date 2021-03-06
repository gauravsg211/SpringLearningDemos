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
 *         &lt;element name="BillToFirstName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillToLastName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillToAddressLine1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="75"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillToAddressLine2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="75"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillToAddressLine3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="75"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillToCity"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillToState"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillToPostalCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillToCountry"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillToPhone" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillToEmail" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
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
    "billToFirstName",
    "billToLastName",
    "billToAddressLine1",
    "billToAddressLine2",
    "billToAddressLine3",
    "billToCity",
    "billToState",
    "billToPostalCode",
    "billToCountry",
    "billToPhone",
    "billToEmail"
})
public class BillToDetail {

    @XmlElement(name = "BillToFirstName", required = true)
    protected String billToFirstName;
    @XmlElement(name = "BillToLastName", required = true)
    protected String billToLastName;
    @XmlElement(name = "BillToAddressLine1", required = true)
    protected String billToAddressLine1;
    @XmlElementRef(name = "BillToAddressLine2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billToAddressLine2;
    @XmlElementRef(name = "BillToAddressLine3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billToAddressLine3;
    @XmlElement(name = "BillToCity", required = true)
    protected String billToCity;
    @XmlElement(name = "BillToState", required = true)
    protected String billToState;
    @XmlElement(name = "BillToPostalCode", required = true)
    protected String billToPostalCode;
    @XmlElement(name = "BillToCountry", required = true)
    protected String billToCountry;
    @XmlElementRef(name = "BillToPhone", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billToPhone;
    @XmlElementRef(name = "BillToEmail", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billToEmail;

    /**
     * Gets the value of the billToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToFirstName() {
        return billToFirstName;
    }

    /**
     * Sets the value of the billToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToFirstName(String value) {
        this.billToFirstName = value;
    }

    /**
     * Gets the value of the billToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToLastName() {
        return billToLastName;
    }

    /**
     * Sets the value of the billToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToLastName(String value) {
        this.billToLastName = value;
    }

    /**
     * Gets the value of the billToAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAddressLine1() {
        return billToAddressLine1;
    }

    /**
     * Sets the value of the billToAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAddressLine1(String value) {
        this.billToAddressLine1 = value;
    }

    /**
     * Gets the value of the billToAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillToAddressLine2() {
        return billToAddressLine2;
    }

    /**
     * Sets the value of the billToAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillToAddressLine2(JAXBElement<String> value) {
        this.billToAddressLine2 = value;
    }

    /**
     * Gets the value of the billToAddressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillToAddressLine3() {
        return billToAddressLine3;
    }

    /**
     * Sets the value of the billToAddressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillToAddressLine3(JAXBElement<String> value) {
        this.billToAddressLine3 = value;
    }

    /**
     * Gets the value of the billToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCity() {
        return billToCity;
    }

    /**
     * Sets the value of the billToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCity(String value) {
        this.billToCity = value;
    }

    /**
     * Gets the value of the billToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToState() {
        return billToState;
    }

    /**
     * Sets the value of the billToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToState(String value) {
        this.billToState = value;
    }

    /**
     * Gets the value of the billToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToPostalCode() {
        return billToPostalCode;
    }

    /**
     * Sets the value of the billToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToPostalCode(String value) {
        this.billToPostalCode = value;
    }

    /**
     * Gets the value of the billToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCountry() {
        return billToCountry;
    }

    /**
     * Sets the value of the billToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCountry(String value) {
        this.billToCountry = value;
    }

    /**
     * Gets the value of the billToPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillToPhone() {
        return billToPhone;
    }

    /**
     * Sets the value of the billToPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillToPhone(JAXBElement<String> value) {
        this.billToPhone = value;
    }

    /**
     * Gets the value of the billToEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillToEmail() {
        return billToEmail;
    }

    /**
     * Sets the value of the billToEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillToEmail(JAXBElement<String> value) {
        this.billToEmail = value;
    }

}
