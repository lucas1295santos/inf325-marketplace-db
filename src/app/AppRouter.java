package app;
import view.*;
import controller.*;

public class AppRouter implements RoutingDelegate {
	
	static AppRouter router;
	
	SellerBasicInfoFormView sellerBasicInfoFormView;
	AddressFormView addressFormView;
	ProductFormView productFormView;

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

		sellerBasicInfoFormView.close();
		addressFormView.display();
	}

	@Override
	public void completedAddressForm() {
		productFormView = new ProductFormView();
		productFormView.delegate = sellerFormController;
		productFormView.router = this;
		
		addressFormView.close();
		productFormView.display();
	}

	@Override
	public void completedProductInformationForm(boolean registerMore) {
		productFormView.close();
		
		if(registerMore == true) {
			productFormView = new ProductFormView();
			productFormView.delegate = sellerFormController;
			productFormView.router = this;
			
			productFormView.display();
		} else {
			
		}
	}
}
