

/*_______________UML Diagram____________________*
 *______________________________________________*
 *               q13			        	*
 *______________________________________________*
 * 							  			 		*
 *  width: double 								*
 *  						    				*
 *  height: double								*
 *  						  					*
 * 	q13()									*
 * 						  					    *
 *  q13(newWidth:double, newHeight:Double)*
 *  											*
 * 	getArea(): double							*
 * 												*
 * 	getPerimeter(): double						*
 * 												*
 * _____________________________________________*
 */
public class q13 {

    double width;
    double height;

    q13() {
        width = 1;
        height = 1;
    }

    q13(double newWidth, double newHeight) {

        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {

        return (2 * width) + (2 * height);
    }
}


