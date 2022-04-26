package com.github.processamentodelistas;

import java.util.List;

public class Metodo {

    private List<Double> ins;
    private List<Double> out;
    private Integer e = 2000;
    private Double lr = 0.025;

    public Metodo() {
    }

    //<editor-fold defaultstate="collapsed" desc="getters&setters">
    public List<Double> getIns() {
        return ins;
    }

    public void setIns(List<Double> ins) {
        this.ins = ins;
    }

    public List<Double> getOut() {
        return out;
    }

    public void setOut(List<Double> out) {
        this.out = out;
    }
    //</editor-fold> 

    public Dupla<Double, Double> metodo(List<Double> ins, List<Double> outs) {

        return metodo(ins, outs, e, lr);
    }

    public Dupla<Double, Double> metodo(List<Double> ins, List<Double> outs, Integer e) {

        return metodo(ins, outs, e, lr);
    }

    public Dupla<Double, Double> metodo(List<Double> ins, List<Double> outs, Integer e, Double lr) {
        Double w0 = 0.0;
        Double w1 = 0.0;
        Double p;
        Double dif;

        for (int k = 1; k <= e; k++) {
            for (int i = 0; i < ins.size(); i++) {
                p = w1 * ins.get(i) + w0;
                dif = outs.get(i) - p;
                w0 += dif * lr;
                w1 += dif * lr * ins.get(i);
            }
            if (k % 10 == 0) {
                System.out.println("E = " + k);
                System.out.format("W1 = %.3f %n", w1);
                System.out.format("W0 = %.3f %n", w0);
                System.out.println("");
            }
        }
         w1 = Math.round(w1*100.0)/100.0;
         w0 = Math.round(w0*100.00)/100.0;
         
        return new Dupla(w1, w0);
    }
}