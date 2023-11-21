// Generated from tok.g4 by ANTLR 4.10.1
 
	import java.util.*; 
	import java.util.Scanner.*;
	import java.util.ArrayList;
	import java.util.Stack;
	import java.lang.*;
	import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tokParser}.
 */
public interface tokListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tokParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(tokParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(tokParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(tokParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(tokParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(tokParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(tokParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(tokParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(tokParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(tokParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(tokParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(tokParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(tokParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeitura(tokParser.CmdLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeitura(tokParser.CmdLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscrita(tokParser.CmdEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscrita(tokParser.CmdEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmdAtribu}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribu(tokParser.CmdAtribuContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmdAtribu}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribu(tokParser.CmdAtribuContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmdSelecao}.
	 * @param ctx the parse tree
	 */
	void enterCmdSelecao(tokParser.CmdSelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmdSelecao}.
	 * @param ctx the parse tree
	 */
	void exitCmdSelecao(tokParser.CmdSelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(tokParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(tokParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmdFazEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdFazEnquanto(tokParser.CmdFazEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmdFazEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdFazEnquanto(tokParser.CmdFazEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(tokParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(tokParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(tokParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(tokParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#termo_one}.
	 * @param ctx the parse tree
	 */
	void enterTermo_one(tokParser.Termo_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#termo_one}.
	 * @param ctx the parse tree
	 */
	void exitTermo_one(tokParser.Termo_oneContext ctx);
}