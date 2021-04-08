package jai;

import java.util.Scanner;

public class NewG {

	public void getname(String name) {

		int n = 7;
		char[] ch = new char[name.length()];
		for (int z = 0; z < name.length(); z++) {
			ch[z] = name.charAt(z);
		}

//		  AAAAAAA   BBBBBBBB   CCCCCCCCC  DDDDDDDDD  EEEEEEEEE  FFFFFFFFF  GGGGGGGGG  H       H  IIIIIIIII  JJJJJJJJJ  K    K     L          M       M  N       N   OOOOOOOO  PPPPPPPP   QQQQQQQ   RRRRRRRR   SSSSSSSSS  TTTTTTTTT  U       U  V       V  W   W   W  X       X  Y       Y  ZZZZZZZZZ  
//		 A       A  B       B  C          D       D  E          F          G          H       H      I          J      K   K      L          MM     MM  NN      N  O       O  P       P  Q     Q   R       R  S              T      U       U  V       V  W   W   W   X     X    Y     Y          Z   
//		 A       A  B       B  C          D       D  E          F          G          H       H      I          J      K  K       L          M M   M M  N N     N  O       O  P       P  Q     Q   R       R  S              T      U       U  V       V  W   W   W    X   X      Y   Y          Z    
//		 A       A  B       B  C          D       D  E          F          G          H       H      I          J      K K        L          M  M M  M  N  N    N  O       O  P       P  Q     Q   R       R  S              T      U       U  V       V  W   W   W     X X        Y Y          Z     
//		 AAAAAAAAA  BBBBBBBB   C          D       D  EEEEEEEEE  FFFFF      G   GGGGG  HHHHHHHHH      I      J   J      KK         L          M   M   M  N   N   N  O       O  PPPPPPPP   Q   Q Q   RRRRRRRR   SSSSSSSSS      T      U       U  V       V  W   W   W      X          Y          Z      
//		 A       A  B       B  C          D       D  E          F          G       G  H       H      I       J  J      KK         L          M       M  N    N  N  O       O  P          Q    QQ   RR                 S      T      U       U   V     V   W   W   W     X X         Y         Z       
//		 A       A  B       B  C          D       D  E          F          G       G  H       H      I        J J      K K        L          M       M  N     N N  O       O  P          QQQQQQQ   R R                S      T      U       U    V   V    W   W   W    X   X        Y        Z        
//		 A       A  B       B  C          D       D  E          F          G       G  H       H      I         JJ      K  K       L          M       M  N      NN  O       O  P                 Q  R  R               S      T      U       U     V V      W W W W    X     X       Y       Z         
//		 A       A  BBBBBBBB   CCCCCCCCC  DDDDDDDDD  EEEEEEEEE  F          GGGGGGGGG  H       H  IIIIIIIII      J      K   K      LLLLLLLLL  M       M  N       N  OOOOOOOO   P                  Q R   R      SSSSSSSSS      T       UUUUUUU       V        W   W    X       X      Y      ZZZZZZZZZ 
		for (int i = 0; i < n; i++) {

			for (int k = 0; k < name.length(); k++) {

				if (ch[k] == 'A' || ch[k] == 'a') {
					// A
					for (int j = 0; j < n; j++) {
						if (i == n / 2 || ((j == 0 || j == n - 1) && (i != 0)) || (i == 0 && j != 0 && j != n - 1)) {
							System.out.print("A");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				} else if (ch[k] == 'B' || ch[k] == 'b') {
					// B
					for (int j = 0; j < n; j++) {
						if ((j == 0) || ((i == 0 || i == n / 2 || i == n - 1) && j != n - 1)
								|| (j == n - 1) && (i != 0) && (i != n - 1) && (i != n / 2))
							System.out.print("B");

						else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'C' || ch[k] == 'c') {
					// C
					for (int j = 0; j < n; j++) {
						if (i == 0 || (i == n - 1) || (j == 0)) {
							System.out.print("C");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'D' || ch[k] == 'd') {
					// D
					for (int j = 0; j < n; j++) {
						if ((i == 0 || (i == n - 1) && (j < n - 1))
								|| (j == 0 || ((j == n - 1) && (i > 0 || i < n - 1)))) {
							System.out.print("D");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'E' || ch[k] == 'e') {
					// E
					for (int j = 0; j < n; j++) {
						if ((i == 0 || (i == n - 1) || (i == n / 2) || (j == 0))) {
							System.out.print("E");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'F' || ch[k] == 'f') {
					// F
					for (int j = 0; j < n; j++) {
						if ((j == 0) || (i == 0) || ((i == n / 2) && (j <= n / 2))) {
							System.out.print("F");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'G' || ch[k] == 'g') {
					// G
					for (int j = 0; j < n; j++) {
						if ((j == 0) || (i == 0) || (i == n - 1) || ((j == n - 1) && (i >= n / 2))
								|| ((i == n / 2) && (j >= n / 2))) {
							System.out.print("G");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'H' || ch[k] == 'h') {
					// H
					for (int j = 0; j < n; j++) {
						if (j == 0 || i == n / 2 || j == n - 1) {
							System.out.print("H");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'I' || ch[k] == 'i') {
					// I
					for (int j = 0; j < n; j++) {
						if (i == 0 || j == n / 2 || i == n - 1) {
							System.out.print("I");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'J' || ch[k] == 'j') {
					// J
					for (int j = 0; j < n; j++) {
						if (i == 0 || j == n / 2 || (i == j + n / 2)) {
							System.out.print("J");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'K' || ch[k] == 'k') {
					// K
					for (int j = 0; j < n; j++) {
						if ((j == 0) || (i == j + n / 2) || (i + j == n / 2 + 1)) {
							System.out.print("K");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'L' || ch[k] == 'l') {
					// L
					for (int j = 0; j < n; j++) {
						if (i == n - 1 || j == 0) {
							System.out.print("L");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'M' || ch[k] == 'm') {
					// M
					for (int j = 0; j < n; j++) {
						if (j == n - 1 || j == 0 || (i == j && i <= n / 2) || (i + j == n - 1 && j >= 5)) {
							System.out.print("M");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'N' || ch[k] == 'n') {
					// N
					for (int j = 0; j < n; j++) {
						if (j == n - 1 || j == 0 || i == j) {
							System.out.print("N");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'O' || ch[k] == 'o') {
					// O
					for (int j = 0; j < n; j++) {
						if ((j == n - 1 || j == 0 || i == 0 || i == n - 1) && (i != 0 || j != 0)
								&& (i != n - 1 || j != n - 1)) {
							System.out.print("O");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'P' || ch[k] == 'p') {
					// P
					for (int j = 0; j < n; j++) {
						if ((j == 0) || ((i == 0 || i == n / 2) && j != n - 1)
								|| ((j == n - 1) && (i > 0) && (i < n / 2))) {
							System.out.print("P");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'Q' || ch[k] == 'q') {
					// Q
					for (int j = 0; j < n; j++) {
						if ((j == 0) && (i < (3 * n) / 4) || (j == (3 * n) / 4) && (i < (3 * n) / 4)
								|| (i == 0) && (j < (3 * n) / 4)
								|| ((i == (3 * n) / 4) && (j < (3 * n) / 4) || ((i == j) && (i >= n / 2)))) {
							System.out.print("Q");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print(" ");
				}

				else if (ch[k] == 'R' || ch[k] == 'r') {
					// R
					for (int j = 0; j < n; j++) {
						if (j == 0 || (i == j + n / 2) || ((i == 0 || i == n / 2) && j != n - 1)
								|| (j == n - 1 && i < n / 2 && i > 0)) {
							System.out.print("R");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'S' || ch[k] == 's') {
					// S
					for (int j = 0; j < n; j++) {
						if (i == 0 || i == n - 1 || i == n / 2 || (j == 0 && i < n / 2) || (j == n - 1 && i > n / 2)) {
							System.out.print("S");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'T' || ch[k] == 't') {
					// T
					for (int j = 0; j < n; j++) {
						if (i == 0 || j == n / 2) {
							System.out.print("T");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'U' || ch[k] == 'u') {
					// U
					for (int j = 0; j < n; j++) {
						if ((i == n - 1 && j != 0 && j != n - 1) || ((j == 0 || j == n - 1) && i != n - 1)) {
							System.out.print("U");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'V' || ch[k] == 'v') {
					// V
					for (int j = 0; j < n; j++) {
						if (((j == 0 || j == n - 1) && i <= n / 2) || (i == j + n / 2)
								|| (i + j == (n - 1) + (n / 2))) {
							System.out.print("V");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'W' || ch[k] == 'w') {
					// W
					for (int j = 0; j < n; j++) {
						if ((j == 0 || j == n - 1 || j == n / 2) && i < 3 * n / 4 || (i == j + 3 * n / 4)
								|| ((i + j == (n - 1) + (n / 4)) && (i >= 3 * n / 4))
								|| (i + j == (n - 1) + (3 * n / 4)) || ((i == j + n / 4) && i >= 3 * n / 4)) {
							System.out.print("W");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'x' || ch[k] == 'X') {
					// X
					for (int j = 0; j < n; j++) {
						if (i == j || (i + j == n - 1)) {
							System.out.print("X");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'y' || ch[k] == 'Y') {
					// Y
					for (int j = 0; j < n; j++) {
						if (((i == j || (i + j == n - 1)) && i <= n / 2) || (j == n / 2 && i >= n / 2)) {
							System.out.print("Y");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == 'Z' || ch[k] == 'z') {
					// Z
					for (int j = 0; j < n; j++) {
						if (i == 0 || i == n - 1 || i + j == n - 1) {
							System.out.print("Z");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				else if (ch[k] == ' '||ch[k]=='.') {
					// space
					for (int j = 0; j < n - 1; j++) {
						System.out.print(" ");
					}
				}

				else if (ch[k] == '0') {
					// 0
					for (int j = 0; j < n; j++) {
						if ((j == n - 1 || j == 0 || i == 0 || i == n - 1) && (i != 0 || j != 0)
								&& (i != n - 1 || j != n - 1) || (i + j == n - 1)) {
							System.out.print("0");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				} else if (ch[k] == '1') {
					// 1
					for (int j = 0; j < n; j++) {
						if (j == n / 2 || (i == n - 1 && j >= n / 4 && j <= 3 * n / 4)
								|| (j + i == n / 2 && j >= n / 4)) {
							System.out.print("1");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

}