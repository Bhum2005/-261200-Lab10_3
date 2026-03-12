//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Create files
    Handler textHandler = new TextFileHandler("textHandler");
    Handler docHandler = new DocumentFileHandler("docHandler");
    Handler imageHandler = new ImageFileHandler("imageHandler");

    textHandler.setHandler(docHandler);
    docHandler.setHandler(imageHandler);

    File textFile = new File("README.txt", "text", "/home/docs");
    File docFile = new File("Document.doc", "document", "/home/docs");
    File imageFile = new File("Picture.jpg", "image", "/home/images");
    File audioFile = new File("Song.mp3", "audio", "/home/audio");

// Process files
    System.out.println("Processing text file:");
    textHandler.process(textFile);
    System.out.println("Processing document file:");
    textHandler.process(docFile);
    System.out.println("Processing audio file:");
    textHandler.process(audioFile);
}
