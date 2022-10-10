fun main() {
//    val timeOpen = 8
//    val timeClose = 12
//    val timeNow = 7
//    val classStatus = if(timeNow >= timeClose) {
//        "calss already closed"
//    } else if (timeNow >= timeOpen) {
//        "class is open"
//    } else {
//        "class is not open yet"
//    }
//    println(classStatus)

//    ====================================================

//    val day = 2
//
//    when (day) {
//        1,2,3,4,5 -> println("Weekday")
//        else -> println("weekend")
//    }

//    ====================================================

//    val day = 2
//    when (day) {
//        1 -> {
//            println("hari pertama dalam seminggu")
//            println("senin")
//        }
//        2 -> {
//            println("hari kedua dalam seminggu")
//            println("selasa")
//        }
//        3 -> {
//            println("hari ketiga dalam seminggu")
//            println("rabu")
//        }
//        4 -> println("kamis")
//        4 -> println("jumat")
//        4 -> println("sabtu")
//        4 -> println("minggu")
//        else -> println("hari tidak valid")
//
//    }

//    ====================================================

//    val rangeInt = 1..10 step 2
//    println("step: " + rangeInt.step)
//    print(rangeInt.toList())

//    ====================================================

//    var i = 4
//    if (i in 1.rangeTo(10)) {
//        println("value 4 available in range")
//    }

//    var i = 20
//    if (i !in 10.downTo(1)) {
//        println("value 4 is not available in range")
//    }

//    ====================================================

//    for (i in 1..20) {
//        println("value is $i")
//    }

//    =====================================================

//    val days = arrayOf("senin", "Selasa", "rabu", "kamis", "jumat", "sabtu", "minggu")
//    for ((index, value) in days.withIndex()){
//        println("value $value with index $index")
//    }

//    val days = arrayOf("senin", "Selasa", "rabu", "kamis", "jumat", "sabtu", "minggu")
//    days.forEach {value ->
//        println("day is $value")
//    }

//    val days = arrayOf("senin", "Selasa", "rabu", "kamis", "jumat", "sabtu", "minggu")
//    days.forEachIndexed { index, value ->
//        println("day $value with index: $index")
//    }

//    var i = 0
//    while (i < 10) {
//        println("loop to : $i")
//        i++
//    }

//    var i = 0
//    while (true) {
//        println("break $i")
//        i++
//        if (i >500) {
//            break
//        }
//    }

    var c = 2
    for (b in 1..10) {
        println("sayang...")
        if (b == c){
            println("putus!")
            break
        }
    }
}