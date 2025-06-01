package theo.builder.modelo;

public class Computador {private String cpu;
    private String ram;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    // Getters para os testes e para visualização
    public String getCpu() { return cpu; }
    public String getRam() { return ram; }
    public String getArmazenamento() { return armazenamento; }
    public String getPlacaDeVideo() { return placaDeVideo; }
    public String getSistemaOperacional() { return sistemaOperacional; }

    private Computador(ComputadorBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.armazenamento = builder.armazenamento;
        this.placaDeVideo = builder.placaDeVideo;
        this.sistemaOperacional = builder.sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Computador [CPU=" + cpu + ", RAM=" + ram + ", Armazenamento=" + armazenamento +
                (placaDeVideo != null ? ", PlacaDeVideo=" + placaDeVideo : "") +
                (sistemaOperacional != null ? ", SistemaOperacional=" + sistemaOperacional : "") + "]";
    }

    public static class ComputadorBuilder {
        // Obrigatórios
        private String cpu;
        private String ram;
        private String armazenamento;

        // Opcionais
        private String placaDeVideo;
        private String sistemaOperacional;

        public ComputadorBuilder(String cpu, String ram, String armazenamento) {
            this.cpu = cpu;
            this.ram = ram;
            this.armazenamento = armazenamento;
        }

        public ComputadorBuilder comPlacaDeVideo(String placaDeVideo) {
            this.placaDeVideo = placaDeVideo;
            return this;
        }

        public ComputadorBuilder comSistemaOperacional(String sistemaOperacional) {
            this.sistemaOperacional = sistemaOperacional;
            return this;
        }

        public Computador build() {
            return new Computador(this);
        }
    }
}
