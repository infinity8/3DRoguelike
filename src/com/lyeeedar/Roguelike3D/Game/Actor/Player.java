/*******************************************************************************
 * Copyright (c) 2013 Philip Collin.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Philip Collin - initial API and implementation
 ******************************************************************************/
package com.lyeeedar.Roguelike3D.Game.Actor;

import com.badlogic.gdx.graphics.Color;

public class Player extends GameActor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6756577346541496175L;

	public Player(Color colour, String texture, float x, float y, float z, float scale, int primitive_type, String... model)
	{
		super(colour, texture, x, y, z, scale, primitive_type, model);

		WEIGHT = 1;
		
		ai = new AI_Player_Controlled(this);
	}
}
