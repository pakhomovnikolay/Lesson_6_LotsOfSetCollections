import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;

public class HomeWork {

    public static void main(String[] args) {
        ArrayList<Notebook> noteBooks = new ArrayList<Notebook>();
        noteBooks.add(new Notebook("hp", "i7", "3050", "8", "512", "Windows", "Серый"));
        noteBooks.add(new Notebook("hp", "i5", "2070", "32", "512", "Windows", "Черный"));
        noteBooks.add(new Notebook("hp", "i5", "3050", "16", "2048", "Windows", "Белый"));
        noteBooks.add(new Notebook("lenovo", "AMD Ryzen 5", "560", "8", "1024", "Windows", "Синий"));
        noteBooks.add(new Notebook("asus", "AMD Ryzen 7", "7800", "32", "2048", "Windows", "Белый"));

        System.out.println("==========================================================================================================================================");
        System.out.println("=============================================================== Все модели ===============================================================");
        PrintNotebook(FileringNotebook(""), noteBooks);
        System.out.println();

        System.out.println("==========================================================================================================================================");
        System.out.println("========================================================== Фильтр по моделям HP ==========================================================");
        PrintNotebook(FileringNotebook("hp"), noteBooks);
        System.out.println();

        System.out.println("==========================================================================================================================================");
        System.out.println("======================================================== Фильтр по моделям Lenovo ========================================================");
        PrintNotebook(FileringNotebook("lenovo"), noteBooks);
        System.out.println();

        System.out.println("==========================================================================================================================================");
        System.out.println("========================================================= Фильтр по моделям ASUS =========================================================");
        PrintNotebook(FileringNotebook("asus"), noteBooks);
        System.out.println();

        System.out.println("==========================================================================================================================================");
        System.out.println("===================================================== Фильтр по моделям и процессору =====================================================");
        PrintNotebook(FileringNotebook("", "i7"), noteBooks);
        PrintNotebook(FileringNotebook("", "i5"), noteBooks);
        PrintNotebook(FileringNotebook("", "AMD Ryzen 5"), noteBooks);
        PrintNotebook(FileringNotebook("", "AMD Ryzen 7"), noteBooks);
        PrintNotebook(FileringNotebook("hp", "i7"), noteBooks);
        System.out.println();

        System.out.println("==========================================================================================================================================");
        System.out.println("============================================================= Фильтр по цвету ============================================================");
        PrintNotebook(FileringNotebook("", "", "", "", "", "", "Серый"), noteBooks);
        PrintNotebook(FileringNotebook("", "", "", "", "", "", "Черный"), noteBooks);
        PrintNotebook(FileringNotebook("", "", "", "", "", "", "Белый"), noteBooks);
        PrintNotebook(FileringNotebook("", "", "", "", "", "", "Синий"), noteBooks);
        System.out.println();
    }

    // Показать отфильтрованные ноутбуки
    public static void PrintNotebook(Notebook filtering, ArrayList<Notebook> noteBooks) {
        HashMap<String, ArrayList<Notebook>> lists = new HashMap<>();
        for (Notebook notebook : noteBooks) {
            if (notebook.equals(filtering)) {
                String model = notebook.getModel();
                if (lists.containsKey(model)) {
                    lists.get(model).add(notebook);
                }
                else  {
                    lists.put(model, new ArrayList<Notebook>());
                    lists.get(model).add(notebook);
                }
            }
        }
        for (String Category : lists.keySet()) {
            //System.out.println("=========================== " + Category + " ===========================");
            ArrayList<Notebook> notebook = lists.get(Category);
            for (Notebook model : notebook) {
                //System.out.println();
                System.out.print(model);
            }
            
        }
        System.out.println();

    }

    // Фильтры для ноутбуков
    public static Notebook FileringNotebook(String _model) {
        Notebook notebook = new Notebook(_model, "", "", "", "", "", "");
        return notebook;
    }

    public static Notebook FileringNotebook(String _model, String _proccessor) {
        Notebook notebook = new Notebook(_model, _proccessor, "", "", "", "", "");
        return notebook;
    }

    public static Notebook FileringNotebook(String _model, String _proccessor, String _videoCard) {
        Notebook notebook = new Notebook(_model, _proccessor, _videoCard, "", "", "", "");
        return notebook;
    }

    public static Notebook FileringNotebook(String _model, String _proccessor, String _videoCard, String _OZU) {
        Notebook notebook = new Notebook(_model, _proccessor, _videoCard, _OZU, "", "", "");
        return notebook;
    }

    public static Notebook FileringNotebook(String _model, String _proccessor, String _videoCard, String _OZU, String _SSDSize) {
        Notebook notebook = new Notebook(_model, _proccessor, _videoCard, _OZU, _SSDSize, "", "");
        return notebook;
    }

    public static Notebook FileringNotebook(String _model, String _proccessor, String _videoCard, String _OZU, String _SSDSize, String _OS) {
        Notebook notebook = new Notebook(_model, _proccessor, _videoCard, _OZU, _SSDSize, _OS, "");
        return notebook;
    }

    public static Notebook FileringNotebook(String _model, String _proccessor, String _videoCard, String _OZU, String _SSDSize, String _OS, String _color) {
        Notebook notebook = new Notebook(_model, _proccessor, _videoCard, _OZU, _SSDSize, _OS, _color);
        return notebook;
    }
}

class Notebook {

    // ========================================================
    // Конструктор класса
    public Notebook(String _model, String _proccessor, String _videoCard, String _OZU, String _SSDSize, String _OS, String _color) {
        model = _model;
        proccessor = _proccessor;
        videoCard = _videoCard;
        OZU = _OZU;
        SSDSize = _SSDSize;
        OS = _OS;
        color = _color;
    }

    // ========================================================
    // Поля класса
    private String model;       // Модель ноутбука
    private String proccessor;  // Тип процессора
    private String videoCard;   // Тип видеокарты
    private String OZU;         // Объем оперативной памяти
    private String SSDSize;     // Объем жесткого диска
    private String OS;          // Тип ОС
    private String color;       // Цвет

    // ========================================================
    // Свойства полей

    // Получить модель ноутбука
    public String getModel() {
        return model;
    }

    // Получить тип процессора
    public String getProccessor() {
        return proccessor;
    }

    // Получить объем оперативной памяти
    public String getOZU() {
        return OZU;
    }

    // Получить тип видеокарты
    public String getVideoCard() {
        return videoCard;
    }

    // Получить объем жесткого диска
    public String getSSDSize() {
        return SSDSize;
    }

    // Получить тип ОС
    public String getOS() {
        return OS;
    }

    // Получить Цвет
    public String getColor() {
        return color;
    }

    // Получить модель ноутбука
    public String setModel(String _model) {
        return model;
    }
    
    // Установить тип процессора
    public void setProccessor(String _proccessor) {
        proccessor = _proccessor;
    }

    // Установить объем оперативной памяти
    public void setOZU(String _OZU) {
        OZU = _OZU;
    }

    // Установить тип видеокарты
    public void setVideoCard(String _videoCard) {
        videoCard = _videoCard;
    }

    // Установить объем жесткого диска
    public void setSSDSize(String _SSDSize) {
        SSDSize = _SSDSize;
    }

    // Установить тип ОС
    public void setOS(String _OS) {
        OS = _OS;
    }

    // Установить Цвет
    public void setColor(String _color) {
        color = _color;
    }

    // ========================================================
    // Методы класса

    @Override
    public String toString() {
        String _model = "Модель: " + model + "; ";                     // Модель ноутбука
        String _proccessor = "Процессор: " + proccessor + "; ";        // Тип процессора
        String _videoCard = "Видеокарта: " + videoCard + "; ";         // Тип видеокарты
        String _OZU = "Объем оперативной памяти: " + OZU + "; ";       // Объем оперативной памяти
        String _SSDSize = "Объем жесткого диска: " + SSDSize + "; ";   // Объем жесткого диска
        String _OS = "Тип ОС: " + OS + "; ";                           // Тип ОС
        String _color = "Цвет: " + color + "; ";                       // Цвет

        return "\nНоутбук {" + _model + _proccessor + _videoCard + _OZU + _SSDSize + _OS + _color + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Notebook noteBook = (Notebook) obj;

        Boolean result = (noteBook.model.toLowerCase().equals(model.toLowerCase()) || noteBook.model == "") &&
                        (noteBook.proccessor.toLowerCase().equals(proccessor.toLowerCase()) || noteBook.proccessor == "") &&
                        (noteBook.videoCard.toLowerCase().equals(videoCard.toLowerCase()) || noteBook.videoCard == "") &&
                        (noteBook.OZU.toLowerCase().equals(OZU.toLowerCase()) || noteBook.OZU == "") &&
                        (noteBook.SSDSize.toLowerCase().equals(SSDSize.toLowerCase()) || noteBook.SSDSize == "") &&
                        (noteBook.OS.toLowerCase().equals(OS.toLowerCase()) || noteBook.OS == "") &&
                        (noteBook.color.toLowerCase().equals(color.toLowerCase()) || noteBook.color == "");

        return  result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, proccessor, videoCard, OZU, SSDSize, OS, color);
    }
}
