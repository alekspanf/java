import static java.lang.Math.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        double y, arcsin, kor, logarifm;

        //эти строчки ниже для ввода значения переменной с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер: ");
        double x  = in.nextDouble();

        arcsin = asin(cos(pow(abs(x),3))/ pow(cos(pow(abs(x),3)+7),2));// аркосинус
        // kor = pow(sqrt(abs(x) + 1 ),1/7);//тут высчитывается корень
        logarifm = pow((pow(2,x) + pow(abs(x),2*tan(x))),5);// логарифм

        y = sqrt(abs(arcsin +  logarifm));//тут собирается уравнение из 3х частей

        if((y >= 0) & (x>= 0 )& (pow(x,2) + pow(y,2) <= 25)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
