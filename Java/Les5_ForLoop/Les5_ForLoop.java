package Java.Les5_ForLoop;

public class Les5_ForLoop {
    public static void main(String[] args) {
        //Урок 5: Цикл for.
        for (int i =0;i<=10;i++){
        // В отличие от while цикл for принимает 3 параметра и будет выполняться, пока
            //второе значение будет принимать true
        // 1 параметр - присваивание значения переменной
        // 2 параметр - указать до какого момента будет выполняться цикл
        // 3 параметр - указать как будет меняться переменная, после каждого круга цикла
            System.out.println("Hello" + i);
            //i = i + 10;         i +=10;
            //i = i - 10;         i -=10;
            //i = i / 10;         i *=10;  - Упрощенный вид формул математических действий
            //i = i * 10;         i /=10;
            //i = i % 10;         i %=10;
            //i --; - вычитание 1 от res
            //i ++; - прибавляет 1 к res
        }

    }
}