
package com.example.demo.ipi;

        import lombok.Data;
        import lombok.ToString;

        import javax.persistence.Entity;
        import javax.persistence.Id;
        import javax.persistence.Table;
        import javax.xml.bind.annotation.XmlRootElement;
        import java.io.Serializable;

@Entity
@Table(name = "plan")
@XmlRootElement
@Data
@ToString
public class Plan implements Serializable {

//flight antity to find plans

    @Id
    private String id;
    private String pSize;
    private String PlanType;



    public String getpSize() {
        return pSize;
    }

    public void setpSize(String pSize) {
        this.pSize = pSize;
    }

    public String getPlanType() {
        return PlanType;
    }

    public void setPlanType(String planType) {
        PlanType = planType;
    }

}