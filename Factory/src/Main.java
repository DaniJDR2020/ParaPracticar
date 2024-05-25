public class Main {
    public static void main(String[] args) {
        DocumentFactory textFactory = new TextDocumentFactory();
        DocumentFactory spreadsheetFactory = new SpreadsheetDocumentFactory();

        textFactory.openDocument();
        textFactory.saveDocument();
        textFactory.closeDocument();

        spreadsheetFactory.openDocument();
        spreadsheetFactory.saveDocument();
        spreadsheetFactory.closeDocument();
    }
}