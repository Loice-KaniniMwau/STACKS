fun main() {
var stack1=Stack()
//    stack1.data= mutableListOf(1,2,3,4,5,6,7,8)
   println( stack1.pop())
    stack1.push(67)
    stack1.push(32)
    stack1.push(45)
    println(stack1.peek())
   println( stack1.pop())
    stack1.push(18)
    var x=stack1.pop()
    var y=stack1.pop()
    var z=x!! + y!!
    println(z)
//
//    var mydata=Characters()
//    var string="AkiraCHIX"
//    for(c in string){
//       mydata.push(c)
//    }
//    var result= mutableListOf<Char>()
//    while (!mydata.isEmpty()){
//
//    }

}
//pop  push isEmpty() isFull() peek
class Stack {
    var data = mutableListOf<Int>()
    fun push(value: Int) {
        data.add(value)
        println(data)
    }

    fun pop(): Int? {
        if (data.isEmpty()) {
            return null
        }
        var top=data[data.lastIndex]
//        data.removeAt(data.lastIndex)
        data.remove(top)
        return top

    }
    fun peek():Int?{
      if(data.isEmpty()){
          return null
      }

        return data[data.lastIndex]

    }
    fun isEmpty():Boolean{
        return data.isEmpty()
    }
}
class Characters{
    var mydata= mutableListOf<Char>()
    fun push(value:Char){
        mydata.add(value)
    }
    
}
