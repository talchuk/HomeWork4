package At_25.Work4;

import java.util.ArrayList;

public class Phones {
	ArrayList<Phone> phone;

	public ArrayList<Phone> getPhone() {
		return phone;
	}

	public void setPhone(ArrayList<Phone> phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Phones{" + "phone=" + phone + '}';
	}
}
