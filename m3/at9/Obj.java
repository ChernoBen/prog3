public class Obj{
  public static Runnable run(Runnable[] arr) {
    return()->{
      for(Runnable item : arr){
        item.run();
      }
    };
  }
}