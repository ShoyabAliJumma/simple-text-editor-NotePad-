
//    import javax .swing.*;
////import java.awt.*;
//            import java.awt.event.ActionEvent;
//            import java.awt.event.ActionListener;
//    import java.awt.print.PrinterException;
//    import java.io.*;
//
//    public class SimpleTextEditor implements ActionListener {
//        JFrame frame; //FOR FRAME
//        JTextArea jTextArea; //FOR TEXT AREA
//        JMenuBar jMenuBar; //for Menu bAR
//        JMenu file;
//        JMenu Edit;
//        JMenu Close;
//        JMenuItem NewFile;
//        JMenuItem OpenFile;
//        JMenuItem SaveFile;
//        JMenuItem PrintFile;
//        JMenuItem cut;
//        JMenuItem copy;
//        JMenuItem paste;
//        JMenuItem closeEditor;
//
//        SimpleTextEditor() {
//            //creating the frame
//            frame = new JFrame("Simple Text Editor");
//            frame.setBounds(0, 0, 800, 1000);
//            //Initialising text area
//            jTextArea = new JTextArea("Welcome to the Editor");
//            //Creating menuBar
//            jMenuBar = new JMenuBar();
//            // creating different menu
//            file = new JMenu("file");
//            Edit = new JMenu("Edit");
//            Close = new JMenu("Close");
//            //adding menu in to the menu bar
//            jMenuBar.add(file);
//            jMenuBar.add(Edit);
//            jMenuBar.add(Close);
//            //creating the menu item for file
//            OpenFile = new JMenuItem("Open");
//            OpenFile.addActionListener(this);
//
//            SaveFile = new JMenuItem("Save");
//            SaveFile.addActionListener(this);
//
//            NewFile = new JMenuItem("New");
//            NewFile.addActionListener(this);
//
//            PrintFile = new JMenuItem("Print");
//            PrintFile.addActionListener(this);
//            //creating menu item for close
//            closeEditor = new JMenuItem("Close");
//            Close.add(closeEditor);
//            // creating menu items for edit
//            copy = new JMenuItem("copy");
//            cut = new JMenuItem("cut");
//            paste = new JMenuItem("paste");
//            //adding menu item int edit menu
//            Edit.add(cut);
//            Edit.add(copy);
//            Edit.add(paste);
//            //adding menu items into file menu
//            file.add(NewFile);
//            file.add(OpenFile);
//            file.add(SaveFile);
//            file.add(PrintFile);
//            //adding menus into the menu bar
//            frame.setJMenuBar(jMenuBar);
//            //adding textArea
//            frame.add(jTextArea);
//            //when we click the exit button it stop over execution of programme
//            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//            frame.setVisible(true);
//        }
//
//        public static void main(String[] args) {
//            SimpleTextEditor editor = new SimpleTextEditor();
//        }
//
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//            String s = e.getActionCommand();
//            if (s.equals("copy")) {
//                jTextArea.copy();
//            } else if (s.equals("cut")) {
//                jTextArea.cut();
//            } else if (s.equals("paste")) {
//                jTextArea.paste();
//
//                try {
//                    jTextArea.print();
//                } catch (PrinterException ex) {
//                    throw new RuntimeException(ex);
//                }
//            } else if (s.equals("New")) {
//                jTextArea.setText("");
//            } else if (s.equals("Close")) {
//                System.exit(1);
//                //frame.setVisible(false);
//            } else if (s.equals("Open")) {
//                JFileChooser jFileChooser=new JFileChooser("C");
//                int ans=jFileChooser.showOpenDialog(null);
//                if(ans==jFileChooser.APPROVE_OPTION) {
//                    File file = new File(jFileChooser.getSelectedFile().getAbsolutePath());
//                    String s1 = "", s2 = "";
//                    try {
//                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//                   s2=bufferedReader.readLine();
//                   while ((s1=bufferedReader.readLine())!=null){
//                       s2+=s1+"\n";
//                   }
//                   jTextArea.setText(s2);
//                    }catch (FileNotFoundException ex){
//                        throw new RuntimeException(ex);
//                    }
//                    catch (IOException ex){
//                        throw new RuntimeException(ex);
//                    }
//                } else if (s.equals("Save")) {
//
//                    JFileChooser jFileChooser1=new JFileChooser("C");
//                    int ans1 = jFileChooser1.showOpenDialog(null);
//                if(ans1==jFileChooser1.APPROVE_OPTION)
//                {
//                    File file1=new File(jFileChooser1.getSelectedFile().getAbsolutePath());
//                    BufferedWriter writer=null;
//                    try {
//                        writer = new BufferedWriter(new FileWriter(file1, false));
//                        writer.write((jTextArea.getText()));
//                        writer.flush();
//                    }catch (IOException ex){
//                        throw new RuntimeException(ex);
//                    }
//                }
//                }
//            }
//        }
//    }
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.*;

public class SimpleTextEditor  implements ActionListener{
    JFrame frame;
    JTextArea jTextArea;
    JMenuBar jMenuBar;
    JMenu File;
    JMenu Edit;
    JMenu Close;
    JMenuItem OpenFile,NewFile,SaveFile,PrintFile;
    JMenuItem Cut,Copy,Paste;
    JMenuItem CloseEditor;
    SimpleTextEditor()
    {
        // created the frame
        frame=new JFrame("Simple Text Editor");
        frame.setBounds(0,0,1000,800);
        jTextArea=new JTextArea("Welcome to the simple text editor");
        frame.add(jTextArea);
        jMenuBar=new JMenuBar();
        File=new JMenu("File");
        Edit=new JMenu("Edit");
        Close=new JMenu("Close");

        OpenFile=new JMenuItem("Open");
        OpenFile.addActionListener(this);

        SaveFile=new JMenuItem("Save");
        SaveFile.addActionListener(this);

        NewFile=new JMenuItem("New");
        NewFile.addActionListener(this);


        PrintFile=new JMenuItem("Print");
        PrintFile.addActionListener(this);

        Cut=new JMenuItem("Cut");
        Cut.addActionListener(this);

        Copy=new JMenuItem("Copy");
        Copy.addActionListener(this);

        Paste=new JMenuItem("Paste");
        Paste.addActionListener(this);

        CloseEditor=new JMenuItem("Close");
        CloseEditor.addActionListener(this);

        File.add(NewFile);
        File.add(OpenFile);
        File.add(SaveFile);
        File.add(PrintFile);

        Edit.add(Cut);
        Edit.add(Copy);
        Edit.add(Paste);

        Close.add(CloseEditor);


        jMenuBar.add(File);
        jMenuBar.add(Edit);
        jMenuBar.add(Close);
        frame.setJMenuBar(jMenuBar);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);


    }
    public static void main(String[] args) {
        SimpleTextEditor f=new SimpleTextEditor();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String s=e.getActionCommand();
        if(s.equals("Copy"))
        {
            jTextArea.copy();
        }else if(s.equals("Cut"))
        {
            jTextArea.cut();
        }else if(s.equals("Paste"))
        {
            jTextArea.paste();
        }else if(s.equals("Print"))
        {
            try {
                jTextArea.print();
            } catch (PrinterException ex) {
                throw new RuntimeException(ex);
            }
        }else if(s.equals("New"))
        {
            jTextArea.setText("");
        }else if(s.equals("Close"))
        {
            System.exit(1);
        }else if(s.equals("Open"))
        {
            JFileChooser jFileChooser=new JFileChooser("C:");

            int ans=jFileChooser.showOpenDialog(null);
            if(ans==JFileChooser.APPROVE_OPTION){
                File file=new File(jFileChooser.getSelectedFile().getAbsolutePath());
                String s1="",s2="";
                try {
                    BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
                    s2=bufferedReader.readLine();
                    while((s1=bufferedReader.readLine())!=null)
                    {
                        s2+=s1+"\n";
                    }
                    jTextArea.setText(s2);
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }else if(s.equals("Save"))
        {
            JFileChooser jFileChooser=new JFileChooser("C:");
            int ans=jFileChooser.showOpenDialog(null);
            if(ans==jFileChooser.APPROVE_OPTION)
            {
                File file=new File(jFileChooser.getSelectedFile().getAbsolutePath());
                BufferedWriter writer=null;
                try {
                    writer=new BufferedWriter(new FileWriter(file,false));
                    writer.write((jTextArea.getText()));
                    writer.flush();
                    writer.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}