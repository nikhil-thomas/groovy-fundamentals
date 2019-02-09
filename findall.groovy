List nums = [1,2,3,4,5,6,7,8,9]

nums.collect { it * 2 }      // map
    .findAll { it % 3 == 0 } // filter
    .sum()                   // reduce

List strings = 'this is a list of strings'.split()

println strings.collect { it[0] }
println strings.collect { it.size() }

println strings*.size()
println strings.size()

def map = [a:1, b:2, c:3]
println map
v = map.collect {k,v -> "$k = $v" }
       .join('&')
println v
