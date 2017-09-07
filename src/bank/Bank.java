package bank;

import java.util.ArrayList;



public class Bank {
	private String address;
	private ArrayList<SafetyDepositBox> boxList;
	private ArrayList<Employee>employeeList;
	private ArrayList<Account>accounts;
	private Vault vault;
	
	public Bank(){
		setAddress(null);
		setBoxList(null);
		setEmployeeList(null);
		setAccounts(null);
		setVault(null);
	}
	public Bank(String address, 
			ArrayList<SafetyDepositBox> boxList, 
			ArrayList<Employee>employeeList,
			ArrayList<Account>accounts,
			Vault vault) {
		setAddress(address);
		setBoxList(boxList);
		setEmployeeList(employeeList);
		setAccounts(accounts);
		setVault(vault);
	}
	
	public void createAccount(Account account) {
		accounts.add(account);
	}
	public void loanMoney(Account account, double amount){

	}
	
	
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<SafetyDepositBox> getBoxList() {
		return boxList;
	}
	public void setBoxList(ArrayList<SafetyDepositBox> boxList) {
		this.boxList = boxList;
	}
	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	public Vault getVault() {
		return vault;
	}
	public void setVault(Vault vault) {
		this.vault = vault;
	}
}
