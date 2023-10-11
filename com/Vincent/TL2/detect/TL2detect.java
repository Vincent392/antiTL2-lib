package com.Vincent.TL2.detect;

import java.awt.Component;
import javax.swing.JOptionPane;

public class TL2detect
{
 // author: Vincent
 // made using: Eclipse IDE + Github Mobile
 //feel free to add this to any mod
    public static void main(final String[] args) {
        //final File f = new File("C:\\Users\\" + System.getProperty("user.home") + "\\AppData\\Roaming\\.minecraft\\TLauncher.exe"); old code
        //if (f.exists()) {
          if (args == "-tl2proxy")) {
            System.out.println("TL2 Detected!");
            System.out.println("BOOT ERR! GIVING WARNING!");
            JOptionPane.showMessageDialog(null, "A boot Error happened!", "Error!", 0);
            System.exit(0);
        }
        else {
            System.out.println("Started okay!");
        }
    }
}
