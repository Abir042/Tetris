/*
 * Copyright 2013 Simon Willeke
 * contact: hamstercount@hotmail.com
 */

/*
    This file is part of Blockinger.

    Blockinger is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Blockinger is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Blockinger.  If not, see <http://www.gnu.org/licenses/>.

    Diese Datei ist Teil von Blockinger.

    Blockinger ist Freie Software: Sie konnen es unter den Bedingungen
    der GNU General Public License, wie von der Free Software Foundation,
    Version 3 der Lizenz oder (nach Ihrer Option) jeder sp�teren
    ver�ffentlichten Version, weiterverbreiten und/oder modifizieren.

    Blockinger wird in der Hoffnung, dass es n�tzlich sein wird, aber
    OHNE JEDE GEW�HELEISTUNG, bereitgestellt; sogar ohne die implizite
    Gew�hrleistung der MARKTF�HIGKEIT oder EIGNUNG F�R EINEN BESTIMMTEN ZWECK.
    Siehe die GNU General Public License f�r weitere Details.

    Sie sollten eine Kopie der GNU General Public License zusammen mit diesem
    Programm erhalten haben. Wenn nicht, siehe <http://www.gnu.org/licenses/>.
 */

package org.nirvana.game.pieces;

import org.nirvana.game.Square;

import android.content.Context;

public class OPiece extends Piece4x4 {

	private Square oSquare;
	
	public OPiece(Context c) {
		super(c);
		oSquare = new Square(Piece.type_O,c);
		pattern[1][1] = oSquare;
		pattern[1][2] = oSquare;
		pattern[2][1] = oSquare;
		pattern[2][2] = oSquare;
		reDraw();
	}

	@Override
	public void reset(Context c) {
		super.reset(c);
		pattern[1][1] = oSquare;
		pattern[1][2] = oSquare;
		pattern[2][1] = oSquare;
		pattern[2][2] = oSquare;
		reDraw();
	}

}
