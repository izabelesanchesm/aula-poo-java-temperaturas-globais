package temperaturas;

public class Temperaturas {

    public static void main(String[] args) {
        String cidades[] = {"Londres", "Madrid", "Nova York", "Buenos Aires", "Assunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        int cidadeMenorTemperatura = 0;
        int cidadeMaiorTemperatura = 0;
        int menorTemperatura = temperaturas[0][0];
        int maiorTemperatura = temperaturas[0][1];

        for (int i = 1; i < cidades.length; i++){
            if (temperaturas[i][0] < menorTemperatura){
                menorTemperatura = temperaturas[i][0];
                cidadeMenorTemperatura = i;
            }

            if (temperaturas[i][1] > maiorTemperatura){
                maiorTemperatura = temperaturas[i][1];
                cidadeMaiorTemperatura = i;
            }
        }

        System.out.println("Cidade: \t Temp Mais Baixa: \t Temp Mais Alta:");

        for (int i = 0; i < cidades.length; i++){
            System.out.println(cidades[i] + " \t" + temperaturas[i][0] + " \t" + temperaturas[i][1]);
        }

        System.out.println("A cidade com a temperatura mais alta é: " + cidades[cidadeMaiorTemperatura]);
        System.out.println("A cidade com a temperatura mais baixa é: " + cidades[cidadeMenorTemperatura]);

    }
}
