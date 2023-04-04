package com.Vincent.TL2.detect; //feel free to add this to any mod

import java.awt.Component;
import javax.swing.JOptionPane;
import java.io.File;

public class TL2detect
{
    public static void main(final String[] args) {
        final File f = new File("C:\\Users\\" + System.getProperty("user.home") + "\\AppData\\Roaming\\.minecraft\\TLauncher.exe");
        if (f.exists()) {
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
