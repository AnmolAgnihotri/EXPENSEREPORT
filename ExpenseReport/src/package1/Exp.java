/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anmol
 */
package package1;
public class Exp {
    public int expid, amount;
    public String date, category, des; 
    public Exp(int expid, String date, String category,int amount, String des)
    {
      this.expid = expid;
      this.date = date;
      this.category = category;
      this.amount = amount;
      this.des = des;
    }
    public int getexpid(){
        return expid;
    }
    public String getdate(){
        return date;
    }
     public String getcategory(){
        return category;
    }
      public int getamount(){
        return amount;
    }
      public String getdes(){
        return des;
    }
  

    void add(Exp exp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
