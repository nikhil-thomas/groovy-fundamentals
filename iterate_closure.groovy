List nums = [1,2,3,4,5]
nums.each { println it }

nums.each { n ->
    println n
}

nums.eachWithIndex { n, idx ->
    println "nums[$idx] = $n"
}