package security;
import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.Data;
import tacos.User;

/**
 * @author Ryan Loong
 * @description 注册表单的对象，把注册时候的表单数据接收封装起来，
 * 然后可以通过toUser方法把这个对象转变为User对象。
 */
@Data
public class RegistrationForm {

  private String username;
  private String password;
  private String fullname;
  private String street;
  private String city;
  private String state;
  private String zip;
  private String phone;
  
  public User toUser(PasswordEncoder passwordEncoder) {
    return new User(
        username, passwordEncoder.encode(password), 
        fullname, street, city, state, zip, phone);
  }
  
}
