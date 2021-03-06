package com.veritis.employeeservice;

import java.util.List;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.xml.ws.BindingType;


/**
 * This class was generated by the JAX-WS RI. Oracle JAX-WS 2.1.5 Generated
 * source version: 2.1
 * 
 */
@WebService(portName = "EmployeeServiceSOAP", serviceName = "EmployeeService", targetNamespace = "http://www.veritis.com/EmployeeService/", wsdlLocation = "/wsdls/EmployeeService.wsdl", endpointInterface = "com.veritis.employeeservice.EmployeeService")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
public class EmployeeService_EmployeeServiceSOAPImpl implements EmployeeService {

	public EmployeeService_EmployeeServiceSOAPImpl() {
	}

	/**
	 * 
	 * @param emp
	 * @return returns java.util.List<com.veritis.employeeservice.Children>
	 */
	public List<Children> getChildren(Emp emp) {
		Children child=null;
		List<Children> children=new ArrayList<Children>();
		if(emp.getEmpno()==111){
			child=new Children();
			child.setStudid(1111);
			child.setStdname("AAAAAAA");
			child.setAge(4);
			children.add(child);
			
			child=new Children();
			child.setStudid(2222);
			child.setStdname("BBBBB");
			child.setAge(2);
			children.add(child);
			
		}
		return children;
	}

}
