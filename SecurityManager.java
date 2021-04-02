/**
 * Security Manager Example
 * @author ashish
 */
public class SecurityManager extends java.lang.SecurityManager {
    public static void main(String[] args) {
        System.setProperty("java.home","101111");
        System.out.println(" java home is set to"+System.getProperty("java.home"));
        SecurityManager securityManager=new SecurityManager();
        System.setSecurityManager(securityManager);
        try{
            System.setProperty("java.home","567890");

        }catch(Exception exception){
            System.out.println(exception.getStackTrace());

        }
    }
}
