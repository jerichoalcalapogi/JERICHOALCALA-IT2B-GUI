
package config;


public class Session {
    private static Session instance;
    private int uid;
    private String fnamee;
    private String lnamee;
    private String emaill;  
    private String userrname;
    private String tpyee;
    private String statuss;
    private String contact;
    private String uimage;

   
    private Session(){
              
    }

   

    
    public static synchronized Session getInstance() {
       if(instance==null){
       instance = new Session();
       
       }
     return instance;
    }

    public static boolean isInstanceEmpty() {
        return instance==null;
    }
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
   
    
    public String getFnamee() {
        return fnamee;
    }

    public void setFnamee(String fnamee) {
        this.fnamee = fnamee;
    }

    public String getLnamee() {
        return lnamee;
    }

    public void setLnamee(String lnamee) {
        this.lnamee = lnamee;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public String getUserrname() {
        return userrname;
    }

    public void setUserrname(String userrname) {
        this.userrname = userrname;
    }

    public String getTpyee() {
        return tpyee;
    }

    public void setTpyee(String tpyee) {
        this.tpyee = tpyee;
    }

    public String getStatuss() {
        return statuss;
    }

    public void setStatuss(String statuss) {
        this.statuss = statuss;
    }
    
      public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
     public void clearSession() {
        uid = -1; // Or any default value indicating no user
        fnamee = null;
        lnamee = null;
        emaill = null;
        userrname = null;
        contact = null;
        tpyee = null;
        statuss = null;
    }

  public String getUimage() {
    return uimage; // IMPLEMENTED GETTER
}
    
  public void setUimage(String uimage) {
    this.uimage = uimage;
}
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    

