class CTO( id: Int) :Employee() {

    override var id: Int?=null
    init {
        this.id=id
    }


    override fun paySalary() {
        println("$10.000")
    }
}