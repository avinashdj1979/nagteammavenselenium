package javapractice.hasa;

import lombok.Data;

public class B {
	
	//Has-A relation, B has A
	
	private A aObj;

	public A getaObj() {
		return aObj;
	}

	public void setaObj(A aObj) {
		this.aObj = aObj;
		this.aObj.setNum2(34);
	}

}
