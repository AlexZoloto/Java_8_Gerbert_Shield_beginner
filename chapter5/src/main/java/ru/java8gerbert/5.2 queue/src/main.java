public class main {
    public static void main(String[] args) {
        Queue BigQ = new Queue(50);
        Queue SmallQ = new Queue(5);

        //Заполняем очередь алфовитом
        //26 стоит заменить на более динамический элемент
        for (int i = 0; i < 26; i++) {
            BigQ.put((char)('A' + i));
        }
        //Выводим полученный алфавит
        for (int i = 0; i < 26; i++) {
            System.out.print(BigQ.get());
        }
        System.out.println('\n');

        for (int i = 0; i < 6; i++) {
            System.out.print("Сохранение символа " + (char)('A' + i));
            SmallQ.put((char)('A'+i));
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(SmallQ.get());
        }
    }
}
