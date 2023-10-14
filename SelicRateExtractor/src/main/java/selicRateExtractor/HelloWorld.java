package selicRateExtractor;

public class HelloWorld {
	
	public static void main(String[] args) {
	  SelicRateExtractor auto = new SelicRateExtractor();
	  System.out.println(auto.getTaxaSelicPeriod("01011989", "31121989"));
	  System.out.println(auto.getTaxaSelicDefaultPeriod());
    }
	
}
