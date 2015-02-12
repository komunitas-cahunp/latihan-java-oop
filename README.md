## Abstraction
* Cara kita melihat suatu sistem dalam bentuk yang lebih sederhana, yaitu sebagai suatu kumpulan subsitem (Object) yang saling berintaksi
* Alat untuk meng-abstraksikan sesuatu adalah class
* Objek bersifat modularity. Object dapat ditulis dan dimaintain terpisah (independen) dari object lain

Pada materi ini ada dua file yaitu `sepeda.java` dan `sepedaBeraksi.java`.

## Encapsulation
* Mekanisme menyembunyikan suatu proses dan data dalam sistem untuk menghindari interferensi, dan menyederhanakan penggunaan proses itu sendiri
  * Tongkat transmisi (gigi) pada mobil
  * Tombol on/off pengaturan suhu pada AC.
* Class access level (public, protection, private) adalah implementasi dari konsep encapsulation
* Enkapsulasi data dapat dilakukan dengan cara :
  * mendeklarasikan instance variable sebagai private.
  * mendeklarasikan method yang sifatnya public untuk mengakses variable tersebut

Ada perbedaan antara Abstraction dengan Encapsulation bisa di lihat [disini](https://github.com/komunitas-cahunp/latihan-java-oop/commit/20946ffaa372f628e2be48650e0938bd2d86fe94) dan [disini](https://github.com/komunitas-cahunp/latihan-java-oop/commit/35c0bf4790030fc652e8a0621afe32eddc95c31c).

## Inheritance
* suatu class dapat mewariskan atribut dan methode kepada class lain (subclass), serta membentuk class hierarchy.
* Kemudian penting untuk dapat reusability.
* Keyword Java-nya adalah `Extends`.

Penggunaan keyword `Extends` bisa di lihat [disini](https://github.com/komunitas-cahunp/latihan-java-oop/commit/c889c42d0dbba9d9736fe7fc3f867743eb596546), yaitu pada `SepedaGunung.java` dan `SepedaGunungBeraksi.java`

## Polymorphism
* Kemampuan untuk memperlakukan object yang memiliki perilaku (bentuk) yang berbeda.
* Implementasi konsep polymorphism:
  1. Overloading: Kemampuan subclass untuk menggunakan nama yang sama untuk beberapa methode yang berbeda paramater (tipe dan atau jumlah).
  2. Overriding: Kemampuan subclass untuk menimpa methode dari superclass, yaitu dengan cara menggunkan nama dan paramater yang sama pada methode.
  3. contoh pemrograman Overloading :

  ```java
  class Lingkaran {
    void GambarLingkaran(){
      ....
    }
    void GambarLingkaran(int diamater){
      ....
    }
    void GambarLingkaran(double diameter){
      ....
    }
    Void GambarLingkaran(int diameter, int x, int y){
      ....
    }
    void GambarLingkaran(int diameter, int x, int y, String warna, String namaLingkaran){
      ....
    }
  }
  ```

  contoh pemrograman Overriding bisa lihat [disini]()
