@main def Question_02: Unit ={
    print("Enter the words :")
    val input = scala.io.StdIn.readLine()
    val words = input.split(" ").toList
    val totalCount = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalCount")
}

def countLetterOccurrences(words: List[String]): Int = {
    val letterCounts = words.map(_.length)
    val totalLetterCount = letterCounts.reduce((count1, count2) => count1 + count2)
    totalLetterCount
}
