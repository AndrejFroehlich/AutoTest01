package froehlich;

public class Auto {
	private String farbe;
	private int ps;
	private String model;

	public Auto(String farbe, int ps, String model) {
		this.farbe = farbe;
		this.ps = ps;
		this.model = model;
	}

	public Auto(){
		this.farbe= "Violett";
		this.ps = 156;
		this.model = "Nissan GTR";
	}
	
	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Auto [farbe=" + farbe + ", ps=" + ps + ", model=" + model + "]";
	}

}
