public class CurrencyFormatter {

    public String formattedConversionResult(CurrencyResult result) {
        return String.format("The converted value from %s to %s is %.2f",
                        result.base_code(),
                        result.target_code(),
                        result.conversion_result())
                .replace(",", ".");
    }
}
