package JavaProject.Classes;

import java.io.IOException;

public class Counter implements AutoCloseable{
    private int count;
    private boolean closed;

    public Counter(){
        count = 0;
        closed = false;
    }

    public int getCount(){
        return count;
    }

    public void add() throws IOException{
        if(isClosed()) throw new IOException("Counter is closed");
        else count++;
    }

    public boolean isClosed(){
        return closed;
    }

    @Override
    public void close() throws Exception {
        closed=true;
    }
    
}
