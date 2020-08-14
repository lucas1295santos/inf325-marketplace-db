package app;

public interface RoutingDelegate {
	void completedBasicInformationForm();
	void completedAddressForm();
	void completedProductInformationForm(boolean registerMore);
}
