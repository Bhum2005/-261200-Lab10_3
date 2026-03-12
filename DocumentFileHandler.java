public class DocumentFileHandler implements Handler{
    private Handler handler;
    private String handlerName;

    public DocumentFileHandler(String handlerName){
        this.handlerName = handlerName;
    }
    public void setHandler(Handler handler){
        this.handler=handler;
    }
    public void process(File file){
        if (file.getFileType().equals("document"))
            System.out.println("Process doc file by " + handlerName);
        else if (handler!=null) { // next handler exists
            System.out.println(handlerName + " forwards request to "
                    + handler.getHandlerName());
            handler.process(file);
        }
        else
            System.out.println("File not supported");
    }
    public String getHandlerName(){
        return this.handlerName;
    }
}
