import java.util.Scanner;

public class Main {
    Node head;

    public void insertAtBeginning(Pegawai pegawai) {
        Node newNode = new Node(pegawai);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(Pegawai pegawai) {
        Node newNode = new Node(pegawai);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteFromBeginning() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    public void deleteFromEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.pegawai);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main list = new Main();
        do{
            System.out.println("Pilihlah Menu:\n1. Input data\n2. Hapus data\n3. Cetak list pegawai\n4. Exit");
            int menu=input.nextInt();
            int pilihan;
            switch (menu) {
                case 1: 
                System.out.println("Masukkan data pegawai:");
                System.out.print("NIP: ");
                String nip =  input.next();
                System.out.print("Nama: ");
                String nama = input.next();
                System.out.print("Divisi: ");
                String divisi = input.next();

                Pegawai pegawai = new Pegawai(nip, nama, divisi);
               
                System.out.println("\n1. Tambahkan  didepan\n2. Tambahkan dibelakang");
                pilihan = input.nextInt();
                if (pilihan == 1) {
                    list.insertAtBeginning(pegawai);
                }else{
                    list.insertAtEnd(pegawai);
                }
                System.out.println("Data pegawai berhasil ditambahkan.");
                break;
                case 2:
                System.out.println("\nPilih pilihan hapus\n1. Hapus depan\2. Hapus belakang");
                pilihan = input.nextInt();
                if (pilihan == 1) {
                    list.deleteFromBeginning();
                }else{
                    list.deleteFromEnd();
                }
                break;
                case 3:
                list.printAll();
                break;
                case 4: 
                System.out.println("Anda Telah Keluar");
                System.exit(0);
            }
        } while (true);
    }
}