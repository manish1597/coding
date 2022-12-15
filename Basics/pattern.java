package Basics;

public class pattern {
    public static void main(String[] args){
       pattern1(5);
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
     // pattern2(5);
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
//        pattern3(5);
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
         //pattern4(5);
        //1
        //12
        //123
        //1234
        //12345
        //pattern5(5);
        //*
        //**
        //***
        //****
        //***
        //**
        //*
//         pattern6(5);
        // *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *
//        pattern7(5);
//        pattern8(5);
        //        1
        //      2 1 2
        //    3 2 1 2 3
        //  4 3 2 1 2 3 4
        //5 4 3 2 1 2 3 4 5
        //  4 3 2 1 2 3 4
        //    3 2 1 2 3
        //      2 1 2
        //        1
        //
//        pattern9(5);
//        ****
//        ****
//        ****
//        ****
//        ****


    }
    static void pattern1(int n) {
        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern2(int n) {
        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern3(int n) {
        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col = 1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern4(int n) {
        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col = 1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();

        }
    }
    static void pattern5(int n) {
        for(int row=0;row<n*2;row++){
            //for every row run the column
            int columninRow=row>n?2*n-row :row;
            for(int col = 1; col< columninRow; col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern6(int n) {
        for(int row=0;row<2*n;row++){
            //for every row run the column
            int columninRow=row>n?2*n-row :row;
            int space=n-columninRow;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }

            for(int col = 0; col< columninRow; col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern7(int n) {
        for(int row=1;row<=n;row++){
            int space=n-row;
            for(int s=0;s<space;s++){
                System.out.print("   ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println( );
        }

    }

    static void pattern8(int n) {
        for(int row=1;row<=2*n;row++){
            int columninRow=row>n?2*n-row :row;

            for(int s=0;s<n-columninRow ;s++){
                System.out.print("  ");
            }
            for(int col=columninRow;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=columninRow;col++){
                System.out.print(col+" ");
            }
            System.out.println( );
        }

    }

    static void pattern9(int n){
        for(int i=1;i<=n;i++){
            System.out.println("****");
        }
    }




}
