var balance = 10_000

fun main(){
    val playTheGame = {
        balance -= 1_000
        println("Playing the game!")
    }
    doTransaction(playTheGame)
}

// tes tambah comment

inline fun doTransaction(doPlay:() -> Unit){
    println("saldo sebelum bermain: $balance")
    doPlay()
    println("Saldo sesudah bermain: $balance")
}