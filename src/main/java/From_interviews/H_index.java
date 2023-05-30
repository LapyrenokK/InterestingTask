package From_interviews;

public class H_index {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 0, 15, 1, 5,19,4,0,100};
        indexH(arr);
    }

//Собеседование на Backend в Лондон за $12.000 в Месяц
//    Задача.
//    Представьте, что у нас есть ученый и он пишет статьи. Соответсвенно у нас есть массив чисел int[] nums = new int[] {3, 0, 6, 1, 5},
//    где кол-во элементов равно кол-ву статей, которые этот ученый выпустил.
//    Значение чисел в этом массиве означает индекс цитирования этих статей.
//    То есть сколько раз на эту статью сослались другие ученые. Соответственно на nums[0] сослались 3 раза,  на nums[1] сослались 0 раз, на nums[2] сослались 6 раз и т.д.
//    Наша задача состоит в том, чтобы найти H-Index этого ученого.
//
//    Простыми словами про H-Index. H-Index = 1 говорит нам о том,
//    что должна быть хотя бы 1 статья с индексом цитирования 1 или больше. H-Index = 2 говорит нам о том,
//    что должно быть минимум 2 статьи с индексом цитирование 2 или больше. Соответственно H-Index = 3 говорит нам о том,
//    что должно быть минимум 3 статьи с индексом цитирования 3 или больше.
//    Найти максимальный H-Index.

    static void indexH(int[] arr) {
        int countLinks = 0;
        int countH = 1;
        int hIndex =0;
        boolean isTrue;

        do {
            isTrue=false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>=countH){
                    countLinks++;
                }
            }
            if (countLinks>=countH){
                isTrue=true;
                countLinks=0;
                hIndex++;
            }
            countH++;
        }while (isTrue);
        System.out.println("This is index H"+hIndex);
    }

}
