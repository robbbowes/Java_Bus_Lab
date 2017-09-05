import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest{
  BusStop busStop;
  Bus bus;
  Person person;

  @Before
  public void before() {
    busStop = new BusStop("Marchmont");
    bus = new Bus("Bussy McBusface");
    person = new Person();
  }

  @Test
  public void hasName(){
    assertEquals("Marchmont", busStop.getName() );
  }

  @Test
  public void peopleAtStop(){
    assertEquals(0, busStop.peopleAtStop() );
  }

  @Test
  public void busStopFull(){
    for( int i = 0; i<8; i++ ){
      busStop.addToQueue(person);
    }
    assertEquals(8, busStop.peopleAtStop() );
  }

  @Test
  public void boardBus(){
    bus.
  }
}
