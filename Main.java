import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {

        int n, result;
        boolean flag = true;

        Scanner reader = new Scanner (System.in);

        n = reader.nextInt();
        List<String> pokemonsList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String pokemon = new String (reader.next());
            if (i == 0){
                pokemonsList.add(pokemon);
                continue;
            }
            for(String poke : pokemonsList){
                if (poke.equals(pokemon)){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                pokemonsList.add(pokemon);
            }
            flag = true;
        }
        result = 151 - pokemonsList.size();
        System.out.printf("Falta(m) %s pomekon(s).\n", result);
 
    }
 
}