class Main {
    public static void main(String[] args) {
//        char alph;
//        for(alph = 'A'; alph <= 'Z'; ++alph)
//            System.out.print(alph);
//        for(int number=1; number<=20; number++){
//            int i = 9;
//           if ((i <= 9));
//            System.out.println(number);
//        }

        char[] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        System.out.println(alph[alph.length - 2]);

        alph[0] = '$';

        System.out.println(alph[alph.length - 2]);

        for (int indexPostion = 0; indexPostion < alph.length; indexPostion++){
            if (alph[indexPostion] != 'y'){
                System.out.println(alph[indexPostion]);
            }
        }


    }

}