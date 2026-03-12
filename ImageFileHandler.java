public class ImageFileHandler implements Handler{
    private Handler handler;
    private String handlerName;

    public ImageFileHandler(String handlerName){
        this.handlerName = handlerName;
    }
    public void setHandler(Handler handler){
        this.handler=handler;
    }
    public void process(File file){
        if (file.getFileType().equals("image"))
            System.out.println("Process image file by " + handlerName);
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
