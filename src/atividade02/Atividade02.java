package atividade02;

import java.time.LocalDate;
import java.time.Period;

public class Atividade02 {
    public static void contaTempo(int dia, int mes, int ano) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataAlvo = LocalDate.of(ano, mes, dia);
        Period periodo = Period.between(dataAtual, dataAlvo);
        
        if (periodo.isNegative()) {
            System.out.println("A data fornecida já passou.");
        } else if (periodo.isZero()) {
            System.out.println("Hoje é a data fornecida!");
        } else {
            System.out.println("Faltam " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias até a data fornecida.");
        }
    }

    public static void main(String[] args) {
        contaTempo(15, 5, 2050); 
    }
}