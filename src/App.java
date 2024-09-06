import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
        Data dataOriginal = new Data(LocalDate.of(2024, 9, 6));
        Data dataClonada = dataOriginal.clone();

        System.out.println("Data Original: " + dataOriginal.getData());
        System.out.println("Data Clonada: " + dataClonada.getData());
        System.out.println(dataOriginal.getMesExtenso());
        System.out.println(dataOriginal.compararData(dataClonada));
        System.out.println(dataOriginal.isBissexto());

    }
}
