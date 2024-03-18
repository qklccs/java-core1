package lr2;
import java.util.Scanner;
public class Example3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст для шифрования");
            String inputText = scanner.nextLine();
            System.out.println("Введите ключ");
            int key = scanner.nextInt();
            String encryptedText = encrypt(inputText, key);
            System.out.println("Преобразованный текст：" + encryptedText);
            System.out.println("Хотите выполнить обратное преобразование? (у/н)");
            String reverse = scanner.next();
            if (reverse.equalsIgnoreCase("y")) {
                String decryptedText = decrypt(encryptedText, key);
                System.out.println("Расшифрованный текст：" + decryptedText);
            } else if (reverse.equalsIgnoreCase("n")) {
                System.out.println("До свидания！");
            } else {
                System.out.println("Введите правильный ответ.");
            }
            scanner.close();
        }

        public static String encrypt(String text, int key) {
            StringBuilder encryptedText = new StringBuilder();
            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    encryptedText.append((char) ((c - base + key) % 26 + base));
                } else {
                    encryptedText.append(c);
                }
            }
            return encryptedText.toString();
        }

        public static String decrypt(String text, int key) {
            return encrypt(text, 26 - key);
        }


}
