/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_14;

/**
 * @author AHMED ABUWARDA.
 */
public class TestShape3 {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Shape shape = new Shape();
        Circle cir = new Circle();
        Rectangle rect = new Rectangle();

        Object shape_cir = new Circle();
        Object shape_rect = new Rectangle();

        System.out.println(((Circle) shape_cir).print());       // Circle
        System.out.println(((Rectangle) shape_rect).print());   // Rectangle

    }

}