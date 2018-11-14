package github.jlucas5.kotlin

fun main(args: Array<String>) {

    println("Qual ano você deseja verificar?")
    val input = readLine()
    val calculator = LeapYearIdentifier()
    if (calculator.isLeapYear(input)){
        println("O ano $input é bissexto")
    }else println("O ano $input não é bissexto")


}
class LeapYearIdentifier{
    fun isLeapYear(year:Int) {
        return if((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0){
            true
        }else false
}
