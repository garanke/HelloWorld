package net.viralpatel.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;

	public String execute() {

		if (this.username.equals("admin") 
				&& this.password.equals("admin123")) {
			return "success";
		} else {
			addActionError(getText("error.login"));
			return "error";
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		// modification de mdp
		this.username = username;
	}

	public String getPassword() {
	// recuperation de mdp
		return password;

	}

	public void setPassword(String password) {
		this.password = password;
	}
}
