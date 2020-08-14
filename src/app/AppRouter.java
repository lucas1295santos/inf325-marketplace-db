package app;
import view.*;
import controller.*;

public class AppRouter implements RoutingDelegate {
	
	static AppRouter router;
	
	SellerBasicInfoFormView sellerBasicInfoFormView;
	AddressFormView addressFormView;

	SellerFormController sellerFormController;
	
	public static void main(String[] args) {
		router = new AppRouter();
	}
	
	AppRouter() {
		sellerFormController = new SellerFormController();
		sellerBasicInfoFormView = new SellerBasicInfoFormView();
		sellerBasicInfoFormView.delegate = sellerFormController;
		sellerBasicInfoFormView.router = this;
		
		sellerBasicInfoFormView.display();
	}

	
	@Override
	public void completedBasicInformationForm() {
		addressFormView = new AddressFormView();
		addressFormView.delegate = sellerFormController;
		addressFormView.router = this;

		addressFormView.display();
	}

	@Override
	public void completedAddressForm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void completedProductInformationForm(boolean registerMore) {
		// TODO Auto-generated method stub
		
	}
}
