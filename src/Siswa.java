class Siswa {
    private String nama;
    private int umur;
    private String kelas;

    /**
     *
     * @param nama
     * @param umur
     * @param kelas
     */

    public Siswa(String nama, int umur, String kelas) {
        this.setNama(nama);
        this.setUmur(umur);
        this.setKelas(kelas);
    }


    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("Kelas: " + getKelas());
    }

    /**
     *
     * @return
     */

    public String getNama() {
        return nama;
    }


    /**
     *
     * @param nama
     */

    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     *
     * @return
     */
    public int getUmur() {
        return umur;
    }

    /**
     *
     * @param umur
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }

    /**
     *
     * @return
     */

    public String getKelas() {
        return kelas;
    }

    /**
     *
     * @param kelas
     */
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}

//hasil refactoring
//rename variabel nm, um, cl
//move class dan method
//getter dan setter
//encapsulation field
//extract method pada validasi umur
//extract method input siswa
