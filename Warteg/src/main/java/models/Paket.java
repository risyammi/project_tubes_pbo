/* Nama Kelompok                  :
 * Kezia Tabhita Smith              140810240020
 * Risyam Muhammad Iesqillah		140810240032
 * Laudzan Ananda Syawaliandi		140810240050
 * Dikumpulkan tanggal            : 7 Desember 2025
*/
package models;
import java.util.Objects;

public class Paket extends Produk {

    private Lauk lauk;
    private Minuman minuman;
    private Nasi nasi;

    public Paket() {
        this.kategori = "PAKET";
    }

    public Lauk getLauk() {
        return lauk;
    }

    public void setLauk(Lauk lauk) {
        this.lauk = lauk;
        hitungHarga();
    }

    public Minuman getMinuman() {
        return minuman;
    }

    public void setMinuman(Minuman minuman) {
        this.minuman = minuman;
        hitungHarga();
    }

    public Nasi getNasi() {
        return nasi;
    }

    public void setNasi(Nasi nasi) {
        this.nasi = nasi;
        hitungHarga();
    }

    private void hitungHarga() {
        float total = 0;

        if (lauk != null) total += lauk.getHarga();
        if (minuman != null) total += minuman.getHarga();
        if (nasi != null) total += nasi.getHarga();

        this.harga = total;
    }
}
