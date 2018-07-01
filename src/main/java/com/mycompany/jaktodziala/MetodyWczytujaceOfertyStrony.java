/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jaktodziala;

import com.aspose.pdf.Document;
import com.aspose.pdf.TextFragment;
import com.aspose.pdf.TextFragmentAbsorber;
import com.aspose.pdf.TextFragmentCollection;
import static com.mycompany.jaktodziala.MetodyWczytujaceOfertyReklamy.nazwaFirmy;

/**
 *
 * @author marci
 */
public class MetodyWczytujaceOfertyStrony {
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
    
    public static void CenaSklepu(Document pdfDocument,String Cena)
    {

        TextFragmentAbsorber textFragmentAbsorber = new TextFragmentAbsorber("5,500 zł brutto");
      
        pdfDocument.getPages().accept(textFragmentAbsorber);
        
        TextFragmentCollection textFragmentCollectionNazwa = textFragmentAbsorber.getTextFragments();
        
        for(TextFragment textFragment:(Iterable<TextFragment>)textFragmentCollectionNazwa)
        {
            textFragment.setText(Cena+" zł brutto");
        }
    }
    
    
//    public static void CenaSklepu(Document pdfDocument,String Cena)
//    {
//        
//        TextFragmentAbsorber textFragmentAbsorber = new TextFragmentAbsorber("5,500 zł brutto");
//        
//        pdfDocument.getPages().accept(textFragmentAbsorber);
//        
//        TextFragmentCollection textFragmentCollectionNazwa = textFragmentAbsorber.getTextFragments();
//        
//        for(TextFragment textFragment:(Iterable<TextFragment>)textFragmentCollectionNazwa)
//        {
//            textFragment.setText(Cena+" zł brutto");
//        }
//    }
    public static void CenaStrony(Document pdfDocument,String Cena)
    {
        
        TextFragmentAbsorber textFragmentAbsorber = new TextFragmentAbsorber("3,500 zł brutto");
        
        pdfDocument.getPages().accept(textFragmentAbsorber);
        
        TextFragmentCollection textFragmentCollectionNazwa = textFragmentAbsorber.getTextFragments();
        
        for(TextFragment textFragment:(Iterable<TextFragment>)textFragmentCollectionNazwa)
        {
            textFragment.setText(Cena+" zł brutto");
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
