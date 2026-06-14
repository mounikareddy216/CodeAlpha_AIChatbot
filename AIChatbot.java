package myproject;

import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI CHATBOT =====");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("hello") || input.equals("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (input.contains("name")) {
                System.out.println("Bot: I am CodeAlpha AI Chatbot.");
            }
            else if (input.contains("course")) {
                System.out.println("Bot: I can help with Java, Python and Programming topics.");
            }
            else if (input.contains("java")) {
                System.out.println("Bot: Java is a powerful object-oriented programming language.");
            }
            else if (input.contains("python")) {
                System.out.println("Bot: Python is popular for AI, Data Science and Web Development.");
            }
            else if (input.contains("thank")) {
                System.out.println("Bot: You're welcome!");
            }
            else if (input.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a great day.");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I don't understand that. Try another question.");
            }
        }

        sc.close();
    }
}