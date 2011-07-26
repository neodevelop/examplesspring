import groovy.swing.*

def builder = new SwingBuilder()

def contador = 0

def frame = builder.frame(title:"Hola",size:[300,300]){
  flowLayout()
  label(text:"Hola")
  campo = textField(columns:10)
  button(text:"Push me!!",actionPerformed:{ contador++; campo.value=contador })
}

frame.show()