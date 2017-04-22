/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2017 Sri Harsha Chilakapati
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.shc.silenceengine.scene.components;

import com.shc.silenceengine.graphics.Color;
import com.shc.silenceengine.math.geom2d.Polygon;
import com.shc.silenceengine.scene.Component;

/**
 * @author Sri Harsha Chilakapati
 */
public class PolygonRenderComponent extends Component
{
    public Polygon    polygon;
    public Color      color;
    public RenderType renderType;

    public PolygonRenderComponent()
    {
        this(Color.RED);
    }

    public PolygonRenderComponent(Color color)
    {
        this.color = color.copy();
        this.renderType = RenderType.OUTLINE;
    }

    public PolygonRenderComponent(Color color, RenderType renderType)
    {
        this.color = color.copy();
        this.renderType = renderType;
    }

    public PolygonRenderComponent(Polygon polygon, Color color)
    {
        this.polygon = polygon;
        this.color = color.copy();
        this.renderType = RenderType.OUTLINE;
    }

    public PolygonRenderComponent(Polygon polygon, Color color, RenderType renderType)
    {
        this.polygon = polygon;
        this.color = color.copy();
        this.renderType = renderType;
    }

    public PolygonRenderComponent(Polygon polygon)
    {
        this.polygon = polygon;
        this.color = Color.RED.copy();
        renderType = RenderType.OUTLINE;
    }

    public enum RenderType
    {
        FILLED,
        OUTLINE
    }
}
