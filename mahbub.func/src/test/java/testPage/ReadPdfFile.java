package testPage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;
@Test
public class ReadPdfFile {
	public static void pdfRead() throws IOException, IOException {
		FileInputStream obj = new FileInputStream("C:/Users/alvee/Desktop/linuxcommands.pdf");
		PDDocument objDoc =PDDocument.load(obj);
		PDFTextStripper objPDFStrp = new PDFTextStripper();
		String pdfContent = objPDFStrp.getText(objDoc);
		System.out.println(pdfContent);
	}

}
