
import java.awt.*;
import java.awt.event.*;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class FrameNA extends Frame {

    JRadioButton rbASD, rbPemlan, rbMatkomlan, rbProbstat;
    ButtonGroup rbg;
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    Button btnHitung, btnTampil;
    TextArea taNilai;
    String asd = "-", pemlan = "-", matkomlan = "-", probstat = "-";

    public FrameNA() {
        setLayout(null);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(100, 30, 170, 20);

        rbg = new ButtonGroup();

        rbASD = new JRadioButton("ASD", false);
        this.add(rbASD).setBounds(30, 60, 50, 20);
        rbPemlan = new JRadioButton("Pemlan", false);
        this.add(rbPemlan).setBounds(80, 60, 70, 20);
        rbMatkomlan = new JRadioButton("Matkomlan", false);
        this.add(rbMatkomlan).setBounds(150, 60, 90, 20);
        rbProbstat = new JRadioButton("Probstat", false);
        this.add(rbProbstat).setBounds(240, 60, 80, 20);

        rbg.add(rbASD);
        rbg.add(rbPemlan);
        rbg.add(rbMatkomlan);
        rbg.add(rbProbstat);

        lbTugas = new Label("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(100, 90, 50, 20);
        lbKuis = new Label("Kuis : ");
        add(lbKuis);
        lbKuis.setBounds(100, 120, 50, 20);
        lbUTS = new Label("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(100, 150, 50, 20);
        lbUAS = new Label("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(100, 180, 50, 20);
        lbHasil = new Label("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(100, 210, 50, 20);

        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(170, 90, 60, 20);
        txtKuis = new TextField("0");
        add(txtKuis);
        txtKuis.setBounds(170, 120, 60, 20);
        txtUTS = new TextField("0");
        add(txtUTS);
        txtUTS.setBounds(170, 150, 60, 20);
        txtUAS = new TextField("0");
        add(txtUAS);
        txtUAS.setBounds(170, 180, 60, 20);
        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(170, 210, 60, 20);

        btnHitung = new Button("Hitung");
        add(btnHitung);
        btnHitung.setBounds(130, 240, 100, 20);

        taNilai = new TextArea();
        add(taNilai);
        taNilai.setBounds(70, 270, 220, 130);

        btnTampil = new Button("Tampilkan Semua Nilai Matkul");
        add(btnTampil);
        btnTampil.setBounds(70, 410, 220, 20);
    }
}
