package erictrudell.securityproject.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

//import com.erictrudell.security.models.Role;

@Entity
@Table(name="users")
public class UserModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Size(min=3, message="Username must be greater than 3 characters")
	private String userName;
	@Size(min=5, message="Password must be greater than 5 characters")
	private String password;
    @Transient
	private String confirmPass;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
//    add once role model is completed
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//        name = "users_roles", 
//        joinColumns = @JoinColumn(name = "user_id"), 
//        inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private List<Role> roles;
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	UserModel(){}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPass() {
		return confirmPass;
	}
	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	
	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	
	

}
