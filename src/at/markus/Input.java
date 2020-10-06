package at.markus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    static BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

    public static void console() throws IOException {
        String ip;

        while (true) {
            System.out.print("> ");
            ip = bufferRead.readLine();
            if (ip.equals("new")) {
                Input.newMail();
            } else if (ip.equals("delete")) {

            }
            if (ip.equals("quit")) {
                System.exit(0);
            }
        }
    }
    public static void newMail() throws IOException {
        System.out.print("    email       : ");
        String email = bufferRead.readLine();
        System.out.print("    subject     : ");
        String subject = bufferRead.readLine();
        System.out.print("    text        : ");
        String text = bufferRead.readLine();

        Sending.sendMail(email,subject,text);
    }
}
