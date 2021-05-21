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
 *         &lt;element name="SplitLine" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LineNumber"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ItemID"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="100"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Quantity"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                         &lt;totalDigits value="13"/&gt;
 *                         &lt;fractionDigits value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OrderedQtyUOM"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OrderLineStatus"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="DC Allocated"/&gt;
 *                         &lt;enumeration value="Released"/&gt;
 *                         &lt;enumeration value="Partially Released"/&gt;
 *                         &lt;enumeration value="DO Partially Created"/&gt;
 *                         &lt;enumeration value="DO Created"/&gt;
 *                         &lt;enumeration value="Partially Shipped"/&gt;
 *                         &lt;enumeration value="Shipped"/&gt;
 *                         &lt;enumeration value="Partially DC Allocated"/&gt;
 *                         &lt;enumeration value="Sourced"/&gt;
 *                         &lt;enumeration value="Partially Sourced"/&gt;
 *                         &lt;enumeration value="Sourcing Failed"/&gt;
 *                         &lt;enumeration value="Scheduled"/&gt;
 *                         &lt;enumeration value="Scheduling Failed"/&gt;
 *                         &lt;enumeration value="Allocated"/&gt;
 *                         &lt;enumeration value="Allocation Failed"/&gt;
 *                         &lt;enumeration value="Invalid"/&gt;
 *                         &lt;enumeration value="Created"/&gt;
 *                         &lt;enumeration value="Canceled"/&gt;
 *                         &lt;enumeration value="Backordered"/&gt;
 *                         &lt;enumeration value="Delivered"/&gt;
 *                         &lt;enumeration value="Picked Up"/&gt;
 *                         &lt;enumeration value="Completed"/&gt;
 *                         &lt;enumeration value="Partially Completed"/&gt;
 *                         &lt;enumeration value="Partially Picked Up"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CancelledQty" minOccurs="0"&gt;
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
 *                   &lt;element name="BackorderReason" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="01"/&gt;
 *                         &lt;enumeration value="02"/&gt;
 *                         &lt;enumeration value=""/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Description"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3000"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ItemImageFileName" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="256"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ItemURLPath" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="255"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AllocationDetails_61" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AllocationDetail_63" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ItemID" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="100"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="AllocatedQuantity" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;union&gt;
 *                                             &lt;simpleType&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                                 &lt;totalDigits value="19"/&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/simpleType&gt;
 *                                             &lt;simpleType&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                 &lt;enumeration value=""/&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/simpleType&gt;
 *                                           &lt;/union&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="AllocatedQtyUOM" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="8"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="SupplyType"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="OH"/&gt;
 *                                             &lt;enumeration value="PO"/&gt;
 *                                             &lt;enumeration value="ASN"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="SupplyID" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="50"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="SupplyDetailID" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="50"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="IsVirtualAllocation" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value=""/&gt;
 *                                             &lt;enumeration value="true"/&gt;
 *                                             &lt;enumeration value="false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="SubstitutionRatio" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;union&gt;
 *                                             &lt;simpleType&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                                 &lt;totalDigits value="3"/&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/simpleType&gt;
 *                                             &lt;simpleType&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                 &lt;enumeration value=""/&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/simpleType&gt;
 *                                           &lt;/union&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="TierId" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="25"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="OriginFacilityAliasID" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="16"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="FacilityType" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="150"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="CommittedShipDTTM" type="{}NonRequiredStringDateTime" minOccurs="0"/&gt;
 *                                       &lt;element name="CommittedDeliveryDTTM" type="{}NonRequiredStringDateTime" minOccurs="0"/&gt;
 *                                       &lt;element name="MustReleaseByDTTM" type="{}NonRequiredStringDateTime" minOccurs="0"/&gt;
 *                                       &lt;element name="MustShipByDTTM" type="{}NonRequiredStringDateTime" minOccurs="0"/&gt;
 *                                       &lt;element name="CreatedDTTM" type="{}StringDateTime"/&gt;
 *                                       &lt;element name="ModifiedDTTM" type="{}StringDateTime"/&gt;
 *                                       &lt;element name="AllocationStatus"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="DEALLOCATED"/&gt;
 *                                             &lt;enumeration value="DRAFT"/&gt;
 *                                             &lt;enumeration value="OPEN"/&gt;
 *                                             &lt;enumeration value="CLOSED"/&gt;
 *                                             &lt;enumeration value="PARTIALLY_CLOSED"/&gt;
 *                                             &lt;enumeration value="DO_CREATED"/&gt;
 *                                             &lt;enumeration value="DO_RELEASED"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="SubstitutionType" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="Whenout"/&gt;
 *                                             &lt;enumeration value="Immediate"/&gt;
 *                                             &lt;enumeration value=""/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="InventorySegmentName" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="20"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="RequiredCapacityPerUnit" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;union&gt;
 *                                             &lt;simpleType&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                                 &lt;totalDigits value="9"/&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/simpleType&gt;
 *                                             &lt;simpleType&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                 &lt;enumeration value=""/&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/simpleType&gt;
 *                                           &lt;/union&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
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
    "splitLine"
})
public class SplitLines {

    @XmlElement(name = "SplitLine")
    protected List<SplitLine> splitLine;

    /**
     * Gets the value of the splitLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitLine }
     * 
     * 
     */
    public List<SplitLine> getSplitLine() {
        if (splitLine == null) {
            splitLine = new ArrayList<SplitLine>();
        }
        return this.splitLine;
    }

}
