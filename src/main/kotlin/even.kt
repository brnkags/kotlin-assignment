fun main(){
    evenNumber()
}
fun evenNumber(){
    val myList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    val filteredList = myList.filter { x -> x % 2 == 0 }
    println((filteredList.sum()))
}