import java.util.Scanner;

class PrintInfo {
    static void print() {
        System.out.println("Name: raghav kaushal");
        System.out.println("USN: 1BM23CS257");
    }
}

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        return "Book name: " + this.name + "\n" +
               "Author name: " + this.author + "\n" +
               "Price: " + this.price + "\n" +
               "Number of pages: " + this.numPages + "\n";
    }
}

class Main {
    public static void main(String args[]) {
        PrintInfo.print();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        Books[] b = new Books[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter book name:");
            String name = s.next();
            System.out.println("Enter author name:");
            String author = s.next();
            System.out.println("Enter the price:");
            int price = s.nextInt();
            System.out.println("Enter number of pages:");
            int numPages = s.nextInt();

            b[i] = new Books(name, author, price, numPages);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Book Details");
            System.out.println(b[i].toString());
        }

        s.close();
    }
}
