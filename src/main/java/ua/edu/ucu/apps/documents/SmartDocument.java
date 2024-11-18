package ua.edu.ucu.apps.documents;

public class SmartDocument implements Document {

    @Override
    public String parse(String path) {
        return "Parsed content from Google Cloud Vision for path: " + path;
    }
}
