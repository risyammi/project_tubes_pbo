-- -----------------------------------------------------
-- Database: WARTEG
-- -----------------------------------------------------
CREATE DATABASE IF NOT EXISTS warteg;
USE warteg;

-- -----------------------------------------------------
-- Table: User
-- -----------------------------------------------------
CREATE TABLE Users (
    id_user INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(30) NOT NULL,
    is_admin BOOLEAN NOT NULL DEFAULT 0
);

-- -----------------------------------------------------
-- Table: Produk
-- -----------------------------------------------------
CREATE TABLE Produk (
    id_produk INT AUTO_INCREMENT PRIMARY KEY,
    nama_produk TEXT NOT NULL,
    harga_produk DECIMAL(10,2) NOT NULL,
    kategori VARCHAR(20) NOT NULL,
    gambar_produk LONGBLOB
);

-- -----------------------------------------------------
-- Table: Transaksi
-- -----------------------------------------------------
CREATE TABLE Transaksi (
    id_transaksi INT AUTO_INCREMENT PRIMARY KEY,
    id_detail INT,
    total_harga DECIMAL(10,2) NOT NULL,
    tgl_transaksi DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    status_transaksi VARCHAR(30) NOT NULL,
    id_user INT,

    CONSTRAINT fk_transaksi_user
        FOREIGN KEY (id_user) REFERENCES Users(id_user)
        ON DELETE SET NULL
        ON UPDATE CASCADE
    
    CONSTRAINT fk_transaksi_detail
        FOREIGN KEY (id_detail) REFERENCES Detail(id_detail)
        ON DELETE SET NULL
        ON UPDATE CASCADE
);

-- -----------------------------------------------------
-- Table: Detail Transaksi
-- -----------------------------------------------------
CREATE TABLE Detail (
    id_detail INT AUTO_INCREMENT PRIMARY KEY,
    id_produk INT NOT NULL,
    id_transaksi INT NOT NULL,
    jumlah INT NOT NULL,
    harga_sub_total DECIMAL(10,2) NOT NULL,

    CONSTRAINT fk_detail_produk
        FOREIGN KEY (id_produk) REFERENCES Produk(id_produk)
        ON DELETE CASCADE
        ON UPDATE CASCADE,

    CONSTRAINT fk_detail_transaksi
        FOREIGN KEY (id_transaksi) REFERENCES Transaksi(id_transaksi)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);