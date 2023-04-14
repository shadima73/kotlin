open class Car constructor(plate:String) {

    open var maxSpeed=130
    var weight : Double?=null
    lateinit var color : String
    var speed : Int? = null
    var hp : Int? = null
    var model : String? = null
    get(){
        return field + "2022"
    }
    set(value) {
        if (value.equals("bmw")){
            field=value
        }else{
            println("error")
        }
    }




    init {
        println("plate number -> : $plate")
    }

    open fun start(){
        println("starting ...")
    }

    fun stop(){
        println("stop ...")
    }

    fun accelerate(){
        println("accelerating ...")
    }

    fun crash(){
        println("crashed ...")
    }
}