//AndresQuinto 18288
fun main(args: Array<String>) {
    var r: String?
    var isOn = true



    println("Bienvenid@s al menu de listas de tareas")

    println(menu())
    r = readLine()!!

    when (r) {
        1.toString() ->{
            println("Ingrese el nombre de la lista" )
            readLine()!!

        }
        2.toString() -> {
            while(isOn)
            println("Gracias por utilizar el programa\nAdios.")

        }
    }
}
