/* @author rich
 * Created on 04-Jul-2003
 *
 * This code is covered by a Creative Commons
 * Attribution, Non Commercial, Share Alike license
 * <a href="http://creativecommons.org/licenses/by-nc-sa/1.0">License</a>
 */
package org.lsmp.djep.djep;

import java.util.Stack;

import org.lsmp.djep.xjep.*;
import org.nfunk.jep.*;
import org.nfunk.jep.function.*;


/**
   * The diff(f,x) opperator.
   */
  public class Diff extends PostfixMathCommand implements CommandVisitorI,SpecialEvaluationI
  {
	//protected DiffVisitorI dv;

	  public Diff() {
		  super();
		  numberOfParameters = 2;
		  //dv = inDv;
	  }
	
	  //private Diff() {}
	  
	  /**
	   * Should never be evaluated!
	   * @throws ParseException if called by evaluator.
	   */
		public void run(Stack inStack)	throws ParseException 
		{
			throw new ParseException("Cannot evaluate the diff function. ");
		}

	public Object evaluate(Node node,Object data,ParserVisitor pv,Stack inStack,SymbolTable symTab) throws ParseException
	{
			throw new ParseException("Cannot evaluate the diff function. ");
		}
	  /**
	   * Process the differentiation specified by node.
	   * Defines process in
	   * @see CommandVisitorI 
	   */
	  public Node process(Node node,Node children[],XJepI xjep) throws ParseException
	  {
		  Node lhs = children[0];
		  Node rhs = children[1];
		  if(!TreeUtils.isVariable(rhs) )
		  {
		  	throw new ParseException("Format should be diff(f,x) where x is a variables and 1,2 are constants");	
		  }
		  ASTVarNode var;
		  try
		  {
//			  lhs = (Node) node.jjtGetChild(0);
			  var = (ASTVarNode) rhs;
		  }
		  catch(ClassCastException e)
		  {	throw new ParseException("Format should be diff(f,x) where x is a variables and 1,2 are constants"); }
			
		  return ((DJepI) xjep).differentiate(lhs,var.getName());
	  }
  } /* end class Diff */
