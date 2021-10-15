interface Saveable{ //guardavel
  void open(int acao); //abrir
  int save(int objeto); //guardar
}

class Refrigerator implements Saveable{
  void open (int acao){
    ...
   }
  int save (int oobjeto){
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
