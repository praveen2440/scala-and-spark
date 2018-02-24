//Executing Scala program with out main method by extending App Trait
package example

object FirstProject  {

  def main(args: Array[String]): Unit = {
    
    println("Hello scala");
    
    var l = Seq("PRAVEEN PRAVEEN VIKRAM VISHAL KArtheek" ,"VIKRAM VISHAL PRAVEEN")
    
    var l1 = l.flatMap(_.split(" "))
    
    println("Printing the elements of the spliited ")
    
    for (args <- l1) {
      
    println(args)
    
    }
    
    var l2 = l1.map(x => (x,1))
    println("Printing the word and count")
    for (args <- l2) {
      
    println(args)
    
    }
    
    }
      
    
    
  
    
  
  
 

}
    
    
    
  
  
  
  


 
