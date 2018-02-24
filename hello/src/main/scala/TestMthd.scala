

object TestMthd {
  
  def main(args: Array[String]): Unit = {
    
    println("Adding method"+add(2,3))
    println("Adding fN"+addFn(2,3))
    
    
  }
  
  //function
  
  
  val addFn = (i:Int,y:Int) => i+y;
  
  //Max no of parameters passed in the fn = 22 = no of fucntion objects
  //if no of args  = 2 (scala created function2 object and calls apply method which has function body
  //method can be part of class defnition
  //No static in scala
  //method can be defined with def
  
  
  //method
  
  def add(i:Int,y:Int)= {
    i+y
    }
  
  def time():Long = {
    
    System.currentTimeMillis();
    
    
  }
  
  def delayedTime(t){
    
    println("Delayed time")
    
  }
  
  
  
}
