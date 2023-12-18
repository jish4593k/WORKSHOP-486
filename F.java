import java.util.Scanner;

public class FileConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n\n\nPlease select below what you would like to do:");
                System.out.println("1. Convert file\n2. Extract file contents\n3. Contents to dataframe\n4. Exit");

                int selectOption = Integer.parseInt(scanner.nextLine());

                if (selectOption == 1) {
                    while (true) {
                        try {
                            System.out.println("Please select the type of file you want to convert your PDF to:");
                            System.out.println("1. Word\n2. Excel\n3. Back to main menu");

                            int conversionOption = Integer.parseInt(scanner.nextLine());

                            if (conversionOption == 1) {
                                convertToWord();
                                break;
                            } else if (conversionOption == 2) {
                                convertToExcel();
                                break;
                            } else if (conversionOption == 3) {
                                break;
                            } else {
                                System.out.println("Not a valid option\n");
                            }
                        } catch (Exception e) {
                            System.out.println("\n[WARNING] " + e.getMessage());
                        }
                    }
                } else if (selectOption == 2) {
                    extractFileContents();
                } else if (selectOption == 3) {
                    contentsToDataframe();
                } else if (selectOption == 4) {
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                } else {
                    System.out.println("Not a valid option. Please try again.\n");
                }
            } catch (Exception e) {
                System.out.println("\n[ERROR] " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static void convertToWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please paste or drag your PDF file: ");
        String pdfFile = scanner.nextLine();
        checkFile(pdfFile);
        toWord(pdfFile);
    }


}
