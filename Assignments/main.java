package clonee;
import java.util.Map;

public class main {


	    public static void main(String[] args) {
	        String filePath = "D:\\country.csv"; // Change to the path of your CSV file
	        Map<String, String> countryCapitalMap = Countrymap.loadCsvFileToMap(filePath);
	        char startsWith = 'M'; // Example: Filter countries starting with 'A'
	        String outputFile = "D:\\countery1.txt"; // Change to desired output file path
	        Country.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
	        System.out.println("Filtered countries have been written to the file.");
	    }
	}


