package com.evg_ws.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Модель сгенерирована!
 */
@Entity
@Table(name = "Models", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Models.findAll", query = "SELECT m FROM Models m")
    , @NamedQuery(name = "Models.findById", query = "SELECT m FROM Models m WHERE m.id = :id")
    , @NamedQuery(name = "Models.findByName", query = "SELECT m FROM Models m WHERE m.name = :name")
    , @NamedQuery(name = "Models.findByManufacturerId", query = "SELECT m FROM Models m WHERE m.manufacturerId = :manufacturerId")
    , @NamedQuery(name = "Models.findByCreatedAt", query = "SELECT m FROM Models m WHERE m.createdAt = :createdAt")
    , @NamedQuery(name = "Models.findByUpdatedAt", query = "SELECT m FROM Models m WHERE m.updatedAt = :updatedAt")
    , @NamedQuery(name = "Models.findByDateEnd", query = "SELECT m FROM Models m WHERE m.dateEnd = :dateEnd")
    , @NamedQuery(name = "Models.findByTypeId", query = "SELECT m FROM Models m WHERE m.typeId = :typeId")})
public class Models implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "manufacturer_id")
    private Integer manufacturerId;
    @Basic(optional = false)
    @Column(name = "createdAt")
    private String createdAt;
    @Basic(optional = false)
    @Column(name = "updatedAt")
    private String updatedAt;
    @Column(name = "date_end")
    private String dateEnd;
    @Column(name = "type_id")
    private Integer typeId;

    public Models() {
    }

    public Models(Integer id) {
        this.id = id;
    }

    public Models(Integer id, String createdAt, String updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Models)) {
            return false;
        }
        Models other = (Models) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "newpackage.entity.Models[ id=" + id + " ]";
    }
    
}
