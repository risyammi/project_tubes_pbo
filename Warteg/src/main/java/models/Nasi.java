/* Nama Kelompok                  :
 * Kezia Tabhita Smith              140810240020
 * Risyam Muhammad Iesqillah		140810240032
 * Laudzan Ananda Syawaliandi		140810240050
 * Dikumpulkan tanggal            : 7 Desember 2025
*/
package models;
import java.util.Objects;

public class Nasi {
    private int nasi_ID;
    private String nama_nasi;
    private float harga_nasi;
    private byte[] gambar_nasi;

    public Nasi() {
    }

    public Nasi(int nasi_ID, String nama_nasi, float harga_nasi, byte[] gambar_nasi) {
        this.nasi_ID = nasi_ID;
        this.nama_nasi = nama_nasi;
        this.harga_nasi = harga_nasi;
        this.gambar_nasi = gambar_nasi;
    }

    public int getNasi_ID() {
        return this.nasi_ID;
    }

    public void setNasi_ID(int nasi_ID) {
        this.nasi_ID = nasi_ID;
    }

    public String getNama_nasi() {
        return this.nama_nasi;
    }

    public void setNama_nasi(String nama_nasi) {
        this.nama_nasi = nama_nasi;
    }

    public float getHarga_nasi() {
        return this.harga_nasi;
    }

    public void setHarga_nasi(float harga_nasi) {
        this.harga_nasi = harga_nasi;
    }

    public byte[] getGambar_nasi() {
        return this.gambar_nasi;
    }

    public void setGambar_nasi(byte[] gambar_nasi) {
        this.gambar_nasi = gambar_nasi;
    }

    public Nasi nasi_ID(int nasi_ID) {
        setNasi_ID(nasi_ID);
        return this;
    }

    public Nasi nama_nasi(String nama_nasi) {
        setNama_nasi(nama_nasi);
        return this;
    }

    public Nasi harga_nasi(float harga_nasi) {
        setHarga_nasi(harga_nasi);
        return this;
    }

    public Nasi gambar_nasi(byte[] gambar_nasi) {
        setGambar_nasi(gambar_nasi);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Nasi)) {
            return false;
        }
        Nasi nasi = (Nasi) o;
        return nasi_ID == nasi.nasi_ID && Objects.equals(nama_nasi, nasi.nama_nasi) && harga_nasi == nasi.harga_nasi && Objects.equals(gambar_nasi, nasi.gambar_nasi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nasi_ID, nama_nasi, harga_nasi, gambar_nasi);
    }

    @Override
    public String toString() {
        return "{" +
            " nasi_ID='" + getNasi_ID() + "'" +
            ", nama_nasi='" + getNama_nasi() + "'" +
            ", harga_nasi='" + getHarga_nasi() + "'" +
            ", gambar_nasi='" + getGambar_nasi() + "'" +
            "}";
    }
}