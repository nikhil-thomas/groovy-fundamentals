// List
def nums = [1,2,3,4]
println nums.class.name

nums = [1,2,3,4] as LinkedList
println nums.class.name

nums = [1,2,3,4] as Set
println nums.class.name

nums = [1,2,3,4] as SortedSet
println nums.class.name

def strs = "this is a list of words".split()
println strs
println strs.class.name

List strs1 = "this is a list of words".split()
strs1 << 123
println strs1
println strs1.class.name


// generics are comiled but not enforced.
// it is up to the user to enforce generics
List<Integer> iList = [1,2,3,4, 'abc']
ilist << new Date()
println ilist
println iList.class.name