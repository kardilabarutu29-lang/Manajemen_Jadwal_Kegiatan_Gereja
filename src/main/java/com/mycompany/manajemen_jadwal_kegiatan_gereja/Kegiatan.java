package com.mycompany.manajemen_jadwal_kegiatan_gereja;

public class Kegiatan {

    private String id;
    private String nama;
    private String tanggal;
    private String jam;
    private String kategori;
    private String deskripsi;
    private String idPetugas;
    private String idTempat;
    

    public Kegiatan(String id, String nama, String tanggal, String jam, String kategori, String deskripsi, String idPetugas, String idTempat) {
        this.id = id;
        this.nama = nama;
        this.tanggal = tanggal;
        this.jam = jam;
        this.kategori = kategori;
        this.deskripsi = deskripsi;
        this.idPetugas = idPetugas;
        this.idTempat = idTempat;
    }

    // getter
    public String getId() { 
        return id; 
    }
    
    public String getNama() { 
        return nama; 
    }
    
    public String getTanggal() { 
        return tanggal; 
    }
    
    public String getJam() { 
        return jam; 
    }
    
    public String getKategori() { 
        return kategori; 
    }
    
    public String getDeskripsi() { 
        return deskripsi; 
    }
    
    public String getIdPetugas() { 
        return idPetugas; 
    }
    
    public String getIdTempat() { 
        return idTempat; 
    }

    // Setter
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public void setTanggal(String tanggal) { 
        this.tanggal = tanggal; 
    }
    public void setJam(String jam) { 
        this.jam = jam; 
    }
    public void setKategori(String kategori) { 
        this.kategori = kategori; 
    }
    public void setDeskripsi(String deskripsi) { 
        this.deskripsi = deskripsi; 
    }
}