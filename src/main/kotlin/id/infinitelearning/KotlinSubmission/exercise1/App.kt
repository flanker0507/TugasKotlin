package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    val firstName: String = "Yuda"
    val lastName: String = "Ganteng"
    val umur: Int = 22
    val status: Boolean = true

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $umur")
    println("Status: ${if (status) "Single" else "Tidak Single"}")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Member: $groupMember")
    println("Session: $session")

    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String {
    val groupMembers = listOf("Yuda", "Malvino", "Safrizal", "Baddriyah", "Ibnah", "Dwi")
    val myName = groupMembers[4]
    return ""
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val countOfGroup = 5
    val totalMentor = mentor.size
    val totalMember = totalMentor + countOfGroup
    return totalMember

}

fun main() {

    myProfile()

    val myGroup = "Vijayanasena"
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(4, listOf("Yuda", "Malvino", "Safrizal", "Badriyyah", "Ibnah", "Dwi"), "Morning")


}