object FooBar 
{
   def main(a: Array[String]): Unit = 
   {
     var a : Integer = null;
     for (a <- 1 to 100)
     {
       if(a%15==0)
       {
         println("foobar");
       }
       else if(a%3==0)
        {
          println("foo");
        }
       else if(a%5==0)
       {
         println("bar");
       }
       else
       {
         println(a);
       }
     }  
   }
}