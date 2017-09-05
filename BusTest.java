import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;

  @Before
  public void before() {
    bus = new Bus("Bussy McBusface");
    person = new Person();
  }

  @Test
  public void hasName(){
    assertEquals("Bussy McBusface", bus.hasName() );
  }

  @Test
  public void busIsEmpty(){
    assertEquals( 0, bus.passengerCount() );
  }

  @Test
  public void busHas1Passenger(){
    for(int i = 0; i<1; i++){
      bus.addPassenger(person);
    }
    assertEquals( 1, bus.passengerCount() );
  }
}
