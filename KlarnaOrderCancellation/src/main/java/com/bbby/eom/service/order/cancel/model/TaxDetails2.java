//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.23 at 06:53:36 PM IST 
//


package com.bbby.eom.service.order.cancel.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="TaxDetail_5" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ExtTaxDetailId"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RequestType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="QUOTATION"/&gt;
 *                         &lt;enumeration value="INVOICE"/&gt;
 *                         &lt;enumeration value="ADJUSTMENT"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TaxCategory"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="100"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ChargeCategory" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Base Price"/&gt;
 *                         &lt;enumeration value="Shipping"/&gt;
 *                         &lt;enumeration value="Misc"/&gt;
 *                         &lt;enumeration value="Value Added Services"/&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="Return Credits"/&gt;
 *                         &lt;enumeration value="Return Charges"/&gt;
 *                         &lt;enumeration value="Gift Packaging"/&gt;
 *                         &lt;enumeration value="Refund SnH"/&gt;
 *                         &lt;enumeration value="Label Handling"/&gt;
 *                         &lt;enumeration value="Restocking Fee"/&gt;
 *                         &lt;enumeration value="MISC"/&gt;
 *                         &lt;enumeration value="Eco Fee"/&gt;
 *                         &lt;enumeration value="Item Surcharge"/&gt;
 *                         &lt;enumeration value="Delivery Surcharge"/&gt;
 *                         &lt;enumeration value="Assembly Charge"/&gt;
 *                         &lt;enumeration value="Adjustment"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TaxName"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TaxLocationName" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TaxAmount"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                         &lt;totalDigits value="11"/&gt;
 *                         &lt;fractionDigits value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TaxRate" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;union&gt;
 *                         &lt;simpleType&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                             &lt;totalDigits value="13"/&gt;
 *                             &lt;fractionDigits value="4"/&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/simpleType&gt;
 *                         &lt;simpleType&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                             &lt;enumeration value=""/&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/simpleType&gt;
 *                       &lt;/union&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TaxableAmount" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;union&gt;
 *                         &lt;simpleType&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                             &lt;totalDigits value="11"/&gt;
 *                             &lt;fractionDigits value="2"/&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/simpleType&gt;
 *                         &lt;simpleType&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                             &lt;enumeration value=""/&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/simpleType&gt;
 *                       &lt;/union&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TaxDTTM" type="{}NonRequiredStringDateTime" minOccurs="0"/&gt;
 *                   &lt;element name="MarkForDeletion" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="true"/&gt;
 *                         &lt;enumeration value="false"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ChargeName" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
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
    "taxDetail5"
})
public class TaxDetails2 {

    @XmlElement(name = "TaxDetail_5")
    protected List<TaxDetail5> taxDetail5;

    /**
     * Gets the value of the taxDetail5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetail5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetail5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetail5 }
     * 
     * 
     */
    public List<TaxDetail5> getTaxDetail5() {
        if (taxDetail5 == null) {
            taxDetail5 = new ArrayList<TaxDetail5>();
        }
        return this.taxDetail5;
    }

}
