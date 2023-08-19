package javaWeb.notes;

public class C_singleton {
    //by default saat class controller yg extends ke Http Servlet dibuat itu akan dibuat dengan singleton atau berapapun class controller yang dibuat
    //itu sebenarnya object yang di eksekusi nantinya hanya satu object yang sama, karena dalam pembuatan object HttpServlet menggunakan design pattern singleton.
    //oleh karena itu dalam pembuatan class controller harus berhati-hati karena data antar controller bisa saja tertukar.
    //untuk mengetahui bahwa class controller singleton lihat di package controller class HelloController2.
}
