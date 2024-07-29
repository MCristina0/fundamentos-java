import java.util.Scanner;
  public class solve {

      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);


                int opcion;
                do {
                  System.out.println("Menú Principal:");
                  System.out.println("1. Casteo");
                  System.out.println("2. Operadores de Asignación");
                  System.out.println("3, Operadores de Incremento y Decremento");
                  System.out.println("4. Ejercicios Combinados");
                  System.out.println("0. Salir");
                  System.out.print("Elige una opción: ");

                  opcion = scanner.nextInt(); // Lee la opción del usuario

                  switch (opcion) {
                      case 1:
                          System.out.println("Has elegido la Opción 1.");
                          System.out.println(" punto 1");
                          System.out.println(" punto 2");
                          System.out.println(" punto 3");
                          System.out.println(" punto 4");
                          System.out.println(" punto 5");
                          System.out.println(" punto 6");
                          System.out.println(" punto 7");
                          System.out.println(" punto 8");
                          System.out.println(" punto 9");
                          System.out.println(" Opción 10");
                          int opcion1 = scanner.nextInt();
                          switch (opcion1) {
                              case 1:
                                  double x = Casteo1();
                                  System.out.println(x);

                                  break;
                              case 2:
                                  int x2 = Casteo2();
                                  System.out.println(x2);
                                  break;
                              case 3:
                                  int x3 = Casteo3();
                                  System.out.println(x3);
                                  break;
                              case 4:
                                  int x4 = Casteo4();
                                  System.out.println(x4);
                                  break;
                              case 5:
                                  int x5 = Casteo5();
                                  System.out.println(x5);
                                  break;
                              case 6:
                                  char x6 = Casteo6();
                                  System.out.println(x6);
                                  break;
                              case 7:
                                  long x7 = Casteo7();
                                  System.out.println(x7);
                                  break;
                              case 8:
                                  String x8 = Casteo8();
                                  System.out.println(x8);
                                  break;
                              case 9:
                                  double x9 = Casteo9();
                                  System.out.println(x9);
                                  break;
                              case 10:
                                  short x10 = Casteo10();
                                  System.out.println(x10);
                                  break;
                              default:
                                  System.out.println("Opción no válida. Por favor, elige otra opción.");
                                  break;
                          }
                          break;
                      case 2:
                          System.out.println("Has elegido la Opción 2.");
                          System.out.println(" punto 1");
                          System.out.println(" punto 2");
                          System.out.println(" punto 3");
                          System.out.println(" punto 4");
                          System.out.println(" punto 5");

                          int opcion2 = scanner.nextInt();
                          switch (opcion2) {
                              case 1:
                                  int x = Operadores1(10);
                                  System.out.println(x);
                                  break;
                              case 2:

                                  int x2 = Operadores2(2, 3);
                                  System.out.println(x2);
                                  break;
                              case 3:

                                  int x3 = Operadores3(15);
                                  System.out.println(x3);
                                  break;

                              case 4:

                                  int x4 = Operadores4(3, 5);
                                  System.out.println(x4);
                                  break;
                              case 5:

                                  int x5 = Operadores5(10);
                                  System.out.println(x5);
                                  break;
                          }
                          break;
                      case 3:
                          System.out.println("Has elegido la Opción 3.");
                          System.out.println(" punto 1");
                          System.out.println(" punto 2");
                          System.out.println(" punto 3");
                          System.out.println(" punto 4");
                          System.out.println(" punto 5");

                          int opcion3 = scanner.nextInt();
                          switch (opcion3) {
                              case 1:
                                  int x = OperadoresdeIncrementoyDecremento1();
                                  System.out.println(x);
                                  break;
                              case 2:

                                  int x2 = OperadoresdeIncrementoyDecremento2();
                                  System.out.println(x2);
                                  break;
                              case 3:

                                  int x3 = OperadoresdeIncrementoyDecremento3();
                                  System.out.println(x3);
                                  break;

                              case 4:

                                  int x4 = OperadoresdeIncrementoyDecremento4();
                                  System.out.println(x4);
                                  break;
                              case 5:

                                  int x5 = OperadoresdeIncrementoyDecremento5();
                                  System.out.println(x5);
                                  break;

                          }


                      case 4:
                          System.out.println("Has elegido la Opción 4.");
                          System.out.println(" punto 1");
                          System.out.println(" punto 2");
                          System.out.println(" punto 3");
                          System.out.println(" punto 4");
                          System.out.println(" punto 5");
                          System.out.println(" punto 6");
                          System.out.println(" punto 7");
                          System.out.println(" punto 8");
                          System.out.println(" punto 9");
                          System.out.println(" punto 10");

                          int opcion4 = scanner.nextInt();
                          switch (opcion4) {
                              case 1:
                                   int x = EjerciciosCombinados1(); System.out.println(x);
                                  break;
                              case 2:
                                   double doubleVar= scanner.nextInt();
                                    int x2 = EjerciciosCombinados2(doubleVar); System.out.println(x2);
                                  break;
                              case 3:
                                  double x3 = EjerciciosCombinados3(); System.out.println(x3);
                                  break;
                              case 4:

                                   double x4 = EjerciciosCombinados4(); System.out.println(x4);
                                  break;
                              case 5:
                                  char x5 = EjerciciosCombinados5(); System.out.println(x5);
                                  break;

                              case 6:
                                  short x6 = EjerciciosCombinados6(); System.out.println(x6);
                                  break;
                              case 7:
                                   int x7 = EjerciciosCombinados7(); System.out.println(x7);
                                  break;
                              case 8:
                                  float floatVar = scanner.nextInt();
                                   int x8 = EjerciciosCombinados8(floatVar); System.out.println(x8);
                                  break;
                              case 9:

                                    int x9 = EjerciciosCombinados9(); System.out.println(x9);
                                  break;

                              case 10:
                                   double doubleVar2 = scanner.nextInt();
                                   int x10 = EjerciciosCombinados10(doubleVar2);
                                   System.out.println(x10);
                                  break;
                          }

                          break;
                      case 0:
                          System.out.println("Saliendo del programa...");
                          break;
                      default:
                          System.out.println("Opción no válida. Por favor elige otra opción.");
                          break;
                  }
                  break;


                } while (opcion != 0);

                scanner.close();
                }

      //Casteo

          static double Casteo1() {
              double x = (double) 5.89 + (double) 3.45;
              return x;

          }

          static int Casteo2() {

              char c = 'A';
              int cValue = (int) c;
              System.out.println(c);
              return cValue;
          }

          static int Casteo3() {
              double d = 100.04;
              long l = (long) d;
              int i = (int) l;

              return i;
          }

          static int Casteo4() {
              String B = "12";
              return Integer.parseInt(B);
          }

          static int Casteo5() {

              int a = (int) (char) (byte) -1;
              return a;
          }

          static char Casteo6() {
              //Casteo6 Convierte el número 65 a un char. ¿Qué carácter obtienes?
              int A = 65;
              char AValue = (char) A;
              System.out.println(A);

              return AValue;


          }

          static long Casteo7() {
              //Casteo7
              int log = 65;
              long logValue = (long) log;
              System.out.println(logValue);
              return logValue;
          }

          static String Casteo8() {
              //Casteo8

              float Floatx = 1.35f;
              System.out.println(Floatx);

              return String.valueOf(Floatx);
          }

          static int Casteo9() {
              //Casteo9
              int round = (int) Math.round(2.7);
              return round;
          }

          static short Casteo10() {

              byte b = 50;
              short bValue = (short) b;
              System.out.println(b);
              return bValue;
          }

      //Operadores de Asignación

          static int Operadores1(int x) {

              x = 10;
              x += 5;
              return x;
          }

          static int Operadores2(int y, int x) {
              //Operadores2
              y *= x + 5;
              return y;
          }

          static int Operadores3(int a) {
              //Operadores3
              a %= 4;
              return a;
          }

          static int Operadores4(int x, int y) {
              //Operadores4

              x += y;
              return x;
          }

          static int Operadores5(int x) {

              //Operadores5

              x ^= 2;
              return x;
          }

      //OperadoresdeIncrementoyDecremento

        static  int  OperadoresdeIncrementoyDecremento1() {

//1. ¿Cuál es el valor de `x` e `y` después de estas operaciones?

            int x = 5;
             int y = ++x;
             return y;
          }

        static  int   OperadoresdeIncrementoyDecremento2() {
            //2. ¿Qué se imprimirá en la consola?
           int a = 5;
            System.out.println(a++);
            System.out.println(a) ;

            System.out.println("retorno a") ;

            return a;
        }

        static int  OperadoresdeIncrementoyDecremento3() {

        //3. Escribe código que use el operador de decremento para disminuir una variable `count` en 1.
            int count = 10;

            System.out.println("Valor de count antes de decrementar: " + count);

            count--;

            System.out.println("Valor de count después de decrementar: " );
            return count;

        }

        static int  OperadoresdeIncrementoyDecremento4(){
          //4. ¿Cuál es la diferencia entre
          // `++i` y `i++`?
          int i = 5;
          int a = ++i; // a será 6, i será 6

          int j = 5;
          int b = j++; // b será 5, j será 6

          System.out.println("En Java, ++i y i++ son formas de incrementar el valor de la variable i en 1, pero se diferencian en el momento en que se realiza la operación de incremento respecto al uso de la variable " );
          System.out.println("asi se ve sin ++i "+i +"asi se ve con ++i "+a +"a será 6, i será 6 porque modifica las variables");
          System.out.println("asi se ve sin i++ "+j +"asi se ve con i++ ");
          return b;
        }

        static int  OperadoresdeIncrementoyDecremento5(){
          //5. ¿Qué valor tendrá `x` después de esta operación?
        int x = 3; x = x++;
        return x;
        }
//EjerciciosCombinados

        static int EjerciciosCombinados1(){
          int i = 5;
          i += ++i + i++ + ++i;
          return i;
        }
        static int EjerciciosCombinados2( double doubleVar){
          int num = (int) doubleVar;
         return num++;

        }
        static double EjerciciosCombinados3(){
        double d = 5.7;
        int i = (int)d;
        i *= 2;
        System.out.println("esto imprime i con i-- en consola" +i--);
        System.out.println("esto  valia i");
        return d;
        }
        static double EjerciciosCombinados4(){

          double result = 0.0;
          int intVar = 10;

          result += (double) intVar / 2.0;
          return  result ;
        }
        static char EjerciciosCombinados5(){
          char c = 'X';
          c += 32;
          System.out.println(c);
          return c;
        }
        static short EjerciciosCombinados6(){
         long longVar = 100L;
         short shortVar = (short) longVar;
         shortVar *= 3;
         return  shortVar;
        }
        static int EjerciciosCombinados7(){
          int x = 10;
          x += (x++) + (++x);
          return x;
        }
        static byte EjerciciosCombinados8( float floatVar){
          byte result = (byte) floatVar;
          return --result;
        }
        static byte EjerciciosCombinados9(){
          int i = 257;
          byte b = (byte)i;
          System.out.println("i a pasar a byte es : ");
          return b;
        }
        static int EjerciciosCombinados10(double doubleVar){
          int num = (int) doubleVar;
          num += 5;
          num++;
          return num;
        }
  }