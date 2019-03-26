/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mis_Clases;

/**
 *
 * @author mdeni
 */
public class Alumno {
    String Nombre;
    String Nua;
    Float Cal1, Cal2, Cal3;
    
    public Alumno(String NombreExt,String NuaExt)
      {
     Nombre = NombreExt;
     Nua = NuaExt;
      }
    
    public void set_Cal1(float CalExt1)
      {
    Cal1 = CalExt1;
      }
    
    public void set_Cal2(float CalExt2)
      {
    Cal2 = CalExt2;
      }
    
    public void set_Cal3(float CalExt3)
      {
    Cal3 = CalExt3;
      }
    
    public String informa()
    {
    
    float promedio;
    promedio = (Cal1+Cal2+Cal3)/3;
    if(promedio<7)
      {
          return "Reprobo";
      }
    else
        return"";

    }
   
    
}
