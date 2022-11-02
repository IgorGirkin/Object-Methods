public class Main {
    public static void main(String[] args) {
        Author strugatsky = new Author("Борис и Аркадий", "Стругатские");
        Book mondayBeginsOnSaturday = new Book("Понедельник начинается в суббо" +
                "ту", strugatsky, 1964);
        Author strugatsky2 = new Author("Борис и Аркадий", "Стругатские");
        Book mondayBeginsOnSaturday2 = new Book("Понедельник начинается в суббо" +
                "ту", strugatsky2, 1964);

        Author marcusAurelius = new Author("Марк Аврелий", "Марк Элий Аврелий Вер Цезарь");
        Book reasoningAboutYourself = new Book("Рассуждения о самом себ" +
                "е.", marcusAurelius, 1914);
        Book reasoningAboutYourself2 = new Book("Рассуждения о самом себ" +
                "е.", marcusAurelius, 1914);
        mondayBeginsOnSaturday.setYearOfPublication(1979);

        System.out.println(reasoningAboutYourself.getFullNameAuthor());
        System.out.println(reasoningAboutYourself.getNameBook());
        System.out.println(reasoningAboutYourself.getYearOfPublication());
        System.out.println("------------------------------------------");

        System.out.println(mondayBeginsOnSaturday.getFullNameAuthor());
        System.out.println(mondayBeginsOnSaturday.getNameBook());
        System.out.println(mondayBeginsOnSaturday.getYearOfPublication());

        System.out.println(strugatsky.equals(strugatsky2));
        System.out.println(mondayBeginsOnSaturday.equals(mondayBeginsOnSaturday2));//Другой год издания
        System.out.println(reasoningAboutYourself.equals(reasoningAboutYourself2));
        if (reasoningAboutYourself.hashCode() != reasoningAboutYourself2.hashCode()) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

    }
}