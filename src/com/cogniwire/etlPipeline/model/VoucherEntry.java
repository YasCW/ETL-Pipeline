//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.12 at 08:25:31 PM BST 
//


package com.cogniwire.etlPipeline.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="record" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TrxDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AcctID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TrxTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="TransactionType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Dr"/>
 *                         &lt;enumeration value="Cr"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Currency">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="GBP"/>
 *                         &lt;enumeration value="USD"/>
 *                         &lt;enumeration value="AED"/>
 *                         &lt;enumeration value="JPY"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "record",
    "msgDesc"
})
@XmlRootElement(name = "voucher_entry")
public class VoucherEntry {

    @XmlElement(required = true)
    protected List<VoucherEntry.Record> record;

    @XmlElement(name = "MsgDesc")
    protected final String msgDesc = new String("Sample voucher message between System A and System B");

    /**
     * Gets the value of the record property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the record property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoucherEntry.Record }
     * 
     * 
     */

       /*
     @XmlElement(name = "MsgDesc")
     protected String msgDesc = new String("Sample voucher message between System A and System B");
   
      *This was manually added as it seems the xjc tool 
      *ignored the incorporation of 
      *a simple XML element from the XSD
      */


    public List<VoucherEntry.Record> getRecord() {
        if (record == null) {
            record = new ArrayList<VoucherEntry.Record>();
        }
        return this.record;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TrxDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AcctID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TrxTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="TransactionType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Dr"/>
     *               &lt;enumeration value="Cr"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Currency">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="GBP"/>
     *               &lt;enumeration value="USD"/>
     *               &lt;enumeration value="AED"/>
     *               &lt;enumeration value="JPY"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trxDate",
        "transactionId",
        "acctID",
        "custID",
        "trxTime",
        "amount",
        "transactionType",
        "currency"
    })
    public static class Record {

        @XmlElement(name = "TrxDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar trxDate;
        @XmlElement(name = "TransactionId", required = true)
        protected String transactionId;
        @XmlElement(name = "AcctID", required = true)
        protected String acctID;
        @XmlElement(name = "CustID", required = true)
        protected String custID;
        @XmlElement(name = "TrxTime", required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar trxTime;
        @XmlElement(name = "Amount", required = true)
        protected BigDecimal amount;
        @XmlElement(name = "TransactionType", required = true)
        protected String transactionType;
        @XmlElement(name = "Currency", required = true)
        protected String currency;

        /**
         * Gets the value of the trxDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTrxDate() {
            return trxDate;
        }

        /**
         * Sets the value of the trxDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTrxDate(XMLGregorianCalendar value) {
            this.trxDate = value;
        }

        /**
         * Gets the value of the transactionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionId() {
            return transactionId;
        }

        /**
         * Sets the value of the transactionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionId(String value) {
            this.transactionId = value;
        }

        /**
         * Gets the value of the acctID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctID() {
            return acctID;
        }

        /**
         * Sets the value of the acctID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctID(String value) {
            this.acctID = value;
        }

        /**
         * Gets the value of the custID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustID() {
            return custID;
        }

        /**
         * Sets the value of the custID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustID(String value) {
            this.custID = value;
        }

        /**
         * Gets the value of the trxTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTrxTime() {
            return trxTime;
        }

        /**
         * Sets the value of the trxTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTrxTime(XMLGregorianCalendar value) {
            this.trxTime = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
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
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

    }

    /**
     * Gets the value of the msgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgDesc() {
        return msgDesc;
    }

}
