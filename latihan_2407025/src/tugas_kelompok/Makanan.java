package tugas_kelompok;

class Makanan extends Menu {
    private String jenis; 

    public Makanan(String nama, double harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }

    // Overriding Method
    @Override
    public void detailMenu() {
        System.out.println("[Makanan] " + getNama() + " (" + jenis + ") - Rp" + getHarga());
    }
}