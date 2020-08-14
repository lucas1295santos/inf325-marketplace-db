package view;

public interface FormViewDelegate {
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
	void addProductClicked(String name, String description, int priceInCents);
	void saveSellerClicked();
}
