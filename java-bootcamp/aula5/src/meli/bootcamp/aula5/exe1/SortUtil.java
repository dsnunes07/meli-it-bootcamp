package meli.bootcamp.aula5.exe1;

import java.util.List;

public class SortUtil {
    public static <T> void sort (List<Precedente <T>> data) {
        Precedente<T> aux;
        for(int i = 0; i < data.size(); i++){
            for(int j = 0; j<4; j++){
                if(data.get(j).precedeA((T) data.get(j + 1)) < 0){
                    aux = data.get(j);
                    data.add(j, data.get(j+1));
                    data.add(j+1, aux);
                }
            }
        }
    }
}
