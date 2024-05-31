# Pekerjaan rumah 16 modul 18

Kriteria:
- buat tugas Gradle sederhana untuk menerima parameter CLI dan mencetaknya dengan pesan ucapan
- Proyek skrip Gradle harus dibuat di repositori yang berbeda dan dorong ke GitHub
  Berikut adalah langkah-langkah untuk membuat tugas khusus Gradle dan menambahkan pustaka:

Buat proyek Gradle baru dengan menjalankan perintah "gradle init --type java-library". Ini akan membuat proyek Gradle baru dengan struktur direktori dan file build.gradle awal.

Buka file build.gradle di direktori root proyek dan tambahkan kode berikut untuk menentukan tugas khusus:

task greetingTask() {
doLast {
String nama = project.hasProperty('nama') ? project.property('nama') : 'Gradle User'
println "Hello, $nama! Welcome to Gradle World!"
}
}

Anda dapat menjalankan tugas dengan menjalankan perintah berikut: "./gradlew greetingTask -Pname=YourName"

Untuk menambahkan pustaka, Anda dapat menggunakan fitur manajemen dependensi bawaan Gradle. Untuk melakukannya, tambahkan kode berikut ke file build.gradle Anda:

dependencies {
implementation 'com.google.guava:guava:29.0-jre'
testImplementation 'junit:junit:4.13'
}



Me run Project pada terminal dengan cara :
"./gradlew greetingTask -Pname=Fadhli"

hasil run capture :
https://github.com/fadlifadli/gradle/tree/master/src/gradle.jpg