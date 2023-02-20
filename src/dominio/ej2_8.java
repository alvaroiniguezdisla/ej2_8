package dominio;

public class ej2_8 {



    public static int sumapareslista(int[]lista,int i) {
        if(i==0) {
            if(lista[i]%2==0) {
                return lista[i];
            }else {
                return 0;
            }
        }

        if(i!=0) {
            if(lista[i]%2!=0) {
                return sumapareslista(lista,i-1);
            }
        }
        return lista[i]+sumapareslista(lista,i-1);


    }



}

