import groovy.transform.*

//@ToString(includeNames = true)
//@EqualsAndHashCode
//@TupleConstructor
@Canonical
class Person {
    String first
    String last
    
    void setLast(String last) {
        println "setting last"
        this.last = last
    }
    
    //String toString() { "$first $last" }
}

Person p = new Person()
p.setFirst("james")
p.last = "bond"
Person p2 = new Person(first: "sk", last: "ted")

Person p3 = new Person(first: "sk", last: "ted")
Person p4 = new Person("sk", "ted")
println "${p.getFirst()} ${p.last}"

println p.toString()

Set people = [p, p2,p3]
people.size()