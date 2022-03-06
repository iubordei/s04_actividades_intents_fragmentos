fun main() {
    // listas
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   ${numbers}")
    println("sorted: ${numbers.sorted()}")
    
    // conjuntos
    val setOfNumbers = numbers.toSet()
	println("set:    ${setOfNumbers}")
    
    val set1 = setOf(1,2,3)
	val set2 = mutableSetOf(3,2,1)
    println("\n$set1 == $set2: ${set1 == set2}")
    
    println("\ncontains 7: ${setOfNumbers.contains(7)}")
    
    // mapas
    
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    println("\n$peopleAges")
    peopleAges["Fred"] = 31
    println(peopleAges)
    
    // como trabajar con colecciones
    // for each
    println()
    peopleAges.forEach { print("${it.key} is ${it.value}, ") }
    
    // map
    println()
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )
    
    // filter
    println()
    val filteredNames = peopleAges.filter { it.key.length < 4 }
	println(filteredNames)
    
    // lambdas
    println()
    peopleAges.forEach { println("${it.key} is ${it.value}") }
    
    // tipos de funciones
    val triple: (Int) -> Int = { a: Int -> a * 3 }
    println()
    println(triple(5))
    
    val triple2: (Int) -> Int = { it * 3 }
    println(triple(5))
    
    // funciones de orden superior
    println()
    peopleAges.filter { it.key.length < 4 }
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })
    
    // listas de palabras
    println()
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
	println(filteredWords)
    val filteredWords2 = words.filter { it.startsWith("b", ignoreCase = true) }
    .shuffled()
	println(filteredWords2)
    
    val filteredWords3 = words.filter { it.startsWith("b", ignoreCase = true) }
    .shuffled()
    .take(2)
	println(filteredWords3)
    
    val filteredWords4 = words.filter { it.startsWith("b", ignoreCase = true) }
    .shuffled()
    .take(2)
    .sorted()
	println(filteredWords4)
    
    println()
    val palabrasC = words.filter { it.startsWith("c", ignoreCase = true) }.shuffled().take(1)
    println(palabrasC)
    
}