# Language Detect Free API (Java)

This project uses the [DetectLanguage API](https://detectlanguage.com/) to identify the language of any input text using Java and HTTP POST requests.

## 💻 How It Works

- Takes input text from user
- Sends it to DetectLanguage API
- Parses and displays the language code (e.g., `en`, `fr`, `hi`)

## 🛠️ Technologies Used

- Java (JDK 8+)
- HTTP (HttpURLConnection)
- Scanner, BufferedReader, URI

## 🚀 How to Run

```bash
javac src/LanguageDetectFreeAPI.java
java -cp src LanguageDetectFreeAPI
```

## 🧪 Example

```bash
Enter text to detect language: Bonjour tout le monde
Detected Language Code: fr
```

## 🧾 License

This project is licensed under the MIT License.