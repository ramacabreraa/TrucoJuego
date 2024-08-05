package botones;

import entradasalida.Entradas;
import utiles.Render;

public class BotonAceptar extends Boton {
	
	public BotonAceptar(Entradas entradas) {
		super(entradas, "botones/Aceptar.png", "botones/AceptarApretado.png", 560, 400, 150, 45);
	}

	public BotonAceptar(Entradas entradas, int x, int y) {
		super(entradas, "botones/Aceptar.png", "botones/AceptarApretado.png", x, y, 150, 45);
	}

	public BotonAceptar(Entradas entradas, int x, int y, int ancho, int alto) {
		super(entradas, "botones/Aceptar.png", "botones/AceptarApretado.png", x, y, ancho, alto);
	}

	@Override
	protected void ejecutarAccion() {
		Render.app.setScreen(Render.app.PartidaVsCpu);
	}


}