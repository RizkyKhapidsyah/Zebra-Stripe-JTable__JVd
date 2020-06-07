package com.rk;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class ZebraStripe extends JTable {

    public ZebraStripe(DefaultTableModel model) {
        super(model);
    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component cell = super.prepareRenderer(renderer, row, column);

        cell.setForeground(Color.BLACK);

        if (row % 2 == 0) {
            cell.setBackground(Color.YELLOW);
        } else {
            cell.setBackground(Color.WHITE);
        }

        return cell;
    }
}
