import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest(){
        City city = new City( "Charlottetown" , "Prince Edward Island" ) ;
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
    }

    @Test
    public void testDeleteCity () {
        City city = new City( "Charlottetown" , "Prince Edward Island" ) ;
        list.addCity(city);
        list.deleteCity(city);
        assertEquals(false, list.hasCity(city));
    }

    @Test
    public void testCountCities() {
        City city1 = new City( "Charlottetown" , "Prince Edward Island" ) ;
        City city2 = new City( "Some other town" , "Prince Edward Island" ) ;
        list.addCity(city1);
        list.addCity(city2);
        assertEquals(list.getCount(), 2);
    }
}
