package test;

import java.util.Date;

import javax.jdo.annotations.*;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {

	 @PrimaryKey
	    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	    private Long id;
	     
	    @Persistent
	    private String member;
	     
	    @Persistent
	    private String address;
	     
	    @Persistent
	    private String password;
	     
	    @Persistent
	    private String mail;
	     
	    @Persistent
	    private String tell;
	     
	    
	    @Persistent
	    private Date datetime;
	 
	    public LinkData(String member, String address, String mail,String tell, String password, Date datetime) {
	        super();
	        this.member = member;
	        this.address = address;
	        this.mail = mail;
	        this.tell=tell;
	        this.password = password;
	        this.datetime = datetime;
	    }
	 
	    public Long getId() {
	        return id;
	    }
	 
	    public void setId(Long id) {
	        this.id = id;
	    }
	 
	    public String getTitle() {
	        return member;
	    }
	 
	    public void setTitle(String member) {
	        this.member = member;
	    }
	 
	    public String getUrl() {
	        return address;
	    }
	 
	    public void setUrl(String address) {
	        this.address = address;
	    }
	 
	    public String getMail() {
	        return mail;
	    }
	 
	    public void setMail(String mail) {
	        this.mail = mail;
	    }
	    
	    public String getComment() {
	        return password;
	    }
	 
	    public void setComment(String password) {
	        this.password = password;
	    }
	 
	    public String getTell() {
	        return tell;
	    }
	 
	    public void setTess(String tell) {
	        this.tell = tell;
	    }
	 
	    
	    public Date getDatetime() {
	        return datetime;
	    }
	 
	    public void setDatetime(Date datetime) {
	        this.datetime = datetime;
	    }
	
}
