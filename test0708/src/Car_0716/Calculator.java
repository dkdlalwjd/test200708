package Car_0716;

import java.util.Scanner;

public class Calculator {

	// µ¡¼À 5+5
	// »¬»ù »©°í½ÍÀº¼ıÀÚ ÀÔ·ÂÇØ¼­ °á°ú Ãâ·Â
	// °ö¼À /¸Ş¼Òµå È£ÃâÇØ¼­ µ¡¼À¿ë, »¬»ù, ³ª´°¼À ¸Ş¼Òµå È£Ãâ
	Scanner scan = new Scanner(System.in);

	int num;// ¹øÈ£ ¼±ÅÃ ¼ıÀÚ
	int num2;// ÀÔ·Â¼ıÀÚ1
	int num3;// ÀÔ·Â¼ıÀÚ2

	// ±âº»»ı¼ºÀÚ »ı¼º
	Calculator() {
	}

	boolean input() {
		boolean run = true;

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.µ¡¼À | 2.»¬¼À | 3.°ö¼À | 4.³ª´°¼À | 5.Á¾·á");
			System.out.println("-------------------------------------------");
			System.out.print("¼±ÅÃ> ");

			num = scan.nextInt();

			// 1. µ¡¼À
			if (num == 1) {
				// add = num;
				// System.out.println(add);
				// System.out.println("µ¡¼À °á°ú : "+add);
				System.out.print("¼ıÀÚÀÔ·Â : ");
				num2 = scan.nextInt();
				System.out.print("¼ıÀÚÀÔ·Â : ");
				num3 = scan.nextInt();
				System.out.println("µ¡¼À °á°ú : " + (num2 + num3));

			}

			// 2. »¬¼À
			else if (num == 2) {
				System.out.print("¼ıÀÚÀÔ·Â : ");
				num2 = scan.nextInt();
				System.out.print("¼ıÀÚÀÔ·Â : ");
				num3 = scan.nextInt();
				System.out.println("»¬¼À °á°ú : " + (num2 - num3));

			}

			// 3. °ö¼À
			else if (num == 3) {
				System.out.print("¼ıÀÚÀÔ·Â : ");
				num2 = scan.nextInt();
				System.out.print("¼ıÀÚÀÔ·Â : ");
				num3 = scan.nextInt();
				System.out.println("»¬¼À °á°ú : " + (num2 * num3));
			}

			// 4. ³ª´°¼À
			else if (num == 4) {
				System.out.print("¼ıÀÚÀÔ·Â : ");
				num2 = scan.nextInt();
				System.out.print("¼ıÀÚÀÔ·Â : ");
				num3 = scan.nextInt();
				System.out.println("³ª´°¼À : " + (num2 / num3));

				// 5. Á¾·á
			} else if (num == 5) {

				run = false;
				System.out.println("ÇÁ·Î±×·¥ Á¾·á");
			}

		}
		return true;

	}

}
