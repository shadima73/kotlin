fun main(){
    var pagani = Car("CA-5768")
    var bmw = Car("CA-5761")
    var electricCar1 = ElectricCar("EL-8576")
    var shima = Person(25,"shima","roshan")
    var sparrow1=Sparrow()
    var student1=Student()
    var student2=Student()
    var student3=student1.plus(student2)


    sparrow1.fly()
    bmw.color="red"
    pagani.hp=1100
    pagani.speed=340
    bmw.model="bmw"
    student1.skills="java"
    student2.skills="kotlin"

    println(electricCar1.maxSpeed)
    println(bmw.color)
    println(bmw.model)

    bmw.stop()
    pagani.start()
    electricCar1.start()
    pay(CTO(10))
    student1.showSkills()
    student2.showSkills()
    student3.showSkills()
}

fun pay(employee: Employee){
    employee.paySalary()
}

fun Student.plus(student1 : Student):Student{
    var newStudent=Student()
    newStudent.skills=this.skills+""+student1.skills
    return newStudent
}