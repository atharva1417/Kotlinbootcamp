class alien(length: Int = 100, width: Int = 40, height: Int = 100) {
    // Dimensions in cm
    var length: Int = length
    var width: Int = width
    var height: Int = height
    fun printSize() {
        println(
                "Width: $width cm " +
                        "Length: $length cm " +
                        "Height: $height cm "
        )
        println("Volume: $volume ")
    }

    init {
        println("Zoo initializing")
    }

    init {
        // Volume of the cage
        println("Volume: ${width * length * height} ")
    }

    constructor(numberOfAnimals: Int) : this() { //secondary constructor
        // 5,000 cm^3 per animal + extra room so they don't end up fighting
        val cage = numberOfAnimals * 5000 * 2.2
        // calculate the height needed
        height = (cage / (length * width)).toInt()
    }

    var volume: Int     //use of getter and setter
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length) //value is recalculated based on the food supplied
        }
    //filters
    fun filter() {
        val animals = listOf("cat", "crocodile", "duck", "pig", "Cow")

        // eager, creates a new list
        val stable = animals.filter { it[0] == 'c' }
        println("stable: $stable")


    }


    fun zooRevenue() {
        val myZoo = alien(numberOfAnimals = 49)
        myZoo.printSize()
        myZoo.volume = 70
        myZoo.printSize()


    }
    fun crawl(speed: String = "zigzag") {
        println("crawling $speed")
    }
}
fun main() {
    //these function calls  are for secondary constructors and getter and setter properties
        zooRevenue()
         //these function calls  are for parameterised functions
        crawl()   // uses default speed
        crawl("slither")   // positional argument
        crawl(speed="cobra-like")   // named parameter
    //these function calls are for filters
        filter()
    }


