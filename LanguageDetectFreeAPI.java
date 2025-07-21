import java.io.*;
import java.net.*;
import java.util.Scanner;

public class LanguageDetectFreeAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to detect language:");
        String text = scanner.nextLine();

        try {
            String urlStr = "https://ws.detectlanguage.com/0.2/detect";
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "Bearer 16a0dda6dcb45d0d68641c975a23e5ed");
            conn.setDoOutput(true);

            String data = "q=" + URLEncoder.encode(text, "UTF-8");
            OutputStream os = conn.getOutputStream();
            os.write(data.getBytes());
            os.flush();
            os.close();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println("Response: " + response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}