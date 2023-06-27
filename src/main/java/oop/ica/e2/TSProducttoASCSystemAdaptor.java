/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.e2;

/**
 *
 * @author W9641416
 */
public class TSProducttoASCSystemAdaptor extends ASCStockItem{
    
    private TSProduct tSProduct;

    public TSProducttoASCSystemAdaptor(String skunumber, String make,String mdl,String clr,String note,int pounds,int pences,int stk) {
      super(skunumber,make+" "+mdl,note,pounds,pences,stk);
        tSProduct=new TSProduct(skunumber, make, mdl, clr, note, Double.parseDouble(pounds+"."+pences), stk);
    }
    
    
    
}
