package com.spy.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.uwsoft.editor.renderer.SceneLoader;
import com.uwsoft.editor.renderer.utils.ItemWrapper;

public class Spy extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	SceneLoader sceneLoader;
	@Override
	public void create () {
		Viewport viewport = new FitViewport(340,200);
		sceneLoader = new SceneLoader();
		sceneLoader.loadScene("MainScene",viewport);

		ItemWrapper root = new ItemWrapper(sceneLoader.getRoot());


		Player player = new Player();
		root.getChild("player").addScript(player);

		//batch = new SpriteBatch();
		//img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sceneLoader.getEngine().update(Gdx.graphics.getDeltaTime());
		//batch.begin();
		//batch.draw(img, 0, 0);
		//batch.end();
	}
}
