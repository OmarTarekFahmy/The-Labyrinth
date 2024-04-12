package engine.text;
import java.time.*;
public class TextWriter {
    
    private long waitMillis;

    public double getWaitMillis() {
        return waitMillis;
    }

    public void setWaitMillis(long waitMillis) {
        this.waitMillis = waitMillis;
    }

    public void write(String text){


        for(int i = 0; i < text.length(); i++){
            System.out.print(text.charAt(i));
            try{
            Thread.sleep(waitMillis);
            }catch(Exception e){

            }
        
        }



    }

    public TextWriter(long waitMillis){
        this.waitMillis = waitMillis;
    }

    


}
