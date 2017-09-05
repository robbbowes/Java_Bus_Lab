public class BusStop{
  private String name;
  private Person[] peopleWaiting;

  public BusStop(String name){
    this.name = name;
    this.peopleWaiting = new Person[8];
  }

  public String getName(){
    return this.name;
  }

  public int peopleAtStop(){
    int count = 0;
    for (Person person : this.peopleWaiting ){
      if(person != null){
        count++;
      }
    }
    return count;
  }

  public boolean isBusStopFull(){
    return peopleAtStop() == this.peopleWaiting.length;
  }

  public void addToQueue(Person person){
    if( this.isBusStopFull() ){
      return;
    }
    int peopleAtStop = peopleAtStop();
    peopleWaiting[peopleAtStop] = person;
  }




}
