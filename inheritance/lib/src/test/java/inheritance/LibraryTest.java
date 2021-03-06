/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @DisplayName("Restorant Test")
    @Test void testRestorant() {
        Restaurant classUnderTest = new Restaurant("restName","$");
        assertEquals("restName",classUnderTest.getName());
        assertEquals(classUnderTest.toString(),"Restaurant{name='restName', stars=5, price=$}");

    }
    @DisplayName("Review Test")
    @Test void testReview(){
        Review classUndertest= new Review("wael",5,"good");
        assertEquals(classUndertest.toString(),"Review{author='wael', body='good', authorReviw=5}");
    }

    @DisplayName(" add Review to the restorant test")
    @Test void testAddReviewToRestorant(){
        Restaurant testRest= new Restaurant("Rest1","$");
        testRest.addRevews("wael",4,"good");
        assertEquals(testRest.toString(),"Restaurant{name='Rest1', stars=4, price=$}");
    }

    @DisplayName(" add  multi Review to the restorant test")
    @Test void testAddMultiReviewToRestorant(){
        Restaurant testRest= new Restaurant("Rest1","$");
        testRest.addRevews("wae2",4,"good");
        testRest.addRevews("wae2l",4,"good");
        testRest.addRevews("wae2l",2,"good");
        testRest.addRevews("wae2l",2,"good");
        assertEquals(testRest.toString(),"Restaurant{name='Rest1', stars=3, price=$}");
    }

///////////////////////////////////////////// new /////////////////////////////////////////////

    @DisplayName("Shop test")
    @Test void shopTest(){
        Shop testShop= new Shop("shop1","shop1","$");

        assertEquals(testShop.toString(),"Shop{name='shop1', description='shop1', number_of_dollar_signs='$'}\n");
    }


    @DisplayName(" Add review Shop test")
    @Test void AddReviewShopTest(){
        Shop testShop= new Shop("shop1","shop1","$");

        testShop.addRevews("wae2",4,"good");
        testShop.addRevews("wae2l",4,"good");
        testShop.addRevews("wae2l",2,"good");
        testShop.addRevews("wae2l",2,"good");
        assertEquals(testShop.toString(),"Shop{name='shop1', description='shop1', number_of_dollar_signs='$'}\n" +
                "Review{author='wae2', body='good', authorReviw=4}\n" +
                "Review{author='wae2l', body='good', authorReviw=4}\n" +
                "Review{author='wae2l', body='good', authorReviw=2}\n" +
                "Review{author='wae2l', body='good', authorReviw=2}\n");
    }


    @Test void theterTest(){



        Theater testShop= new Theater("Thater1");
        testShop.addMovie("pat man");
        testShop.addMovie("spider man");
        testShop.addMovie("new man");
        assertEquals(testShop.toString(),"Theater{name='Thater1', movies=[pat man, spider man, new man]\n" +
                "}");
    }





    @Test void theterMovieReviewTest(){
        Theater testShop= new Theater("Thater1");
        testShop.addMovie("pat man");
        testShop.addMovie("spider man");
        testShop.addMovie("new man");
        testShop.addRevews("wael",4,"good");

        assertEquals(testShop.toString(),"Theater{name='Thater1', movies=[pat man, spider man, new man]\n" +
                "Review{author='wael', body='good', authorReviw=4}\n" +
                "}");
    }
}
