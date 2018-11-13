package github.jlucas5.kotlin

fun main(args: Array<String>) {


}
class LeapYearIdentifier{


    fun isBissexto(numero:Int) {

        return when(){
            numero % 4 === 0 -> true
        }
    }
}