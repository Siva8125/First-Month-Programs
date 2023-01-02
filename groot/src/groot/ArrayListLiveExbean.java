package groot;

import java.io.Serializable;
import java.util.Date;

public class ArrayListLiveExbean implements Serializable {
	private String fullName;
	 private String email;
	 private String password;
	 private String mobileNumber;
	 private Date dateOfBirth;

	 public String getFullName() {
	  return fullName;
	 }

	 public void setFullName(String fullName) {
	  this.fullName = fullName;
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

	 public String getMobileNumber() {
	  return mobileNumber;
	 }

	 public void setMobileNumber(String mobileNumber) {
	  this.mobileNumber = mobileNumber;
	 }

	 public Date getDateOfBirth() {
	  return dateOfBirth;
	 }

	 public void setDateOfBirth(Date dateOfBirth) {
	  this.dateOfBirth = dateOfBirth;
	 }

}
