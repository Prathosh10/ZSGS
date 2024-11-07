public class Rectangles {
    public static void main(String[] args) {
//        char[][] rectangle = {{' ', ' ', ' ', '+', '-', '-', '+'},
//                              {' ', ' ', '+', '+', ' ', ' ', '|'},
//                              {'+', '-', '+', '+', '-', '-', '+'},
//                              {'|', ' ', ' ', '|', ' ', ' ', '|'},
//                              {'+', '-', '-', '+', '-', '-', '+'}
//        };

        char[][] rectangle = {  {'+', '-', '-', '+', '-', '-', '+'},
                                {'|', ' ', ' ', '|', ' ', ' ', '|'},
                                {'+', '-', '-', '+', '-', '-', '+'},
                                {'|', ' ', ' ', '|', ' ', ' ', '|'},
                                {'+', '-', '-', '+', '-', '-', '+'}
        };

        for (char[] ch1 : rectangle) {
            for (char ch2 : ch1) {
                System.out.print(ch2 + " ");
            }
            System.out.println();
        }

        int noOfrectangles = 0;
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                if (rectangle[i][j] == '+') {
                    for (int k = j + 1; k < rectangle[i].length; k++) {
                        if (rectangle[i][k] == '+') {
                            for (int l = i + 1; l < rectangle.length; l++) {
                                if (rectangle[l][j] == '+' && rectangle[l][k] == '+') {
                                    noOfrectangles++;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("No of rectangles : " + noOfrectangles);

    }
}
