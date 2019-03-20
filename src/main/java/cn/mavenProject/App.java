package cn.mavenProject;

import javax.annotation.processing.SupportedAnnotationTypes;

/**
 * Hello world!
 *
 */

public class App
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("初始化驱动成功");
        System.out.println( "Hello World!" );
         System.out.println( "Hello World!chenhuang" );
        System.out.println( "Hello World!chenhuang2" );
        System.out.println( "Hello World!chenhuang3" );
    }
}
