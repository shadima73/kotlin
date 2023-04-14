class ElectricCar constructor(plate:String): Car(plate) {

    override var maxSpeed=210
    override fun start() {
        super.start()
        println("electric car is starting ...")
    }
}