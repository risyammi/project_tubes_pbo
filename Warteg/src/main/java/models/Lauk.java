package models;
import java.util.Objects;

public class Lauk {
    private int lauk_ID;
    private String nama_lauk;
    private float harga_lauk;
    private byte[] gambar_lauk;

    public Lauk() {
    }

    public Lauk(int lauk_ID, String nama_lauk, float harga_lauk, byte[] gambar_lauk) {
        this.lauk_ID = lauk_ID;
        this.nama_lauk = nama_lauk;
        this.harga_lauk = harga_lauk;
        this.gambar_lauk = gambar_lauk;
    }

    public int getLauk_ID() {
        return this.lauk_ID;
    }

    public void setLauk_ID(int lauk_ID) {
        this.lauk_ID = lauk_ID;
    }

    public String getNama_lauk() {
        return this.nama_lauk;
    }

    public void setNama_lauk(String nama_lauk) {
        this.nama_lauk = nama_lauk;
    }

    public float getHarga_lauk() {
        return this.harga_lauk;
    }

    public void setHarga_lauk(float harga_lauk) {
        this.harga_lauk = harga_lauk;
    }

    public byte[] getGambar_lauk() {
        return this.gambar_lauk;
    }

    public void setGambar_lauk(byte[] gambar_lauk) {
        this.gambar_lauk = gambar_lauk;
    }

    public Lauk lauk_ID(int lauk_ID) {
        setLauk_ID(lauk_ID);
        return this;
    }

    public Lauk nama_lauk(String nama_lauk) {
        setNama_lauk(nama_lauk);
        return this;
    }

    public Lauk harga_lauk(float harga_lauk) {
        setHarga_lauk(harga_lauk);
        return this;
    }

    public Lauk gambar_lauk(byte[] gambar_lauk) {
        setGambar_lauk(gambar_lauk);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Lauk)) {
            return false;
        }
        Lauk lauk = (Lauk) o;
        return lauk_ID == lauk.lauk_ID && Objects.equals(nama_lauk, lauk.nama_lauk) && harga_lauk == lauk.harga_lauk && Objects.equals(gambar_lauk, lauk.gambar_lauk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lauk_ID, nama_lauk, harga_lauk, gambar_lauk);
    }

    @Override
    public String toString() {
        return "{" +
            " lauk_ID='" + getLauk_ID() + "'" +
            ", nama_lauk='" + getNama_lauk() + "'" +
            ", harga_lauk='" + getHarga_lauk() + "'" +
            ", gambar_lauk='" + getGambar_lauk() + "'" +
            "}";
    }
}
