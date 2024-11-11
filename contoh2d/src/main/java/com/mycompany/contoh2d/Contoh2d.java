/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contoh2d;

/**
 *
 * @author lenovo
 */
public class Contoh2d 
{
int[][] A={{3,7,5},{2,8,6}};
public void cetak()
{
System.out.println(" Matrik A: ");
for(int i=0;i<A.length;i++)
{
for(int j=0;j<A[0].length;j++)
{
System.out.print(A[i][j]+" ");
}
System.out.println();
}
}
public static void main(String args[])
{
Contoh2d jm=new Contoh2d();
jm.cetak();
}
}