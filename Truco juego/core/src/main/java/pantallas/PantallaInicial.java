package pantallas;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import utiles.Imagen;
import utiles.Render;

public class PantallaInicial implements Screen {
	Imagen inicial;
	SpriteBatch batch;
	float transparencia = 0.00001f;
	boolean terminado = false, completo = false;
	int contEspera = 0;
	
	@Override
	public void show() {
		inicial = new Imagen("fondos/PantallaInicial.png");
		batch = Render.batch;
		inicial.setTransparencia(transparencia);
	}

	@Override
	public void render(float delta) {
		if(Gdx.input.isKeyPressed(Keys.SPACE)) {
			//Render.app.setScreen(new MenuPrincipal());
			Render.app.setScreen(new IngresarNombre());
		}
		Render.limpiarPantalla(0, 0, 0, 1);
		
		batch.begin();
			inicial.dibujar();
			batch.end();

		degradado();

	}

	private void degradado() {
		if(!terminado) {
			transparencia += 0.01f;
			if(transparencia > 1) {
				transparencia = 1;
				terminado = true;
			}
			
		} else {
			contEspera++;
			if (contEspera >= 100) {
				contEspera = 100;
				transparencia-=0.01f;
				if(transparencia < 0) {
					transparencia = 0;
					completo = true;
				}
			}
		}
		inicial.setTransparencia(transparencia);
		if(completo) {
		//	Render.app.setScreen(new MenuPrincipal());
			Render.app.setScreen(new IngresarNombre());
		}		
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		inicial.dispose();	
	}
	
}
