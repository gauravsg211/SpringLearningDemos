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
 *         &lt;element name="ExtChargeDetailId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ChargeCategory"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Base Price"/&gt;
 *               &lt;enumeration value="Shipping"/&gt;
 *               &lt;enumeration value="Misc"/&gt;
 *               &lt;enumeration value="Value Added Services"/&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="Return Credits"/&gt;
 *               &lt;enumeration value="Return Charges"/&gt;
 *               &lt;enumeration value="Gift Packaging"/&gt;
 *               &lt;enumeration value="Refund SnH"/&gt;
 *               &lt;enumeration value="Label Handling"/&gt;
 *               &lt;enumeration value="Restocking Fee"/&gt;
 *               &lt;enumeration value="MISC"/&gt;
 *               &lt;enumeration value="Eco Fee"/&gt;
 *               &lt;enumeration value="Item Surcharge"/&gt;
 *               &lt;enumeration value="Delivery Surcharge"/&gt;
 *               &lt;enumeration value="Assembly Charge"/&gt;
 *               &lt;enumeration value="Adjustment"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ChargeName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ChargeAmount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="11"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UnitCharge" minOccurs="0"&gt;
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
 *         &lt;element name="TaxIncluded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OriginalChargeAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;union&gt;
 *               &lt;simpleType&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                   &lt;totalDigits value="13"/&gt;
 *                   &lt;fractionDigits value="4"/&gt;
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
 *         &lt;element name="MarkForDeletion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IsOverridden" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OverrideReason_3" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CreatedSource" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="25"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ReasonCode" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Comments" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1000"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="InitiatingSystem" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
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
    "extChargeDetailId",
    "chargeCategory",
    "chargeName",
    "chargeAmount",
    "unitCharge",
    "taxIncluded",
    "originalChargeAmount",
    "markForDeletion",
    "isOverridden",
    "overrideReason3"
})
public class ChargeDetail6 {

    @XmlElement(name = "ExtChargeDetailId", required = true)
    protected String extChargeDetailId;
    @XmlElement(name = "ChargeCategory", required = true)
    protected String chargeCategory;
    @XmlElementRef(name = "ChargeName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chargeName;
    @XmlElement(name = "ChargeAmount", required = true)
    protected BigDecimal chargeAmount;
    @XmlElementRef(name = "UnitCharge", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitCharge;
    @XmlElementRef(name = "TaxIncluded", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxIncluded;
    @XmlElementRef(name = "OriginalChargeAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalChargeAmount;
    @XmlElementRef(name = "MarkForDeletion", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markForDeletion;
    @XmlElementRef(name = "IsOverridden", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isOverridden;
    @XmlElement(name = "OverrideReason_3")
    protected OverrideReason3 overrideReason3;

    /**
     * Gets the value of the extChargeDetailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtChargeDetailId() {
        return extChargeDetailId;
    }

    /**
     * Sets the value of the extChargeDetailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtChargeDetailId(String value) {
        this.extChargeDetailId = value;
    }

    /**
     * Gets the value of the chargeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCategory() {
        return chargeCategory;
    }

    /**
     * Sets the value of the chargeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCategory(String value) {
        this.chargeCategory = value;
    }

    /**
     * Gets the value of the chargeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChargeName() {
        return chargeName;
    }

    /**
     * Sets the value of the chargeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChargeName(JAXBElement<String> value) {
        this.chargeName = value;
    }

    /**
     * Gets the value of the chargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Sets the value of the chargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeAmount(BigDecimal value) {
        this.chargeAmount = value;
    }

    /**
     * Gets the value of the unitCharge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitCharge() {
        return unitCharge;
    }

    /**
     * Sets the value of the unitCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitCharge(JAXBElement<String> value) {
        this.unitCharge = value;
    }

    /**
     * Gets the value of the taxIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxIncluded() {
        return taxIncluded;
    }

    /**
     * Sets the value of the taxIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxIncluded(JAXBElement<String> value) {
        this.taxIncluded = value;
    }

    /**
     * Gets the value of the originalChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalChargeAmount() {
        return originalChargeAmount;
    }

    /**
     * Sets the value of the originalChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalChargeAmount(JAXBElement<String> value) {
        this.originalChargeAmount = value;
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
     * Gets the value of the isOverridden property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsOverridden() {
        return isOverridden;
    }

    /**
     * Sets the value of the isOverridden property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsOverridden(JAXBElement<String> value) {
        this.isOverridden = value;
    }

    /**
     * Gets the value of the overrideReason3 property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideReason3 }
     *     
     */
    public OverrideReason3 getOverrideReason3() {
        return overrideReason3;
    }

    /**
     * Sets the value of the overrideReason3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideReason3 }
     *     
     */
    public void setOverrideReason3(OverrideReason3 value) {
        this.overrideReason3 = value;
    }

}