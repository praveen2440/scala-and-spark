

object Cs {
  
  def main(args: Array[String]): Unit = {
    
    if (args.length != 0){
      
      val input = args
      val iLength = args.length
      
      println("for loop")

      for(i <- 0 to iLength) {
        
        println(args(i))
      }
      
     println("for loop with diffrent syntax")
     
     for(arg <- args){
       
       
       println(arg)
     }
      
     println("While loop")
     var i = 0
     while (i < iLength){
       println(args(i))
       
       i = i+1
     }
    }
    
    else {
      
      
      
      
      
    }
  }
  
}