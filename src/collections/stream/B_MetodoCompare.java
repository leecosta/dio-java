package collections.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class B_MetodoCompare {

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
        		//primeiro parâmetro tipo que quer que faça a comparação, 
        		//segundo parâmetro tipo de dado do retorno
        		new Function<Map.Entry<Integer, Contato>, Integer>() {
        	@Override
            public Integer apply(Map.Entry<Integer, Contato> cont) {
                return cont.getValue().getNumero();
            }
        }));
        
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
        	System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }

	}

}
