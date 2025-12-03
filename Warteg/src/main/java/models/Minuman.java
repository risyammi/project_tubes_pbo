package models;
import java.util.Objects;

public class Minuman {
    private int minuman_ID;
    private String nama_minuman;
    private float harga_minuman;
    private byte[] gambar_minuman;

    public Minuman() {
    }

    public Minuman(int minuman_ID, String nama_minuman, float harga_minuman, byte[] gambar_minuman) {
        this.minuman_ID = minuman_ID;
        this.nama_minuman = nama_minuman;
        this.harga_minuman = harga_minuman;
        this.gambar_minuman = gambar_minuman;
    }

    public int getMinuman_ID() {
        return this.minuman_ID;
    }

    public void setMinuman_ID(int minuman_ID) {
        this.minuman_ID = minuman_ID;
    }

    public String getNama_minuman() {
        return this.nama_minuman;
    }

    public void setNama_minuman(String nama_minuman) {
        this.nama_minuman = nama_minuman;
    }

    public float getHarga_minuman() {
        return this.harga_minuman;
    }

    public void setHarga_minuman(float harga_minuman) {
        this.harga_minuman = harga_minuman;
    }

    public byte[] getGambar_minuman() {
        return this.gambar_minuman;
    }

    public void setGambar_minuman(byte[] gambar_minuman) {
        this.gambar_minuman = gambar_minuman;
    }

    public Minuman minuman_ID(int minuman_ID) {
        setMinuman_ID(minuman_ID);
        return this;
    }

    public Minuman nama_minuman(String nama_minuman) {
        setNama_minuman(nama_minuman);
        return this;
    }

    public Minuman harga_minuman(float harga_minuman) {
        setHarga_minuman(harga_minuman);
        return this;
    }

    public Minuman gambar_minuman(byte[] gambar_minuman) {
        setGambar_minuman(gambar_minuman);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Minuman)) {
            return false;
        }
        Minuman minuman = (Minuman) o;
        return minuman_ID == minuman.minuman_ID && Objects.equals(nama_minuman, minuman.nama_minuman) && harga_minuman == minuman.harga_minuman && Objects.equals(gambar_minuman, minuman.gambar_minuman);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minuman_ID, nama_minuman, harga_minuman, gambar_minuman);
    }

    @Override
    public String toString() {
        return "{" +
            " minuman_ID='" + getMinuman_ID() + "'" +
            ", nama_minuman='" + getNama_minuman() + "'" +
            ", harga_minuman='" + getHarga_minuman() + "'" +
            ", gambar_minuman='" + getGambar_minuman() + "'" +
            "}";
    }
}