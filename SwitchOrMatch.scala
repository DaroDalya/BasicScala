package Looping

object SwitchOrMatch 
{
  def main(args:Array[String]): Unit=
  {
    //Example 1
    var a =1
    a match //asign that a is switch case
    {
      case 1 => println("one")
      case 2 => println("two") //no need to use break
      case _ => println("no") //default
    }
    //Example 2
    var  result = search("hello")
    print(result) //if we put print result here, we cannot put println or print in the case bcuz variable cannot take an expression
  }
  def search(a:Any):Any = a match //Any mean that any datatype
    {
      case 1 => "one"
      case "hello" => "hello"
      case _ => "no"
    }
}