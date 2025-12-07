/* Nama Kelompok                  :
 * Kezia Tabhita Smith              140810240020
 * Risyam Muhammad Iesqillah		140810240032
 * Laudzan Ananda Syawaliandi		140810240050
 * Dikumpulkan tanggal            : 7 Desember 2025
*/
package models;
import java.util.Objects;

public class Paket {
    private Lauk lauk;
    private Minuman minuman;
    private Nasi nasi;

    public Paket() {
    }

    public Paket(Lauk lauk, Minuman minuman, Nasi nasi) {
        this.lauk = lauk;
        this.minuman = minuman;
        this.nasi = nasi;
    }

    public Lauk getLauk() {
        return this.lauk;
    }

    public void setLauk(Lauk lauk) {
        this.lauk = lauk;
    }

    public Minuman getMinuman() {
        return this.minuman;
    }

    public void setMinuman(Minuman minuman) {
        this.minuman = minuman;
    }

    public Nasi getNasi() {
        return this.nasi;
    }

    public void setNasi(Nasi nasi) {
        this.nasi = nasi;
    }

    public Paket lauk(Lauk lauk) {
        setLauk(lauk);
        return this;
    }

    public Paket minuman(Minuman minuman) {
        setMinuman(minuman);
        return this;
    }

    public Paket nasi(Nasi nasi) {
        setNasi(nasi);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Paket)) {
            return false;
        }
        Paket paket = (Paket) o;
        return Objects.equals(lauk, paket.lauk) && Objects.equals(minuman, paket.minuman) && Objects.equals(nasi, paket.nasi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lauk, minuman, nasi);
    }

    @Override
    public String toString() {
        return "{" +
            " lauk='" + getLauk() + "'" +
            ", minuman='" + getMinuman() + "'" +
            ", nasi='" + getNasi() + "'" +
            "}";
    }
    
}
