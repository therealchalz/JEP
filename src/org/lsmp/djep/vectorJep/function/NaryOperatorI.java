/* @author rich
 * Created on 02-Nov-2003
 *
 * This code is covered by a Creative Commons
 * Attribution, Non Commercial, Share Alike license
 * <a href="http://creativecommons.org/licenses/by-nc-sa/1.0">License</a>
 */
package org.lsmp.djep.vectorJep.function;
import org.lsmp.djep.matrixJep.nodeTypes.*;
import org.lsmp.djep.vectorJep.*;
import org.lsmp.djep.vectorJep.values.*;
import org.nfunk.jep.ParseException;
import org.nfunk.jep.function.PostfixMathCommandI;

/**
 * @author Rich Morris
 * Created on 02-Nov-2003
 */
public interface NaryOperatorI extends PostfixMathCommandI {
	public Dimensions calcDim(MatrixNodeI node[]) throws ParseException;
	public MatrixValueI calcValue(MatrixValueI res,
		MatrixValueI inputs[]) throws ParseException;
}