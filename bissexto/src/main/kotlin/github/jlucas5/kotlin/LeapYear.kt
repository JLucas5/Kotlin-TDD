package github.jlucas5.kotlin

fun main(args: Array<String>) {


}
class LeapYearIdentifier{
    fun isLeapYear(year:Int) {
        return if((year % 4 === 0 && year % 100 === 0) || (year % 400 === 0){
            true
        }else false
}
