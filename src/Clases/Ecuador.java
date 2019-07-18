/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Dell_5437
 */
public class Ecuador {
    public String strProvincia;
    public String strCantones;

    public Ecuador() {
    }
    

    public Ecuador(String strProvincia, String strCantones) {
        this.strProvincia = strProvincia;
        this.strCantones = strCantones;
    }

    public String getStrProvincia() {
        return strProvincia;
    }

    public void setStrProvincia(String strProvincia) {
        this.strProvincia = strProvincia;
    }

    public String getStrCantones() {
        return strCantones;
    }

    public void setStrCantones(String strCantones) {
        this.strCantones = strCantones;
    }
    
    
}
