package app;

public interface RoutingDelegate {
	void presentListSellers();
	void presentRegisterSellerForm();
	void completedBasicInformationForm();
	void completedAddressForm();
	void completedProductInformationForm(boolean registerMore);
}
