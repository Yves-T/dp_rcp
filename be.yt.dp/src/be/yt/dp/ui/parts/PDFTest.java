package be.yt.dp.ui.parts;

import java.io.FileOutputStream;
import java.net.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Document document = new Document();

		try {
			PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\ytalboom\\Documents\\Image.pdf"));
			document.open();

			Image image1 = Image.getInstance("icons/042.png");
			document.add(image1);

//			String imageUrl = "http://jenkov.com/images/"
//					+ "20081123-20081123-3E1W7902-small-portrait.jpg";
//
//			Image image2 = Image.getInstance(new URL(imageUrl));
//			document.add(image2);

			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
