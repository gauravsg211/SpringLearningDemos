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
 *         &lt;element name="Override_342" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OriginalDeliverySurcharge" minOccurs="0"&gt;
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
 *                   &lt;element name="OverriddenDeliverySurcharge" minOccurs="0"&gt;
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
 *                   &lt;element name="OverrideDTTM" type="{}NonRequiredStringDateTime" minOccurs="0"/&gt;
 *                   &lt;element name="User" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
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
    "override342"
})
public class DeliverySurchargeOverrideHistory {

    @XmlElement(name = "Override_342")
    protected List<Override342> override342;

    /**
     * Gets the value of the override342 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the override342 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverride342().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Override342 }
     * 
     * 
     */
    public List<Override342> getOverride342() {
        if (override342 == null) {
            override342 = new ArrayList<Override342>();
        }
        return this.override342;
    }

}
