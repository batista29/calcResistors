// Ler na documentação sobre null-safety
fun showInstructions(){
    println("Calculadora de resistores <<<<")
    println("Informe as 4 cores separadas por vírgula")
}

fun getColorsFromUser():String?{
        return readLine()
}

fun cleanResistorString(s: String):String{
    return s.replace(" ", "").uppercase()
}

fun getColorsList(cleanedString:String):List<String>{
    return cleanedString.split(",")
}

fun main(){
    var resistorColors: List<String>

    showInstructions()
    var colors = getColorsFromUser()
    if (colors != null){
        resistorColors = getColorsList(cleanResistorString(colors))
        println(resistorColors)
    }
}


// Strings são imutáveis por definição em java e kotlin