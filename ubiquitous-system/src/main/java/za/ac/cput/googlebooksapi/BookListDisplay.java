/*
 *     
 * pass type voluems to be looped through as a list 
 */
package za.ac.cput.googlebooksapi;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import com.google.api.services.books.model.Volume;
import com.google.api.services.books.model.Volumes;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Peter Buckingham
 */
public class BookListDisplay {

    /**
     *
     * @param volumes
     */
    public void diplay(Volumes volumes)//passed a booklist to display//passed a voulme list now
    {
        ArrayList <Book> bookArrayList = new ArrayList<>();
        JTable bookListJTable;
        
        java.util.List<Volume> listOfVolumes = null;
        JFrame bookListDisplayJFrame = new JFrame("Library System - Search Results : ");
        JPanel jPanel = new JPanel();

        System.out.println(volumes.size());

        listOfVolumes = volumes.getItems();

        int numberOfVolumes = listOfVolumes.size();
        if (numberOfVolumes == 0) {
            System.out.println("Nothing in list of volumes!");
        }else
        {

                String[][] tempDataBookRow = new String[10][4];  //[0][0]
                String[] tempDataColNames = {"Number : ", "Title : ", "Author : ", " Date of Publication : "};

                int colMax = tempDataBookRow[0].length;
                for (int i = 0; i < numberOfVolumes; i++) {
                    int colCounter = 0;
                    System.out.println("( " + (i + 1) + " of " + numberOfVolumes + " )" + " Title : " + listOfVolumes.get(i).getVolumeInfo().getTitle()); //output ////: ( 1 of 10 ) Title : Why To Kill a Mockingbird Matters      
                    tempDataBookRow[i][colCounter] = String.valueOf(i);
                    colCounter++;
                    tempDataBookRow[i][colCounter] = volumes.getItems().get(i).getVolumeInfo().getTitle();
                    colCounter++;
                    tempDataBookRow[i][colCounter] = String.valueOf(volumes.getItems().get(i).getVolumeInfo().getAuthors());
                    colCounter++;
                    tempDataBookRow[i][colCounter] = volumes.getItems().get(i).getVolumeInfo().getPublishedDate();
                }
        
                int counter =0;
                String title = "Not Found";
                String subTitle = "Not Found";
                String ISBN  = "Not Found" ;
                String authors = "Not Found";
                String description = "Not Found";
                String ratings = "Not Found";
                String imagelLinks = "Not Found";
                
                for  (Volume volume : volumes.getItems()) 
                {
                    
                    Volume.VolumeInfo volumeInfo = volume.getVolumeInfo();
                    try {
                       title = volumeInfo.getTitle();
                        if (volumeInfo.getTitle()!=null) {
                            title = volumeInfo.getTitle();
                        }
                        if (volumeInfo.getSubtitle()!= null) {
                            subTitle = volumeInfo.getSubtitle();
                        }
                       //ISBN  if (authors != null && !authors.isEmpty())
                       if (volumeInfo.getIndustryIdentifiers().toString()!= null) {
                            ISBN = volumeInfo.getIndustryIdentifiers().toString();
                        }
                        if (volumeInfo.getAuthors()!=null) {
                            authors = volumeInfo.getAuthors().toString();
                        }
                        
                        if (volumeInfo.getDescription() !=null && volumeInfo.getDescription().length() > 0) {
                            description = volumeInfo.getDescription();
                        }
                        // Ratings (if any).
          
                        //ratings = volumeInfo.getRatingsCount().toString();
                        if (volumeInfo.getRatingsCount() != null && volumeInfo.getRatingsCount() > 0) {
                            int fullRating = (int) Math.round(volumeInfo.getAverageRating().doubleValue());
                            ratings = String.valueOf(fullRating);                           
                        }
                        
                     //   imagelLinks = volumeInfo.getImageLinks().toString();//can get large image must write contdtion incase it dont exsist
                        if (volumeInfo.getImageLinks().toString()!= null) {
                            imagelLinks = imagelLinks = volumeInfo.getImageLinks().toString();
                        }
                       
                        bookArrayList.add(new Book(counter, title, subTitle , ISBN, authors, description,ratings , imagelLinks));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                  // bookArrayList.add(new Book(counter, volumeInfo.getTitle(), "", authors, volumeInfo.getDescription(),ratings , volumeInfo.getImageLinks().toString()));
                    counter++;
                }
        
        
                //instance table model make non editable and double clickable 
                DefaultTableModel tableModel = new DefaultTableModel(tempDataBookRow, tempDataColNames) {

                @Override
                    public boolean isCellEditable(int row, int column) {
                    //all cells false
                    return false;
                    }
                };

                bookListJTable = new JTable(tempDataBookRow, tempDataColNames);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                Dimension jframeScreenSize = new Dimension(screenSize.width / 2, screenSize.height / 2);
                bookListDisplayJFrame.setSize(jframeScreenSize.width, jframeScreenSize.height);
                bookListDisplayJFrame.setSize(jframeScreenSize);
                jPanel.setSize(jframeScreenSize);

                int colSize = bookListDisplayJFrame.getSize().width / 3;

                TableColumnModel columnModel = bookListJTable.getColumnModel();
                int columnCount = bookListJTable.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    columnModel.getColumn(i).setPreferredWidth(colSize);
                }


                JScrollPane scroll = new JScrollPane(bookListJTable);
                bookListJTable.setFillsViewportHeight(true);

                JLabel labelHead = new JLabel("List of Results");
                labelHead.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));

                bookListDisplayJFrame.getContentPane().add(labelHead,BorderLayout.PAGE_START);
                //add table to frame
                bookListDisplayJFrame.getContentPane().add(scroll,BorderLayout.CENTER);

                bookListDisplayJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                bookListDisplayJFrame.add(scroll);
                bookListJTable.setModel(tableModel);


                bookListDisplayJFrame.setVisible(true);
                bookListJTable.addMouseListener(new MouseAdapter(){
                    @Override
                    public void  mouseClicked(MouseEvent event) {
                        //set book
                        System.err.println("Event trigered : " + event);
                        if (event.getClickCount() == 2 && bookListJTable.getSelectedRow() != -1) {
                    // your valueChanged overridden method 

                       BookDisplay currentBookDisplay = new BookDisplay();
                            try {
                                 currentBookDisplay.setBook(bookArrayList.get(Integer.valueOf(bookListJTable.getValueAt(bookListJTable.getSelectedRow(), 0).toString())));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                      // currentBookDisplay.setBook(bookArrayList.get(Integer.valueOf(bookListJTable.getValueAt(bookListJTable.getSelectedRow(), 0).toString())));
                        try {
                            //all frames to a array
                            Window[] allFrames = Frame.getWindows();

                            //Iterate through the allFrames array
                            for(Window fr : allFrames){
                            //uncomment the below line to see frames names and properties/atr.
                            System.out.println(fr);        

                            //to get specific frame name
                            String specificFrameName = fr.getClass().getName();

                            //if found frame that I want I can close or any you want
                            //GUIS.CheckForCustomer is my specific frame name that I want to close.
                            if(specificFrameName.equals("Libirary System - Book Details : ")){
                            //close the frame
                            fr.dispose();
                                }
                            }


                            currentBookDisplay.displayBook();
                        } catch (IOException ex) {
                            Logger.getLogger(BookListDisplay.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        // do some actions here, for example
                        // print first column value from selected row
                        System.out.println(bookListJTable.getValueAt(bookListJTable.getSelectedRow(), 0).toString());
                        }
                    }    
                    
                });
   
        }
    }
   
    
}
