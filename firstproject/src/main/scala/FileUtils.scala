import scala.io.Source
import java.io.FileWriter
import java.io.FileInputStream
import java.io.BufferedReader


object FileUtils extends App {
  
  
 //Working with the files io operations
  
  val ipFile = "C:/Users/Praveen/Desktop/sample.txt"
  val opFile = "C:/Users/Praveen/Desktop/output.txt"
  
  val list: List[String] = Source.fromFile(ipFile).getLines().toList
  
  println("File reading by using foreach")
 
  list.foreach(println)
  
  println("File reading by using for loop")

  for (l <- list) {
   println(l) 
   
  }
  
  val fw = new FileWriter(opFile)
  
  for (l <- list)  {
    
    fw.write(l )
    
  }
  
  fw.flush();

    fw.close();
    
 println("File reading by using foreach")
 
 val is = new FileInputStream(ipFile)
 
 var input:String = null
 
 
 
 

    
  
}