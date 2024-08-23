
    public class ArrayExample {
        public static void main(String[] args) {
            // Bir tamsayı dizisi tanımlama
            int[] numbers = {100, 200, 300, 400, 500};

            // Diziyi ekrana yazdırma
            System.out.println("Dizi Elemanları:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Eleman " + (i + 1) + ": " + numbers[i]);
            }

            // Dizideki elemanların toplamını hesaplama
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Dizideki Elemanların Toplamı: " + sum);

            // Dizideki en büyük elemanı bulma
            int max = numbers[0];
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            System.out.println("Dizideki En Büyük Eleman: " + max);
        }
    }

