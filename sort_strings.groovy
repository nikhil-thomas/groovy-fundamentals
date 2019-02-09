List strings = 'this is a list of strings'.split()

Collections.sort(strings)
println strings

Collections.sort(strings, new Comparator<String>() {
    int compare(String s1, String s2) {
        s1.size() <=> s2.size()
    }
})
println strings

println strings*.size()

// natural Groovy
println strings.sort(false)
println strings

println strings.sort(false, new Comparator<String>() {
    int compare(String s1, String s2) {
        s1.size() <=> s2.size()
    }
})

// Groovy reverse length sort with closure
println strings.sort(false) { s1, s2 ->
    s2.size() <=> s1.size()
}

//groovy sort with one param closure
println strings.sort(false) { it.size() }

// reverse size by size and if size equal alphabetical
println strings.sort(false) { String s1, String s2 ->
    s2.size() <=> s1.size() ?: s2 <=> s1
}
