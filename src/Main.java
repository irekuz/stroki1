public class Main {
    public static void main(String[] args) {
        // Задание №1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника — " + lastName + firstName + middleName);

        //Задание №2

       String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);

        //Задание №3

        String fullName3 = "Иванов Семён Семёнович";
        //fullName3 = fullName3.replace("ё", "е");
        //System.out.println("Данные ФИО сотрудника —" + fullName3);
        String[] b = fullName3.split(" ");
        for (int i = 0; i<b.length; i++) {
            String new_string = "";
            for (int j = 0; j < b[i].length(); j++) {
                if(b[i].charAt(j) == 'ё') {
                new_string+='ё';
            } else
            new_string+=b[i].charAt(j);
        }
        b[i] = new_string;
        System.out.println(new_string);
            }
        }



















    }