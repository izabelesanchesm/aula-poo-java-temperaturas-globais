package temperaturas;

public class Temperaturas {

    public static void main(String[] args) {
        String cidades[] = new String[10];
        int temperaturas[][] = new int[10][2];
        int cidadeMenorTemperatura = 0;
        int cidadeMaiorTemperatura = 0;

        cidades[0] = "Londres";
        cidades[1] = "Madrid";
        cidades[2] = "Nueva York";
        cidades[3] = "Buenos Aires";
        cidades[4] = "Asunción";
        cidades[5] = "São Paulo";
        cidades[6] = "Lima";
        cidades[7] = "Santiago de Chile";
        cidades[8] = "Lisboa";
        cidades[9] = "Tokio";

        temperaturas[0][0] = -2;
        temperaturas[0][1] = 33;
        temperaturas[1][0] = -3;
        temperaturas[1][1] = 32;
        temperaturas[2][0] = -8;
        temperaturas[2][1] = 27;
        temperaturas[3][0] = 4;
        temperaturas[3][1] = 37;
        temperaturas[4][0] = 6;
        temperaturas[4][1] = 42;
        temperaturas[5][0] = 5;
        temperaturas[5][1] = 43;
        temperaturas[6][0] = 0;
        temperaturas[6][1] = 39;
        temperaturas[7][0] = -7;
        temperaturas[7][1] = 26;
        temperaturas[8][0] = -1;
        temperaturas[8][1] = 31;
        temperaturas[9][0] = -10;
        temperaturas[9][1] = 35;

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
