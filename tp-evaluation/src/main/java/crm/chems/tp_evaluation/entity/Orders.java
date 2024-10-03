package crm.chems.tp_evaluation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Orders {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String serviceType;
    @NotNull
    private Double tva;
    @NotNull
    private Double clientId;
    @NotNull
    private Integer nbDays;
    @NotNull
    private Double totalExcludeTax;
    private Integer state;
    private String comment;
    
    public Orders(Long id, @NotBlank String serviceType, @NotNull Double tva, @NotNull Double clientId,
            @NotNull Integer nbDays, @NotNull Double totalExcludeTax, Integer state, String comment) {
        this.id = id;
        this.serviceType = serviceType;
        this.tva = tva;
        this.clientId = clientId;
        this.nbDays = nbDays;
        this.totalExcludeTax = totalExcludeTax;
        this.state = state;
        this.comment = comment;
    }
    public Orders(@NotBlank String serviceType, @NotNull Double tva, @NotNull Double clientId, @NotNull Integer nbDays,
            @NotNull Double totalExcludeTax, Integer state, String comment) {
        this.serviceType = serviceType;
        this.tva = tva;
        this.clientId = clientId;
        this.nbDays = nbDays;
        this.totalExcludeTax = totalExcludeTax;
        this.state = state;
        this.comment = comment;
    }
    public Orders() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getServiceType() {
        return serviceType;
    }
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    public Double getTva() {
        return tva;
    }
    public void setTva(Double tva) {
        this.tva = tva;
    }
    public Double getClientId() {
        return clientId;
    }
    public void setClientId(Double clientId) {
        this.clientId = clientId;
    }
    public Integer getNbDays() {
        return nbDays;
    }
    public void setNbDays(Integer nbDays) {
        this.nbDays = nbDays;
    }
    public Double getTotalExcludeTax() {
        return totalExcludeTax;
    }
    public void setTotalExcludeTax(Double totalExcludeTax) {
        this.totalExcludeTax = totalExcludeTax;
    }
    public Integer getState() {
        return state;
    }
    public void setState(Integer state) {
        this.state = state;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

}
