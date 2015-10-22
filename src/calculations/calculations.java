/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculations;

/**
 *
 * @author Zoi
 */
public class calculations {
    
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        firstnum = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operations="+";
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        firstnum = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operations="-";
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        firstnum = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operations="*";
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        firstnum = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operations="/";
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // αποτελεσμα
        String answer;
        secondnum = Double.parseDouble(jTextField1.getText());
        if (operations == "+")
        {
            result = firstnum + secondnum;
            answer = String.format("%.0f",result);
            jTextField1.setText(answer);
        }
        else  if (operations == "-")
        {
            result = firstnum - secondnum;
            answer = String.format("%.0f",result);
            jTextField1.setText(answer);
        }
        else  if (operations == "*")
        {
            result = firstnum * secondnum;
            answer = String.format("%.0f",result);
            jTextField1.setText(answer);
        }
        else  if (operations == "/")
        {
            result = firstnum / secondnum;
            answer = String.valueOf(result);
            jTextField1.setText(answer);
        }
        else  if (operations == "%")
        {
            result = firstnum / secondnum;
            answer = String.format("%.0f",result);
            jTextField1.setText(answer);
        }       
    }                                         

    
}
