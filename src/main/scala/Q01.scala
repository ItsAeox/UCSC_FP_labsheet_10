@main def Question_01: Unit ={
    print("Enter temperatures : ")
    val input = scala.io.StdIn.readLine()
    val temperatures = input.split(" ").map(_.toDouble).toList
    val average = calculateAverage(temperatures)
    println(s"Average Fahrenheit temperature: $average")
}

def calculateAverage(temperatures: List[Double]): Double = {
    val fTemperatures = temperatures.map(celsius => (celsius * 9/5) + 32)
    val totalF = fTemperatures.reduce((temp1, temp2) => temp1 + temp2)
    val averageF = totalF / temperatures.length
    averageF
}



