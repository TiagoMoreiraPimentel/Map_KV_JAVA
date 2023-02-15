package App;

import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {
        
        // instancia o map
        Map<String, String> cookies = new TreeMap<>();
        
        // adiciona valores   key/value
        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99771122");
        
        // remove o valor pela chave.
        cookies.remove("email");
        
        // sobre escreve os valores
        cookies.put("phone", "99771133");
        
        // verifica se ja existe o valor dentro do map de acordo com a chave.
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        
        // imprime o valor com o metodo get, chamando pela chave key
        System.out.println("Phone number: " + cookies.get("phone"));
        
        // retorna null, se a chave não existir
        System.out.println("Email: " + cookies.get("email"));
        
        // ver o tamanho do map
        System.out.println("Size: " + cookies.size());
        
        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
