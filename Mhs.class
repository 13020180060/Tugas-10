public class Mhs { 
private String nim; 
private String nama; 
private String jurusan; 
private String kelas; 
private boolean jenisKelamin; 
public Mhs(String nim, String nama) { 
this.nim = nim; 
this.nama = nama; 
} 
public boolean getJenisKelamin() { 
return jenisKelamin; 
} 
public void setJenisKelamin(boolean jenisKelami
n) { 
this.jenisKelamin = jenisKelamin; 
} 
public String getJurusan() { 
return jurusan; 
} 
public void setJurusan(String jurusan) { 
this.jurusan = jurusan; 
} 
public String getKelas() { 
return kelas; 
} 
public void setKelas(String kelas) { 
this.kelas = kelas; 
} 
public String getNama() { 
return nama; 
} 
public void setNama(String nama) { 
this.nama = nama; 
} 
public String getNim() { 
return nim; 
} 
public void setNim(String nim) { 
this.nim = nim; 
} 
} 
// End of varia
bles declaration
public JRadioButton getRbLakiLaki() { 
return rbLakiLaki; 
} 
public JTextField getTxtJurusan() { 
return txtJurusan; 
} 
public JTextField getTxtKelas() { 
return txtKelas; 
} 
public JTextField getTxtNama() { 
return txtNama; 
} 
public JTextField getTxtNim() { 
return txtNim; 
} 
public class FormDokumenMhs extends javax.swing.JFr
ame {
/** Creates new form FormDokumenMhs */ 
public FormDokumenMhs() { 
initComponents(); 
} 
public void refresh(Mhs mhs) { 
lblNim.setText("Nim : " + mhs.getNim()); 
lblNama.setText("Nama : " + mhs.getNama());
lblJurusan.setText("Jurusan : " + mhs.getJu
rusan()); 
lblKelas.setText("Kelas : " + mhs.getKelas(
)); 
if (mhs.getJenisKelamin()) { 
lblJenisKelamin.setText("Jenis Kelamin 
: Pria"); 
} else { 
lblJenisKelamin.setText("Jenis Kelamin 
: Wanita"); 
} 
} 
public cl
ass MhsController {
private FormDokumenMhs formDokumenMhs; 
private FormMhs formMhs; 
private Mhs mhs; 
public MhsController(FormDokumenMhs formDokumenMhs,
,FormMhs formMhs) { 
this.formDokumenMhs = formDokumenMhs; 
this.formMhs=formMhs; 
mhs = new Mhs("10.10.1010", "Testing"); 
formDokumenMhs.refresh(mhs); 
} 
public void updateMhs() { 
mhs.setNim(formMhs.getTxtNim().getText()); 
mhs.setNama(formMhs.getTxtNama().getText())
; 
mhs.setJurusan(formMhs.getTxtJurusan().getT
ext()); 
mhs.setJenisKelamin(formMhs.getRbLakiLaki()
.isSelected()); 
mhs.setKelas(formMhs.getTxtKelas().getText(
)); 
formDokumenMhs.refresh(mhs); 
} 
public class FormMhs extends javax.swing.JFrame {
private MhsController mhsController; 
/** Creates new form FormMhs */ 
public FormMhs() { 
initComponents(); 
} 
public void setMhsController(MhsController mhsContr
oller) { 
this.mhsController = mhsController; 
} 
private void btnUbahActionPerformed(java.awt.event.
ActionEvent evt) {
// TODO add your handling code here: 
mhsController.updateMhs(); 
public class Main {
/** 
* @param args the command line arguments 
*/ 
public static void main(String[] args) { 
// TODO code application logic here 
FormMhs formMhs = new FormMhs(); 
formMhs.setVisible(true); 
FormDokumenMhs formDokumenMhs = new FormDok
umenMhs(); 
formDokumenMhs.setVisible(true); 
MhsController mhsController = new MhsContro
ller(formDokumenMhs, formMhs); 
formMhs.setMhsController(mhsController); 
} 
} 

