package id.infinitelearning.KotlinSubmission.exercise5

class Hero {

    private var name: String? = null
    private var age = 21
    private var height = 158.0

    private var health = 100

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height.toDouble()
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Anda telah mati $name")
        }
    }

    fun jalan() {
        checkHealth()
        println("$name sedang berjalan...")
        health -= 1
    }



    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */ fun checkHealth(jalan: Int, makan: Int, minum: Int, lompat: Int, duduk: Int, lari: Int) {
        val energy = jalan + makan + minum + lompat + duduk + lari
        health=energy
    }


}