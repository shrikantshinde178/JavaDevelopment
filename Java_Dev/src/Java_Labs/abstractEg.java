package Java_Labs;

public class abstractEg {


	//abstract class seperate
	abstract class EuropianCountry{
		
		abstract void puneRegion();
		abstract void mumbaiRegion();
	}
	
	//seperate concept of interface
	interface worldCountries {
		
		void countries();
		void AsianCountries();
	}
	
	//both mixed example
	class subEuropian implements worldCountries{

		public void countries() {
			System.out.println("subEuropian implements by worldCountries interface");
		}
		
	class AsianCountries extends EuropianCountry implements worldCountries{


		@Override
		public void AsianCountries() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void puneRegion() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void mumbaiRegion() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void countries() {
			// TODO Auto-generated method stub
			
		}
		
		
	}

	@Override
	public void AsianCountries() {
		// TODO Auto-generated method stub
		
	}
		
	}
	
	public static void main(String[] args) {
		abstractEg AE = new abstractEg();
	}
	
}
