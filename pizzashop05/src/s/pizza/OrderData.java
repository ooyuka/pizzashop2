package s.pizza;

import java.net.URL;
import java.util.Date;
 
import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class OrderData {
      @PrimaryKey
      @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
      private Long id;
     
    @Persistent
    private String order;
     
    @Persistent
    private String name;
     
    @Persistent
    private String tel;
     
    @Persistent
    private Date datetime;

    public OrderData(String order, String name, String tel, Date datetime) {
        super();
        this.order = order;
        this.name = name;
        this.tel = tel;
        this.datetime = datetime;
        
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getOrder() {
        return order;
    }
    
    public void setOrder(String order) {
        this.order = order;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String url) {
        this.name = name;
    }
 
    public String getTel() {
        return tel;
    }
 
    public void setTel(String tel) {
        this.tel = tel;
    }
 
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
    
}
