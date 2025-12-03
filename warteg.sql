CREATE DATABASE warteg;
USE warteg;

CREATE TABLE Produk (
    id_produk INT AUTO_INCREMENT NOT NULL,
    nama_produk TEXT NOT NULL,
    harga_produk DECIMAL(10, 2) NOT NULL,
    gambar_produk BLOB,
    PRIMARY KEY (id_produk)
);

CREATE TABLE User (
    id_user INT NOT NULL,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(30) NOT NULL,
    is_admin BOOL NOT NULL,
    PRIMARY KEY (id_user)
);

CREATE TABLE Transaksi (
    id_transaksi INT NOT NULL,
    id_detail INT NOT NULL, -- Kunci asing yang menunjuk ke Detail (seharusnya ini dihilangkan dan relasi Detail ke Transaksi)
    id_user INT NOT NULL,
    id_total_harga DECIMAL(10, 2) NOT NULL,
    tgl_transaksi DATETIME NOT NULL,
    PRIMARY KEY (id_transaksi),
    FOREIGN KEY (id_user) REFERENCES User(id_user)
    -- Catatan: Relasi Transaksi ke Detail (id_detail) di diagram Anda tidak sesuai dengan praktik normalisasi (Detail seharusnya menunjuk ke Transaksi).
    -- Saya asumsikan id_detail di Transaksi adalah Foreign Key ke Detail, meskipun ini tidak umum.
    -- FOREIGN KEY (id_detail) REFERENCES Detail(id_detail) -- Ini di-comment karena relasi di diagram menyiratkan Detail menunjuk ke Transaksi.
);

CREATE TABLE Detail (
    id_detail INT NOT NULL,
    id_produk INT NOT NULL,
    id_transaksi INT NOT NULL,
    jumlah INT NOT NULL,
    harga_sub_total DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (id_detail),
    FOREIGN KEY (id_produk) REFERENCES Produk(id_produk),
    FOREIGN KEY (id_transaksi) REFERENCES Transaksi(id_transaksi)
    -- Catatan: Berdasarkan praktik E-Commerce/Warteg, Detail biasanya menyimpan item-item yang termasuk dalam satu Transaksi.
    -- Jadi, Detail memiliki Kunci Asing ke Transaksi dan Produk.
);