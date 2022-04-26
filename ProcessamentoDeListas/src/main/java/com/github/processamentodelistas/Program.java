package com.github.processamentodelistas;

import java.util.List;

/**
 * Classe para Testes.
 * @author Dijalmir Junior
 * @ version 0.1
 */
public class Program {

    public static void main(String[] args) {
        List<Double> ins = List.of(2.900000095, 6.699999809, 4.900000095, 7.900000095, 9.800000191, 6.900000095, 
                6.099999905,6.199999809, 6.0, 5.099999905, 4.699999809, 4.400000095, 5.800000191);
        List<Double> outs = List.of(4.0, 7.400000095, 5.0, 7.199999809, 7.900000095, 6.099999905, 6.0, 5.800000191, 
                5.199999809,4.199999809, 4.0, 4.400000095, 5.199999809);

        Dupla d;
        Metodo t1 = new Metodo();
        d = t1.metodo(ins, outs);
        System.out.println(d);
    }
}
