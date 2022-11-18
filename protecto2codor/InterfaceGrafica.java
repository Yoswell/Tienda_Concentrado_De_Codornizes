package protecto2codor;
//--Autor: Yoswel Badilla Toruño_31 de octubre del 2022--//
//---Librerias a utilizar--//
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class InterfaceGrafica extends javax.swing.JFrame {
    
    //--Declaracion de variables--//
    public String polluelos;
    public String jovenes;
    public String adultos;
    public String huevos;
    public String convertString;
    public String convertStringTwo;
    public String tot1, tot2, tot3;
    char validarSoloNumeros;
    
    //--Inicializamos las siguietes variables con los precios de los sacos--//
    public int prec1 = 5840; //--Precio del saco de polluelos
    public int prec2 = 8045; //--Precio del saco de jovenes
    public int prec3 = 13200; //--Precio del saco de adultos
    private int total = 0; //--Variable para almacenar la suma de cantidades
    private double totalFinal;
    double porcentajePUnidad = 20.0/300, descuento; //Esta formula es para sacar el porcentaje de descuento correspondiente que le toca a cada huevo

    public InterfaceGrafica() {
        initComponents();
        this.setTitle("TIENDA SURTIDORA DE ALIMENTO PARA CODORNIZES"); //Asiganmos este titulo para la interface
        this.setLocationRelativeTo(this);                                                                 //Su ubicación ssera en el centro de la pntalla de la pc
        Image loge = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/codorniz.png")); //Le ponemos una imagen a nuestros JPanel redondo, en medio del titulo
        codorLogo.setIcon(new ImageIcon(loge.getScaledInstance(codorLogo.getWidth(), codorLogo.getHeight(), Image.SCALE_SMOOTH))); //Aca le asignamos la magen al  JPanel
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contenedorLogo = new protecto2codor.BordesRedondos();
        codorLogo = new javax.swing.JLabel();
        contenedorTitulo = new protecto2codor.BordesRedondos();
        tituloLabel = new javax.swing.JLabel();
        bordesRedondos3 = new protecto2codor.BordesRedondos();
        seccionUno = new protecto2codor.BordesRedondos();
        contenedorDatos = new protecto2codor.BordesRedondos();
        polluelosLabel = new javax.swing.JLabel();
        jovenesLabel = new javax.swing.JLabel();
        adultosLabel = new javax.swing.JLabel();
        huevosLabel = new javax.swing.JLabel();
        contenedorTextPolluelos = new protecto2codor.BordesRedondos();
        cantidadPolluelosTextF = new javax.swing.JTextField();
        contenedorTextJovenes = new protecto2codor.BordesRedondos();
        cantidadJovenesTextF = new javax.swing.JTextField();
        contenedorTextAdultos = new protecto2codor.BordesRedondos();
        cantidadAdultosTextF = new javax.swing.JTextField();
        contenedorTextHuevos = new protecto2codor.BordesRedondos();
        cantidadHuevosTextF = new javax.swing.JTextField();
        contenedorGuardar = new protecto2codor.BordesRedondos();
        guardarDatosBoton = new javax.swing.JButton();
        bordesRedondos2 = new protecto2codor.BordesRedondos();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        seccionDos = new protecto2codor.BordesRedondos();
        contenedorDatosImprimir = new protecto2codor.BordesRedondos();
        contenedorCalcular = new protecto2codor.BordesRedondos();
        mostrarPolluelos = new javax.swing.JLabel();
        mostrarJovenes = new javax.swing.JLabel();
        mostrarAdultos = new javax.swing.JLabel();
        mostrarHuevos = new javax.swing.JLabel();
        huevsLabelNombre = new javax.swing.JLabel();
        adultLabelNombre = new javax.swing.JLabel();
        jovLabelNombre = new javax.swing.JLabel();
        pollLabelNombre = new javax.swing.JLabel();
        precioPolluelos = new javax.swing.JLabel();
        descuentoHuevos = new javax.swing.JLabel();
        precioJovenes = new javax.swing.JLabel();
        precioAdultos = new javax.swing.JLabel();
        TotalConDesc = new javax.swing.JLabel();
        totalSinDesc = new javax.swing.JLabel();
        mostrarConDesc = new javax.swing.JLabel();
        mostrarSinDesc = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bordesRedondos1 = new protecto2codor.BordesRedondos();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedorLogo.setBackground(new java.awt.Color(137, 83, 43));
        contenedorLogo.setRoundBottomLeft(200);
        contenedorLogo.setRoundBottomRight(200);
        contenedorLogo.setRoundTopLeft(200);
        contenedorLogo.setRoundTopRight(200);
        contenedorLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contenedorLogo.add(codorLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 110));

        jPanel1.add(contenedorLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 180, 170));

        contenedorTitulo.setBackground(new java.awt.Color(137, 83, 43));
        contenedorTitulo.setRoundBottomLeft(30);
        contenedorTitulo.setRoundBottomRight(30);
        contenedorTitulo.setRoundTopLeft(30);
        contenedorTitulo.setRoundTopRight(30);
        contenedorTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloLabel.setBackground(new java.awt.Color(137, 83, 43));
        tituloLabel.setFont(new java.awt.Font("Courier New", 1, 30)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(204, 204, 204));
        tituloLabel.setText("   BIENVENIDO A LA               TIENDA CODOR FELÍZ");
        contenedorTitulo.add(tituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 940, 50));

        jPanel1.add(contenedorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 970, 70));

        bordesRedondos3.setBackground(new java.awt.Color(68, 43, 24));
        bordesRedondos3.setRoundBottomLeft(30);
        bordesRedondos3.setRoundBottomRight(30);
        bordesRedondos3.setRoundTopLeft(30);
        bordesRedondos3.setRoundTopRight(30);
        bordesRedondos3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seccionUno.setBackground(new java.awt.Color(137, 83, 43));
        seccionUno.setRoundBottomLeft(20);
        seccionUno.setRoundBottomRight(20);
        seccionUno.setRoundTopLeft(20);
        seccionUno.setRoundTopRight(20);
        seccionUno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedorDatos.setBackground(new java.awt.Color(137, 83, 43));
        contenedorDatos.setForeground(new java.awt.Color(255, 255, 255));
        contenedorDatos.setRoundBottomLeft(20);
        contenedorDatos.setRoundBottomRight(20);
        contenedorDatos.setRoundTopLeft(20);
        contenedorDatos.setRoundTopRight(20);
        contenedorDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        polluelosLabel.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        polluelosLabel.setForeground(new java.awt.Color(204, 204, 204));
        polluelosLabel.setText("Polluelos");
        contenedorDatos.add(polluelosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jovenesLabel.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jovenesLabel.setForeground(new java.awt.Color(204, 204, 204));
        jovenesLabel.setText("Jovenes");
        contenedorDatos.add(jovenesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        adultosLabel.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        adultosLabel.setForeground(new java.awt.Color(204, 204, 204));
        adultosLabel.setText("Adultos");
        contenedorDatos.add(adultosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        huevosLabel.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        huevosLabel.setForeground(new java.awt.Color(204, 204, 204));
        huevosLabel.setText("Huevos");
        contenedorDatos.add(huevosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        contenedorTextPolluelos.setBackground(new java.awt.Color(68, 43, 24));
        contenedorTextPolluelos.setRoundBottomLeft(20);
        contenedorTextPolluelos.setRoundBottomRight(20);
        contenedorTextPolluelos.setRoundTopLeft(20);
        contenedorTextPolluelos.setRoundTopRight(20);
        contenedorTextPolluelos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantidadPolluelosTextF.setBackground(new java.awt.Color(68, 43, 24));
        cantidadPolluelosTextF.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        cantidadPolluelosTextF.setForeground(new java.awt.Color(204, 204, 204));
        cantidadPolluelosTextF.setBorder(null);
        cantidadPolluelosTextF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadPolluelosTextFKeyTyped(evt);
            }
        });
        contenedorTextPolluelos.add(cantidadPolluelosTextF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 130, 30));

        contenedorDatos.add(contenedorTextPolluelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 170, 40));

        contenedorTextJovenes.setBackground(new java.awt.Color(68, 43, 24));
        contenedorTextJovenes.setRoundBottomLeft(20);
        contenedorTextJovenes.setRoundBottomRight(20);
        contenedorTextJovenes.setRoundTopLeft(20);
        contenedorTextJovenes.setRoundTopRight(20);
        contenedorTextJovenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantidadJovenesTextF.setBackground(new java.awt.Color(68, 43, 24));
        cantidadJovenesTextF.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        cantidadJovenesTextF.setForeground(new java.awt.Color(204, 204, 204));
        cantidadJovenesTextF.setBorder(null);
        cantidadJovenesTextF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadJovenesTextFKeyTyped(evt);
            }
        });
        contenedorTextJovenes.add(cantidadJovenesTextF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 130, 30));

        contenedorDatos.add(contenedorTextJovenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 170, 40));

        contenedorTextAdultos.setBackground(new java.awt.Color(68, 43, 24));
        contenedorTextAdultos.setRoundBottomLeft(20);
        contenedorTextAdultos.setRoundBottomRight(20);
        contenedorTextAdultos.setRoundTopLeft(20);
        contenedorTextAdultos.setRoundTopRight(20);
        contenedorTextAdultos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantidadAdultosTextF.setBackground(new java.awt.Color(68, 43, 24));
        cantidadAdultosTextF.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        cantidadAdultosTextF.setForeground(new java.awt.Color(204, 204, 204));
        cantidadAdultosTextF.setBorder(null);
        cantidadAdultosTextF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadAdultosTextFKeyTyped(evt);
            }
        });
        contenedorTextAdultos.add(cantidadAdultosTextF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 130, 30));

        contenedorDatos.add(contenedorTextAdultos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 170, 40));

        contenedorTextHuevos.setBackground(new java.awt.Color(68, 43, 24));
        contenedorTextHuevos.setRoundBottomLeft(20);
        contenedorTextHuevos.setRoundBottomRight(20);
        contenedorTextHuevos.setRoundTopLeft(20);
        contenedorTextHuevos.setRoundTopRight(20);
        contenedorTextHuevos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantidadHuevosTextF.setBackground(new java.awt.Color(68, 43, 24));
        cantidadHuevosTextF.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        cantidadHuevosTextF.setForeground(new java.awt.Color(204, 204, 204));
        cantidadHuevosTextF.setBorder(null);
        cantidadHuevosTextF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadHuevosTextFKeyTyped(evt);
            }
        });
        contenedorTextHuevos.add(cantidadHuevosTextF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 130, 30));

        contenedorDatos.add(contenedorTextHuevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 170, 40));

        contenedorGuardar.setBackground(new java.awt.Color(68, 43, 24));
        contenedorGuardar.setRoundBottomLeft(20);
        contenedorGuardar.setRoundBottomRight(20);
        contenedorGuardar.setRoundTopLeft(20);
        contenedorGuardar.setRoundTopRight(20);
        contenedorGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guardarDatosBoton.setBackground(new java.awt.Color(68, 43, 24));
        guardarDatosBoton.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        guardarDatosBoton.setForeground(new java.awt.Color(204, 204, 204));
        guardarDatosBoton.setText("Calcular");
        guardarDatosBoton.setBorder(null);
        guardarDatosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDatosBotonActionPerformed(evt);
            }
        });
        contenedorGuardar.add(guardarDatosBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 40));

        contenedorDatos.add(contenedorGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 130, -1));

        bordesRedondos2.setBackground(new java.awt.Color(68, 43, 24));
        bordesRedondos2.setRoundBottomLeft(10);
        bordesRedondos2.setRoundBottomRight(10);
        bordesRedondos2.setRoundTopLeft(10);
        bordesRedondos2.setRoundTopRight(10);
        bordesRedondos2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Campos");
        bordesRedondos2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 90, 20));

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Categoria");
        bordesRedondos2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 20));

        contenedorDatos.add(bordesRedondos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 360, 40));

        seccionUno.add(contenedorDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 540));

        bordesRedondos3.add(seccionUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 460, 560));

        seccionDos.setBackground(new java.awt.Color(137, 83, 43));
        seccionDos.setRoundBottomLeft(20);
        seccionDos.setRoundBottomRight(20);
        seccionDos.setRoundTopLeft(20);
        seccionDos.setRoundTopRight(20);
        seccionDos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedorDatosImprimir.setBackground(new java.awt.Color(137, 83, 43));
        contenedorDatosImprimir.setRoundBottomLeft(20);
        contenedorDatosImprimir.setRoundBottomRight(20);
        contenedorDatosImprimir.setRoundTopLeft(20);
        contenedorDatosImprimir.setRoundTopRight(20);
        contenedorDatosImprimir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedorCalcular.setBackground(new java.awt.Color(68, 43, 24));
        contenedorCalcular.setRoundBottomLeft(5);
        contenedorCalcular.setRoundBottomRight(5);
        contenedorCalcular.setRoundTopLeft(5);
        contenedorCalcular.setRoundTopRight(5);
        contenedorCalcular.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contenedorDatosImprimir.add(contenedorCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 350, 5));

        mostrarPolluelos.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        mostrarPolluelos.setForeground(new java.awt.Color(204, 204, 204));
        mostrarPolluelos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarPolluelos.setText("Vacío");
        contenedorDatosImprimir.add(mostrarPolluelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 110, 20));

        mostrarJovenes.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        mostrarJovenes.setForeground(new java.awt.Color(204, 204, 204));
        mostrarJovenes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarJovenes.setText("Vacío");
        contenedorDatosImprimir.add(mostrarJovenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 110, 20));

        mostrarAdultos.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        mostrarAdultos.setForeground(new java.awt.Color(204, 204, 204));
        mostrarAdultos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarAdultos.setText("Vacío");
        contenedorDatosImprimir.add(mostrarAdultos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 110, -1));

        mostrarHuevos.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        mostrarHuevos.setForeground(new java.awt.Color(204, 204, 204));
        mostrarHuevos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarHuevos.setText("Vacío");
        contenedorDatosImprimir.add(mostrarHuevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 110, -1));

        huevsLabelNombre.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        huevsLabelNombre.setForeground(new java.awt.Color(204, 204, 204));
        huevsLabelNombre.setText("Huevos");
        contenedorDatosImprimir.add(huevsLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 90, -1));

        adultLabelNombre.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        adultLabelNombre.setForeground(new java.awt.Color(204, 204, 204));
        adultLabelNombre.setText("Adultos");
        contenedorDatosImprimir.add(adultLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 110, -1));

        jovLabelNombre.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jovLabelNombre.setForeground(new java.awt.Color(204, 204, 204));
        jovLabelNombre.setText("Jovenes");
        contenedorDatosImprimir.add(jovLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 110, 20));

        pollLabelNombre.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        pollLabelNombre.setForeground(new java.awt.Color(204, 204, 204));
        pollLabelNombre.setText("Polluelos");
        contenedorDatosImprimir.add(pollLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 100, -1));

        precioPolluelos.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        precioPolluelos.setForeground(new java.awt.Color(204, 204, 204));
        precioPolluelos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precioPolluelos.setText("Vacío");
        contenedorDatosImprimir.add(precioPolluelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 110, 20));

        descuentoHuevos.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        descuentoHuevos.setForeground(new java.awt.Color(204, 204, 204));
        descuentoHuevos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        descuentoHuevos.setText("Vacío");
        contenedorDatosImprimir.add(descuentoHuevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 220, 20));

        precioJovenes.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        precioJovenes.setForeground(new java.awt.Color(204, 204, 204));
        precioJovenes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precioJovenes.setText("Vacío");
        contenedorDatosImprimir.add(precioJovenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 110, 20));

        precioAdultos.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        precioAdultos.setForeground(new java.awt.Color(204, 204, 204));
        precioAdultos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precioAdultos.setText("Vacío");
        contenedorDatosImprimir.add(precioAdultos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 110, -1));

        TotalConDesc.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        TotalConDesc.setForeground(new java.awt.Color(204, 204, 204));
        TotalConDesc.setText("Total con descuento");
        contenedorDatosImprimir.add(TotalConDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 230, 20));

        totalSinDesc.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        totalSinDesc.setForeground(new java.awt.Color(204, 204, 204));
        totalSinDesc.setText("Total sin descuento");
        contenedorDatosImprimir.add(totalSinDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 230, 20));

        mostrarConDesc.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        mostrarConDesc.setForeground(new java.awt.Color(204, 204, 204));
        mostrarConDesc.setText("Vacío");
        contenedorDatosImprimir.add(mostrarConDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 150, -1));

        mostrarSinDesc.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        mostrarSinDesc.setForeground(new java.awt.Color(204, 204, 204));
        mostrarSinDesc.setText("Vacío");
        contenedorDatosImprimir.add(mostrarSinDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 150, -1));

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Descuento");
        contenedorDatosImprimir.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 100, -1));

        bordesRedondos1.setBackground(new java.awt.Color(68, 43, 24));
        bordesRedondos1.setRoundBottomLeft(10);
        bordesRedondos1.setRoundBottomRight(10);
        bordesRedondos1.setRoundTopLeft(10);
        bordesRedondos1.setRoundTopRight(10);
        bordesRedondos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Cantidad");
        bordesRedondos1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 20));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Total");
        bordesRedondos1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 20));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Datos");
        bordesRedondos1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        contenedorDatosImprimir.add(bordesRedondos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 390, 40));

        seccionDos.add(contenedorDatosImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 540));

        bordesRedondos3.add(seccionDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 490, 560));

        jPanel1.add(bordesRedondos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1090, 790));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarDatosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDatosBotonActionPerformed
        obtenerDatos();
        if(polluelos.isEmpty() || jovenes.isEmpty() || adultos.isEmpty() || huevos.isEmpty()) { //Esto nos permite saber si algun campo esta vacio y si lo estan, mostrara el siguiente mensaje
              JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos para poder avanzar");
        } else {
            if (Integer.parseInt(polluelos) > 11000 || Integer.parseInt(jovenes) > 8800 || Integer.parseInt(adultos) > 5500) { //La facturizacion de la compra tendra un limite con respecto a la cantidad de codornizes si se ecxede esa cantidad mostrara el siguiente mensaje
                JOptionPane.showMessageDialog(null, "Hola, el sistema solo admite 11 000 codornicez polluelos, 8 800 codornizes jovenes y 5 500 codornizes adultos por transacción");
            } else if (Integer.parseInt(polluelos) <= 11000 && Integer.parseInt(jovenes) <= 8800 && Integer.parseInt(adultos) <= 5500) { //Sino se ecxede procedera a mostrar los datos y calculalos
                mostrarEnFactura();
            }
        }
    }//GEN-LAST:event_guardarDatosBotonActionPerformed

    private void cantidadPolluelosTextFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadPolluelosTextFKeyTyped
        validarSoloNumeros = evt.getKeyChar(); //Aca igualamos nuestra variable char a nuestra funcion de getKeyChar que nos suministra las teclas que se pulsan
        if (Character.isLetter(validarSoloNumeros)) { //Si es una letra mostrara un mensaje 
            evt.consume();
            JOptionPane.showMessageDialog(null, "Por favor ingresar solamente numeros. Gracias");
        }
        if(cantidadPolluelosTextF.getText().length() >= 5) { //Si la cantidad de caracteres supera al limite por transacción mostrara el siguiente mensaje y borrara la cantidad del textfield
             JOptionPane.showMessageDialog(null, "Solo se admiten cantidades en un rango de 0 a 5 cifras");
             cantidadPolluelosTextF.setText (null);
        }
    }//GEN-LAST:event_cantidadPolluelosTextFKeyTyped

    private void cantidadJovenesTextFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadJovenesTextFKeyTyped
        validarSoloNumeros = evt.getKeyChar(); //Aca igualamos nuestra variable char a nuestra funcion de getKeyChar que nos suministra las teclas que se pulsan
        if (Character.isLetter(validarSoloNumeros)) { //Si es una letra mostrara un mensaje 
            evt.consume();
            JOptionPane.showMessageDialog(null, "Por favor ingresar solamente numeros. Gracias");
        }
        if(cantidadJovenesTextF.getText().length() >= 4) { //Si la cantidad de caracteres supera al limite por transacción mostrara el siguiente mensaje y borrara la cantidad del textfield
             JOptionPane.showMessageDialog(null, "Solo se admiten cantidades en un rango de 0 a 4 cifras");
             cantidadJovenesTextF.setText (null);
        }
    }//GEN-LAST:event_cantidadJovenesTextFKeyTyped

    private void cantidadAdultosTextFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadAdultosTextFKeyTyped
        validarSoloNumeros = evt.getKeyChar(); //Aca igualamos nuestra variable char a nuestra funcion de getKeyChar que nos suministra las teclas que se pulsan
        if (Character.isLetter(validarSoloNumeros)) { //Si es una letra mostrara un mensaje 
            evt.consume();
            JOptionPane.showMessageDialog(null, "Por favor ingresar solamente numeros. Gracias");
        }
        if(cantidadAdultosTextF.getText().length() >= 4) { //Si la cantidad de caracteres supera al limite por transacción mostrara el siguiente mensaje y borrara la cantidad del textfield
             JOptionPane.showMessageDialog(null, "Solo se admiten cantidades en un rango de 0 a 4 cifras");
             cantidadAdultosTextF.setText (null);
        }
    }//GEN-LAST:event_cantidadAdultosTextFKeyTyped

    private void cantidadHuevosTextFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadHuevosTextFKeyTyped
        validarSoloNumeros = evt.getKeyChar(); //Aca igualamos nuestra variable tipo char a nuestra funcion de getKeyChar que nos suministra las teclas que se pulsan para validar que solo se digiten numeros
        if (Character.isLetter(validarSoloNumeros)) { //Si es una letra mostrara un mensaje 
            evt.consume();
            JOptionPane.showMessageDialog(null, "Por favor ingresar solamente numeros. Gracias");
        }
        if(cantidadHuevosTextF.getText().length() >= 3) { //Si la cantidad de caracteres supera al limite por transacción mostrara el siguiente mensaje y borrara la cantidad del textfield
             JOptionPane.showMessageDialog(null, "Solo se admiten cantidades en un rango de 0 a 3 cifras");
             cantidadHuevosTextF.setText (null);
        }
    }//GEN-LAST:event_cantidadHuevosTextFKeyTyped
    
    //--Metodo en el cual llenamos nuestras variables con el contenido de los textfield--//
    public void obtenerDatos() {
        polluelos = cantidadPolluelosTextF.getText(); //Polluelos sera igual a su contenido digitado en su textfield--//
        jovenes = cantidadJovenesTextF.getText();    //Jovenes sera igual a su contenido digitado en su textfield--//
        adultos = cantidadAdultosTextF.getText();      //Adultos sera igual a su contenido digitado en su textfield--//
        huevos = cantidadHuevosTextF.getText();      //Huevos sera igual a su contenido digitado en su textfield--//
    }
    
    //--Metodo que usaremos para mostrar todos los resultados en el apartado de resultados--//
    public void mostrarEnFactura() {
        totalAPagar();    //--Llamamos a nuestro metodo que contiene el total a pagar--//
        obtenerDatos(); //--Llamamos a nuestro metodo que contiene las cantidades de coodornizes--//
        
        //--Aca mostramos en los JLabels el contenido de nuestras variables las cuales son las cantidades de codornizes--//
        mostrarPolluelos.setText(polluelos); //Cantidad de polluelos
        mostrarJovenes.setText(jovenes);    //Cantidad de jovenes
        mostrarAdultos.setText(adultos);      //Cantidad de adultos
        mostrarHuevos.setText(huevos);      //Cantidad de huevos
        
        Codorniz metOne = new Codorniz(); //--Llamo a la clase de calcular precio y le paso los parametros que debe de calcular un String y un int--//
        precioPolluelos.setText(metOne.precioSacoPolluelo(polluelos, prec1)); //Le pasamos la cantidad de polluelos y el precio de su saco por parametro a calcular
        precioJovenes.setText(metOne.precioSacoJovenes(jovenes, prec2));   //Le pasamos la cantidad de jovenes y el precio de su saco por parametro a calcular
        precioAdultos.setText(metOne.precioSacoAdultos(adultos, prec3));      //Le pasamos la cantidad de adultos y el precio de su saco por parametro a calcular
        
        CalculoDescuento calc = new CalculoDescuento(); //--Llamo a la clase que calcula el descuento y le paso el porcentaje de descuento por unidad y la cantidad de huevos por parametro--//
        descuento = calc.calculoDescuento(porcentajePUnidad, huevos); //Descuento aplicable retornado por el metodo y asignado a nuestra variable descuento
        totalFinal = calc.costoConDescuento(total, descuento);                 //Le asignamos a nuestra variable totalFinal lo que retorna este metodo
        
        double restar = total - totalFinal; //Aca le asignamos a nuestra variable restar la cantidad a pagar final restandole el descuento
        
        //--Tomamos el valor de la variable total final y se la asignamos a nuestro string ya que al double la conversion a int caurara error y en el Jlabel solo se puede mostrar texto, lo mismo para el otro pedazo de codigo--//
        convertStringTwo = String.valueOf(totalFinal);
        convertString = String.valueOf(restar);
        
        //--Mostramos en los Jlabels los dotos que tenemos--//
        descuentoHuevos.setText(convertString);
        mostrarSinDesc.setText(Integer.toString(total));
        mostrarConDesc.setText(convertStringTwo);
    }
    
    //--Metodo para calcular el total que el usuario debe de pagar--//
    public void totalAPagar() {
        Codorniz metOne = new Codorniz(); //Lamamos a nuestra clase codorniz que contiene los metodos para calcular el precio a pagar 
        tot1 = metOne.precioSacoPolluelo(polluelos, prec1); //Igualamos nuestra variable tot1 a lo que retorna el metodo polluelos, pasando la cantidad de polluelos y el prec1 como parametro a calcular
        tot2 = metOne.precioSacoJovenes(jovenes, prec2);  //Igualamos nuestra variable tot2 a lo que retorna el metodo jovenes, pasando la cantidad de jovenes y el prec2 como parametro a calcular
        tot3 = metOne.precioSacoAdultos(adultos, prec3);    //Igualamos nuestra variable tot3 a lo que retorna el metodo adultos, pasando la cantidad de adultos y el prec3 como parametro a calcular
        total = Integer.parseInt(tot1) +  Integer.parseInt(tot2) +  Integer.parseInt(tot3); //Ahora sumamos todos los resultados arrojados y se lo igualamos a nuestra variable total
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGrafica().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalConDesc;
    private javax.swing.JLabel adultLabelNombre;
    private javax.swing.JLabel adultosLabel;
    private protecto2codor.BordesRedondos bordesRedondos1;
    private protecto2codor.BordesRedondos bordesRedondos2;
    private protecto2codor.BordesRedondos bordesRedondos3;
    private javax.swing.JTextField cantidadAdultosTextF;
    private javax.swing.JTextField cantidadHuevosTextF;
    private javax.swing.JTextField cantidadJovenesTextF;
    private javax.swing.JTextField cantidadPolluelosTextF;
    private javax.swing.JLabel codorLogo;
    private protecto2codor.BordesRedondos contenedorCalcular;
    private protecto2codor.BordesRedondos contenedorDatos;
    private protecto2codor.BordesRedondos contenedorDatosImprimir;
    private protecto2codor.BordesRedondos contenedorGuardar;
    private protecto2codor.BordesRedondos contenedorLogo;
    private protecto2codor.BordesRedondos contenedorTextAdultos;
    private protecto2codor.BordesRedondos contenedorTextHuevos;
    private protecto2codor.BordesRedondos contenedorTextJovenes;
    private protecto2codor.BordesRedondos contenedorTextPolluelos;
    private protecto2codor.BordesRedondos contenedorTitulo;
    private javax.swing.JLabel descuentoHuevos;
    private javax.swing.JButton guardarDatosBoton;
    private javax.swing.JLabel huevosLabel;
    private javax.swing.JLabel huevsLabelNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jovLabelNombre;
    private javax.swing.JLabel jovenesLabel;
    private javax.swing.JLabel mostrarAdultos;
    private javax.swing.JLabel mostrarConDesc;
    private javax.swing.JLabel mostrarHuevos;
    private javax.swing.JLabel mostrarJovenes;
    private javax.swing.JLabel mostrarPolluelos;
    private javax.swing.JLabel mostrarSinDesc;
    private javax.swing.JLabel pollLabelNombre;
    private javax.swing.JLabel polluelosLabel;
    private javax.swing.JLabel precioAdultos;
    private javax.swing.JLabel precioJovenes;
    private javax.swing.JLabel precioPolluelos;
    private protecto2codor.BordesRedondos seccionDos;
    private protecto2codor.BordesRedondos seccionUno;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel totalSinDesc;
    // End of variables declaration//GEN-END:variables
}
