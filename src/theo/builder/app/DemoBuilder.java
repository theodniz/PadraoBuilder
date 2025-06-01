package theo.builder.app;

import theo.builder.modelo.Computador;

public class DemoBuilder {public static void main(String[] args) {
    Computador gamerPC = new Computador.ComputadorBuilder("Intel i9", "32GB", "1TB SSD")
            .comPlacaDeVideo("NVIDIA RTX 4080")
            .comSistemaOperacional("Windows 11")
            .build();
    System.out.println("Computador Gamer: " + gamerPC);

    Computador officePC = new Computador.ComputadorBuilder("Intel i5", "16GB", "512GB SSD")
            .comSistemaOperacional("Ubuntu Linux")
            .build();
    System.out.println("Computador Escritório: " + officePC);
}
}
