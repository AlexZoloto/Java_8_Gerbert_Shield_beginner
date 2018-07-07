public class ShowBits {
    //Число битов, которые будут отображаться
    int numbers;

    public ShowBits(int numbers) {
        this.numbers = numbers;
    }

    void show(long val){
        long mask = 1;
        //Сдвинуть значение 1 влево на нужную позицию
        mask <<= numbers-1;
        int spacer = 0;
        for (;mask != 0; mask>>>=1){
            if ((val & mask) !=0 ) System.out.print("1");
            else System.out.print("0");
            spacer ++;
            //После каждого 8 символа будет ставиться пробел
            // для более читаемых двоичных комбинаций
            if ((spacer % 8) == 0){
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
