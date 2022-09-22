public class Task8 {
    public static void main(String[] args) {
        var totalHours = 640;
        var onePersonHours = 8;
        System.out.println("Всего работников в компании - " + (totalHours / onePersonHours) + " человек");
        var totalPersons = totalHours / onePersonHours;
        totalPersons += 94;
        System.out.println("Если в компании работает " + totalPersons + " человек, то всего " + (totalPersons * onePersonHours) + " часов работы может быть поделено между сотрудниками");
    }
}
