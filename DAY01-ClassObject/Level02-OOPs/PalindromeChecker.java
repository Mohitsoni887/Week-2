// Class to check if a given text is a palindrome
class PalindromeChecker {
    // Private field to encapsulate data
    private String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Getter for text
    public String getText() {
        return text;
    }

    // Setter for text
    public void setText(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = cleanText.length();

        // Compare characters from the start and end of the string
        for (int i = 0; i < n / 2; i++) {
            if (cleanText.charAt(i) != cleanText.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example usage
        PalindromeChecker checker = new PalindromeChecker("A man, a plan, a canal, Panama");
        checker.displayResult();

        // Test another text
        checker.setText("Hello");
        checker.displayResult();
    }
}
