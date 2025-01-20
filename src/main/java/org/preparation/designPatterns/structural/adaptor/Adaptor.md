# Adaptor

Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

If you have the interface and you want to use a class to implement your interface you can use an Adaptor class to do so.
Here in this case the Adaptor class will implement your interface and in the method defination you will create an object 
of the class which you want to use and call the method which better suits you.

 
`public class PenAdaptor implements Pen{
Pilotpen pilotpen=new Pilotpen();
@Override
public String write() {
return pilotpen.writing();
}
}`

`public interface Pen {
String write();
}`

`public class Pilotpen {
String writing(){
return "Writing....";
}
}`
