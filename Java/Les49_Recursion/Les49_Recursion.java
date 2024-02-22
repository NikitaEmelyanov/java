package Java.Les49_Recursion;

public class Les49_Recursion {
    public static void main(String[] args) {
        // Урок 49: Рекурсия.
        //Рекурсия  - это вызов метода в теле этого же метода
        counter(3);
        //Статический метод можно вызывать в методе main не создавая объекта
    }
    private static void counter(int n){
        if (n==0)
            return;
        System.out.println(n);

        counter(n-1);

        //Поскольку метод вызывался и в основном потоке метода main и в теле метода появилась
        //своего рода петля с почти бесконечным вызовом и реализацией данного метода и
        // последующей ошибкой Exception in thread "main" java.lang.StackOverflowError, говорящей
        // о том что Stack(участок оперативной памяти отвечающий за вызов и реализацию методов)
        // переполнен, но до того как Stack не будет переполнен все будет отображаться корректно,
        //поэтому нужно создать условия для выхода, для этого нужно что-то передать в качестве
        //аргумента, в нашем случает это целое число n. То есть в методе counter в качестве
        // аргумента ставим число n, теперь при вызове в main мы устанавливаем начальное
        //значение для n и далее в реализации метода аргументом для counter уже будет другое
        //значение, в нашем случае n-1, после чего создаем условия для выхода с помощью if,
        // например, если n==0. Что сделает эту петлю конечной

        // При рекурсии внутри происходит следующая механика: Сначала вызывается метод из метода
        //main, зачем программа спускается ниже по коду и если условия выполняется спускаться
        //еще ниже до уменьшения переменной, а выполнение предыдущего метода ждет отклик выполнения
        //условий и так далее вниз по цепочке, выполнения методов ждут от следующего продолжения
        //или прекращения выполнения условий, затем когда условия уже не могут быть выполнены,
        //снова поочередно уже по цепочке вверх поступает обратная связь от последнего к первому
    }



    }

