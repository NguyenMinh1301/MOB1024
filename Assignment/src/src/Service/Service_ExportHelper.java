package src.Service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class Service_ExportHelper {

    public static void exportToCSV(JTable table) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("src/list.csv"); OutputStreamWriter writer = new OutputStreamWriter(fos, StandardCharsets.UTF_8); BufferedWriter csvWriter = new BufferedWriter(writer)) {

            fos.write(0xEF);
            fos.write(0xBB);
            fos.write(0xBF);

            TableModel model = table.getModel();

            for (int i = 0; i < model.getColumnCount(); i++) {
                csvWriter.write("\"" + model.getColumnName(i) + "\"");
                if (i < model.getColumnCount() - 1) {
                    csvWriter.write(",");
                }
            }
            csvWriter.newLine();

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Object value = model.getValueAt(i, j);
                    csvWriter.write("\"" + (value != null ? value.toString() : "") + "\"");
                    if (j < model.getColumnCount() - 1) {
                        csvWriter.write(",");
                    }
                }
                csvWriter.newLine();
            }

            csvWriter.flush();
            Handle_Notification.announceInfo("Exported CSV successfully (src/list.csv)!");
        }
    }
}
