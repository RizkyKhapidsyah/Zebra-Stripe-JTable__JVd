package com.rk;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FormUtama extends JFrame {

    ZebraStripe table;
    JScrollPane scrollTable;

    public FormUtama() {
        super("Warna Row Selang-Seling Pada Tabel");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        String data[][] = {
                {"1", "Rizky Khapidsyah", "Medan"}, {"2", "Dessy Puspita Sari", "Medan"},
                {"3", "Khairina El-Tifani", "Medan"}, {"4", "Falih Robbiansyah", "Medan"}
        };
        String col[] = {"No.", "Nama", "Kota"};
        DefaultTableModel model = new DefaultTableModel(data, col);

        table = new ZebraStripe(model);
        scrollTable = new JScrollPane(table);

        scrollTable.setPreferredSize(new Dimension(400, 200));
        getContentPane().add(scrollTable, BorderLayout.NORTH);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
