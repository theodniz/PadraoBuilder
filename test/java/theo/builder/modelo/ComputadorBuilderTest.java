package theo.builder.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputadorBuilderTest {

    @Test
    void deveConstruirComputadorComTodosOsCampos() {
        Computador gamerPC = new Computador.ComputadorBuilder("Intel i9", "32GB", "1TB SSD")
                .comPlacaDeVideo("NVIDIA RTX 4080")
                .comSistemaOperacional("Windows 11")
                .build();

        assertEquals("Intel i9", gamerPC.getCpu(), "CPU deve ser Intel i9");
        assertEquals("32GB", gamerPC.getRam(), "RAM deve ser 32GB");
        assertEquals("1TB SSD", gamerPC.getArmazenamento(), "Armazenamento deve ser 1TB SSD");
        assertEquals("NVIDIA RTX 4080", gamerPC.getPlacaDeVideo(), "Placa de vídeo deve ser NVIDIA RTX 4080");
        assertEquals("Windows 11", gamerPC.getSistemaOperacional(), "Sistema Operacional deve ser Windows 11");
    }

    @Test
    void deveConstruirComputadorApenasComCamposObrigatorios() {
        Computador officePC = new Computador.ComputadorBuilder("Intel i5", "16GB", "512GB SSD")
                .build();

        assertEquals("Intel i5", officePC.getCpu(), "CPU deve ser Intel i5");
        assertEquals("16GB", officePC.getRam(), "RAM deve ser 16GB");
        assertEquals("512GB SSD", officePC.getArmazenamento(), "Armazenamento deve ser 512GB SSD");
        assertNull(officePC.getPlacaDeVideo(), "Placa de vídeo deve ser nula");
        assertNull(officePC.getSistemaOperacional(), "Sistema Operacional deve ser nulo");
    }

    @Test
    void buildDeveRetornarInstanciaNaoNula() {
        Computador computador = new Computador.ComputadorBuilder("AMD Ryzen 7", "16GB", "512GB NVMe")
                .build();
        assertNotNull(computador, "Instância do computador não deve ser nula");
    }
}
