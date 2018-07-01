
package com.mycompany.jaktodziala;

import com.aspose.pdf.Document;
import com.aspose.pdf.Font;
import com.aspose.pdf.FontRepository;
import com.aspose.pdf.TextFragment;
import com.aspose.pdf.TextFragmentAbsorber;
import com.aspose.pdf.TextFragmentCollection;
import javax.swing.JOptionPane;


public class MetodyWczytujaceOfertyReklamy
{
    public static String nazwaFirmy=null;
    public static void NazwaFirmy(Document pdfDocument,String Oferta)
    {
           
//        String Oferta = JOptionPane.showInputDialog("Podaj Nazwe Firmy do której jest skierowana Oferta: ");
        
        TextFragmentAbsorber textFragmentAbsorberNazwaFirmy = new TextFragmentAbsorber("Nazwa Firmy");
        nazwaFirmy=Oferta;
        pdfDocument.getPages().accept(textFragmentAbsorberNazwaFirmy);
        
        TextFragmentCollection textFragmentCollectionNazwa = textFragmentAbsorberNazwaFirmy.getTextFragments();
        
        for(TextFragment textFragment:(Iterable<TextFragment>)textFragmentCollectionNazwa)
        {
            textFragment.setText(Oferta);
        }
    }
    
    public static void Fejs(Document pdfDocument,String fb)
    {
//        String fb = JOptionPane.showInputDialog("Podaj ile wpisów ma być na fejsbuku: ");
        
        TextFragmentAbsorber textFragmentAbsorber = new TextFragmentAbsorber("fb wpisów miesięcznie");
        
        pdfDocument.getPages().accept(textFragmentAbsorber);
        
        TextFragmentCollection textFragmentCollection = textFragmentAbsorber.getTextFragments();
     
        char firstPlace = fb.charAt(0);
        char secoundPlace = fb.charAt(2);   
        char sekundo=fb.charAt(1);
        System.out.println(firstPlace);
        System.out.println(secoundPlace);
        System.out.println(sekundo);
        for(TextFragment textFragment:(Iterable<TextFragment>)textFragmentCollection)
        {
            if(fb.length()>3)
            {
                  textFragment.setText(fb+" wpisów miesięcznie");
            }
            else if(fb.length()<=3&&(firstPlace=='1'||firstPlace=='2'||firstPlace=='3')&&(secoundPlace=='2'||secoundPlace=='3'||secoundPlace=='4'))
            {
                textFragment.setText(fb+" wpisy miesięcznie"); 
            }
            else if(fb.length()<=3&&(secoundPlace!='2'||secoundPlace!='3'||secoundPlace!='4'))
            {
                textFragment.setText(fb+" wpisów miesięcznie"); 
            }
            
        }
    }
    
    public static void Instagram(Document pdfDocument,String instagram)
    {
//        String instagram = JOptionPane.showInputDialog("Podaj ile wpisów ma być na Instagramie: ");
        
        TextFragmentAbsorber textFragmentAbsorberInsta = new TextFragmentAbsorber("insta wpisów miesięcznie");
        
        pdfDocument.getPages().accept(textFragmentAbsorberInsta);
        
        TextFragmentCollection textFragmentCollectionInsta = textFragmentAbsorberInsta.getTextFragments();
        
        
        char firstPlace = instagram.charAt(0);
        char secoundPlace = instagram.charAt(2); 
        for(TextFragment textFragment:(Iterable<TextFragment>)textFragmentCollectionInsta)
        {
                if(instagram.length()>3)
            {
                  textFragment.setText(instagram+" wpisów miesięcznie");
            }
            else if(instagram.length()<=3&&(firstPlace=='1'||firstPlace=='2'||firstPlace=='3')&&(secoundPlace=='2'||secoundPlace=='3'||secoundPlace=='4'))
            {
                textFragment.setText(instagram+" wpisy miesięcznie"); 
            }
            else if(instagram.length()<=3&&(secoundPlace!='2'||secoundPlace!='3'||secoundPlace!='4'))
            {
                textFragment.setText(instagram+" wpisów miesięcznie"); 
            }
                
        }
        
    }
    
    public static void Blog(Document pdfDocument,String blog)
    {
//        String blog = JOptionPane.showInputDialog("Podaj ile wpisów na blogu będzie umieszczonych: ");
        
        TextFragmentAbsorber textFragmentAbsorberblog = new TextFragmentAbsorber("blog wpisów miesięcznie");
        
        pdfDocument.getPages().accept(textFragmentAbsorberblog);
        
        TextFragmentCollection textFragmentCollectionBlog = textFragmentAbsorberblog.getTextFragments();
        
        
        
        char firstPlace = blog.charAt(0);
        char secoundPlace = blog.charAt(2); 
        for(TextFragment textFragment:(Iterable<TextFragment>)textFragmentCollectionBlog)
        {
                if(blog.length()>3)
            {
                  textFragment.setText(blog+" wpisów miesięcznie");
            }
            else if(blog.length()<=3&&(firstPlace=='1'||firstPlace=='2'||firstPlace=='3')&&(secoundPlace=='2'||secoundPlace=='3'||secoundPlace=='4'))
            {
                textFragment.setText(blog+" wpisy miesięcznie"); 
            }
            
            else if(blog.length()<=3&&(secoundPlace!='2'||secoundPlace!='3'||secoundPlace!='4'))
            {
                textFragment.setText(blog+" wpisów miesięcznie"); 
            }
        }
        
        
    }
    
    public static void platnaReklama(Document pdfDocument,String platnaReklama)
    {
//         String platnaReklama = JOptionPane.showInputDialog("Podaj ile kampani odbędzie sie w postaci Płatnej reklamy: ");
        
        TextFragmentAbsorber textFragmentAbsorberplatnaReklama = new TextFragmentAbsorber("platna kampanie reklamowe miesięcznie");
        
        pdfDocument.getPages().accept(textFragmentAbsorberplatnaReklama);
        
        TextFragmentCollection textFragmentCollectionplatnaReklama = textFragmentAbsorberplatnaReklama.getTextFragments();
        
        
        char firstPlace = platnaReklama.charAt(0);
        char secoundPlace = platnaReklama.charAt(2); 
        for(TextFragment textFragment:(Iterable<TextFragment>)textFragmentCollectionplatnaReklama)
        {
                if(platnaReklama.length()>3)
            {
                  textFragment.setText(platnaReklama+" kampanii reklamowych miesięcznie");
            }
            else if(platnaReklama.length()<=3&&(firstPlace=='1'||firstPlace=='2'||firstPlace=='3')&&(secoundPlace=='2'||secoundPlace=='3'||secoundPlace=='4'))
            {
                textFragment.setText(platnaReklama+" kampanie reklamowe miesięcznie"); 
            }
            
            else if(platnaReklama.length()<=3&&(secoundPlace!='2'||secoundPlace!='3'||secoundPlace!='4'))
            {
                textFragment.setText(platnaReklama+" kampanii reklamowych miesięcznie"); 
            }
        }
    }
    public static void Cena(Document pdfDocument,String cena)
    {
                 
        
//        String cena = JOptionPane.showInputDialog("Podaj Cene: ");
        
        TextFragmentAbsorber textFragmentAbsorberCena = new TextFragmentAbsorber("Cenaoferty zł brutto - mies.");
//        com.aspose.pdf.Font font = FontRepository.findFont("Arial");
        pdfDocument.getPages().accept(textFragmentAbsorberCena);
//        textFragmentAbsorberCena.applyForAllFragments(font);
        
        TextFragmentCollection textFragmentCollectionCena = textFragmentAbsorberCena.getTextFragments();
    
        
        
        for(TextFragment textFragment:(Iterable<TextFragment>)textFragmentCollectionCena)
        {
            
            textFragment.setText(cena+" zł brutto - mies.");
            
                
          
        }
    }
    
    
    public static void DataOferty(Document pdfDocument,String data)
    {
           
        
        TextFragmentAbsorber textFragmentAbsorber = new TextFragmentAbsorber("dzienoferty");
      
        pdfDocument.getPages().accept(textFragmentAbsorber);
        
        TextFragmentCollection textFragmentCollectionNazwa = textFragmentAbsorber.getTextFragments();
        
        for(TextFragment textFragment:(Iterable<TextFragment>)textFragmentCollectionNazwa)
        {
            textFragment.setText(data+"r.");
        }
    }
    
    public static void AutorOferty(Document pdfDocument,String autor)
    {
           
        
        TextFragmentAbsorber textFragmentAbsorber = new TextFragmentAbsorber("imienazwisko");
      
        pdfDocument.getPages().accept(textFragmentAbsorber);
        
        TextFragmentCollection textFragmentCollectionNazwa = textFragmentAbsorber.getTextFragments();
        
        for(TextFragment textFragment:(Iterable<TextFragment>)textFragmentCollectionNazwa)
        {
            textFragment.setText(autor);
        }
    }
    
    
}
