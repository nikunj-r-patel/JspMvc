package userFormJspMvc;
public class LoginBean {
	private String name, email, password;
	LoginBean(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	LoginBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginBean [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	public boolean validate() {
		if (password.equals("admin")) {
			return true;
		} else {
			return false;
		}
	}
}
