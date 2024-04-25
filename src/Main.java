import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String menu = """
                ---- Available currencies to convert ----
                1 - USD - U.S. Dollar
                2 - BRL - Brazilian Real
                3 - ARS - Argentine Peso
                4 - BOB - Bolivian Peso
                5 - CHL - Chilean Peso
                6 - COP - Colombian Peso
                -------------------------------------------
                """;


        String[] currencies = {"", "USD", "BRL", "ARS", "BOB", "CHL", "COP"};

        try {
            while (true) {
                System.out.println(menu);
                System.out.println("Select base currency or 9 to exit:");
                int baseOption = reader.nextInt();
                if (baseOption == 9) {
                    break;
                }
                String baseCurrency = currencies[baseOption];

                System.out.println(menu);
                System.out.println("Select target currency or 9 to exit:");
                int targetOption = reader.nextInt();
                if (targetOption == 9) {
                    break;
                }
                String targetCurrency = currencies[targetOption];

                System.out.println("Insert the amount to convert or 9 to exit:");
                double amountToConvert = reader.nextDouble();
                if (amountToConvert == 9) {
                    break;
                }

                CurrencyConverter converter = new CurrencyConverter();
                CurrencyResult newCurrencyResult = converter.currencyConverterResult(baseCurrency, targetCurrency, amountToConvert);

                CurrencyFormatter formatter = new CurrencyFormatter();
                System.out.println(formatter.formattedConversionResult(newCurrencyResult));


            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
