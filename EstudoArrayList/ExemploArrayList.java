package EstudoArrayList;

public class ExemploArrayList {
    // Atributos
    int cont = 0;
    // Métodos
    public void add(int add) {
        Vetor a = new Vetor(cont);
        // vou copiar o v1 -> v2
        if (cont == 0) {
            v1[0]=add;
        } else {
            for (int i = 0; i < cont; i++) {
                v2[i] = v1[i];
            }
            // adicionei o valor do add a ultima posição do vetor2
            v2[cont + 1] = add;
            // copiar o v2 para o v1
            for (int i = 0; i < cont + 1; i++) {
                v1[i] = v2[i];
            }
            cont++;
        }
    }

    public void imprimir() {
        for (int i = 0; i < v1.length; i++) {
            System.out.println("valor=" + v1[i]);
        }
    }
}
