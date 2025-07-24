package generics;

import java.util.List;

public class ListaUtil {

    public static Object getUltimo1(List<?> lista){
        return lista.get(lista.size() - 1); //pegando ultimo elemento da lista
    }

    //aqui nao precisa preocupar com cast
    public static <T> T getUltimo2(List<T> lista){
        return lista.get(lista.size() - 1); //pegando ultimo elemento da lista
    }




}
