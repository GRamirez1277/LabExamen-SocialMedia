/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen1;
import javax.swing.JTextArea;
import java.io.OutputStream;

class TextAreaOutputStream extends OutputStream {
    private JTextArea textArea;

    public TextAreaOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    public void write(int b) {
        textArea.append(String.valueOf((char) b));
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

    public void write(byte[] b, int off, int len) {
        String s = new String(b, off, len);
        textArea.append(s);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}