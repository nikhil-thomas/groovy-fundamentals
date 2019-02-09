def map = [a: 1, b:2, c: 3]
println map
println map.getClass().name

for (String key : map.keySet()) {
    def val = map[key]
    println "map[$key] = $val"
}

println "\neach"
map.each { entry ->
    println "$entry :: m[${entry.key}] = ${entry.value}"
}

println "\neach"
map.each { key, val ->
    println "$key = $val"
}

// idiomatic groovy

println "\njava accent"
10.downto(7, { println it })

println "\nidiomatic groovy"
10.downto(7) { println it }

println "\nidiomatic groovy (optional paraenthesis"
10.downto 7,  { println it }