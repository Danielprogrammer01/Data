import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Eu sou o dev Daniel!");
    
        Data dataOriginal = new Data(LocalDate.of(2024, 9, 7));
        Data dataClonada = dataOriginal.clone();

        System.out.println("Data Atual: " + dataOriginal.getDataAtual());
        System.out.println("Data Recebida: " + dataOriginal.getData());
        System.out.println("Data Clonada: " + dataClonada.getData());
        System.out.println(dataOriginal.getMesExtenso());
        System.out.println(dataOriginal.compararData(dataClonada));
        System.out.println(dataOriginal.isBissexto());

    }
}
