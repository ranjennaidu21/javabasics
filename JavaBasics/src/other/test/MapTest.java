package other.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		// if returned list is Map<String,Object>
		System.out.println("////////if returned list is Map<String,Object>////////");
		List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();
		resList.add(getMapObject());
		// read the map list added above
		System.out.println("================================");
		for (Map<String, Object> map : resList) {
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				System.out.println("For :" + entry.getKey());
				Employee employee = (Employee) entry.getValue();
				System.out.println("Name: " + employee.getName());
				System.out.println("Age: " + employee.getAge());
				System.out.print("Adress: ");
				for (Address addressObject : employee.getAddress()) {
					System.out.println(addressObject.getAddrLine1()
							+ " , " + addressObject.getAddrLine2()
							+ " , " + addressObject.getPostcode());
				}
				System.out.println("================================");
			}
		}

		// if returned list is List<Object>
		System.out.println("////////if returned list is List<Object>////////");
		List<Employee> resultList = new ArrayList<Employee>();
		// create Employee Object and add to the resultList
		Employee emp1 = createEmployeeObject("Josh", 33, "JoshAddr1","JoshAddr2", 929);
		resultList.add(emp1);
		for (Employee employeeObj : resultList) {
			System.out.println("Name: " + employeeObj.getName());
			System.out.println("Age: " + employeeObj.getAge());
			System.out.print("Adress: ");
			for (Address addressObject : employeeObj.getAddress()) {
				System.out.println(addressObject.getAddrLine1()
						+ " , " + addressObject.getAddrLine2()
						+ " , " + addressObject.getPostcode());
			}
		}
	}

	public static Employee createEmployeeObject(String name, int age,
			String addressLine1, String addressLine2, int postCode) {
		// create object 1
		// create address object
		Address address = new Address(addressLine1, addressLine2, postCode);

		// add address object to list
		List<Address> addressList = new ArrayList<Address>();
		addressList.add(address);
		Employee employee = new Employee(name, age, addressList);
		return employee;
	}

	public static Map<String, Object> getMapObject() {
		Employee emp1 = createEmployeeObject("Kumar", 21, "KumarAddr1",
				"KumarAddr2", 123);
		Employee emp2 = createEmployeeObject("Babu", 32, "BabuAddr1",
				"BabuAddr2", 456);
		// add two objects created above to Map Object
		Map<String, Object> myMap = new HashMap<String, Object>();
		myMap.put("0", emp1);
		myMap.put("1", emp2);
		return myMap;
	}

}

class Employee {
	private String name;
	private int age;
	private List<Address> address;

	public Employee(String name, int age, List<Address> address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

}

class Address {
	private String addrLine1;
	private String addrLine2;
	private int postcode;

	public Address(String addrLine1, String addrLine2, int postcode) {
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.postcode = postcode;
	}

	public String getAddrLine1() {
		return addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return addrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

}
