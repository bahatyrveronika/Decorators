package ua.edu.ucu.apps.documents;

public abstract class AbstractDecorator implements Document {

    protected Document document;

    public AbstractDecorator(Document document) {
        this.document = document;
    }

    @Override
    public String parse(String path) {
        return document.parse(path);
    }
}
