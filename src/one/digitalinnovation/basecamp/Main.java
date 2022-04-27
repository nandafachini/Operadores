package one.digitalinnovation.basecamp;

public class Main {

    // aqui vamos chamar nossas funções
    public static void main(String[] args) {
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritméticos");
        aritmetico();
        System.out.println("Atribuições");
        atribuicao();
        System.out.println("Precedências");
        precedencia();

    }

    private static void prePos() {

        int k = 10;

        int i = ++k; //PréFix: incrementa a variável antes de remover a referência ao objeto
        int j = k--; //PósFix: decrementa a variável após fazer a referência a ela.
        int x = k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);

    }

    private static void aritmetico(){

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        //variaveis de resultado
        int r1 = a+b; // soma
        int r2 = c-a; // subtração
        int r3 = d*b; // multiplicação
        int r4 = e/a; // divisão
        int r5 = c%b; // módulo

        System.out.println("a+b " + r1);
        System.out.println("c-a " + r2);
        System.out.println("d*b " + r3);
        System.out.println("e/a " + r4);
        System.out.println("c%b " + r5);
    }

    public static void atribuicao() {

        //atribuicoes simples
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        // para mostrar que o d recebe o valor de f
        System.out.println("d: " + d);

        // atribuicoes compostas
        i += 5; // i = i+5
        j -=3; // j = j-3
        d /=2.7d; // d = d/2.7d
        l *= 3; // l = l*3
        k %=2; // k = k%2

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        // i recebendo valor de k que por sua vez recebeu o valor de j
        i = k = j;

        System.out.println("k: " + k);
        System.out.println("j: " + j);

    }

    private static void precedencia(){

        int i = 10;
        int j = 20;
        int k = 30;

        // (11) somente depois que ele resolver o valor de a (580) é que vai alterar o valor de i (i++)
        int a = i++ + --j * k; // 10 + 19 * 30 = 10 + 570 -> 580
        System.out.println("i++ + --j * k: " + a);
        System.out.println("i: " + i);

        // primeiro ele vai mudar o valor de i pra depois usar ele, então o i que tinha acabado de ir pra 11, volta a ser 10 aqui
        // pela precedência, primeiro faz a divisão, depois o módulo e no final a soma
        int b = k / --i % 3 +1; // 30 / 10 % 3 + 1 -> 1
        System.out.println("k / --1 % 3 + 1: " +   b);
        System.out.println("i: " + i); // 10 - pra mostrar que i teve seu valor alterado novamente (voltou a ser 10)

        int c = 2;

        c *= i += 5; // c = 2 * i; i = i + 5 -> c = 2 * i; i = 10 + 5; c = 2 * 15; -> c = 30;

        System.out.println("c *= i += 5: " + c);

    }
}
// para saber mais: docs.oracle.com/javase/tutorial/java/nutsandbolts/operations.html
// para saber mais: docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
// para saber mais: docs.oracle.com/javase/tutorial/java/nutsandbolts/keywords.html
// para saber mais: docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
// para saber mais: docs.oracle.com/javase/tutorial/java/nutsandbolts/variablessummary.html