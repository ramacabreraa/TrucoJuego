package com.bc.truco;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import pantallas.PantallaInicial;
import utiles.Render;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Principal extends Game {

    @Override
    public void create() {
    	Render.app = this;
		Render.batch = new SpriteBatch();
		this.setScreen(new PantallaInicial());
    }

    @Override
    public void render() {
    	super.render();
		if(Gdx.input.isKeyPressed(Keys.ESCAPE)) {
			Gdx.app.exit();
		}
    }

    @Override
    public void dispose() {
		Render.batch.dispose();
    }
}
