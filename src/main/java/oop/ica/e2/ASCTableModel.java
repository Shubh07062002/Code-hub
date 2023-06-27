/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.e2;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author W9641416
 */
public class ASCTableModel extends AbstractTableModel {
    
    private String [] columnsNames;
    
    private Object data[][];
    
    public ASCTableModel(final String colName[], final ArrayList<ASCStockItem> dataList)
    {
        int columnsNameslength= colName.length;
        
        columnsNames=Arrays.copyOf(colName, columnsNameslength);
        int rowLength=dataList.size();
        data=new Object[rowLength][columnsNameslength];
        int row=0;
        for(ASCStockItem list: dataList)
        {
            String stockcode=list.getItem();
            String stockTitle=list.getTitle();
            String stockDescription=list.getDescription();
            int sPounds=list.getPound();
            int spences=list.getPenny();
            float fprice=(float)spences/100;
            fprice=sPounds+fprice;
            String price=String.format("£ %.2f",fprice);
            int stockQuantity=list.getStock();
            
            Object[] dataRow=new Object[]{stockcode,stockTitle,stockDescription,price,stockQuantity};
            data[row]=Arrays.copyOf(dataRow, columnsNameslength);
            row++;
        }
        
    }

    @Override
    public int getRowCount() {
        
       return data.length;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
       return columnsNames.length;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    @Override
    public void setValueAt(Object obj,int row ,int col)
    {
        data[row][col]=obj;
        fireTableCellUpdated(row, col);
    }
    
}
