# Pendaftaran Siswa

## Deskripsi Projek

Aplikasi pendaftaran siswa sederhana berbasis konsol ini memungkinkan pengguna untuk memasukkan data siswa,
termasuk nama, umur, dan kelas. Data setiap siswa akan disimpan dalam daftar dan dapat ditampilkan kembali. 

## Struktur Projek

Projek ini memiliki dua kelas utama:
- **Main**: Kelas utama yang menangani input pengguna dan mengelola daftar siswa.
- **Siswa**: Model data yang merepresentasikan setiap siswa beserta informasi pribadi mereka.

## Fitur

- Input data siswa termasuk nama, umur, dan kelas.
- Validasi input umur agar tidak negatif atau tidak valid.
- Menampilkan informasi lengkap dari semua siswa yang telah didaftarkan.



## Cara Kerja Proyek

1. **Memasukkan Data Siswa**:
    - Aplikasi meminta pengguna untuk memasukkan jumlah siswa yang ingin didaftarkan.
    - Untuk setiap siswa, pengguna akan diminta memasukkan:
        - **Nama**: Nama lengkap siswa.
        - **Umur**: Usia siswa dalam angka positif. Jika input bukan angka atau angka negatif, 
          aplikasi akan terus meminta input ulang.
        - **Kelas**: Kelas atau tingkat siswa.
      

2. **Validasi Data**:
    - Aplikasi memvalidasi input usia agar sesuai (harus berupa angka positif).
    - Jika input usia salah, pengguna akan diminta memasukkan ulang data usia hingga valid.
   

3. **Menampilkan Data Siswa**:
    - Setelah semua data siswa dimasukkan, aplikasi menampilkan daftar lengkap siswa dengan 
    informasi yang dimasukkan tadi, termasuk nama, umur, dan kelas.
