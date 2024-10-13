import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значений
        System.out.print("Введите объем воды X: ");
        int X = scanner.nextInt();

        System.out.print("Введите объем первой ванночки A: ");
        int A = scanner.nextInt();

        System.out.print("Введите объем второй ванночки B: ");
        int B = scanner.nextInt();

        System.out.print("Введите объем третьей ванночки C: ");
        int C = scanner.nextInt();

        System.out.print("Введите объем четвертой ванночки D: ");
        int D = scanner.nextInt();

        
        int cnt = 0; // Подсчет заполненных ванночек
        int ost = 0; // Излишки воды в переполненных ванночках

        if (X<A){
            if(X==B){
                cnt++;
                if(C==X){
                    cnt++;
                    if(D<=X){
                        cnt++;
                    }
                }else if(C<X){
                    ost = X-C;
                    cnt++;
                    if(D<=X+ost){
                        cnt++;
                    }
                }else{
                    if(D<=X){
                        cnt++;
                    }
                }
            }else if(X>B){
                ost = X-B;
                cnt++;
                if(C==X+ost){
                    cnt++;
                    if(D<=X){
                        cnt++;
                    }
                }else if(C<X+ost){
                    ost = X+ost - C;
                    cnt++;
                    if(D<=X+ost){
                        cnt++;
                    }
                }else{
                    if(D<=X){
                        cnt++;
                    }
                }
            }else{
                if(X>C){
                    ost = X-C;
                    cnt++;
                    if (X+ost >= D){
                        cnt++;
                    }
                }
                else if (X == C) {
                    cnt++;
                    if (X >= D)
                        cnt++;
                }else{
                    if (X >= D){
                        cnt++;
                    }
                }
            };
        }else if(X>A){
            cnt++;
            ost = X-A;
            if (B<X+ost){
                cnt++;
                ost = X+ost - B;
                if(C==X+ost){
                    cnt++;
                    if(D<=X){
                        cnt++;
                    }
                }else if(C<X+ost){
                    ost = X+ost - C;
                    cnt++;
                    if(D<=X+ost){
                        cnt++;
                    }
                }else{
                    if(D<=X){
                        cnt++;
                    }}
            }else if(B==X+ost){
                cnt++;
                if(C==X){
                    cnt++;
                    if(D<=X){
                        cnt++;
                    }
                }else if(C<X){
                    ost = X-C;
                    cnt++;
                    if(D<=X+ost){
                        cnt++;
                    }
                }else{
                    if(D<=X){
                        cnt++;
                    }
                }
            }else{
                if(X>C){
                    ost = X-C;
                    cnt++;
                    if (X+ost >= D){
                        cnt++;
                    }
                }
                else if (X == C) {
                    cnt++;
                    if (X >= D)
                        cnt++;
                }else{
                    if (X >= D){
                        cnt++;
                    }
                }
            }
        }else{
            cnt++;
            if(X==B){
                cnt++;
                if(X==C){
                    cnt++;
                    if(X>=D){
                        cnt++;
                    }
                }else if(C<X){
                    ost = X-C;
                    cnt++;
                    if(D<=X+ost){
                        cnt++;
                    }
                }else{
                    if(D<=X){
                        cnt++;
                    }
                }
            }else if(X>B){
                ost = X-B;
                cnt++;
                if(C==X+ost){
                    cnt++;
                    if(D<=X){
                        cnt++;
                    }
                }else if(C<X+ost){
                    ost = X+ost-C;
                    cnt++;
                    if(D<=X+ost){
                        cnt++;
                    }
                }else{
                    if(D<=X){
                        cnt++;
                    }
                }
            }else{
                if(X>C){
                    ost = X-C;
                    cnt++;
                    if (X+ost >= D){
                        cnt++;
                    }
                }
                else if (X == C) {
                    cnt++;
                    if (X >= D)
                        cnt++;
                }else{
                    if (X >= D){
                        cnt++;
                    }

                }
            }
        }
        // Вывод результата
        System.out.println("Количество полностью заполненных ванночек: " + cnt);
    }
}