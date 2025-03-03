
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
    
}
