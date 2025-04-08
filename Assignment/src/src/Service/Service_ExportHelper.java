package src.Service;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class Service_ExportHelper {

    public static void exportToCSV(JTable table) throws IOException {
        try (
                FileOutputStream fos = new FileOutputStream("src/list.csv"); 
                OutputStreamWriter writer = new OutputStreamWriter(fos, StandardCharsets.UTF_8); 
                BufferedWriter csvWriter = new BufferedWriter(writer)
                
                ) {
            
            //Ghi BOM UTF-8 (3 byte EF BB BF dùng để đánh dấu UTF-8)
            fos.write(0xEF);
            fos.write(0xBB);
            fos.write(0xBF);

            //Lấy dữ liệu trong bảng
            TableModel model = table.getModel();
            
            //Lấy tên lần lượt của các cột từ trái sang phải
            for (int i = 0; i < model.getColumnCount(); i++) {
                csvWriter.write("\"" + model.getColumnName(i) + "\"");
                if (i < model.getColumnCount() - 1) {
                    csvWriter.write(",");
                }
            }
            //Xuống dòng sau khi ghi xong hàng tên cột.
            csvWriter.newLine();

            //Lấy dữ liệu của từng dòng trong bảng
            for (int i = 0; i < model.getRowCount(); i++) {
                //Lấy từng dữ liệu trong dòng
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Object value = model.getValueAt(i, j);
                    csvWriter.write("\"" + (value != null ? value.toString() : "") + "\"");
                    if (j < model.getColumnCount() - 1) {
                        csvWriter.write(",");
                    }
                }
                //Xuống dòng mới sau khi lấy hết dữ liệu
                csvWriter.newLine();
            }
            
            //Đẩy toàn bộ dữ liệu đang tạm thời lưu trong bộ nhớ (buffer) ra file thật
            csvWriter.flush();
            Handle_Notification.announceInfo("Exported CSV successfully (src/list.csv)!");
            //Mở file sau khi hoàn tất
            Desktop.getDesktop().open(new File("src/list.csv"));
        }
    }
}
