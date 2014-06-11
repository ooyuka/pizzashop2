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
    
    @Persistent
    private String addr;

    @Persistent
    private String zip;
    
    
    public OrderData(String order, String name, String tel, String addr, String zip, Date datetime) {
        super();
        this.order = order;
        this.name = name;
        this.tel = tel;
        this.addr = addr;
        this.zip = zip;
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
 
    public String getAdr() {
        return addr;
    }
 
    public void setAdr(String adr) {
        this.addr = adr;
    }
    
    public String getAdrn() {
        return zip;
    }
 
    public void setAdrn(String adrn) {
        this.zip = adrn;
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
