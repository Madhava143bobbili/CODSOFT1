public class Copycnstr
 {
   int x,y;
 Copycnstr()
  {
     x=10;
     y=67;
   }
Copycnstr(Copycnstr t)
  {
  x= t.x;
  y=t.y;
  }
void display()
  {
 System.out.println(x+" "+y);
 }
public static void main(String args[])
  {
     Copycnstr c=new  Copycnstr();
     Copycnstr c1=new  Copycnstr(c);
     c.display();
}
}
     


  











