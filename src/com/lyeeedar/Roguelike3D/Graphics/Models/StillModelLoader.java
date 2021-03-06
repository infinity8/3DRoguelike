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
package com.lyeeedar.Roguelike3D.Graphics.Models;

import com.badlogic.gdx.graphics.Mesh;

public class StillModelLoader {
	
	public static StillModel createFromList(StillSubMesh... meshes)
	{
		return new StillModel(meshes);
	}
	
	public static StillModel createFromArray(StillSubMesh[] meshes)
	{
		return new StillModel(meshes);
	}
	
	public static StillSubMesh convertMeshtoSubMesh(Mesh mesh, String name, int primitive_type)
	{
		return new StillSubMesh(name, mesh, primitive_type);
	}

}
