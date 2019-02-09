String name
def n = (name != null && name.size() > 0 ? name : 'World')
n = name ? name : 'World2'
n = name ?: 'World3'
println "Hello $n"
