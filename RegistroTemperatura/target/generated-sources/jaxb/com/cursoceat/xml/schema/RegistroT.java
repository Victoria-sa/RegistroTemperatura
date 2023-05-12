//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.05.10 a las 01:24:15 PM CEST 
//


package com.cursoceat.xml.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="leerT" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="tMax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="tMin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "leerT"
})
@XmlRootElement(name = "registroT")
public class RegistroT {

    @XmlElement(required = true)
    protected List<RegistroT.LeerT> leerT;

    /**
     * Gets the value of the leerT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the leerT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeerT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistroT.LeerT }
     * 
     * 
     */
    public List<RegistroT.LeerT> getLeerT() {
        if (leerT == null) {
            leerT = new ArrayList<RegistroT.LeerT>();
        }
        return this.leerT;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="tMax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="tMin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "fecha",
        "tMax",
        "tMin"
    })
    public static class LeerT {

        @XmlElement(required = true)
        protected String fecha;
        @XmlElement(required = true)
        protected String tMax;
        @XmlElement(required = true)
        protected String tMin;

        /**
         * Obtiene el valor de la propiedad fecha.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFecha() {
            return fecha;
        }

        /**
         * Define el valor de la propiedad fecha.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFecha(String value) {
            this.fecha = value;
        }

        /**
         * Obtiene el valor de la propiedad tMax.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTMax() {
            return tMax;
        }

        /**
         * Define el valor de la propiedad tMax.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTMax(String value) {
            this.tMax = value;
        }

        /**
         * Obtiene el valor de la propiedad tMin.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTMin() {
            return tMin;
        }

        /**
         * Define el valor de la propiedad tMin.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTMin(String value) {
            this.tMin = value;
        }

    }

}
