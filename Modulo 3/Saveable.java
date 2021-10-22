interface Saveable{ //guardavel
  void open(int acao); //abrir
  int save(int objeto); //guardar
}
//explicando os parametros, acao é o abrir 
//objeto é o que vai colocar dentro 
class Refrigerator implements Saveable{
  void open (int acao){
    ...
   }
  int save (int objeto){
    ...
   }
}

class Cabinet implements Saveable{
  void open(int acao){
    ...
    }
  int save (int objeto){
    ...
    }
}


class Handbag implements Saveable{
  void open(int acao){
    ...
    }
  int save(int objeto){
    ...
    }
}
