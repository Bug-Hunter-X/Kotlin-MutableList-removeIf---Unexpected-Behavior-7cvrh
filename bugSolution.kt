fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it % 2 != 0 }.toMutableList()
    println(newList)
    //Or using toList() if mutability is not needed
    val newList2 = list.filter { it % 2 != 0 }.toList() 
    println(newList2)
}