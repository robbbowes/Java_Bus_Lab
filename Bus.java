public class Bus{
  private String name;
  private Person[] passengers;

  public Bus(String name){
    this.name = name;
    this.passengers = new Person[10];
  }

  public String hasName(){
    return this.name;
  }

  public int passengerCount(){
    int count = 0;
    for(Person person : this.passengers ){
      if(person != null){
        count++;
      }
    }
    return count;
  }

  public boolean isBusFull(){
    return passengerCount() == this.passengers.length;
  }

  public void addPassenger(Person person){
    if( this.isBusFull() ){
      return;
    }
    int passengerCount = passengerCount();
    passengers[passengerCount] = person;
  }

  
}
