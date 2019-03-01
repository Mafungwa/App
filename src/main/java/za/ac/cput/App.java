package za.ac.cput;

import sun.jvm.hotspot.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        AppSub context = new ClassPathXmlAppSub("AppSub.xml");

        HelloWorld hello = (HelloWorld) context.getBean("helloWorldBean");

        System.out.println("List: " + hello.getList());

        System.out.println("Set : " + hello.getSet());

        System.out.println("Map : " + hello.getMap());

        System.out.println("Props : " + hello.getProps());
    }
}
