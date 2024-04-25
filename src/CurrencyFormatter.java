public class CurrencyFormatter {

    public String formattedConversionResult(CurrencyResult result) {
        System.out.println(" ********* CONVERSION RESULT *********");
        return String.format("The converted value from %s to %s is %.2f\n", result.base_code(), result.target_code(), result.conversion_result());

    }
}
