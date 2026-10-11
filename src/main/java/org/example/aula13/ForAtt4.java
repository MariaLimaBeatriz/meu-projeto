package org.example.aula13;
//4. Com um array de nomes, use for-each e um if para contar quantos
//   têm mais de 5 letras. Mostre o total. Dica: usem o método length.
public class ForAtt4 {
    static void main() {

        String[] nomes = {"Ana", "Julia", "Fabi", "Clara"};

        for (String nome : nomes) {
            System.out.println(nome);

            if (nomes.length >= 5) {

                System.out.println("nome possui mais de 5 letras ");
            } else {

                System.out.println("não tem nomes com mais de 5 letras");
            }

        }
    }}
