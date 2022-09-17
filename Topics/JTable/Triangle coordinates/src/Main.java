import javax.swing.table.DefaultTableModel;
import java.util.Scanner;

class TriangleTable {
    public static void main(String[] args) {
        // implement me
        Scanner scanner = new Scanner(System.in);
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[] {"X", "Y"});
        while (scanner.hasNext()) {
            model.addRow(new Integer[] {scanner.nextInt(), scanner.nextInt() });
        }

        // do not remove the code below
        TableModelTest.test(model);
    }
}