package pack1;

import java.io.Serializable;

public class EmployeeBean implements Serializable
{
	private  String eId,eName,eDesg;
	private float eBsal,eHra,eDa,eTsal;
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDesg() {
		return eDesg;
	}
	public void seteDesg(String eDesg) {
		this.eDesg = eDesg;
	}
	public float geteBsal() {
		return eBsal;
	}
	public void seteBsal(float eBsal) {
		this.eBsal = eBsal;
	}
	public float geteHra() {
		return eHra;
	}
	public void seteHra(float eHra) {
		this.eHra = eHra;
	}
	public float geteDa() {
		return eDa;
	}
	public void seteDa(float eDa) {
		this.eDa = eDa;
	}
	public float geteTsal() {
		return eTsal;
	}
	public void seteTsal(float eTsal) {
		this.eTsal = eTsal;
	}
	
	
	
	
}
