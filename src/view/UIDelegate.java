package view;

public interface UIDelegate {
	void saveBasicInformationClicked(String name, String email, String phone);
	void saveAddressClicked(
				String zipCode,
				String country,
				String state,
				String city,
				String neighborhood,
				String street,
				String number
			);
}
