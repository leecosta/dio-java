package collections.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class A_FuncaoAnonima {

	public static void main(String[] args) {

		System.out.println("--\tOrdem aleatória\t--");
		Map<Integer, Contato> agenda = new HashMap<>() {
			{
				put(1, new Contato("Simba", 5555));
				put(4, new Contato("Cami", 1111));
				put(3, new Contato("Jon", 2222));
			}
		};
		System.out.println(agenda);
		for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		System.out.println("\n--\tOrdem número telefone\t--");

		// classe anônima do ComparatorOrdemNumerica
		Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
			@Override
			public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
				return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
			}
		});

		set.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry : set) {
			System.out
					.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
		}

	}
}

//class ComparatorOrdemNumerica implements Comparator<HashMap.Entry<Integer, Contato>> {
//    @Override
//    public int compare(HashMap.Entry<Integer, Contato> cont1, HashMap.Entry<Integer, Contato> cont2) {
//        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
//    }
//}
