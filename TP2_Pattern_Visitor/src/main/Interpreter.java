package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import tp6.analysis.Analysis;
import tp6.node.AAssignment;
import tp6.node.ABinexpression;
import tp6.node.ABlock;
import tp6.node.AConditional;
import tp6.node.ADiviserOperatorarith;
import tp6.node.AEqualOperatorlogique;
import tp6.node.AInfOperatorlogique;
import tp6.node.AIntegervalue;
import tp6.node.AMinusOperatorarith;
import tp6.node.AModuloOperatorarith;
import tp6.node.AMultiplierOperatorarith;
import tp6.node.APlusOperatorarith;
import tp6.node.APrintS;
import tp6.node.AReadS;
import tp6.node.ASupOperatorlogique;
import tp6.node.AVariableref;
import tp6.node.AWhileS;
import tp6.node.PStatement;

public class Interpreter extends AbstractInterpreter implements Analysis {
	private int indent = 0;
	
	@Override
	public void caseAAssignment(AAssignment node) {
		// Starts with indentation
		System.out.print(printIndent(indent));
		
		node.getVar().apply(this);
		System.out.print(node.getAssign().getText());
		node.getRhs().apply(this);
		
		// Line break
		System.out.print("\n");	
	}

	@Override
	public void caseABinexpression(ABinexpression node) {
		node.getLExp().apply(this);
		
		System.out.print(node.getOperator());
		
		node.getRExp().apply(this);	
	}

	@Override
	public void caseABlock(ABlock node) {
		// Starts with indentation and opening curly brace
		System.out.println(printIndent(indent) + "{");
		indent++;
		
		for (PStatement statement : node.getStatement()) {
			statement.apply(this);
		}
		
		indent--;
		// Ends with indentation and closing curly brace
		System.out.println(printIndent(indent) + "}");
	}

	@Override
	public void caseAConditional(AConditional node) {
		// Starts with indentation and prints the If text
		System.out.print(printIndent(indent) + node.getIf().getText() + node.getLPar());
		
		node.getCond().apply(this);
		
		System.out.println(node.getRPar());
		
		node.getThenpart().apply(this);
		
		if(node.getElsepart() != null) {
			System.out.println(printIndent(indent) + node.getElse().getText());
			node.getElsepart().apply(this);
		}
	}

	@Override
	public void caseAEqualOperatorlogique(AEqualOperatorlogique node) {
		System.out.print(node.getEqual());
	}

	@Override
	public void caseAInfOperatorlogique(AInfOperatorlogique node) {
		System.out.print(node.getInf());
	}

	@Override
	public void caseAIntegervalue(AIntegervalue node) {
		System.out.println(node.getNumber());
	}

	@Override
	public void caseAMinusOperatorarith(AMinusOperatorarith node) {
		System.out.print(node.getMinus());
	}

	@Override
	public void caseAMultiplierOperatorarith(AMultiplierOperatorarith node) {
		System.out.print(node.getMultiplier());
	}

	@Override
	public void caseAPlusOperatorarith(APlusOperatorarith node) {
		System.out.print(node.getPlus());
	}

	@Override
	public void caseAPrintS(APrintS node) {
		System.out.print(printIndent(indent) + "print(");
		
		node.getValue().apply(this);
		
		System.out.print(")");
	}

	@Override
	public void caseAReadS(AReadS node) {
	
	}

	@Override
	public void caseASupOperatorlogique(ASupOperatorlogique node) {
		System.out.print(node.getSup());
	}

	@Override
	public void caseAVariableref(AVariableref node) {
		System.out.print(node.getIdentifier().getText());
	}

	@Override
	public void caseAWhileS(AWhileS node) {
		// TODO While
	}

	@Override
	public void caseADiviserOperatorarith(ADiviserOperatorarith node) {
		System.out.print(node.getDiv());
	}

	@Override
	public void caseAModuloOperatorarith(AModuloOperatorarith node) {
		System.out.print(node.getModulo());
	}

	private String printIndent(int indent) {
		StringBuilder sIndent = new StringBuilder();
		for (int i = 0; i < indent; i++) {
			sIndent.append("\t");
		}
		return sIndent.toString();
	}
}
