String s = "hola mundo"
s.metaClass.metodoQueNoExiste = {
  println "Como ño????"
}

println s.class.name
s.metodoQueNoExiste()
println s.class.name