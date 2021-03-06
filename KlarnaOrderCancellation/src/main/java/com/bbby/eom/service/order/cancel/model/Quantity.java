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
 *         &lt;element name="OrderedQty"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="13"/&gt;
 *               &lt;fractionDigits value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrderedQtyUOM"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CancelledQty" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;union&gt;
 *               &lt;simpleType&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                   &lt;totalDigits value="9"/&gt;
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
 *         &lt;element name="TotalAllocatedQty" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;union&gt;
 *               &lt;simpleType&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                   &lt;totalDigits value="19"/&gt;
 *                   &lt;fractionDigits value="1"/&gt;
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
 *         &lt;element name="TotalCancelledQty" minOccurs="0"&gt;
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
    "orderedQty",
    "orderedQtyUOM",
    "cancelledQty",
    "totalAllocatedQty",
    "totalCancelledQty"
})
public class Quantity {

    @XmlElement(name = "OrderedQty", required = true)
    protected BigDecimal orderedQty;
    @XmlElement(name = "OrderedQtyUOM", required = true)
    protected String orderedQtyUOM;
    @XmlElementRef(name = "CancelledQty", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cancelledQty;
    @XmlElementRef(name = "TotalAllocatedQty", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalAllocatedQty;
    @XmlElementRef(name = "TotalCancelledQty", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalCancelledQty;

    /**
     * Gets the value of the orderedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderedQty() {
        return orderedQty;
    }

    /**
     * Sets the value of the orderedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderedQty(BigDecimal value) {
        this.orderedQty = value;
    }

    /**
     * Gets the value of the orderedQtyUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderedQtyUOM() {
        return orderedQtyUOM;
    }

    /**
     * Sets the value of the orderedQtyUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderedQtyUOM(String value) {
        this.orderedQtyUOM = value;
    }

    /**
     * Gets the value of the cancelledQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCancelledQty() {
        return cancelledQty;
    }

    /**
     * Sets the value of the cancelledQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCancelledQty(JAXBElement<String> value) {
        this.cancelledQty = value;
    }

    /**
     * Gets the value of the totalAllocatedQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalAllocatedQty() {
        return totalAllocatedQty;
    }

    /**
     * Sets the value of the totalAllocatedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalAllocatedQty(JAXBElement<String> value) {
        this.totalAllocatedQty = value;
    }

    /**
     * Gets the value of the totalCancelledQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalCancelledQty() {
        return totalCancelledQty;
    }

    /**
     * Sets the value of the totalCancelledQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalCancelledQty(JAXBElement<String> value) {
        this.totalCancelledQty = value;
    }

}
