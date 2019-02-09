def nums = [1,2,3,4]

assert 20 == nums.collect { it * 2 }.sum()


// sum taking a closure
assert 20 == nums.sum { it * 2 }

// sum with spread dot
assert 20 == nums*.multiply(2).sum()

// use inject
assert 20 == nums.inject(0) { acc, val ->
    acc + val * 2
}