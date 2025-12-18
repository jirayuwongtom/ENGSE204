package Lab5_11;
import java.util.Scanner;

class Document {
	protected String title;
	public Document(String title) {
		this.title = title;
	}
	public void displayDetail() {
		System.out.println("Document : " + title);
	}
}

class TextDocument extends Document {
	protected int wordCount;
	public TextDocument(String title , int wordCount) {
		super(title);
		this.wordCount = wordCount;
	}
	@Override
	public void displayDetail() {
		System.out.println("Text : " + title + " , Words : " + wordCount);
	}
}

class PDFDocument extends Document {
	protected int pageCount;
	public PDFDocument(String title , int pageCount) {
		super(title);
		this.pageCount = pageCount;
	}
	@Override
	public void displayDetail() {
		System.out.println("PDF : " + title + " , Pages" + pageCount);
	}
}

public class Lab5_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String textTitle = input.nextLine();
		int textWord = input.nextInt();
		input.nextLine();
		String pdfTitle = input.nextLine();
		int pdfPage = input.nextInt();
		
		input.nextLine();
		
		String textTitle1 = input.nextLine();
		int textWord1 = input.nextInt();
		input.nextLine();
		String pdfTitle1 = input.nextLine();
		int pdfPage1 = input.nextInt();
		
		
		Document TextDocument1 = new TextDocument(textTitle , textWord);
		Document PDFDocument1 = new PDFDocument(pdfTitle , pdfPage);
		Document TextDocument2 = new TextDocument(textTitle1 , textWord1);
		Document PDFDocument2 = new PDFDocument(pdfTitle1 , pdfPage1);
		Document[] d = {TextDocument1 , PDFDocument1 , TextDocument2 , PDFDocument2};
		
		int totalPages = 0;
		for(int i = 0; i < d.length; i++) {
			if(d[i] instanceof PDFDocument) {
				PDFDocument pdf = (PDFDocument) d[i];
				totalPages = totalPages + pdf.pageCount;
			}
		}
		
		for(int i = 0; i < d.length; i++) {
			d[i].displayDetail();
		}
		 System.out.println("Total Pages : " + totalPages);
		input.close();
	}
}
