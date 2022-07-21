package collections.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class C_Lambda {

	public static void main(String[] args) {

		System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {{
           put(1, new Contato("Simba", 5555));
           put(4, new Contato("Cami", 1111));
           put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        
        
        System.out.println("\n--\tOrdem número telefone\t--");
        
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
        		cont -> cont.getValue().getNumero()));
        
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
        	System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }


	}

}
