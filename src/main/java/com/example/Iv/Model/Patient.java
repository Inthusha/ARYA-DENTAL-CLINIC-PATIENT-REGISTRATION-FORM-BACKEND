package com.example.Iv.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient 
{
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	
    private String date;

	private String fullName;
	private String age;
	private String gender;
	private String dateOfBirth;
	private String occupation;
	private String otherOccupation;
	@Column(unique = true)
	private String phoneNumber;
	@Column(unique = true)
	private String email;
	private String address;
	private String chiefComplaint;
	
	private boolean hyperTension;
	private boolean heartDisease;
	private boolean diabetes;
	private boolean bloodDisorder;
	private boolean epilepsy;
	private boolean gastritis;
	private boolean respiratoryDisease;
	private boolean thyroid;
	private boolean jaundice;
	private boolean pregnant;
	private boolean nursingMother;
	private boolean habitualHistory;
	private boolean surgicalHistory;
	private String dentalIssue;
	private String regularMedications;
	private String allergies;
	
	
	public Patient(long Id, String date, String fullName, String age, String gender, String dateOfBirth,
			String occupation, String otherOccupation, String phoneNumber, String email, String address,
			String chiefComplaint, boolean hyperTension, boolean heartDisease, boolean diabetes, boolean bloodDisorder,
			boolean epilepsy, boolean gastritis, boolean respiratoryDisease, boolean thyroid, boolean jaundice,
			boolean pregnant, boolean nursingMother, boolean habitualHistory, boolean surgicalHistory,
			String dentalIssue, String regularMedications, String allergies) {
		super();
		this.Id = Id;
		this.date = date;
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.occupation = occupation;
		this.otherOccupation = otherOccupation;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.chiefComplaint = chiefComplaint;
		this.hyperTension = hyperTension;
		this.heartDisease = heartDisease;
		this.diabetes = diabetes;
		this.bloodDisorder = bloodDisorder;
		this.epilepsy = epilepsy;
		this.gastritis = gastritis;
		this.respiratoryDisease = respiratoryDisease;
		this.thyroid = thyroid;
		this.jaundice = jaundice;
		this.pregnant = pregnant;
		this.nursingMother = nursingMother;
		this.habitualHistory = habitualHistory;
		this.surgicalHistory = surgicalHistory;
		this.dentalIssue = dentalIssue;
		this.regularMedications = regularMedications;
		this.allergies = allergies;
	}
	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public long getId() {
		return Id;
	}
	public void setPatientId(long Id) {
		this.Id = Id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getOtherOccupation() {
		return otherOccupation;
	}
	public void setOtherOccupation(String otherOccupation) {
		this.otherOccupation = otherOccupation;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getChiefComplaint() {
		return chiefComplaint;
	}
	public void setChiefComplaint(String chiefComplaint) {
		this.chiefComplaint = chiefComplaint;
	}
	public boolean isHyperTension() {
		return hyperTension;
	}
	public void setHyperTension(boolean hyperTension) {
		this.hyperTension = hyperTension;
	}
	public boolean isHeartDisease() {
		return heartDisease;
	}
	public void setHeartDisease(boolean heartDisease) {
		this.heartDisease = heartDisease;
	}
	public boolean isDiabetes() {
		return diabetes;
	}
	public void setDiabetes(boolean diabetes) {
		this.diabetes = diabetes;
	}
	public boolean isBloodDisorder() {
		return bloodDisorder;
	}
	public void setBloodDisorder(boolean bloodDisorder) {
		this.bloodDisorder = bloodDisorder;
	}
	public boolean isEpilepsy() {
		return epilepsy;
	}
	public void setEpilepsy(boolean epilepsy) {
		this.epilepsy = epilepsy;
	}
	public boolean isGastritis() {
		return gastritis;
	}
	public void setGastritis(boolean gastritis) {
		this.gastritis = gastritis;
	}
	public boolean isRespiratoryDisease() {
		return respiratoryDisease;
	}
	public void setRespiratoryDisease(boolean respiratoryDisease) {
		this.respiratoryDisease = respiratoryDisease;
	}
	public boolean isThyroid() {
		return thyroid;
	}
	public void setThyroid(boolean thyroid) {
		this.thyroid = thyroid;
	}
	public boolean isJaundice() {
		return jaundice;
	}
	public void setJaundice(boolean jaundice) {
		this.jaundice = jaundice;
	}
	public boolean isPregnant() {
		return pregnant;
	}
	public void setPregnant(boolean pregnant) {
		this.pregnant = pregnant;
	}
	public boolean isNursingMother() {
		return nursingMother;
	}
	public void setNursingMother(boolean nursingMother) {
		this.nursingMother = nursingMother;
	}
	public boolean isHabitualHistory() {
		return habitualHistory;
	}
	public void setHabitualHistory(boolean habitualHistory) {
		this.habitualHistory = habitualHistory;
	}
	public boolean isSurgicalHistory() {
		return surgicalHistory;
	}
	public void setSurgicalHistory(boolean surgicalHistory) {
		this.surgicalHistory = surgicalHistory;
	}
	public String getDentalIssue() {
		return dentalIssue;
	}
	public void setDentalIssue(String dentalIssue) {
		this.dentalIssue = dentalIssue;
	}
	public String getRegularMedications() {
		return regularMedications;
	}
	public void setRegularMedications(String regularMedications) {
		this.regularMedications = regularMedications;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	
	
	
	
	
}