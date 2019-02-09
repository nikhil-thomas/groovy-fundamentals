List nums = [1,2,3,4,5]

// procedural
// there is a side effect (modifies result which is defined outside
List result = []
nums.each {
    result << it * 2
}
println result

// functional
// no side effects
r = nums.collect {
    it * 2
}
println 