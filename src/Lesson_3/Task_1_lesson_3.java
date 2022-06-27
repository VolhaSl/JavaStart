package Lesson_3;

public class Task_1_lesson_3 {

        //Написать частотный словарь - посчитать
        // сколько раз каждое слово встречается в
        // предложении и вывести результат в консоль


        public static void main(String[] args) {
            // место элемента массива 0        1     2         3
            String[] worlds = {"We", "peace", "peace", "for"};
            //length            1      2        3       4


            //1 ВАРИАНТ
            int count = 0;
            int count2 = 0;
            int count3 = 0;

            for (int i = 0; i < worlds.length; i++) {

                if (worlds[i] == "peace") {
                    ++count;
                    continue;
                } else if (worlds[i] == "We") {
                    ++count2;
                    continue;
                } else if (worlds[i] == "for") {
                    ++count3;
                    continue;
                }

            }
            System.out.println(count);
            System.out.println(count2);
            System.out.println(count3);

            FrequencyDictionary(worlds);

        }

        private static void FrequencyDictionary(String[] worlds) {

            //2 ВАРИАНТ

//  // место элемента массива 0        1     2         3
//        String[] worlds = {"We", "peace", "for", "peace"};
//        //length             1      2        3       4

            for (int i = 0; i < worlds.length; ++i) {
                int count = 1;
                if (worlds[i] != null) {
                    for (int g = i + 1; g < worlds.length; ++g) {

                        if (worlds[i].equals(worlds[g])) {
                            ++count;
                            worlds[g] = null;
                        }
                    }
                    System.out.printf("Word -> %s, count -> %s", worlds[i], count);
                    System.out.println();
                }
            }
        }
    }


