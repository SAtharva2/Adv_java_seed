package interfacedemo;

public interface Interdeno {
    public void print();
    public default void show()
    {
    	System.out.println("hello");
    }
}

 
