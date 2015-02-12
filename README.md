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
* Keyword Java adalah `Extends.`
