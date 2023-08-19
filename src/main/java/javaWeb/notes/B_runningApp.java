package javaWeb.notes;

public class B_runningApp {
    //untuk melakukan running java web servlet perlu melakukan langkah-langkah berikut.
    //1. jika code program sudah siap, maka ketikkan mvn package untuk membuat file .war yang akan muncul di folder target.
    //2. setelah itu running apache tomcat web server lebih dahulu dengan mengeksekusi file 'catalina.bat run' melalui terminal,
    //   file catalina.bat tersedia di dalam folder installan C:\Program Files\apache-tomcat-10.1.8\bin.
    //3. copy file .war di langkah nomer 1 ke folder C:\Program Files\apache-tomcat-10.1.8\webapps, nanti secara auto tomcat server
    //   akan membuatkan folder yang namanya sama seperti file .war yang anda paste di folder C:\Program Files\apache-tomcat-10.1.8\webapps.
    //4. setelah itu running web app di browser dengan http://localhost:8080/path_name/url_pattern
}
