class Person {
    String name
}

class Manager {
    Person mng
}

def m1 = new Manager(mng: new Person(name: "Bob"))
println m1.mng.name

def m2 = new Manager()
println m2?.mng?.name
