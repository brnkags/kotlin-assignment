fun main(){
    removedup()
}
fun removedup(){
    val integerList = listOf(1, 2, 3, 3, 4, 5, 6, 6, 7, 8, 9, 10)
    val remduplist = integerList.distinct()
    println(remduplist)
}