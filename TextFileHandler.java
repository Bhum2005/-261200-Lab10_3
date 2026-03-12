public class TextFileHandler implements Handler{
    private Handler handler;
    private String handlerName;

    public TextFileHandler(String handlerName){
        this.handlerName = handlerName;
    }
    public void setHandler(Handler handler){ // set handler ที่ส่งงานต่อ
        this.handler=handler;
    }
    public void process(File file){
        if (file.getFileType().equals("text"))
            System.out.println("Process text file by " + handlerName);
        else if (handler!=null) { // เช็คว่า handler ที่ส่งงานต่อมีไหม ถ้ามีส่งต่อให้ทำ
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
