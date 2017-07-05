package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/5.
 */
public class Server {
    private ServerSocket server;
    private List<PrintWriter> list;

    public Server() {
        try {
            server = new ServerSocket(9060);
            list = new ArrayList<PrintWriter>();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start() {
        try {
            System.out.println("等待连接--");
            while (true) {
                Socket socket = server.accept();
                System.out.println("一连击");
                SilerHanderq hander = new SilerHanderq(socket);
                Thread t = new Thread(hander);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();

    }

    class SilerHanderq implements Runnable {
        private Socket socket;

        SilerHanderq(Socket socket) {
            this.socket = socket;

        }

        public void run() {
            PrintWriter vv = null;
            try {
                InputStream qq = socket.getInputStream();
                InputStreamReader ww = new InputStreamReader(qq, "GBk");
                BufferedReader ee = new BufferedReader(ww);

                vv = new PrintWriter(
                        new OutputStreamWriter(
                                socket.getOutputStream()
                        )
                );
                synchronized (list) {
                    list.add(vv);
                }
                String tt = null;
                while ((tt = ee.readLine()) != null) {
                    System.out.println(tt);
                    synchronized (list) {
                        for (PrintWriter jj : list) {
                            jj.println(tt);
                        }
                    }

                }


            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                synchronized (list) {
                    list.remove(vv);
                }

                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
