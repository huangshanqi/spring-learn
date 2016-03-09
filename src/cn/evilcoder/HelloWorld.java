package cn.evilcoder;

/**
 * User: Huangshanqi
 * Date: 2016/3/9
 * Time: 15:06
 */
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
