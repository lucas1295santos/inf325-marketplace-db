package app;
import view.*;
import controller.*;
import data.SellerDAO;

public class AppRouter implements RoutingDelegate {
	
	static AppRouter router;
	static SellerDAO sellerDAO;
	
	SellerBasicInfoFormView sellerBasicInfoFormView;
	AddressFormView addressFormView;
	ProductFormView productFormView;
	HomeView homeView;

	SellerFormController sellerFormController;
	
	public static void main(String[] args) {
		router = new AppRouter();
		sellerDAO = new SellerDAO();
	}
	
	AppRouter() {
		presentHome();
	}

	private void presentHome() {
		homeView = new HomeView();
		homeView.router = this;
		homeView.display();
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

	@Override
	public void presentListSellers() {
		// TODO Auto-generated method stub
	}

	@Override
	public void presentRegisterSellerForm() {
		sellerFormController = new SellerFormController();
		sellerFormController.sellerDAO = sellerDAO;
		sellerBasicInfoFormView = new SellerBasicInfoFormView();
		sellerBasicInfoFormView.delegate = sellerFormController;
		sellerBasicInfoFormView.router = this;
		
		homeView.close();
		sellerBasicInfoFormView.display();
	}
}
