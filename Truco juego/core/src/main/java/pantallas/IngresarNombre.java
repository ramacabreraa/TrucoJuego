package pantallas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import botones.Boton;
import botones.BotonAceptar;
import botones.Espacio;
import entradasalida.Entradas;
import utiles.Imagen;
import utiles.Render;

public class IngresarNombre implements Screen{
	
	private Boton botonAceptar;
	
	private Imagen fondo;
	private SpriteBatch batch = Render.batch;
	private Entradas entradas = new Entradas();
	
	private JTextField txfNombre;
	private JFrame frame;
	private JButton boton;
	
	public IngresarNombre(){
		frame = new JFrame();
		frame.setLayout(null);
		frame.setTitle("Ingrese su nombre");
		frame.setSize(500, 250);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txfNombre = new JTextField();
		txfNombre.setBounds(150, 20, 100, 30);
		frame.add(txfNombre);
		
		boton = new JButton("Establecer nombre");
		boton.setBounds(70, 70, 250, 40);
		boton.addActionListener(new Espacio(txfNombre, frame));
		frame.add(boton);
		
		frame.setVisible(true);
		
		botonAceptar = new BotonAceptar(entradas);
	}
	
	@Override
	public void show() {
		fondo = new Imagen("fondos/QuieroRetruco.png");
		fondo.setTransparencia(1);
		Gdx.input.setInputProcessor(entradas);
	}

	@Override
	public void render(float delta) {
		
		batch.begin();
			fondo.dibujar();
			botonAceptar.dibujar();		
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
}
