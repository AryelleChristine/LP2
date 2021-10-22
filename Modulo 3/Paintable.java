interface Paintable{ //pintavel
  int topaint(int objeto); //pintar
  int sand (int objeto); //lixar
}
//os dois parametros sao os obejtos porque sao eles que serao pintados ou lixados
class Wall implements Paintable{
  int topaint (int objeto){
    ...
    }
  int sand (int objeto){
    ...
    }
}

class Nail implements Paintable{
  int topaint (int objeto){
    ...
    }
  int sand (int objeto){
    ...
    }
}


class Door implements Paintable{
  int topaint(int objeto){
    ...
    }
  int sand (int objeto){
    ...
    }
}
