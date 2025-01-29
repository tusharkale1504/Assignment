class Conn
{
    int a, b;
    Conn ( )	{
        int a = 5;
        int b = 10;
    }
    void display ( ) {
        System.out.println(a+b);
    }
    public static void main (String args [ ])
    {
        Conn obj1 = new Conn( );
        obj1.display( );
    }}

