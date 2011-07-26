class HolaMundo{
  String nombre
  
  def saluda(){
    "Hola $nombre !!!!"
  }
}

def objeto = new HolaMundo(nombre:"Juan")
println(objeto.saluda())
