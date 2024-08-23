    import java.util.Scanner;

    public class IstqbTicket {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan bilet türü isteme
            System.out.println("Ne tür bir bilet istiyorsunuz? Tek yön veya gidiş-dönüş?");
            String ticketType = scanner.nextLine().toLowerCase();

            if (ticketType.equals("gidiş-dönüş")) {
                // Kullanıcıdan fiyat oranı isteme
                System.out.println("Hangi oranı istiyorsunuz? Standart veya İndirimli?");
                String rateType = scanner.nextLine().toLowerCase();

                if (rateType.equals("indirimli")) {
                    System.out.println("Fiyat £11.20");
                } else {
                    System.out.println("Fiyat £19.50");
                }
            } else if (ticketType.equals("tek yön")) {
                System.out.println("Fiyat £9.75");
            } else {
                System.out.println("Geçersiz bilet türü girdiniz.");
            }

            scanner.close();
        }
}
